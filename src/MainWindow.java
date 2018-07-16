import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame{
	private JPanel contentPanel;
	private JTextField textField;
	private JTextField textField_1;
	ArrayList<Persona> personas = new ArrayList<Persona>();
	
	public void paint(Graphics g){
		super.paint(g);
		//g.drawRect(30, 30, 30, 30);
		for (Persona p : personas) {
		g.drawLine(p.x1+70,p.y1+120,675,375);
		//g.drawOval(20,20,20,20);
		}
		}
	
	public static void main(String [] args) {	
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}	
		});
    }
	
		public MainWindow() {
			//Recibe 200-600
			//Envia 800-1200
			//100-600
			
		
			Persona persona1 = new Persona(true, true, "info5");
			Persona persona2 = new Persona(true, false, "info5");
			Persona persona3 = new Persona(true, true, "info5");
			Persona persona4 = new Persona(false, false, "info5");
			Persona persona5 = new Persona(false, true, "info5");
			personas.add(persona1);
			personas.add(persona2);
			personas.add(persona3);
			personas.add(persona4);
			personas.add(persona5);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(40,40,1300,650);
			contentPanel = new JPanel();
			contentPanel.setBorder(new EmptyBorder(5,5,5,5));
			setContentPane(contentPanel);
			contentPanel.setLayout(null);
			
			/*JLabel foto = new JLabel("");
			foto.setBorder(new LineBorder(new Color(0,0,0,0)));
			foto.setBounds(290,250,95,95);
			foto.setIcon(new ImageIcon("src\\img\\img1.png"));
			contentPanel.add(foto);*/
			
			/*JLabel foto3 = new JLabel("");
			foto3.setText("text");
			foto3.setBorder(new LineBorder(new Color(0,0,0,0)));
			foto3.setBounds(990,350,95,95);
			foto3.setIcon(new ImageIcon("src\\img\\img2.png"));
			contentPanel.add(foto3);*/
			
			JLabel foto2 = new JLabel("");
			foto2.setBorder(new LineBorder(new Color(0,0,0,0)));
			foto2.setBounds(600,275,145,145);
			foto2.setIcon(new ImageIcon("src\\img\\user.png"));
			contentPanel.add(foto2);
			
			JLabel lblNewLabel = new JLabel("Nombre");
			lblNewLabel.setBounds(22, 28, 46, 14);
			contentPanel.add(lblNewLabel);
			
			textField = new JTextField();
			textField.setBounds(78, 25, 257, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("No  Cliente");
			lblNewLabel_1.setBounds(394, 28, 60, 14);
			contentPanel.add(lblNewLabel_1);
			
			textField_1 = new JTextField();
			textField_1.setBounds(464, 25, 86, 20);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
			
			JButton btnNewButton = new JButton("Buscar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnNewButton.setBounds(572, 24, 89, 23);
			contentPanel.add(btnNewButton);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(22, 189, 165, 391);
			contentPanel.add(scrollPane);
			
			JTextPane textPane = new JTextPane();
			textPane.setBounds(22, 83, 165, 95);
			contentPanel.add(textPane);
			
			/*JPanel panel = new JPanel();
			panel.setBackground(Color.DARK_GRAY);
			panel.setBounds(200, 80, 1000, 500);
			contentPanel.add(panel);*/
			//centro, 600,540,500,250
			
			/*foto3.addMouseListener(new MouseAdapter() {

	            @Override
	            public void mouseEntered(MouseEvent e) {
	                super.mouseEntered(e);
	                //foto3.setIcon(null);
	                foto3.setVerticalTextPosition(JLabel.CENTER);
	            }

	            @Override
	            public void mouseExited(MouseEvent e) {
	                super.mouseExited(e);  
	                //foto3.setHorizontalTextPosition(JLabel.CENTER);
	                foto3.setIcon(new ImageIcon("src\\img\\img2.png"));
	                //foto3.setText("Adios");
	            }

	        });
			*/
			

			
		for (Persona p : personas) {
			JLabel fot = new JLabel("");
			fot.setBorder(new LineBorder(new Color(0, 0, 0, 0)));
			fot.setBounds(p.x1,p.y1,p.x2,p.y2);
			fot.setIcon(new ImageIcon("src\\img\\img1.png"));
			 
			contentPanel.add(fot);

		}
		
		/*Graphics2D g2 = (Graphics2D) contentPanel;
	    Line2D.Double line1 = new Line2D.Double(30, 110, 80, 110);
	    g2.draw(line1);*/
			
		}
}
