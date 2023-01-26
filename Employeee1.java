public class Employeee1 {
    int id;
    String dept;

    public Employeee1(int idd, String dep) {
        id = idd;
        dept = dep;
    }

    public static void main(String[] args) {
        Employeee1 vro = new Employeee1(34,"boomer");
        System.out.println(vro.dept);
    }
}