import java.io.*;

public class PracticeProblem {

	public static void main(String args[]) {

	}
public static String readFile(String fileName){
	String contents = "";
	BufferedReader inputStream = null;
	
	try{
		String line;
inputStream = new BufferedReader(new FileReader(fileName));
while((line = inputStream.readLine()) != null){
contents = contents + line + "\n";
}
	}

	catch(IOException e){
		System.out.println("IOE exception");
	}
	finally{
		try{
			if (inputStream != null){
				inputStream.close();
			}

		}
		catch(IOException e){
			System.out.println("IOE exception");
		}
	}
	return contents;
}
	
public static String backwardsReadFile(String fileName){
	String contents = "";
	BufferedReader inputStream = null;
	
	try{
		String line;
inputStream = new BufferedReader(new FileReader(fileName));
while((line = inputStream.readLine()) != null){
contents = contents + line + "\n"; 
}
	}

	catch(IOException e){
		System.out.println("IOE exception");
	}
	finally{
		try{
			if (inputStream != null){
				inputStream.close();
			}

		}
		catch(IOException e){
			System.out.println("IOE exception");
		}
	}
String bwd = "";
	for (int i = contents.length()-1; i >= 0; i--){
		bwd = bwd + contents.charAt(i);
	}
	return bwd;
}
}
