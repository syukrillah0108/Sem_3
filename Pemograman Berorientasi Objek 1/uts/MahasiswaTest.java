package uts;
// Class Mahasiswa dengan atribut nim, nama, dan notlp
class Mahasiswa {
  private int nim;
  private String nama;
  private String notlp;

  // Constructor untuk mengisi atribut
  public Mahasiswa(int nim, String nama, String notlp) {
    this.nim = nim;
    this.nama = nama;
    this.notlp = notlp;
  }

  // Setter dan getter untuk nim
  public void setNim(int nim) {
    this.nim = nim;
  }

  public int getNim() {
    return nim;
  }

  // Setter dan getter untuk nama
  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getNama() {
    return nama;
  }

  // Setter dan getter untuk notlp
  public void setNotlp(String notlp) {
    this.notlp = notlp;
  }

  public String getNotlp() {
    return notlp;
  }
}

// Class MahasiswaInter yang merupakan subclass dari Mahasiswa
// Memiliki atribut tambahan noPaspor dan kebangsaan
class MahasiswaInter extends Mahasiswa {
  private String noPaspor;
  private String kebangsaan;

  // Constructor untuk mengisi atribut, termasuk yang diwarisi dari Mahasiswa
  public MahasiswaInter(int nim, String nama, String notlp, String noPaspor, String kebangsaan) {
    super(nim, nama, notlp); // Memanggil constructor dari superclass
    this.noPaspor = noPaspor;
    this.kebangsaan = kebangsaan;
  }

  // Setter dan getter untuk noPaspor
  public void setNoPaspor(String noPaspor) {
    this.noPaspor = noPaspor;
  }

  public String getNoPaspor() {
    return noPaspor;
  }

  // Setter dan getter untuk kebangsaan
  public void setKebangsaan(String kebangsaan) {
    this.kebangsaan = kebangsaan;
  }

  public String getKebangsaan() {
    return kebangsaan;
  }
}

// Class utama untuk menguji program
public class MahasiswaTest {
  public static void main(String[] args) {
    // Membuat objek dari class Mahasiswa
    Mahasiswa mhs1 = new Mahasiswa(12345, "Budi", "08123456789");
    // Membuat objek dari class MahasiswaInter
    MahasiswaInter mhs2 = new MahasiswaInter(67890, "Alice", "09876543210", "A123456", "Australia");

    // Menampilkan output dari objek mhs1
    System.out.println("Data mahasiswa lokal:");
    System.out.println("NIM: " + mhs1.getNim());
    System.out.println("Nama: " + mhs1.getNama());
    System.out.println("No. Telp: " + mhs1.getNotlp());

    // Menampilkan output dari objek mhs2
    System.out.println("Data mahasiswa internasional:");
    System.out.println("NIM: " + mhs2.getNim());
    System.out.println("Nama: " + mhs2.getNama());
    System.out.println("No. Telp: " + mhs2.getNotlp());
    System.out.println("No. Paspor: " + mhs2.getNoPaspor());
    System.out.println("Kebangsaan: " + mhs2.getKebangsaan());
  }
}
