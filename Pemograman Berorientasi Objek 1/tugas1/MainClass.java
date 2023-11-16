package tugas1;

public class MainClass {
    public static void main(String[] args) {
        Handphone hp1 = new Handphone();
        hp1.setMerk("Samsung");
        hp1.setTipe("Galaxy S21");

        Handphone hp2 = new Handphone();
        hp2.setMerk("Apple");
        hp2.setTipe("iPhone 13");

        Handphone hp3 = new Handphone();
        hp3.setMerk("Xiaomi");
        hp3.setTipe("Mi 11");

        Toko tokoHp = new Toko();
        tokoHp.setNamaToko("Toko Elektronik Bandung");
        tokoHp.setTipeHandphone(hp1.getTipe());
        tokoHp.setTipeHandphone(hp2.getTipe());
        tokoHp.setTipeHandphone(hp3.getTipe());

        System.out.println("Toko " + tokoHp.getNamaToko());
        System.out.println("Menjual berbagai tipe handphone dengan merk dan tipe : ");
        System.out.println(" Merk " + hp1.getMerk() + " dengan Tipe " + hp1.getTipe());
        System.out.println(" Merk " + hp2.getMerk() + " dengan Tipe " + hp2.getTipe());
        System.out.println(" Merk " + hp3.getMerk() + " dengan Tipe " + hp3.getTipe());
    }
}
