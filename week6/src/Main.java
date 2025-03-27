public class Main {
    public static void main(String[] args) {
        Point p;
        Rectangle r1 = new Rectangle(p,3,4);
        System.out.println(r1.counterforobject);
        System.out.println(Rectangle.counter);
        Rectangle r2 = new Rectangle(p,5,6);
        System.out.println(r1.counterforobject);
        System.out.println(r2.counterforobject);
        System.out.println(Rectangle.counter);

        System.out.println(Integer.max(3,4));
        System.out.println(Integer.parseInt("1"));
        String s = "aaa";
        System.out.println(r1);
    }
}