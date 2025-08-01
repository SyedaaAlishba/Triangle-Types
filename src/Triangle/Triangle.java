package Triangle;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private static int currentCount;

   public Triangle(){
        this.sideA=1.0;
        this.sideB=1.0;
        this.sideC=1.0;
    }
    public Triangle(double x){
       this.sideA=x;
       this.sideB=x;
       this.sideC=x;
    }
    public Triangle(double x, double y){
       this.sideA=x;
       this.sideB=y;
       this.sideC=x;
    }
    public Triangle(double x, double y,double z){
       this.sideA=x;
       this.sideB=y;
       this.sideC=z;
    }
     public Triangle(Triangle other){
       this.sideA=other.sideA;
       this.sideB=other.sideB;
       this.sideC=other.sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideC() {
        return sideC;
    }
    protected int objectCount(){
       return currentCount;
    }
    protected double perimeters(){
       return this.getSideA()+this.getSideB()+this.getSideC();
    }
    protected boolean isRightAngled(boolean flag){
       if(flag==true){
           return true;
       }else{
           return false;
       }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
