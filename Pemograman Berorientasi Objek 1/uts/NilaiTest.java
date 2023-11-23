package uts;
// Class Nilai dengan atribut quis, uts, dan uas
class Nilai {
  private double quis;
  private double uts;
  private double uas;

  // Constructor untuk class Nilai
  public Nilai() {
    // Nilai awal jika diperlukan
    quis = 0;
    uts = 0;
    uas = 0;
  }

  // Method untuk mengisi nilai quis
  public void setQuis(double x) {
    quis = x;
  }

  // Method untuk mengisi nilai uts
  public void setUTS(double x) {
    uts = x;
  }

  // Method untuk mengisi nilai uas
  public void setUAS(double x) {
    uas = x;
  }

  // Method untuk mendapatkan nilai quis
  public double getQuis() {
    return quis;
  }

  // Method untuk mendapatkan nilai uts
  public double getUTS() {
    return uts;
  }

  // Method untuk mendapatkan nilai uas
  public double getUAS() {
    return uas;
  }

  // Method untuk menghitung dan mengembalikan nilai akhir
  public double getNA() {
    return 0.2 * quis + 0.3 * uts + 0.5 * uas;
  }

  // Method untuk menentukan dan mengembalikan index berdasarkan nilai akhir
  public char getIndex() {
    double na = getNA(); // Memanggil method getNA
    if (na >= 80 && na <= 100) {
      return 'A';
    } else if (na >= 68 && na < 80) {
      return 'B';
    } else if (na >= 56 && na < 68) {
      return 'C';
    } else if (na >= 45 && na < 56) {
      return 'D';
    } else {
      return 'E';
    }
  }

  // Method untuk menentukan dan mengembalikan keterangan berdasarkan index
  public String getKeterangan() {
    char index = getIndex(); // Memanggil method getIndex
    switch (index) {
      case 'A':
        return "Sangat Baik";
      case 'B':
        return "Baik";
      case 'C':
        return "Cukup";
      case 'D':
        return "Kurang";
      case 'E':
        return "Sangat Kurang";
      default:
        return "Tidak Valid";
    }
  }
}

// Class utama untuk menguji program
public class NilaiTest {
  public static void main(String[] args) {
    // Membuat objek dari class Nilai
    Nilai nilai1 = new Nilai();
    // Mengisi nilai quis, uts, dan uas
    nilai1.setQuis(80);
    nilai1.setUTS(75);
    nilai1.setUAS(90);
    // Menampilkan output dari objek nilai1
    System.out.println("Nilai Quis: " + nilai1.getQuis());
    System.out.println("Nilai UTS: " + nilai1.getUTS());
    System.out.println("Nilai UAS: " + nilai1.getUAS());
    System.out.println("Nilai Akhir: " + nilai1.getNA());
    System.out.println("Index: " + nilai1.getIndex());
    System.out.println("Keterangan: " + nilai1.getKeterangan());
  }
}
