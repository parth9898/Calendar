package interfaces;

public class Swift extends Engine implements Eng
{
public void color()
{
	System.out.println("swift color are red");
	
	
}
public void parts()
{
	System.out.println(" All parts are very costly");
	
}
public static void main(String args[])
{
	Swift D1 = new Swift();
	D1.color();
	D1.parts();
	D1.pw();
}
}
