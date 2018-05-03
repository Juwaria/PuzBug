package puzBug;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Split extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,browse,back,spec,run,hint,giveUp,start_b,b1run,b2run,b3run,b4run,b5run,b6run,b7run,b8run,b9run;
	int DBIndex=0,buttonID,snippetFlag;
	String iconName=null,picName=null,pathReadCode=null,pathWriteCode=null,pathTestTest=null,pathTestCode=null,pathCodeSpec=null,pathCodeHint=null,pathCodeSolution=null,pathSolution=null;
	//Icon pic2=new ImageIcon("pic/main.jpeg");
	JLabel l4;
	ArrayList<String[]> DB;
	Boolean added=false;
	Icon pic1 = new ImageIcon("pic/original/o1.jpeg");
	Icon pic2 = new ImageIcon("pic/original/o2.jpeg");
	Icon pic3 = new ImageIcon("pic/original/o3.jpeg");
	Icon pic4 = new ImageIcon("pic/original/o4.jpeg");
	Icon start,startma,startmi,startca,startcar,start4,start6,ic1,ic2, ic3,ic4,ic5,ic6,ic7,ic8,ic9,ic10,ic11,ic12,ic13,ic14,ic15,ic16,ic17,ic18,ic19,ic21,ic22,ic23,ic24,ic25,ic26,ic27,ic28,ic29,ic31,ic32,ic33,ic34,ic35,ic36,ic37,ic38,ic39;
	private JTextArea textfieldOriginal,textfieldEditable;

	public int pieces;
	Split(int number)
	{
		try
		{
			//FileOperations f=new FileOperations();
			DB=FileOperations.initialLoad();
		}
		catch(Exception e)
		{
			System.out.println("error in split arraylist code "+e);
		}
		setTitle("Puz-Bug");
		setLayout(new FlowLayout());
		setSize(1300,900);
		setVisible(true);
		setLocationRelativeTo(null);
		back=new JButton("BACK");
		back.setBackground(new Color(0, 180, 209));
		back.setForeground(Color.WHITE);
		back.setFocusPainted(false);
		back.setFont(new Font("Tahoma", Font.BOLD, 12));
		back.setBounds(50,30,100,30);
		add(back);
		back.addActionListener(this);


		pieces=number;
		if(pieces == 2)
		{
			ic1=new ImageIcon("pic/2pieces/ma2.jpeg");
			ic2=new ImageIcon("pic/2pieces/ma1.jpeg");
			startma=new ImageIcon("pic/start_icon/2pieces/mas.jpeg");
			startmi=new ImageIcon("pic/start_icon/2pieces/mis.jpeg");
			startca=new ImageIcon("pic/start_icon/2pieces/cas.jpeg");
			startcar=new ImageIcon("pic/start_icon/2pieces/cars.jpeg");
		}
		else if(pieces == 4)
		{
			ic1=new ImageIcon("pic/4pieces/ma4.jpeg");
			ic2=new ImageIcon("pic/4pieces/ma1.jpeg");
			ic3=new ImageIcon("pic/4pieces/ma2.jpeg");
			ic4=new ImageIcon("pic/4pieces/ma3.jpeg");

			startma=new ImageIcon("pic/start_icon/4pieces/mas.jpeg");
			startmi=new ImageIcon("pic/start_icon/4pieces/mis.jpeg");
			startca=new ImageIcon("pic/start_icon/4pieces/cas.jpeg");
			startcar=new ImageIcon("pic/start_icon/4pieces/cars.jpeg");
		}
		else if(pieces == 9)
		{
			ic1=new ImageIcon("pic/9pieces/ma1.jpeg");
			ic2=new ImageIcon("pic/9pieces/ma5.jpeg");
			ic3=new ImageIcon("pic/9pieces/ma2.jpeg");
			ic4=new ImageIcon("pic/9pieces/ma7.jpeg");
			ic5=new ImageIcon("pic/9pieces/ma4.jpeg");
			ic6=new ImageIcon("pic/9pieces/ma6.jpeg");
			ic7=new ImageIcon("pic/9pieces/ma8.jpeg");
			ic8=new ImageIcon("pic/9pieces/ma9.jpeg");
			ic9=new ImageIcon("pic/9pieces/ma3.jpeg");

			startma=new ImageIcon("pic/start_icon/9pieces/mas.jpeg");
			startmi=new ImageIcon("pic/start_icon/9pieces/mis.jpeg");
			startca=new ImageIcon("pic/start_icon/9pieces/cas.jpeg");
			startcar=new ImageIcon("pic/start_icon/9pieces/cars.jpeg");
		}
	}
	public void Display()
	{
		if(pieces==2)
		{
			b1run=new JButton();
			b2run=new JButton();
			System.out.println("Inside Display:"+pieces);
			b1=new JButton(ic1);
			b1.setEnabled(false);
			b1.setBounds(100,500,282,141);
			b1run.setBounds(70,560,20,20);
			b2=new JButton(ic2);
			b2.setEnabled(false);
			b2.setBounds(100,641,282,141);
			b2run.setBounds(70,700,20,20);
			start=b2.getIcon();
			start_b=new JButton(startma);
			start_b.setBounds(190,350,100,50);

			browse=new JButton(pic1);
			picName="ma";
			browse.setBounds(100,100,200,200);

			JLabel l1=new JLabel("Original Picture (Click to select picture)");
			l1.setBounds(100,80,500,20);

			JLabel l3=new JLabel("Active Icon:");
			l3.setBounds(100,370,200,20);
			l3.setForeground(Color.black);


			add(b1);add(b2);add(browse);add(l1);add(l3); add(start_b);
			add(b1run);add(b2run);

			b1.addActionListener(this); b2.addActionListener(this);
			b1run.addActionListener(this);
			b2run.addActionListener(this);
			browse.addActionListener(this);
			setLayout(null);
			setSize(1300,900);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else if(pieces==4)
		{
			b1run=new JButton();
			b2run=new JButton();
			b3run=new JButton();
			b4run=new JButton();
			System.out.println("Inside Display:"+pieces);
			b1=new JButton(ic1);
			b1.setBounds(100,500,141,141);
			b2=new JButton(ic2);
			b2.setBounds(241,500,141,141);
			b3=new JButton(ic3);
			b3.setBounds(100,642,141,141);
			b4=new JButton(ic4);
			b4.setBounds(241,642,141,141);
			b1.setEnabled(false);
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
			start=b4.getIcon();
			b1run.setBounds(165,470,20,20);
			b2run.setBounds(295,470,20,20);
			b3run.setBounds(165,790,20,20);
			b4run.setBounds(295,790,20,20);
			start_b=new JButton(startma);
			start_b.setBounds(190,350,92,92);

			browse=new JButton(pic1);
			browse.setBounds(100,100,200,200);
			picName="ma";

			JLabel l1=new JLabel("Original Picture (Click to select picture)");
			l1.setBounds(100,80,500,20);
			JLabel l3=new JLabel("Active Icon:");
			l3.setBounds(100,380,200,20);
			l3.setForeground(Color.black);

			add(b1);add(b2);add(b3);add(b4);add(browse);add(l1);add(l3);add(start_b);add(b1run);add(b2run);add(b3run);add(b4run);
			b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this); b4.addActionListener(this);
			browse.addActionListener(this);
			b1run.addActionListener(this);
			b2run.addActionListener(this);
			b3run.addActionListener(this);
			b4run.addActionListener(this);
			setLayout(null);
			setSize(1300,900);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else if(pieces==9)
		{
			b1run=new JButton();
			b2run=new JButton();
			b3run=new JButton();
			b4run=new JButton();
			b5run=new JButton();
			b6run=new JButton();
			b7run=new JButton();
			b8run=new JButton();
			b9run=new JButton();
			System.out.println("Inside Display:"+pieces);
			b1=new JButton(ic1);
			b1.setBounds(50,500,100,100);
			b1.setEnabled(false);
			b2=new JButton(ic2);
			b2.setBounds(150,500,100,100);
			b2.setEnabled(false);
			b3=new JButton(ic3);
			b3.setBounds(250,500,100,100);
			b3.setEnabled(false);
			b4=new JButton(ic4);
			b4.setBounds(50,600,100,100);
			b4.setEnabled(false);
			b5=new JButton(ic5);
			b5.setBounds(150,600,100,100);
			b5.setEnabled(false);
			b6=new JButton(ic6);
			b6.setBounds(250,600,100,100);
			b6.setEnabled(false);
			b7=new JButton(ic7);
			b7.setBounds(50,700,100,100);
			b7.setEnabled(false);
			b8=new JButton(ic8);
			b8.setBounds(150,700,100,100);
			b8.setEnabled(false);
			b9=new JButton(ic9);
			b9.setBounds(250,700,100,100);
			b9.setEnabled(false);
			b1run.setBounds(90,470,20,20);
			b2run.setBounds(190,470,20,20);
			b3run.setBounds(290,470,20,20);
			b4run.setBounds(20,645,20,20);
			b6run.setBounds(360,645,20,20);
			b7run.setBounds(90,810,20,20);
			b8run.setBounds(190,810,20,20);
			b9run.setBounds(290,810,20,20);
			b5run.setBounds(190,645,20,20);
			browse=new JButton(pic1);

			start_b=new JButton(startma);		
			start_b.setBounds(190,350,92,92);

			browse.setBounds(100,100,200,200);
			picName="ma";
			start=b9.getIcon();
			JLabel l1=new JLabel("Original Picture (Click to select picture)");
			l1.setBounds(100,80,500,20);
			JLabel l3=new JLabel("Active Icon:");
			l3.setBounds(100,370,200,20);
			l3.setForeground(Color.black);


			add(b1);add(b2);add(b3);add(b4);add(b5run);add(b5);add(b6);add(b7);add(b8);add(b9);
			add(b1run);add(b2run);add(b3run);add(b4run);add(b6run);add(b7run);add(b8run);add(b9run);
			add(browse);add(l1);add(l3);add(start_b);
			b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this); b4.addActionListener(this); 
			b5.addActionListener(this); b6.addActionListener(this);
			b7.addActionListener(this); b8.addActionListener(this); b9.addActionListener(this); 
			b1run.addActionListener(this); b2run.addActionListener(this); b3run.addActionListener(this); b4run.addActionListener(this); 
			b5run.addActionListener(this); b6run.addActionListener(this);
			b7run.addActionListener(this); b8run.addActionListener(this); b9run.addActionListener(this); 
			browse.addActionListener(this);
			b5.setEnabled(false);
			setLayout(null);
			setSize(1300,900);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{

		if(e.getSource()==browse)
		{
			if(pieces==2)
				displayPieces2();
			else if (pieces==4)
				displayPieces4();
			else if (pieces==9)
				displayPieces9();

		}//main if ends
		else if (e.getSource()==back)
		{
			System.out.println("in action back");
			this.dispose();
			System.out.println("dispose executed");
			try {
				new GuiMain().setVisible(true);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b1run)
		{
			if(b1.getIcon()== ic1)
			{
				iconName="ic1";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b1.getIcon()== ic2)
			{
				iconName="ic2";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b1.getIcon()== ic3)
			{
				iconName="ic3";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b1.getIcon()== ic4)
			{
				iconName="ic4";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b1.getIcon()== ic5)
			{
				iconName="ic5";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b1.getIcon()== ic6)
			{
				iconName="ic6";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b1.getIcon()== ic7)
			{
				iconName="ic7";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b1.getIcon()== ic8)
			{
				iconName="ic8";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b1.getIcon()== ic9)
			{
				iconName="ic9";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			if(!added)
			{
				addSnippetButtons();

			}
			setPaths();
			System.out.println("PATHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"+pathReadCode);
			loadCode();
			spec.setEnabled(true);
			run.setEnabled(true);
			hint.setEnabled(true);
			giveUp.setEnabled(true);
			buttonID=1;
			System.out.println("In e.getSource()==b1");
		}
		else if(e.getSource()==b2run)
		{
			if(b2.getIcon()== ic1)
			{
				iconName="ic1";
				System.out.println("Icon Name:"+b2.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b2.getIcon()== ic2)
			{
				iconName="ic2";
				System.out.println("Icon Name:"+b2.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b2.getIcon()== ic3)
			{
				iconName="ic3";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b2.getIcon()== ic4)
			{
				iconName="ic4";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b2.getIcon()== ic5)
			{
				iconName="ic5";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b2.getIcon()== ic6)
			{
				iconName="ic6";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b2.getIcon()== ic7)
			{
				iconName="ic7";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b2.getIcon()== ic8)
			{
				iconName="ic8";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b2.getIcon()== ic9)
			{
				iconName="ic9";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			if(!added)
			{
				addSnippetButtons();

			}
			setPaths();

			System.out.println("PATHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"+pathReadCode);

			loadCode();
			spec.setEnabled(true);
			run.setEnabled(true);
			hint.setEnabled(true);
			giveUp.setEnabled(true);
			buttonID=2;
		}/////
		else if(e.getSource()==b3run)
		{
			if(b3.getIcon()== ic1)
			{
				iconName="ic1";
				System.out.println("Icon Name:"+b2.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b3.getIcon()== ic2)
			{
				iconName="ic2";
				System.out.println("Icon Name:"+b2.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b3.getIcon()== ic3)
			{
				iconName="ic3";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b3.getIcon()== ic4)
			{
				iconName="ic4";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b3.getIcon()== ic5)
			{
				iconName="ic5";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b3.getIcon()== ic6)
			{
				iconName="ic6";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b3.getIcon()== ic7)
			{
				iconName="ic7";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b3.getIcon()== ic8)
			{
				iconName="ic8";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b3.getIcon()== ic9)
			{
				iconName="ic9";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			if(!added)
			{
				addSnippetButtons();

			}
			setPaths();

			System.out.println("PATHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"+pathReadCode);

			loadCode();
			spec.setEnabled(true);
			run.setEnabled(true);
			hint.setEnabled(true);
			giveUp.setEnabled(true);
			buttonID=3;
		}
		else if(e.getSource()==b4run)
		{
			if(b4.getIcon()== ic1)
			{
				iconName="ic1";
				System.out.println("Icon Name:"+b2.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b4.getIcon()== ic2)
			{
				iconName="ic2";
				System.out.println("Icon Name:"+b2.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b4.getIcon()== ic3)
			{
				iconName="ic3";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b4.getIcon()== ic4)
			{
				iconName="ic4";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b4.getIcon()== ic5)
			{
				iconName="ic5";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b4.getIcon()== ic6)
			{
				iconName="ic6";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b4.getIcon()== ic7)
			{
				iconName="ic7";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b4.getIcon()== ic8)
			{
				iconName="ic8";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b4.getIcon()== ic9)
			{
				iconName="ic9";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			if(!added)
			{
				addSnippetButtons();

			}
			setPaths();

			System.out.println("PATHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"+pathReadCode);

			loadCode();
			spec.setEnabled(true);
			run.setEnabled(true);
			hint.setEnabled(true);
			giveUp.setEnabled(true);
			buttonID=4;
		}
		else if(e.getSource()==b5run)
		{
			if(b5.getIcon()== ic1)
			{
				iconName="ic1";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b5.getIcon()== ic2)
			{
				iconName="ic2";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b5.getIcon()== ic3)
			{
				iconName="ic3";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b5.getIcon()== ic4)
			{
				iconName="ic4";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b5.getIcon()== ic5)
			{
				iconName="ic5";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b5.getIcon()== ic6)
			{
				iconName="ic6";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b5.getIcon()== ic7)
			{
				iconName="ic7";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b5.getIcon()== ic8)
			{
				iconName="ic8";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b5.getIcon()== ic9)
			{
				iconName="ic9";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			if(!added)
			{
				addSnippetButtons();

			}
			setPaths();
			System.out.println("PATHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"+pathReadCode);
			loadCode();
			spec.setEnabled(true);
			run.setEnabled(true);
			hint.setEnabled(true);
			giveUp.setEnabled(true);
			buttonID=5;
			System.out.println("In e.getSource()==b1");
		}
		else if(e.getSource()==b6run)
		{
			if(b6.getIcon()== ic1)
			{
				iconName="ic1";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b6.getIcon()== ic2)
			{
				iconName="ic2";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b6.getIcon()== ic3)
			{
				iconName="ic3";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b6.getIcon()== ic4)
			{
				iconName="ic4";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b6.getIcon()== ic5)
			{
				iconName="ic5";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b6.getIcon()== ic6)
			{
				iconName="ic6";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b6.getIcon()== ic7)
			{
				iconName="ic7";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b6.getIcon()== ic8)
			{
				iconName="ic8";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b6.getIcon()== ic9)
			{
				iconName="ic9";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			if(!added)
			{
				addSnippetButtons();

			}
			setPaths();
			System.out.println("PATHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"+pathReadCode);
			loadCode();
			spec.setEnabled(true);
			run.setEnabled(true);
			hint.setEnabled(true);
			giveUp.setEnabled(true);
			buttonID=6;
			System.out.println("In e.getSource()==b1");
		}
		else if(e.getSource()==b7run)
		{
			if(b7.getIcon()== ic1)
			{
				iconName="ic1";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b7.getIcon()== ic2)
			{
				iconName="ic2";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b7.getIcon()== ic3)
			{
				iconName="ic3";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b7.getIcon()== ic4)
			{
				iconName="ic4";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b7.getIcon()== ic5)
			{
				iconName="ic5";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b7.getIcon()== ic6)
			{
				iconName="ic6";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b7.getIcon()== ic7)
			{
				iconName="ic7";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b7.getIcon()== ic8)
			{
				iconName="ic8";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b7.getIcon()== ic9)
			{
				iconName="ic9";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			if(!added)
			{
				addSnippetButtons();

			}
			setPaths();
			System.out.println("PATHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"+pathReadCode);
			loadCode();
			spec.setEnabled(true);
			run.setEnabled(true);
			hint.setEnabled(true);
			giveUp.setEnabled(true);
			buttonID=7;
			System.out.println("In e.getSource()==b1");

		}
		else if(e.getSource()==b8run)
		{
			if(b8.getIcon()== ic1)
			{
				iconName="ic1";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b8.getIcon()== ic2)
			{
				iconName="ic2";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b8.getIcon()== ic3)
			{
				iconName="ic3";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b8.getIcon()== ic4)
			{
				iconName="ic4";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b8.getIcon()== ic5)
			{
				iconName="ic5";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b8.getIcon()== ic6)
			{
				iconName="ic6";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b8.getIcon()== ic7)
			{
				iconName="ic7";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b8.getIcon()== ic8)
			{
				iconName="ic8";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b8.getIcon()== ic9)
			{
				iconName="ic9";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			if(!added)
			{
				addSnippetButtons();

			}
			setPaths();
			System.out.println("PATHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"+pathReadCode);
			loadCode();
			spec.setEnabled(true);
			run.setEnabled(true);
			hint.setEnabled(true);
			giveUp.setEnabled(true);
			buttonID=8;
			System.out.println("In e.getSource()==b1");
		}
		else if(e.getSource()==b9run)
		{
			if(b9.getIcon()== ic1)
			{
				iconName="ic1";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b9.getIcon()== ic2)
			{
				iconName="ic2";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b9.getIcon()== ic3)
			{
				iconName="ic3";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b9.getIcon()== ic4)
			{
				iconName="ic4";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b9.getIcon()== ic5)
			{
				iconName="ic5";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b9.getIcon()== ic6)
			{
				iconName="ic6";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b9.getIcon()== ic7)
			{
				iconName="ic7";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b9.getIcon()== ic8)
			{
				iconName="ic8";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			else if(b9.getIcon()== ic9)
			{
				iconName="ic9";
				System.out.println("Icon Name:"+b1.getIcon()+"picN"+picName+ " iconN"+iconName);
			}
			if(!added)
			{
				addSnippetButtons();

			}
			setPaths();
			System.out.println("PATHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"+pathReadCode);
			loadCode();
			spec.setEnabled(true);
			run.setEnabled(true);
			hint.setEnabled(true);
			giveUp.setEnabled(true);
			buttonID=9;
			System.out.println("In e.getSource()==b1");
		}
		else if(e.getSource()==b1)
		{

			//move(b1);
			try {
				if(b1.isEnabled() == true && b2.isEnabled() ==true && pieces ==2)
					move(b1);	
				if( (pieces ==4) && b4.isEnabled())
					move(b1);	
				if(pieces ==9 && b9.isEnabled())
					move(b1);
				puzzleSolved();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
				else if(e.getSource()==b2)
		{
			try {
				if(b1.isEnabled() == true && b2.isEnabled() ==true && pieces ==2)
					move(b2);	
				if((pieces ==4) && b4.isEnabled())
					move(b2);
				if(pieces ==9 && b9.isEnabled())
					move(b2);
				puzzleSolved();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b3)
		{
			if((pieces ==4)&& b4.isEnabled())
				move(b3);	
			if(pieces ==9 && b9.isEnabled())
				move(b3);
			try {
				puzzleSolved();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b4)
		{
			if((pieces ==4)&& b4.isEnabled())
				move(b4);
			if(pieces ==9 && b9.isEnabled())
				move(b4);
			try {
				puzzleSolved();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		else if(e.getSource()==b5)
		{
			if(pieces ==9 && b9.isEnabled())
				move(b5);
			try {
				puzzleSolved();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b6)
		{
			if(pieces ==9 && b9.isEnabled())
				move(b6);
			try {
				puzzleSolved();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b7)
		{
			if(pieces ==9 && b9.isEnabled())
				move(b7);
			try {
				puzzleSolved();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b8)
		{
			if(pieces ==9 && b9.isEnabled())
				move(b8);
			try {
				puzzleSolved();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b9)
		{
			if(pieces ==9 && b9.isEnabled())
				move(b9);
			try {
				puzzleSolved();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		else if(e.getSource()==run)
		{
			FileOperations f=new FileOperations();
			String code=textfieldEditable.getText().toString();
			//System.out.println("Text code is :"+code);
			try 
			{
				int enable=f.save(code,pathWriteCode,pathTestTest,pathTestCode,pieces);
				if(enable==1){
					if(buttonID==1)
					{
						b1.setEnabled(true);
					}
					else if(buttonID==2)
						b2.setEnabled(true);
					else if(buttonID==3)
						b3.setEnabled(true);
					else if(buttonID==4)
						b4.setEnabled(true);
					else if(buttonID==5)
					{
						b5.setEnabled(true);
						b5run.setVisible(false);
					}
					else if(buttonID==6)
						b6.setEnabled(true);
					else if(buttonID==7)
						b7.setEnabled(true);
					else if(buttonID==8)
						b8.setEnabled(true);
					else if(buttonID==9)
						b9.setEnabled(true);

				}


				//f.initialLoad();

			}  catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		} 
		else if(e.getSource() == b2 || e.getSource()==b3 || e.getSource()== b4 
				|| e.getSource()== b5 || e.getSource()== b6 || e.getSource()== b7 || e.getSource()== b8 || e.getSource()== b9)
		{
			//addSnippetButtons();
			textfieldOriginal.append("Code");
			textfieldEditable.append("Code");


		}

		else if(e.getSource()==spec)
		{

			String s1=pathCodeSpec;
			System.out.println("Specification is: "+s1);
			String line,s="";
			BufferedReader in;
			try 
			{
				in = new BufferedReader(new FileReader(s1));
				while ((line = in.readLine()) != null) 
				{
					s +=line+"\n";
				}
				JOptionPane.showMessageDialog(null,s, "Specification", JOptionPane.INFORMATION_MESSAGE);

			} 
			catch (Exception e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}//spec ends 
		else if(e.getSource() == hint)
		{
			String h=pathCodeHint;
			System.out.println("Hint is: "+h);
			String line,s="";
			BufferedReader in;
			try 
			{
				in = new BufferedReader(new FileReader(h));
				while ((line = in.readLine()) != null) 
				{
					s +=line+"\n";
				}
				JOptionPane.showMessageDialog(null,s, "Hint", JOptionPane.INFORMATION_MESSAGE);

			} 
			catch (Exception e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource() == giveUp)
		{
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you wish to give up on this snippet?","Warning",dialogButton);
			if(dialogResult == JOptionPane.YES_OPTION)
			{   
				showSolution();

			}
			else
			{
				//do nothing
			}
		}

	}//actionPerformed ends
	public void displayPieces2()
	{
		Icon change=browse.getIcon();
		if(change==pic1)
		{
			if(added){
				textfieldEditable.setText(null);
				textfieldOriginal.setText(null);
				spec.setEnabled(false);
				run.setEnabled(false);
				hint.setEnabled(false);
				giveUp.setEnabled(false);
			}

			b1.setEnabled(false);
			b2.setEnabled(false);
			browse.setIcon(pic2);
			picName="mi";
			ic1=new ImageIcon("pic/2pieces/mi2.jpeg");
			b1.setIcon(ic1);
			ic2=new ImageIcon("pic/2pieces/mi1.jpeg");
			b2.setIcon(ic2);
			start=b2.getIcon();
			start_b.setIcon(startmi);

		}//if ends
		else if(change==pic2)
		{
			if(added)
			{
				textfieldEditable.setText(null);
				textfieldOriginal.setText(null);
				spec.setEnabled(false);
				run.setEnabled(false);
				hint.setEnabled(false);
				giveUp.setEnabled(false);
			}
			b1.setEnabled(false);
			b2.setEnabled(false);
			browse.setIcon(pic3);
			picName="ca";
			ic1=new ImageIcon("pic/2pieces/ca2.jpeg");
			b1.setIcon(ic1);
			ic2=new ImageIcon("pic/2pieces/ca1.jpeg");
			b2.setIcon(ic2);

			//b1.setIcon(ic5);
			//b2.setIcon(ic6);
			start=b2.getIcon();
			//start_b.setIcon(start);
			start_b.setIcon(startca);

		}//else if ends
		else if(change==pic3)
		{
			if(added)
			{
				textfieldEditable.setText(null);
				textfieldOriginal.setText(null);
				spec.setEnabled(false);
				run.setEnabled(false);
				hint.setEnabled(false);
				giveUp.setEnabled(false);
			}
			b1.setEnabled(false);
			b2.setEnabled(false);
			browse.setIcon(pic4);
			picName="car";
			ic1=new ImageIcon("pic/2pieces/car2.jpeg");
			ic2=new ImageIcon("pic/2pieces/car1.jpeg");
			b1.setIcon(ic1);
			b2.setIcon(ic2);
			//b1.setIcon(ic7);

			//b2.setIcon(ic8);
			start=b2.getIcon();
			//start_b.setIcon(start);
			start_b.setIcon(startcar);

		}//else if ends
		else if(change==pic4)
		{
			if(added)
			{
				textfieldEditable.setText(null);
				textfieldOriginal.setText(null);
				spec.setEnabled(false);
				run.setEnabled(false);
				hint.setEnabled(false);
				giveUp.setEnabled(false);
			}
			b1.setEnabled(false);
			b2.setEnabled(false);
			browse.setIcon(pic1);
			picName="ma";
			ic1=new ImageIcon("pic/2pieces/ma2.jpeg");
			ic2=new ImageIcon("pic/2pieces/ma1.jpeg");
			b1.setIcon(ic1);
			b2.setIcon(ic2);
			start=b2.getIcon();
			//start_b.setIcon(start);
			start_b.setIcon(startma);

		}//else if ends
	}
	public void displayPieces4()
	{
		Icon change=browse.getIcon();
		if(added)
		{
			textfieldEditable.setText(null);
			textfieldOriginal.setText(null);
			spec.setEnabled(false);
			run.setEnabled(false);
			hint.setEnabled(false);
			giveUp.setEnabled(false);
		}
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		if(change==pic1)
		{
			browse.setIcon(pic2);

			picName="mi";
			ic1=new ImageIcon("pic/4pieces/mi4.jpeg");
			ic2=new ImageIcon("pic/4pieces/mi1.jpeg");
			ic3=new ImageIcon("pic/4pieces/mi2.jpeg");
			ic4=new ImageIcon("pic/4pieces/mi3.jpeg");
			b1.setIcon(ic1);
			b2.setIcon(ic2);
			b3.setIcon(ic3);
			b4.setIcon(ic4);
			start=b4.getIcon();
			start_b.setIcon(startmi);

		}//if ends
		else if(change==pic2)
		{
			browse.setIcon(pic3);
			picName="ca";
			ic1=new ImageIcon("pic/4pieces/ca4.jpeg");
			ic2=new ImageIcon("pic/4pieces/ca1.jpeg");
			ic3=new ImageIcon("pic/4pieces/ca2.jpeg");
			ic4=new ImageIcon("pic/4pieces/ca3.jpeg");
			b1.setIcon(ic1);
			b2.setIcon(ic2);
			b3.setIcon(ic3);
			b4.setIcon(ic4);
			start=b4.getIcon();
			start_b.setIcon(startca);

		}//else if ends
		else if(change==pic3)
		{
			browse.setIcon(pic4);
			picName="car";
			ic1=new ImageIcon("pic/4pieces/car4.jpeg");
			ic2=new ImageIcon("pic/4pieces/car1.jpeg");
			ic3=new ImageIcon("pic/4pieces/car2.jpeg");
			ic4=new ImageIcon("pic/4pieces/car3.jpeg");
			b1.setIcon(ic1);
			b2.setIcon(ic2);
			b3.setIcon(ic3);
			b4.setIcon(ic4);
			start=b4.getIcon();
			start_b.setIcon(startcar);
		}//else if ends
		else if(change==pic4)
		{
			browse.setIcon(pic1);
			picName="ma";
			ic1=new ImageIcon("pic/4pieces/ma4.jpeg");
			ic2=new ImageIcon("pic/4pieces/ma1.jpeg");
			ic3=new ImageIcon("pic/4pieces/ma2.jpeg");
			ic4=new ImageIcon("pic/4pieces/ma3.jpeg");
			b1.setIcon(ic1);
			b2.setIcon(ic2);
			b3.setIcon(ic3);
			b4.setIcon(ic4);
			start=b4.getIcon();
			start_b.setIcon(startma);
		}//else if ends
	}
	public void displayPieces9()
	{	
		Icon change=browse.getIcon();

		if(added)
		{
			textfieldEditable.setText(null);
			textfieldOriginal.setText(null);
			spec.setEnabled(false);
			run.setEnabled(false);
			hint.setEnabled(false);
			giveUp.setEnabled(false);
		}

		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);

		if(change==pic1)
		{
			browse.setIcon(pic2);
			picName="mi";
			ic1=new ImageIcon("pic/9pieces/mi1.jpeg");
			ic2=new ImageIcon("pic/9pieces/mi5.jpeg");
			ic3=new ImageIcon("pic/9pieces/mi2.jpeg");
			ic4=new ImageIcon("pic/9pieces/mi7.jpeg");
			ic5=new ImageIcon("pic/9pieces/mi4.jpeg");
			ic6=new ImageIcon("pic/9pieces/mi6.jpeg");
			ic7=new ImageIcon("pic/9pieces/mi8.jpeg");
			ic8=new ImageIcon("pic/9pieces/mi9.jpeg");
			ic9=new ImageIcon("pic/9pieces/mi3.jpeg");
			b1.setIcon(ic1);
			b2.setIcon(ic2);
			b3.setIcon(ic3);
			b4.setIcon(ic4);
			b5.setIcon(ic5);
			b6.setIcon(ic6);
			b7.setIcon(ic7);
			b8.setIcon(ic8);
			b9.setIcon(ic9);

			start=b9.getIcon();
			start_b.setIcon(startmi);
		}//if ends
		else if(change==pic2)
		{
			browse.setIcon(pic3);
			picName="ca";
			ic1=new ImageIcon("pic/9pieces/ca1.jpeg");
			ic2=new ImageIcon("pic/9pieces/ca5.jpeg");
			ic3=new ImageIcon("pic/9pieces/ca2.jpeg");
			ic4=new ImageIcon("pic/9pieces/ca7.jpeg");
			ic5=new ImageIcon("pic/9pieces/ca4.jpeg");
			ic6=new ImageIcon("pic/9pieces/ca6.jpeg");
			ic7=new ImageIcon("pic/9pieces/ca8.jpeg");
			ic8=new ImageIcon("pic/9pieces/ca9.jpeg");
			ic9=new ImageIcon("pic/9pieces/ca3.jpeg");
			b1.setIcon(ic1);
			b2.setIcon(ic2);
			b3.setIcon(ic3);
			b4.setIcon(ic4);
			b5.setIcon(ic5);
			b6.setIcon(ic6);
			b7.setIcon(ic7);
			b8.setIcon(ic8);
			b9.setIcon(ic9);
			start=b9.getIcon();
			start_b.setIcon(startca);

		}//else if ends
		else if(change==pic3)
		{
			browse.setIcon(pic4);
			picName="car";
			ic1=new ImageIcon("pic/9pieces/car1.jpeg");
			ic2=new ImageIcon("pic/9pieces/car5.jpeg");
			ic3=new ImageIcon("pic/9pieces/car2.jpeg");
			ic4=new ImageIcon("pic/9pieces/car7.jpeg");
			ic5=new ImageIcon("pic/9pieces/car4.jpeg");
			ic6=new ImageIcon("pic/9pieces/car6.jpeg");
			ic7=new ImageIcon("pic/9pieces/car8.jpeg");
			ic8=new ImageIcon("pic/9pieces/car9.jpeg");
			ic9=new ImageIcon("pic/9pieces/car3.jpeg");
			b1.setIcon(ic1);
			b2.setIcon(ic2);
			b3.setIcon(ic3);
			b4.setIcon(ic4);
			b5.setIcon(ic5);
			b6.setIcon(ic6);
			b7.setIcon(ic7);
			b8.setIcon(ic8);
			b9.setIcon(ic9);
			start=b9.getIcon();
			start_b.setIcon(startcar);

		}//else if ends
		else if(change==pic4)
		{
			browse.setIcon(pic1);
			picName="ma";
			ic1=new ImageIcon("pic/9pieces/ma1.jpeg");
			ic2=new ImageIcon("pic/9pieces/ma5.jpeg");
			ic3=new ImageIcon("pic/9pieces/ma2.jpeg");
			ic4=new ImageIcon("pic/9pieces/ma7.jpeg");
			ic5=new ImageIcon("pic/9pieces/ma4.jpeg");
			ic6=new ImageIcon("pic/9pieces/ma6.jpeg");
			ic7=new ImageIcon("pic/9pieces/ma8.jpeg");
			ic8=new ImageIcon("pic/9pieces/ma9.jpeg");
			ic9=new ImageIcon("pic/9pieces/ma3.jpeg");
			b1.setIcon(ic1);
			b2.setIcon(ic2);
			b3.setIcon(ic3);
			b4.setIcon(ic4);
			b5.setIcon(ic5);
			b6.setIcon(ic6);
			b7.setIcon(ic7);
			b8.setIcon(ic8);
			b9.setIcon(ic9);
			start=b9.getIcon();
			start_b.setIcon(startma);
		}//else if ends
	}
	public void addSnippetButtons()
	{
		giveUp=new JButton("GIVE UP");
		giveUp.setBackground(new Color(0, 180, 209));
		giveUp.setForeground(Color.WHITE);
		giveUp.setFocusPainted(false);
		giveUp.setFont(new Font("Tahoma", Font.BOLD, 12));

		l4=new JLabel("Original Code");

		spec=new JButton("SPECIFICATION");
		spec.setBackground(new Color(0, 180, 209));
		spec.setForeground(Color.WHITE);
		spec.setFocusPainted(false);
		spec.setFont(new Font("Tahoma", Font.BOLD, 12));

		hint=new JButton("HINT");
		hint.setBackground(new Color(0, 180, 209));
		hint.setForeground(Color.WHITE);
		hint.setFocusPainted(false);
		hint.setFont(new Font("Tahoma", Font.BOLD, 12));

		run=new JButton("RUN");
		run.setBackground(new Color(0, 180, 209));
		run.setForeground(Color.WHITE);
		run.setFocusPainted(false);
		run.setFont(new Font("Tahoma", Font.BOLD, 12));



		textfieldOriginal=new JTextArea("");
		textfieldOriginal.setFont(new Font("Tahoma", Font.BOLD, 12));
		textfieldEditable=new JTextArea("");
		textfieldEditable.setFont(new Font("Tahoma", Font.BOLD, 12));

		add(l4);
		add(run);add(hint);add(giveUp);
		add(spec);
		add(textfieldOriginal);
		add(textfieldEditable);

		//textfield.setBorder(new EmptyBorder(20, 3, 2, 3));
		textfieldOriginal.setBounds(400,100,850,320);
		textfieldEditable.setBounds(400,500,850,320);
		l4.setBounds(400,80,500,20);
		giveUp.setBounds(780,450,100,30);
		hint.setBounds(670,450,100,30);
		run.setBounds(560,450,100,30);
		spec.setBounds(400,450,150,30);
		textfieldOriginal.setEditable(false);
		run.addActionListener(this);
		giveUp.addActionListener(this);
		hint.addActionListener(this);
		spec.addActionListener(this);
		added=true;
		textfieldOriginal.setVisible(true);
		textfieldEditable.setVisible(true);
		hint.setVisible(true);
		spec.setVisible(true);
		giveUp.setVisible(true);
		run.setVisible(true);
		l4.setVisible(true);

	}
	public void movement9(JButton b)
	{

		if(b==b1)
		{  
			Icon s1=b1.getIcon();  
			if(b2.getIcon()==start){  

				b2.setIcon(s1);  
				b1.setIcon(start);  
			} else if(b4.getIcon()==start){  
				b4.setIcon(s1);  
				b1.setIcon(start);  
			}  
		}//end of if  

		if(b==b2){  
			Icon s1=b2.getIcon();  
			if(b1.getIcon()==start){  
				b1.setIcon(s1);  
				b2.setIcon(start);  
			} else if(b5.getIcon()==start){  
				b5.setIcon(s1);  
				b2.setIcon(start);  
			}  
			else if(b3.getIcon()==start){  
				b3.setIcon(s1);  
				b2.setIcon(start);  
			}  
		}//end of if  

		if(b==b3){  
			Icon s1=b3.getIcon();  
			if(b2.getIcon()==start){  
				b2.setIcon(s1);  
				b3.setIcon(start);  
			} else if(b6.getIcon()==start){  
				b6.setIcon(s1);  
				b3.setIcon(start);  
			}  
		}//end of if  

		if(b==b4){  
			Icon s1=b4.getIcon();  
			if(b1.getIcon()==start){  
				b1.setIcon(s1);  
				b4.setIcon(start);  
			} else if(b5.getIcon()==start){  
				b5.setIcon(s1);  
				b4.setIcon(start);  
			}  
			else if(b7.getIcon()==start){  
				b7.setIcon(s1);  
				b4.setIcon(start);  
			}  
		}//end of if  

		if(b==b5){  
			Icon s1=b5.getIcon();  
			if(b2.getIcon()==start){  
				b2.setIcon(s1);  
				b5.setIcon(start);  
			} else if(b4.getIcon()==start){  
				b4.setIcon(s1);  
				b5.setIcon(start);  
			}  
			else if(b6.getIcon()==start){  
				b6.setIcon(s1);  
				b5.setIcon(start);  
			}  
			else if(b8.getIcon()==start){  
				b8.setIcon(s1);  
				b5.setIcon(start);  
			}  
		}//end of if  

		if(b==b6){  
			Icon s1=b6.getIcon();  
			if(b3.getIcon()==start){  
				b3.setIcon(s1);  
				b6.setIcon(start);  
			} else if(b5.getIcon()==start){  
				b5.setIcon(s1);  
				b6.setIcon(start);  
			}  
			else if(b9.getIcon()==start){  
				b9.setIcon(s1);  
				b6.setIcon(start);  
			}  
		}//end of if  

		if(b==b7){  
			Icon s1=b7.getIcon();  
			if(b4.getIcon()==start){  
				b4.setIcon(s1);  
				b7.setIcon(start);  
			} else if(b8.getIcon()==start){  
				b8.setIcon(s1);  
				b7.setIcon(start);  
			}  
		}//end of if  

		if(b==b8){  
			System.out.println("Inside mov b8");
			Icon s1=b8.getIcon();  
			if(b7.getIcon()==start){  
				System.out.println("Inside b7 if");
				b7.setIcon(s1);  
				b8.setIcon(start);  
			} else if(b5.getIcon()==start){  
				System.out.println("Inside b5 if");
				b5.setIcon(s1);  
				b8.setIcon(start);  
			}  
			else if(b9.getIcon()==start){  
				System.out.println("Inside b9 if");
				b9.setIcon(s1);  
				b8.setIcon(start);  
			}  

		}//end of if  

		if(b==b9){  
			//start=b9.getIcon();
			System.out.println("Inside mov b9");
			Icon s1=b9.getIcon();  
			if(b8.getIcon()==start){  
				System.out.println("Inside b8 if");
				b8.setIcon(s1);  
				b9.setIcon(start);  
			} else if(b6.getIcon()==start){  
				System.out.println("Inside b6 if");
				b6.setIcon(s1);  
				b9.setIcon(start);  
			}  
		}//end of if  
	}


	public void movement2(JButton b)
	{
		if(b==b1)
		{  
			Icon s1=b1.getIcon();  
			if(b2.getIcon()==start){  

				b2.setIcon(s1);  
				b1.setIcon(start);  
			} 
		}//end of if  

		if(b==b2)
		{  
			Icon s1=b2.getIcon();  
			if(b1.getIcon()==start){  

				b1.setIcon(s1);  
				b2.setIcon(start);  
			} 
		}//end of if  
	}

	public void movement4(JButton b)
	{

		if(b==b1)
		{  
			Icon s1=b1.getIcon();  
			if(b2.getIcon()==start){  

				b2.setIcon(s1);  
				b1.setIcon(start);  
			} else if(b3.getIcon()==start){  
				b3.setIcon(s1);  
				b1.setIcon(start);  
			}  
		}//end of if  
		else if(b==b2)
		{  
			Icon s1=b2.getIcon();  
			if(b1.getIcon()==start){  

				b1.setIcon(s1);  
				b2.setIcon(start);  
			} else if(b4.getIcon()==start){  
				b4.setIcon(s1);  
				b2.setIcon(start);  
			}  
		}//end of if 
		else if(b==b3)
		{  
			Icon s1=b3.getIcon();  
			if(b1.getIcon()==start){  

				b1.setIcon(s1);  
				b3.setIcon(start);  
			} else if(b4.getIcon()==start){  
				b4.setIcon(s1);  
				b3.setIcon(start);  
			}  
		}//end of if 
		else if(b==b4)
		{  
			Icon s1=b4.getIcon();  
			if(b2.getIcon()==start){  

				b2.setIcon(s1);  
				b4.setIcon(start);  
			} else if(b3.getIcon()==start){  
				b3.setIcon(s1);  
				b4.setIcon(start);  
			}  
		}//end of if 
	}

	public void move(JButton b)
	{
		if(pieces== 2)
			movement2(b);		
		else if(pieces == 4)
			movement4(b);	
		else if(pieces ==9)
			movement9(b);
	}
	public void setPaths()
	{
		for(int i=1; i<DB.size();i++)
		{
			for(int j=0;j< DB.get(i).length;j++)
			{
				if(DB.get(i)[2].equals(iconName) && DB.get(i)[0].equals(picName) && Integer.parseInt(DB.get(i)[1])==pieces)
				{
					System.out.println();
					System.out.println("START---------------------------------------------------");
					System.out.println("Pic: "+picName);
					System.out.print(" pathReadCode: "+pathReadCode);
					System.out.print(" pathWrite: "+pathWriteCode);
					System.out.print(" pathTestCode: "+pathTestCode);
					System.out.print(" pathTestTest: "+pathTestTest);
					DBIndex=i;
					pathReadCode=DB.get(i)[3];
					pathWriteCode=DB.get(i)[4];
					pathTestCode=DB.get(i)[5];
					pathCodeSpec=DB.get(i)[6];
					pathCodeHint=DB.get(i)[7];
					pathSolution=DB.get(i)[9];
					//pathTestTest=DB.get(i)[8];

					System.out.println();
					System.out.println("LATER-------------------------------------------------------------");
					System.out.println("Pic: "+picName);
					System.out.print(" pathReadCode: "+pathReadCode);
					System.out.print(" pathWrite: "+pathWriteCode);
					System.out.print(" pathTestCode: "+pathTestCode);
					break;
				}
			}
		}

	}//path setPaths ends
	public void loadCode()
	{
		BufferedReader in;
		textfieldEditable.setText(null);
		textfieldOriginal.setText(null);
		try {
			System.out.println("Inside Load,read code"+pathReadCode);
			in = new BufferedReader(new FileReader(pathReadCode));
			String line;
			line = in.readLine();
			while(line != null)
			{
				textfieldOriginal.append(line + "\n");
				textfieldEditable.append(line + "\n");
				line = in.readLine();
			}
		} 
		catch (Exception e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
	}

	public void puzzleSolved() throws IOException, InterruptedException
	{
		int f=0;
		if(b1.getIcon()==ic2 && b2.getIcon()==ic1 && pieces==2)
			f=1;
		else if(b1.getIcon()==ic2 && b2.getIcon()==ic3 && b3.getIcon()==ic4 && b4.getIcon()==ic1 && pieces==4)
			f =1;
		else if(b1.getIcon()==ic1 && b2.getIcon()==ic3 && b3.getIcon()==ic9 && b4.getIcon()==ic5 && b5.getIcon()==ic2 && b6.getIcon()==ic6 && b7.getIcon()==ic4 && b8.getIcon()==ic7 && b9.getIcon()==ic8 && pieces==9)
			f=1;

		if(f==1)
		{
			JOptionPane.showMessageDialog(null,"Congratulations!!You win.", "Success", JOptionPane.INFORMATION_MESSAGE);
			int dialogButton1 = JOptionPane.YES_NO_OPTION;
			int dialogResult1 = JOptionPane.showConfirmDialog (null, "Do you wish to play another game?","Message",dialogButton1);

			if(dialogResult1 == JOptionPane.YES_OPTION)
			{			
				this.dispose();
				new GuiMain();

			}	
			else
			{
				this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
			}
		}
	}
	public void showSolution()
	{
		JLabel imgLabel = new JLabel(new ImageIcon(pathSolution));
		JOptionPane.showMessageDialog(null,imgLabel, "Solution", JOptionPane.INFORMATION_MESSAGE);
		if(buttonID==1)
		{
			b1.setEnabled(true);
		}
		else if(buttonID==2)
		{
			b2.setEnabled(true);
		}
		else if(buttonID==3)
		{
			b3.setEnabled(true);
		}
		else if(buttonID==4)
		{
			b4.setEnabled(true);
		}
		else if(buttonID==5)
		{
			b5.setEnabled(true);
		}
		else if(buttonID==6)
		{
			b6.setEnabled(true);
		}
		else if(buttonID==7)
		{
			b7.setEnabled(true);
		}
		else if(buttonID==8)
		{
			b8.setEnabled(true);
		}
		else if(buttonID==9)
		{
			b9.setEnabled(true);
		}
		
	}

}
