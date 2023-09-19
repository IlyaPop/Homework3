public class NumberSum {
    public void sum() {
        System.out.println(0);
    }
    public void sum(int a) {
        System.out.println(a);
    }
    public void sum(int a, int b) {
        System.out.println(a+b);
    }
    public void sum(int a, int b, int c) {
        System.out.println(a+b+c);
    }
    public void sum(int a, int b, int c, int d) {
        System.out.println(a+b+c+d);
    }

    public static void main(String[] args) {
        NumberSum sumObj = new NumberSum();
        sumObj.sum();
        sumObj.sum(5);
        sumObj.sum(1,2);
        sumObj.sum(1,2,3);
        sumObj.sum(1,2,3,4);
    }
}

