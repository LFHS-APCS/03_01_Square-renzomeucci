public class Square{
private double side;
public final int MAX_SIDE_LENGTH = 10 ;
public Square(double numDouble )
{
  side = numDouble;
}
public void setSide(double theSide){
  if (theSide >= 0 && theSide <= MAX_SIDE_LENGTH)
  side = theSide;
}
public double getSide(){
  return side;
}
public String toString(){
  return "Square with side length = "+ side;
}
public double area(){
  double area = side * side;
  return area;
}
public double diagonal(){
  return Math.sqrt(2) * side;
}
}
