import java.util.Scanner;

public class Phone {
    private String merek;
    private int qty;
    private int harga;
    private int totalHarga;

    public Phone(String mrk, int qty, int hg) {
        this.merek = mrk;
        this.qty = qty;
        this.harga = hg;
        this.totalHarga = hg * qty;
    }

    public void lihatPhone() {
        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println("                merek : " + merek);
        System.out.println("               jumlah : " + qty);
        System.out.println("                harga : " + harga);
        System.out.println("          total harga : " + totalHarga);
        System.out.println("----------------------------------------------");
        System.out.println("");
    }

    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan nama handphone : ");
        String phoneName = input.nextLine();
        
        System.out.println("masukan harga handphone : ");
        String phonePrice = input.nextLine();

        System.out.println("masukan total pembelian handphone : ");
        String phoneBuyQty = input.nextLine();

        Phone p1 = new Phone(phoneName, Integer.parseInt(phoneBuyQty), Integer.parseInt(phonePrice));
        p1.lihatPhone();
    }
}