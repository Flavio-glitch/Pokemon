package Pokemon;

import java.math.*;
import javax.swing.JPanel;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;

import javax.swing.Box;
import javax.swing.JTextArea;

public class PanelloP extends JPanel implements ActionListener {
	/**
	 * Create the panel.
	 */
	private Component horizontalStrut;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	
	
	private Pokemon p;
	private Pokemon avv;
	private Oggetti o;
	private Mosse m1;
	private Mosse m2;
	private Mosse m3;
	private Mosse m4;
	
	private static final long serialVersionUID = 1L;
	Image Fuoco;
	Toolkit tk;
	
	
	public PanelloP() {
		setLayout(null);
		
		p=new Pokemon();
		avv=new Pokemon();
		o=new Oggetti();
		m1=new Mosse();
		m2=new Mosse();
		m3=new Mosse();
		m4=new Mosse();
		
		tk = Toolkit.getDefaultToolkit();
		Fuoco = tk.getImage("Cyndaquil.jpg");
		MediaTracker nt = new MediaTracker(this);
		nt.addImage(Fuoco, 1);
		
		tk = Toolkit.getDefaultToolkit();
		Fuoco = tk.getImage("Cyndaquil.jpg");
		MediaTracker nr = new MediaTracker(this);
		nr.addImage(Fuoco, 1);
		
		horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(10, 375, 630, 27);
		add(horizontalStrut);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(192, 494, 89, 23);
		btnNewButton.setText(m1.getNome());
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(342, 494, 89, 23);
		add(btnNewButton_1);
		btnNewButton.setText(m2.getNome());
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(192, 560, 89, 23);
		add(btnNewButton_2);
		btnNewButton.setText(m3.getNome());
		
		btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(342, 560, 89, 23);
		add(btnNewButton_3);
		btnNewButton.setText(m4.getNome());
		
		btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(265, 611, 89, 23);
		add(btnNewButton_4);
		btnNewButton.setText(o.getPozione());
		
		JTextArea txtrPv = new JTextArea();
		txtrPv.setText(Integer.toString(p.getPV()));
		txtrPv.setBounds(417, 104, 62, 22);
		add(txtrPv);
		
		JTextArea txtrPv_1 = new JTextArea();
		txtrPv_1.setText(Integer.toString(p.getPV()));
		txtrPv_1.setBounds(161, 104, 62, 22);
		add(txtrPv_1);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(Fuoco, 30, 30, 50, 50, null);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Object o=arg0.getSource();
		if(o==btnNewButton) {
			avv.setPV(m1.getDanno());
		}
		if(o==btnNewButton) {
			avv.setPV(m1.getDanno());
		}
		if(o==btnNewButton) {
			avv.setPV(m1.getDanno());
		}
		if(o==btnNewButton) {
			avv.setPV(m1.getDanno());
		}
	}
}
