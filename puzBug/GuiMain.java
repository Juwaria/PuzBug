package puzBug;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;


@SuppressWarnings("serial")
class GuiMain extends JFrame implements ActionListener
{
	JButton easy, medium, hard;

	//JLabel l1;
	@SuppressWarnings("unchecked")
	public GuiMain() throws IOException
	{
		//ArrayList<String[]> DB=FileOperations.initialLoad();
		setTitle("Puz-Bug");
		setContentPane(new JLabel(new ImageIcon("icon/icon2.jpg")));
		//l1=new JLabel("Select Level");
		//l1.setBounds(325,205,100,50);
		//l1.setFont(new Font("Tahoma", Font.BOLD, 12));
		//l1.setForeground(Color.BLUE);
		//add(l1);
		easy = new JButton("EASY");
		easy.setBackground(new Color(0, 180, 209));
		easy.setForeground(Color.WHITE);
		easy.setFocusPainted(false);
		easy.setFont(new Font("Tahoma", Font.BOLD, 16));
		easy.setBounds(330,370,220,50);
		medium = new JButton("MEDIUM");
		medium.setBackground(new Color(0, 180, 209));
		medium.setForeground(Color.WHITE);
		medium.setFocusPainted(false);
		medium.setFont(new Font("Tahoma", Font.BOLD, 16));
		medium.setBounds(330,440,220,50);
		hard = new JButton("HARD");
		hard.setBackground(new Color(0, 180, 209));
		hard.setForeground(Color.WHITE);
		hard.setFocusPainted(false);
		hard.setFont(new Font("Tahoma", Font.BOLD, 16));
		hard.setBounds(330,510,220,50);
		add(easy);
		add(medium);
		add(hard);
		easy.addActionListener(this);
		medium.addActionListener(this);
		hard.addActionListener(this);
		setLayout(null);
		setSize(900,900);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]) throws IOException
	{
		new GuiMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		int n;
		if(e.getSource()==easy)
		{
			this.dispose();
			Level l=new Level();
			n=l.getNoOfPieces("Easy");
			Split s= new Split(n);
			s.Display();	
		}
		else if(e.getSource()==medium)
		{
			this.dispose();
			Level l=new Level();
			n=l.getNoOfPieces("Medium");
			Split s= new Split(n);
			s.Display();
		}
		else if(e.getSource()==hard)
		{
			this.dispose();
			Level l=new Level();
			n=l.getNoOfPieces("Hard");
			Split s= new Split(n);
			s.Display();
		}

	}
} 