import java.time.LocalDate;
public class Member {
    int mid;
    String name;
    String m_type;
    LocalDate startDate;
    

    void upgrade(String m_type){
     System.out.println("Membership upgraded to " +m_type);
    }
    void displayDetails(int mid,String name,String m_type,LocalDate startDate){
        System.out.println(mid);
        System.out.println(name);
        System.out.println(m_type);
        System.out.println(startDate);
    }
    public static void main(String[] args){
        Member member = new Member();
        member.displayDetails(154,"Fahad","Standard",LocalDate.of(2021, 12, 15));
        member.upgrade("Premium");

    }
}
