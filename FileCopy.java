package firstjavalab;
    import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class FileCopy {

		public static void main(String[] args) {
			String str="My name is Rony Sebastian Tomson";
			char [] data=new char[50];
			FileWriter input=null;
			FileWriter output=null;
			FileReader string=null;
			try {
				input=new FileWriter("input.txt");
				output=new FileWriter("output.txt");
				input.write(str);
				input.flush();
				input.close();
				string=new FileReader("input.txt");
				int bytes=string.read(data);
				string.close();
				output.write(data,0,bytes);
				output.flush();
				output.close();
				
			}
			catch(IOException e){
				e.printStackTrace();
				
			}
		}

	}

