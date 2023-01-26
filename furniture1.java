public class furniture1 {
    int width;
    int height;

    void display(String item) {
        System.err.println(item+" width "+width+" height "+height);
    }
    public static void main(String[] args) {
        Chair wow = new Chair();
        wow.foo();
    }

}
class Chair extends furniture1 {
    void foo() {
        width=19;
        height=54;
        display("chair");
    }
}
class Table extends furniture1 {
    void foo() {
        width=89;
        height=94;
        display("Table");
    }
}
class Almirah extends furniture1{
    void foo() {
        width=18;
        height=94;
        display("Almirah");
    }

}
//memory = n*8 bytes n is count of classes
//memory optimization
//code resuability
//faster dev