import java.util.*;
public class JunitEx {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		assert a>5:"Error";
		System.out.println(a);
		

	}

}
