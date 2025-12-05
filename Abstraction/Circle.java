public class Circle extends Shape{
     int r=7;
    double areac;
    @Override
    double area(){
    areac=(Math.PI)*r*r;
    return areac;
    }
    
}
