class Address{
    String city;
    int plot_no;
    Address(String city,int plot_no){
        this.city=city;
        this.plot_no=plot_no;
    }

}
public class Employee {
    String name;
    int id;
    Address address;
    Employee(String name,int id,Address address){
        this.name=name;
        this.id=id;
        this.address=address;
    }

}
class Main{
    public static void main(String[] args) {
        Address addressone=new Address("Delhi",1);
        Employee employeeOne=new Employee("sahil",101,addressone);

        System.out.println("name "+employeeOne.name);
        System.out.println("id: "+employeeOne.id);
        System.out.println("city "+employeeOne.address.city);
        System.out.println("plot_no "+employeeOne.address.plot_no);

    }
}
