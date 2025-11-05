package day7;
interface Operation{
    int execute(int a,int b);
}
public class Lambda { public static void main(String[] args) {
    Operation add = (a,b) -> a+b;
    System.out.println(add.execute(525,5));

    Operation sub=(a,b)->a-b;
    System.out.println(sub.execute(45,60));

    Operation mul=(a,b)->a*b;
    System.out.println(mul.execute(133,5));

    Operation div=(a,b)->a/b;
    System.out.println(mul.execute(13,5));

}
}

