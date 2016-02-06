package comp.aw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.util.Enumeration;

import java.io.IOException;

public class TestClass {
	int dat;
	public static BufferedReader input;
	public static OutputStream output;
public TestClass() {
	
	try {
		SerialClass obj = new SerialClass();
		int c = dat;
		obj.initialize();
		input = SerialClass.input;
		output = SerialClass.output;
		
		InputStreamReader Ir = new InputStreamReader(System.in);
		BufferedReader Br = new BufferedReader(Ir);
		while (c != 3) {
			System.out.println("LED ON / OFF MENU.");
			System.out.println("1.LED ON");
			System.out.println("2.LED OFF");
			System.out.print("Enter your choice :");
			c = Integer.parseInt(Br.readLine());
 
			switch (c) {
			case 1:
				writeData("1");
				break;

			case 2:
				writeData("0");
				break;

			case 3:
				System.exit(0);
			}
		}

		String inputLine = input.readLine();
		System.out.println(inputLine);

		obj.close();

	} catch (Exception e) {
	}	// TODO Auto-generated constructor stub
}
	public static synchronized void writeData(String data) {
		System.out.println("Sent: " + data);
		try {
			output.write(data.getBytes());
		} catch (Exception e) {
			System.out.println("could not write to port");
		}
	}

	public static void main(String[] ag) {
  new TestClass();
	}
	public int abc(int dta) {
		dat = dta;
		return dta;
	}
}