package practice;
//how to create custom exception...


class AgeInvalidException extends Exception
{

	AgeInvalidException()
	{
		super("Age is invalid !");
	}

	AgeInvalidException(String message)
	{
		super(message);
	}

}




class Ex
{
	public static void main(String[] args) {
		System.out.println("Started...");//starting ...


		try
		{
			int n1=1;
			int n2=0;
			System.out.println("We have got two numbers..");
			int result=n1/n2;
			System.out.println("Division is "+result);

			

		}
		catch(ArithmeticException  | NumberFormatException e)
		{
			
			System.out.println(e.getMessage());	
		}

		
		
		finally
		{
			//always gets executed ..
			System.out.println("i am in finally block");
			System.out.println("closing all the resources...");
		}

		//100

		System.out.println("Terminated..");//ending point
	}}