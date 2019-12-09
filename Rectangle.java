
/**
 * Write a description of class Rectangle here.
 * This Class will produce the AREA of Rectangle ****
 * @author David Jason Bowlby
 * @version December 9, 2019
 */
public class Rectangle
{
    // instance variables - replace the example below with your own
    private double width;
    private double length;
    public double area;
    
    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(double width,double length)
    {
        // initialise instance variables
        width = 0.0;
        length = 0.0;
        area = 0.0;
    }
    
    //Set and Get Width ****
    public void setWidth (double newWidth)
    {
        this.width = newWidth;
    }
    public double getWidth()
    {
        return width;
    }
    
    //Set and Get Length ****
    public void setLength (double newLength)
    {
        this.length = newLength;
    }
    public double getLength()
    {
        return length;
    }
    
    //Calculate AREA ****
    public double area(double width, double length)
    {
        // put your code here
        return (width * length);
    }
}
