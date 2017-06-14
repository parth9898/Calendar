package interfaces;
interface MyInterface
{
  
   public void Color();
   
}
 class Animal implements MyInterface
{
	public void Color()
	{
		System.out.println("All colors are different");
	}
  
  public static void main(String arg[])
  {
      MyInterface obj = new  Animal();
      obj.Color();
  }

}