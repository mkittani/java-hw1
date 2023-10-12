import static java.lang.Math.*;
import static java.lang.System.*;
public class test1{
	public static void main(String args[]){
//		shape a=new shape();
//		shape x=new shape("black", false);
//		out.printf("\tcolor from getColor= %s, filled= %s",x.getColor(),x.isFilled());


		
		circle m=new circle();
		circle y=new circle(2);
		circle z=new circle(4,"red",false);
		out.printf("\tarea of circle from getArea= %.2f, and the perimeter of getPerimeter= %.2f",z.getArea(),z.getPerimeter());
		


//		rectangle g=new  rectangle(3.0,4.0,"yellow",true);
//		out.printf("\tgetWidth= %.2f, getLength= %.2f, getArea= %.2f, getPerimeter= %.2f",g.getWidth(), g.getLength(), g.getArea(), g.getPerimeter());
//		square sq =new square(10,"blue",false);
//		out.printf("\tgetSide= %.2f", sq.getSide());

	}
}
public class shape{
	protected String color="red";
	protected boolean filled=true;
	public shape(){
		color="green";
		filled=true;
		out.printf("\n\nShape no args constructor: "+this);
	}
	public shape(String c, boolean f){
		color = c;
		filled=f;
		out.printf("\n\nShape two args constructor: "+this);
	}
	public String getColor(){return color;}
	public void setColor(String c){color =c;}
	public boolean isFilled(){return filled;}
	public void setFilled(boolean f){filled = f;}
	public String toString(){
		if(filled)
			return"A shape with color of "+color+" and filled";
		else
			return"A shape with color of "+color+" and NOT filled";
	}
}

public class circle extends shape{
	protected double radius =1.0d;
	public circle(){
		radius=1.0;
		out.printf("\n\nCircle no args constructor: "+this);
	}
	public circle(double r){
		radius=r; 
		out.printf("\n\nCircle one parameter constructor: "+this);
	}
	public circle(double r, String c, boolean f){
		super(c,f);
		radius=r;
		setFilled(f);
		setColor(c);
		out.printf("\n\nCircle three parameter constructor: "+this);
	}
	public double getRadius(){return  radius;}
	public void setRadius(double r){this.radius = r;}
	public double getArea(){return (pow(radius,2.0)*PI);}
	public double getPerimeter(){return(2*PI*radius);}
	public String toString(){return"A Circle with the radius= "+radius+" which is a subclass of "+super.toString();}
}

public class rectangle extends shape{
	protected double width=1.0d;
	protected double length=1.0d;
	public rectangle(){
		setWidth(1.0); 
		setLength(1.0); 
		out.printf("\n\nRectangle no args contructor: "+this);
	}
	public rectangle(double w, double l){
		setWidth(w);
		setLength(l);
		out.printf("\n\nRectangle two parameter constructor: "+this);
	}
	public rectangle(double w, double l, String c, boolean f){
		super(c,f);
		setColor(c);
		setFilled(f);
		setWidth(w);
		setLength(l);
		out.printf("\n\nRectangle four parameter constructor: "+this);
	}
	public double getWidth(){ return width;}
	public void setWidth(double w){width=w;}
	public double getLength(){return length;}
	public void setLength(double l){length=l;}
	public double getArea(){return length*width;}
	public double getPerimeter(){return length+width;}
	public String toString(){return"A Rectangle with width= "+width+" and length= "+length+" which is a sublcass of "+super.toString();}
}
public class square extends rectangle{
	protected double side =1.0d;
	public square(){setSide(1);}
	public square(double s){setSide(s);}
	public square(double s, String c, boolean f){
		super(s,s);
		setSide(s);
		setColor(c);
		setFilled(f);
		out.printf("\n\nSquare 3 parameters constructor: "+this);
	}
	public double getSide(){return side;}
	public void setSide(double s){side=s;}
	public void setWidth(double s){length=s;}
	public void setLength(double s){width=s;}
	public String toString(){return"A Square with side="+ side +", which is a subclass of "+super.toString();}
}



