package Constructor;

public class constructor {
	 public int i;
	public static void main(String[] args) {
		constructor cp=new constructor(100);
		System.out.println(cp.i);
	}
	public constructor() {
		i=20;

	}
	public constructor(int a) {
		i=a;
		
	}
}
