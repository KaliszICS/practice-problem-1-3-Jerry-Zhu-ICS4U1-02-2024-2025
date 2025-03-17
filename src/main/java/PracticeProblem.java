public class PracticeProblem {

	public static void main(String args[]) {

	}
public static String readfile(String fileName){
	String contents = "";
	BufferedReader inputStream = null;
	
	try{
		String line;
inputStream = new BufferedReader(new FileReader(fileName));
while(line = inputStream.readLine() != null){
contents = contents + line;
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
	
public static String backwardsReadfile(String fileName){
	String contents = "";
	BufferedReader inputStream = null;
	
	try{
		String line;
inputStream = new BufferedReader(new FileReader(fileName));
while(line = inputStream.readLine() != null){
contents = contents + line; 
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
	for (int i = contents.length(); i > 0; i--){
		bwd = bwd + contents.charAt(i);
	}
	return bwd;
}
}
