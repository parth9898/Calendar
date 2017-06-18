package interfaces;
interface vcall
{
	void videocall();
	
}

public class Sandroid extends Samsung implements vcall
{
void HD()
{
	System.out.println("HD display are available");
}
void multitask()
{
	System.out.println("provide multitasking Function ");
	
}
public void videocall() {
	// TODO Auto-generated method stub
	System.out.println("provide Video calling Feature");
}
public static void main(String[] args)
{
	Sandroid AB = new Sandroid();
	AB.call();
	AB.message();
	AB.HD();
	AB.multitask();
	AB.videocall();
	
	
}
}
