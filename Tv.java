package interfaces;
interface HD
{
void HD1();
}
interface FULLHD
{
	void FHD();
	
}
interface fourk extends HD,FULLHD
{
	void display();
}
public class Tv  implements fourk
{

	public void display() {
		System.out.println("4k display resolution is good");
		
		
	}

	public void FHD() {
		System.out.println("FHD display resolution is 1820p");
		
	}

	public void HD1() {
		
	}
public static void main(String[] args)
{
	 fourk B1 = new Tv();
	B1.display();
	B1.FHD();
	
	
	
}
	
}
