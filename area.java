package devops;

public class area {
	double b;
void circle()
{int r;
r=4;
double pi,circ;
pi=3.14;
circ=pi*r*r;
System.out.println("areaof a circle="+circ);

}
void triangle()
{
	double h,tri;
	b=5.0; h=6.0;
	tri=0.5*b*h;
	System.out.println("area of triangle="+tri);
}
void rectangle()
{
	double l,rect;
	l=5;
	rect=l*b;
	System.out.println("area of a rect="+rect);

}
public static void main(String args[]){
	area a1=new area();
	a1.triangle();
	a1.rectangle();
	a1.circle();}
}