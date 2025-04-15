import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class InputOutputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		FileInputStream
//		FileInputStream fis = null;
//        try {
//            // Create a FileInputStream to read from a file
//            fis = new FileInputStream("C:\\Sonali_Data\\eclipse_workspace\\Dummy\\src\\example.txt");
//
//            int content;
//            // Read until the end of the file is reached
//            while ((content = fis.read()) != -1) {
//                // Convert the byte to char and print
//                System.out.print((char) content);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (fis != null) {
//                    fis.close();
//                }
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
		
//		FileOutputStream
//		 FileOutputStream fos = null;
//	        try {
//	            // Create a FileOutputStream to write to a file
//	            fos = new FileOutputStream("C:\\\\Sonali_Data\\\\eclipse_workspace\\\\Dummy\\\\src\\\\example.txt");
//
//	            String data = "Hello, World!";
//	            // Convert string to byte array
//	            byte[] byteArray = data.getBytes();
//
//	            // Write byte array to file
//	            fos.write(byteArray);
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        } finally {
//	            try {
//	                if (fos != null) {
//	                    fos.close();
//	                }
//	            } catch (IOException ex) {
//	                ex.printStackTrace();
//	            }
//	        }
        
//		//Without BufferedReader:
//		try (FileReader fr = new FileReader("C:\\\\Sonali_Data\\\\eclipse_workspace\\\\Dummy\\\\src\\\\example.txt")) {
//            int character;
//            while ((character = fr.read()) != -1) {
//                // Process the character
//            	 System.out.print((char) character);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
		
//		// Without BufferedReader:
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\\\Sonali_Data\\\\eclipse_workspace\\\\Dummy\\\\src\\\\example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Process the line
            	System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
	}

}
