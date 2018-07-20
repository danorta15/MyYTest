import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import javax.swing.JOptionPane;

import org.apache.commons.io.IOUtils;

public class FormatFile {

	public static void main(String[] args) throws IOException {
		  FileDialog dialog = new FileDialog((Frame)null, "Selecciona los archivos ");
		    dialog.setFile("*.txt;");
		    dialog.setMultipleMode(true);
		    dialog.setMode(FileDialog.LOAD);
		    dialog.setVisible(true);
		    File[] files = dialog.getFiles();
		    
		for (File file : files) {
			String fileName = file.getPath();
			FileInputStream fis = new FileInputStream(fileName);
			String content = IOUtils.toString(fis, Charset.defaultCharset());
			content = content.replaceAll(" del 20", " de 20");
			FileOutputStream fos = new FileOutputStream(fileName);
			IOUtils.write(content, new FileOutputStream(fileName), Charset.defaultCharset());
			fis.close();
			fos.close();
		}
		
		JOptionPane.showMessageDialog(null, "Formato realizado con exito.");
	}

}
