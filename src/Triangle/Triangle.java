package Triangle;

public class Triangle {
    private final double sideA;
    private final double sideB;
    private final double sideC;
    private static int currentCount;

   public Triangle(){
       currentCount++;
        this.sideA=1.0;
        this.sideB=1.0;
        this.sideC=1.0;
    }
    public Triangle(double x){
        currentCount++;
       this.sideA=x;
       this.sideB=x;
       this.sideC=x;
    }
    public Triangle(double x, double y){
       this.sideA=x;
       this.sideB=y;
       this.sideC=x;
        currentCount++;
    }
    public Triangle(double x, double y,double z){
        currentCount++;
       this.sideA=x;
       this.sideB=y;
       this.sideC=z;
    }
     public Triangle(Triangle other){
         currentCount++;
       this.sideA=other.sideA;
       this.sideB=other.sideB;
       this.sideC=other.sideC;
    }
//can use this
//    public void setSideA(double sideA) {
//        this.sideA = sideA;
//    }

    public double getSideA() {
        return sideA;
    }
//can use this
//    public void setSideB(double sideB) {
//        this.sideB = sideB;
//    }

    public double getSideB() {
        return sideB;
    }

    //can use this
//    public void setSideC(double sideC) {
//        this.sideC = sideC;
//    }

    public double getSideC() {
        return sideC;
    }
    public static int objectCount(){
       return currentCount;
    }
    public double perimeters(){
       return this.getSideA()+this.getSideB()+this.getSideC();
    }
//    protected boolean isRightAngled(){
//
//           return true;
//
//    }

    @Override
    public String toString() {
        return "Side A "+getSideA()+" Side B "+getSideB()+" Side C "+getSideC();
    }
}
