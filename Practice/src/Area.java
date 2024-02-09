public class Area {
    int r;
    int l;
    int b;

    void circle (int r) {
        System.out.println(3.14*r*r);
    }
    void rectangle (int l, int b){
        System.out.println(l*b);
    }
    public static void main(String[] args)
    {
        Area area = new Area();
        area.circle(3);
        area.rectangle(3,4);


    }
}
