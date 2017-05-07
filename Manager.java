package example;

public class Manager {
public static void main(String[] args){ 
	Twowheeler a1=new Twowheeler();
	System.out.println("cost of the two wheeler is"+a1.getcost()+"rupees");
	System.out.println("speed of the two wheeler is"+a1.getspeed()+"speed/second");
	Threewheller a2=new Threewheller();
	System.out.println("cost of the three wheeler is"+a2.getcost()+"rupees");
	System.out.println("speed of the three wheeler is"+a2.getspeed()+"speed/second");
	Fourwheller a3=new Fourwheller();
	System.out.println("cost of the four wheeler is"+a3.getcost()+"rupees");
	System.out.println("speed of the four wheeler is"+a3.getspeed()+"speed/second");
}
}