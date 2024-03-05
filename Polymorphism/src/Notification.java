public class Notification {
    void sendNotification(String email,String firstname, String Lastname){
        System.out.println(email);
        System.out.println(firstname);
        System.out.println(Lastname);
        System.out.println("you will receive notifications through the provided email");
    }
    void sendNotification(int ccode,int pnum,String firstname, String Lastname){
        System.out.println(ccode);
        System.out.println(pnum);
        System.out.println(firstname);
        System.out.println(Lastname);
        System.out.println("You has been subscribed to notifications for the above number");
    }
    void sendNotification(String mos, int pnum, String password, String signup){
        System.out.println(mos);
        System.out.println(pnum);
        System.out.println(password);
        System.out.println(signup);
        System.out.println("You have been signed up, Please enable app notifications in your mobile inorder ro receive notifications");
    }
public static void main(String[] args){
        Notification notification=new Notification();
        notification.sendNotification("k@email.com","Karthik","T");
}
}
