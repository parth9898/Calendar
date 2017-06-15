package interfaces;
interface Eng
{
void parts();	
}
interface power
{
	void pw();
}
public class Engine implements power {

	public void pw() {
		System.out.println("Engine is 1500cc");
		
	}

	public static void main(String[] args)
	{
		power B1 = new Engine();
		B1.pw();
	
	}
}
