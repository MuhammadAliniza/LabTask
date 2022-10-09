package LabTaskOne;

public class Operators {
    public void arithmetic(int a, int b){

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        return;
    }
    public void logical(int a, int b){

        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a != b);
        System.out.println(a == b);
        System.out.println(a & b);
        System.out.println(a | b);

        return;
    }
    public void assignment(int a, int b){

        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a /= b);
        System.out.println(a *= b);
        System.out.println(a %= b);

        return;
    }
    public void increment_decrement(int a, int b){

        System.out.println("Post Increment" + a++);
        System.out.println("Post Decrement" + a--);
        System.out.println("Pre Increment" + ++a);
        System.out.println("Pre Decrement" + --a);

        return;
    }
}
