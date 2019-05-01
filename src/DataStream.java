import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DataStream {
	private static final int SIZE = 100;

	public static void writeArray() {
		
		String fileName = "OUrData.dat";
		try(
				ObjectOutputStream output =
				new ObjectOutputStream(new FileOutputStream(fileName));)
				
		{
			int[] values = new int[SIZE];
			String[] strings = new String[SIZE];
			
			for(int index = 0; index < SIZE; ++index) {
				values[index] = index;
				strings[index] = String.valueOf(index);
			}
			
			output.writeObject(values);
			output.writeObject(strings);
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}

	public static void main(String[] args) {
		

		String fileName = "YourData.dat";
		try(

				DataOutputStream output =
				new DataOutputStream(new FileOutputStream(fileName));)
				
		{
			output.writeUTF("CS2334");
			output.writeDouble(2334.0);
			output.writeInt(2334);
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		
		try(
				DataInputStream input =
				new DataInputStream(new FileInputStream(fileName));)
				
		{
			//String str = input.readUTF();
			//Double dbl1 = input.readDouble();
			Integer int1 = input.readInt();
			Double dbl1 = input.readDouble();
			String str = input.readUTF();
			
			System.out.println(str);
			System.out.println(dbl1);
			System.out.println(int1);
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		
		writeArray();
	

	}

}
