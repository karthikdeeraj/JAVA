public class Employee {
    int eid;
    String name;
    String department;
    int salary = 40000;

    void increaseSalary(int x){
        salary = salary + x;

    }
    void eDetails(int eid,String name,String department){
        System.out.println(eid);
        System.out.println(name);
        System.out.println(department);
        System.out.println(salary);
    }
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.increaseSalary(5000);
        employee.eDetails(200,"Karthik","Web develpment");
    }
}
