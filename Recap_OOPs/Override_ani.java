class Animals{

	void sound()
		{
			System.out.println("Animal Sound");
		}

}

class Cat extends Animals{
			void sound()
				{
					System.out.println("Cat meows");
				}

	}



public class Override_ani{

	public static void main(String args[])
	{
		Animals  obj = new Cat();
		obj.sound();
	}
}