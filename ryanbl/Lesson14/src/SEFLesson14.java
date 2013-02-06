import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.HashSet;

public class SEFLesson14 {

	/**
	 * @param args
	 */
	
	public static void main(String [] args) {
		
		// Set up some data to save and restore.
		byte[] binaryData = new byte[5];
		for (byte i = 0; i < 5; i++)
		{
			binaryData[i] = i;
		}
		HashSet<String> scrabbleDictionary = new HashSet<String>();
		Path binaryPath = Paths.get("C:/dump.dat");
		Path textPath = Paths.get("/Users/ryanblair/Sites/SES_Homework/ryanbl/Lesson14/words.txt");
		/*
		//  Unbuffered, unstreamed
		try {
			Files.write(binaryPath,  binaryData);
			
			byte[] readData = Files.readAllBytes(binaryPath);

			for (int i = 0; i < readData.length; i++)
			{
				System.out.println(readData[i]);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		*/
		// Buffered, streamed
		String text = "The quick red fox jumped over the lazy brown dogs.";

		Charset charset = Charset.forName("US-ASCII");
		try {


			BufferedReader reader = Files.newBufferedReader(textPath, charset);
			String line = null;
			while ((line = reader.readLine()) != null) {
				scrabbleDictionary.add(line);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int dictionarySize = scrabbleDictionary.size();
		System.out.print(dictionarySize);
		/*
		// Unbuffered, streamed
		try (OutputStream out = new BufferedOutputStream(
				Files.newOutputStream(binaryPath, CREATE))) {
		   
		   out.write(binaryData, 0, binaryData.length);
		   out.close();
		   
		   InputStream in = Files.newInputStream(binaryPath);
		   BufferedReader reader =
		      new BufferedReader(new InputStreamReader(in));
		   int value;
		   while ((value = reader.read()) != -1)
		   {
			   System.out.println(value);
		   }
		   in.close();
		} catch (IOException x) {
		   System.err.println(x);
		}

		// Channel I/O
		// Defaults to READ
		try (SeekableByteChannel sbc = Files.newByteChannel(textPath)) {
		    ByteBuffer buf = ByteBuffer.allocate(10);

		    String encoding = System.getProperty("file.encoding");
		    while (sbc.read(buf) > 0) {
		        buf.rewind();
		        System.out.print(Charset.forName(encoding).decode(buf));
		        buf.flip();
		    }
		} catch (IOException x) {
		    System.out.println("caught exception: " + x);
		}
		*/
	}

}
