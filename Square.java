
public class Square 
{ private double area;
  private double side;
public final int MAX_SIDE_LENGTH = 10;
public Square() {
 
}
public Square(double theSide) { 
  side = theSide;
}
public void  getSide() {
  //if (side <= 10) {
System.out.println(side);
 // } else System.out.println("side is too long");
  
}
public void setSide(double theSide) { 
  side = theSide;
}
public String toString() {
  return "square with side length = " + side;
}
public void getArea() { 
 area = side * side;

  System.out.println("the area is " + area);
}






}



