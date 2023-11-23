package datatypes;

public class Logical {
    public static void main(String[] args) {
        //Logical OR (ИЛИ, +)
        boolean a = false;
        boolean b = false;
        System.out.println(a||b);
         a = true;
         b = false;
        System.out.println(a||b);
         a = true;
         b = true;
        System.out.println(a||b);

        //Logical AND (И, *)
         a = false;
         b = false;
        System.out.println(a&&b);
        a = true;
        b = false;
        System.out.println(a&&b);
        a = true;
        b = true;
        System.out.println(a&&b);

        //Logical NOT
        a = false;
        System.out.println(!a);
        a = true;
        System.out.println(!a);
    }
}
