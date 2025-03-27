public class Rectangle {
    private Point topLeft;
    private int sideA, sideB;
    static int counter = 0;
    public int counterforobject =0;


    public Rectangle(Point topLeft,int sideA, int sideB) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideB);
    }

    public Rectangle(Point topLeft,int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA);

        setSideB(sideB);
    }
    public Point getTopLeft(){
        return topLeft;
    }
    public void setTopLeft(Point topLeft){
        this.topLeft = topLeft;
        count++;
    }
    public int getSideB(){
        return sideB;
    }
    public void setSideB(int SideB){
        if(sideB<0){
            this.sideB=0;
            System.out.println("Side B is negative");
        }else{
            this.sideB = sideB;
        }
    }
    public void setSideA(int SideA){
        if(sideA<0){
            throw new IllegalArgumentException("Side A cannot be negative");

        }else{
            this.sideB = sideB;
        }
    }
    public int getSideA(){
        return sideA;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "topLeft=" + topLeft +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", counterforobject=" + counterforobject +
                '}';
    }

    public int setSideA(int sideA) {
        if (sideA <= 0) {
            throw new IllegalArgumentException("Side A cannot be negative");
        }else{
            this.sideA = sideA;
        }


        public int perimeter () {
            return (2 * sideA) + (2 * sideB);
        }
        public int area() {
            return sideA * sideB;
        }
        Rectangle r1 = new Rectangle(
                new Point(3, 4),
                3, 4
        );

        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB());
        System.out.println(r1.getTopLeft().xCoord);
        System.out.println(r1.getTopLeft().yCoord);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        Circle c1 = new Circle(
                new Point(3,4),
                5
        );
        System.out.println(c1.getRadius());
        c1.setRadius(-21);
        System.out.println(c1.getRadius());





    }

}
