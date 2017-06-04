package multitasking;

public class Sample extends Thread {
	public void run(){
		for (int i=0;i<1000;i++){
		System.out.println("new thread;"+i);
		}
	}
//	public static void main(String[] args) {
//		Sample obj1=new Sample();	
//		obj1.start();
//		for(int i=1000;i<2000;i++){
//		Thread.sleep(2000);
//		System.out.println("main thread;"+i);}	
//		}


public static void main(String[] args) {
	Sample obj1=new Sample();	
	obj1.start();
	for(int i=1000;i<2000;i++){
		try
		{
			Thread.sleep(30000);		
		}
		catch(Exception e)
		{
			
		}
	
	System.out.println("main thread;"+i);}	
	}

}
