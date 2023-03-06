import java.util.Scanner;

public class PerpustakaanDavid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menginisialisasi array buku
        Buku[] buku = new Buku[3];
        buku[0] = new Buku("pelajaran", 2000);
        buku[1] = new Buku("novel", 5000);
        buku[2] = new Buku("skripsi", 10000);

        // Menerima inputan user
        System.out.print("Masukkan jenis buku (pelajaran/novel/skripsi): ");
        String jenisBuku = input.nextLine();
        System.out.print("Masukkan jumlah hari terlambat: ");
        int hariTerlambat = input.nextInt();

        // Mencari buku yang sesuai dengan inputan
        Buku terpilih = null;
        for (Buku b : buku) {
            if (b.getJenisBuku().equals(jenisBuku)) {
                terpilih = b;
                break;
            }
        }

        // Validasi jika buku tidak ditemukan
        if (terpilih == null) {
            System.out.println("Jenis buku tidak valid.");
            return;
        }

        // Pengitungan denda
        int denda = terpilih.getDenda() * hariTerlambat;

        // Tampilkan hasil
        if (hariTerlambat <= 0) {
            System.out.println("Anda tidak dikenakan denda.");
        } else {
            System.out.println("Anda terlambat " + hariTerlambat + " hari, dan dikenakan denda sebesar Rp" + denda + ".");
        }
    }
}

class Buku {
    private String jenisBuku;
    private int denda;

    public Buku(String jenisBuku, int denda) {
        this.jenisBuku = jenisBuku;
        this.denda = denda;
    }

    public String getJenisBuku() {
        return jenisBuku;
    }

    public int getDenda() {
        return denda;
    }
}
