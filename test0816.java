//1.按照代码书写顺序，执行定义和构造代码块
//2.再去执行构造方法
class Parent{
	static{
		System.out.println("A");
	}
	static{
		System.out.println("B");
	}
}
public class test0816 extends Parent{
	private static int initB(){
		System.out.println(1);
		return 0;
	}
	
	static int a = initA();
	
	static{
		System.out.println(2);
	}
	
	static int b = initB();
	
	private static int initA(){
		System.out.println(3);
		return 0;
	}
	
	private static int initC(){
	    System.out.println(5);
		return 0;
	}
	
	static{
		System.out.println(4);
	}
    
    public static void main(String[] args){
		
	}	
	
}
// A,B,3,2,1,4