package hwch5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test_p32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("請輸入字串");
try {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String str = br.readLine();
	System.out.println("己輸入字串"+str);
}
catch(IOException e) {
	System.out.print("輸入輸出有誤");
}
	}

}
