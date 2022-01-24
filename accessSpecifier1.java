package modifier1;
class defAccessSpecifier
{
	void display()
	{
		System.out.println("default accesss pecifier");
		
	}
}


public class accessSpecifier1
{
public static void main(String[]args)
{
	System.out.println("default");
	defAccessSpecifier obj = new defAccessSpecifier();
	obj.display();
}
}