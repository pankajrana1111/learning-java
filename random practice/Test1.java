public class Test1{
	{System.out.println("This is a code block");}
	private int guru = 20;
	Test test = new Test();
	
	private Test1 (){
	System.out.println("Initializing Constructor");
	}
	{System.out.println("This is second code block");}
	public static void main(String[] args){
	Test1 test1 = new Test1();
	System.out.println(test1.guru);
	test1.method();
	}
	public static void method(){
	Test1 test1 = new Test1();
	System.out.println(test1.guru);
	}
}
