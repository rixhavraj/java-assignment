//MY BILLS 

public class ProductBilling {
    public double bill(double p1) {
        return p1;
    }
    public double bill2(double p1, double p2) {
        return p1 + p2;
    }
    public double bill3(double p1, double p2, double p3) {
        return p1 + p2 + p3;
    }
    public static void main(String[] args) {
     ProductBilling pb = new ProductBilling();
        System.out.println("RJ bill: "+pb.bill(100));
        System.out.println("RR bill: "+pb.bill2(100, 200));
        System.out.println("PJ bill: "+pb.bill3(100, 200, 300));

        System.out.println("------END------");
}
    }