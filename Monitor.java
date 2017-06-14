package interfaces;

public class Monitor extends Tv{
	public void display() {
		System.out.println("4k display resolution is good");
		
		
	}

	public void FHD() {
		System.out.println("FHD display resolution is 1820p");
		
	}

	public void HD1() {
		System.out.println("FHD display resolution is 720p");
		
	}
	public static void main(String[] args)
	{
		 Monitor B1 = new Monitor();
		B1.display();
		B1.FHD();
		B1.HD1();
		
		
		
	}

}
