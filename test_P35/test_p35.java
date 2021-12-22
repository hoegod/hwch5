package hwch5;

import java.io.PrintWriter;
import java.io.FileWriter;

import java.io.BufferedWriter;

import java.io.IOException;
public class test_p35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileWriter fw = new FileWriter("text1.txt");
	PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
	pw.println("Hello");
	pw.println("GoodBye!");
	pw.close();
	System.out.println("資料己經寫寫入檔案了");
}
catch(IOException e) {
	System.out.println("輸出入錯誤");
}
	}

}
