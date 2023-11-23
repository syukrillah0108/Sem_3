package uts;
// Class Dosen dengan atribut nama, pelajaran, dan kodeDosen
class Dosen {
  protected String nama;
  protected String pelajaran;
  protected String kodeDosen;

  // Constructor untuk mengisi atribut
  public Dosen(String nama, String pelajaran, String kodeDosen) {
    this.nama = nama;
    this.pelajaran = pelajaran;
    this.kodeDosen = kodeDosen;
  }

  // Method untuk menampilkan detail dosen
  public void Detail() {
    System.out.println("Nama: " + nama);
    System.out.println("Pelajaran: " + pelajaran);
    System.out.println("Kode Dosen: " + kodeDosen);
  }
}

// Class DosenBiasa yang merupakan subclass dari Dosen
class DosenBiasa extends Dosen {
  // Constructor untuk mengisi atribut, termasuk yang diwarisi dari Dosen
  public DosenBiasa(String nama, String pelajaran, String kodeDosen) {
    super(nama, pelajaran, kodeDosen); // Memanggil constructor dari superclass
  }

  // Method untuk menampilkan detail dosen biasa
  public void Detail() {
    System.out.println("Dosen Biasa");
    super.Detail(); // Memanggil method Detail dari superclass
  }
}

// Class DosenLuarBiasa yang merupakan subclass dari Dosen
class DosenLuarBiasa extends Dosen {
  // Constructor untuk mengisi atribut, termasuk yang diwarisi dari Dosen
  public DosenLuarBiasa(String nama, String pelajaran, String kodeDosen) {
    super(nama, pelajaran, kodeDosen); // Memanggil constructor dari superclass
  }

  // Method untuk menampilkan detail dosen luar biasa
  public void Detail() {
    System.out.println("Dosen Luar Biasa");
    super.Detail(); // Memanggil method Detail dari superclass
  }
}

// Class utama untuk menguji program
public class DosenTest {
  public static void main(String[] args) {
    // Membuat objek dari class DosenBiasa
    DosenBiasa db1 = new DosenBiasa("Rina", "Matematika", "DB001");
    // Membuat objek dari class DosenLuarBiasa
    DosenLuarBiasa dlb1 = new DosenLuarBiasa("Budi", "Fisika", "DLB001");

    // Menampilkan output dari objek db1
    db1.Detail();

    // Menampilkan output dari objek dlb1
    dlb1.Detail();
  }
}
