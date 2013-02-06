
import java.io.*;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.*;

public class SEFLesson14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		// Set up some data to save and restore.
		byte[] binaryData = new byte[5];
		for (byte i = 0; i < 5; i++)
		{
			binaryData[i] = i;
		}
		
		Path binaryPath = Paths.get("C:/dump.dat");
		Path textPath = Paths.get("C:/dump.txt");
		
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
		
		
		// Buffered, streamed
		String text = "The quick red fox jumped over the lazy brown dogs.";

		Charset charset = Charset.forName("US-ASCII");
		try {
			BufferedWriter writer = Files.newBufferedWriter(textPath, charset);
			writer.write(text, 0, text.length());
			writer.close();

			BufferedReader reader = Files.newBufferedReader(textPath, charset);
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
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
		
		
		
		// In class exercises
		
		//  Unbuffered, unstreamed
		Path wordsPath = Paths.get("words.txt");
		Charset charset = Charset.forName("US-ASCII");
		
		/*
		try {
			List<String> readData = Files.readAllLines(wordsPath, charset);
			
			for (int i = 0; i < readData.size(); i++)
			{
				String word = readData.get(i);
				System.out.println(word);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		// Buffered, Streamed

		HashSet<String> validWords = new HashSet<String>();
		
		try {
			BufferedReader reader = Files.newBufferedReader(wordsPath, charset);
			Scanner s = new Scanner(reader);
			
			while (s.hasNext()) {
				validWords.add(s.next());
			}
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String word = new String("math");
		
		if (validWords.contains(word)) {
			System.out.println("Yes, the word list contains the word: " + word);
		} else {
			System.out.println("No, the word list does NOT contain the word: " + word);
		}

	}

}
