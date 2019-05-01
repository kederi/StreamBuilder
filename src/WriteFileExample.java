import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileExample {

	public static void main(String[] args) {
		
		String fileName = "MyData.txt";
		String data = createTextData();
		writeFile(data, fileName);
		writeFile(fileName);

	}

	private static void writeFile(String data, String fileName) {

		File file;
		FileOutputStream output = null;
		
		try {
			file = new File(fileName);
			output = new FileOutputStream(file);
			
			if (!file.exists()) {
				file.createNewFile();
			}
			
			byte[] yikes = data.getBytes();
			output.write(yikes);
			
			output.flush();
			
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (output != null) {
					output.close();
				}
			}
			catch (IOException e) {
					e.printStackTrace();
			}
				
		}
	}
	
	private static void writeFile(String fileName) {

		
		try (FileOutputStream output = 
				new FileOutputStream(new File(fileName)))
		{
			
			for(int index = 0; index < 255; ++index) {
				output.write(index);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	private static String createTextData() {
		String[] values = {"four", "six", "three"};
		
		StringBuffer buffer = new StringBuffer();
		
		for(String str: values) {
			buffer.append(str);
			buffer.append(" ");
		}
				
		return buffer.toString();
	}

}
