public class TourPackage {
    int package_ID;
    String destination;
    int n_days;
    int price = 11500;
    void updatePrice(int x){
        price = price + x;
    }
    void packageDetails(int package_ID,String destination,int n_days){
        System.out.println(package_ID);
        System.out.println(destination);
        System.out.println(n_days);
        System.out.println(price);

    }
    public static void main(String[] args){
        TourPackage tour = new TourPackage();
        tour.updatePrice(2000);
        tour.packageDetails(153,"Ladakh",10);
    }
}
