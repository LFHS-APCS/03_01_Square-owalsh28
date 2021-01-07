
public class Square 
{
  private double side;



public final int MAX_SIDE_LENGTH = 10;
public Square() {
  side = 2.0;

}
public Square(double theSide) {
  //if (theSide<= MAX_SIDE_LENGTH) {

  
  side = theSide;
 // }
 // else side = 2.0;
}
public void getSide() {
  System.out.println(side);
  
}
public void setSide(double theSide) { 
  side = theSide;

}
}





