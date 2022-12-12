
package sheet3_2;

public class triangle {
    private double  a;
     private double b;
     private double c;
    private double h;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setHeight(double h) {
        this.h = h;
    }

   
    
       void triangle_circumference() 
    {
        System.out.println(a+b+c);
    }
    void triangle_Area()
    {
        System.out.println(.5*b*h);
    }

    
    
}

