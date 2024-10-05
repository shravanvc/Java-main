

public class Function {
    public static void p(){
        System.out.println("Hello Java");
    }
    public static void n(String name){
        System.out.println(name);
    }
    public static void s(int a, int b){
        int sum = a + b ;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        n("aman");
        n("akku");
        p();
        s(4,6);
    }
    
}
