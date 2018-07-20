import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;

public class Formatter {

	
	public static void replaceFileString(String old, String news) throws IOException {
		
		  FileDialog dialog = new FileDialog((Frame)null, "Select File to Open");
		    dialog.setMode(FileDialog.LOAD);
		    dialog.setVisible(true);
		    String file = dialog.getFile();
		    System.out.println(file + " chosen.");

/*File folder = new File("/Users/you/folder/");
File[] listOfFiles = folder.listFiles();

for (File file : listOfFiles) {
    if (file.isFile()) {
        System.out.println(file.getName());
    }
}*/


	    String fileName = "fileDirectory";
	    FileInputStream fis = new FileInputStream(fileName);
	    String content = IOUtils.toString(fis, Charset.defaultCharset());
	    content = content.replaceAll(old, news);
	    FileOutputStream fos = new FileOutputStream(fileName);
	    IOUtils.write(content, new FileOutputStream(fileName), Charset.defaultCharset());
	    fis.close();
	    fos.close();
	}
	
}
