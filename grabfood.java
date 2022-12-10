public class grabfood extends ojol{
    private String makanan;
    private int harga;
    private int total;
    private int ongkir = 2000;

    grabfood(String makanan1, int harga1){
        this.makanan = makanan1;
        this.harga = harga1;
    }


    public double food(){
        total = harga + ongkir;
        return total;
    }

    void displaygrabfood(){
        System.out.println("Anda memilih : " + makanan);
        System.out.println("Total order : " + food());
    }
}
