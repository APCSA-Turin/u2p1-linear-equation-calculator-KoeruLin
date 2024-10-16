package com.example.project;
import java.text.DecimalFormat;

public class LinearCalculator
{
    //INSTANCE VARIABLES 
    //4 INTEGER variables (name them: x1,x2,y1,y2) 

    private int x1;
    private int x2;
    private int y1;
    private int y2;

    //CONSTRUCTOR
    //1 constructor with 2 String parameters. Each parameter represents a coordinate. 
    //For example, "(1,2)" and "(3,4)" would be two parameter values 
    //You will have to parse the string into 4 integers, representing the 2 points.
    public LinearCalculator(String firstCoordinate, String secondCoordinate)
    {
        x1 = Integer.parseInt(firstCoordinate.substring(1, 2));
        y1 = Integer.parseInt(firstCoordinate.substring(3, 4));
        x2 = Integer.parseInt(secondCoordinate.substring(1, 2));
        y2 = Integer.parseInt(secondCoordinate.substring(3, 4));

    }



    //METHODS
    //getters and setters for the 4 instance variables (8 methods total) 
    public int getX1()
    {
        return x1;
    }
    public int getY1()
    {
        return y1;
    }
    public int getX2()
    {
        return x2;
    }
    public int getY2()
    {
        return y2;
    }
    public void setX1(int x1)
    {
        this.x1 = x1;
    }
    public void setY1(int y1)
    {
        this.y1 = y1;
    }
    public void setX2(int x2)
    {
        this.x2 = x2;
    }
    public void setY2(int y2)
    {
        this.y2 = y2;
    }


    //distance() -> returns a double. 
    //calculates the distance between the two points to the nearest HUNDREDTH and returns the value.
    public double distance()
    {
        DecimalFormat format = new DecimalFormat("#.##");
        String stringDistance = format.format((x2 - x1) / (y2 - y1));
        return Double.parseDouble(stringDistance);
    }
    //yInt() -> returns a double.
    //calculates the y intercept of the equation and returns the value to the nearest HUNDREDTH
    //if y-int if undefined, should return -999.99
    public double yInt(){
        return 0.0;
    }

    //slope() -> returns a double. 
    //calculates the slope of the equations and returns the value to the nearest HUNDREDTH
    //if slope is undefined, should return -999.99
    public double slope(){
        return 0.0;
    }

    //equations() -> returns a String.
    //calculates the final equation in y=mx+b form and returns the string
    //if the equation has no slope, the equation should return -> "undefined"
    //HINT: You may need other custom methods to decrease the amount of code in the equations() method
    public String equation(){
        return "";
    }


    //roundedToHundredth(double x)-> returns double
    //calculates the input to the nearest hundredth and returns that value
    public double roundedToHundredth(double x){
        return 0.0;
    }

    //printInfo() -> returns a string of information
    //this method is tested but you can also call it in your main method if gradle tests are 
    //not working. 
    public String printInfo(){
        String str = "The two points are: (" + x1 + "," + y1 + ")";
        str += " and " + "(" + x2 + "," + y2 + ")";
        str += "\nThe equation of the line between these points is: " ;
        str += "\nThe slope of this line is: ";
        str += "\nThe y-intercept of the line is: ";
        str += "\nThe distance between the two points is: ";
 
        return str;
    }



}