import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {
	public static void main(String[] args) throws IOException {
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello");
		System.out.println(p1.toString()); //표현형 반환
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello");
		p2.close();
	}
}
