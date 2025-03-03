class Main
{
	static long x= 0;

	public static void hello()
	{
		if(x==98989569)
		{
			return;
		}
		System.out.println("Harshil" + "-" + x);
		x++;
		hello();
	}

	public static void main(String[] args) {
		hello();
	}
}