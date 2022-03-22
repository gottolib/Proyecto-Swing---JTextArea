import javax.swing.*;
import java.awt.event.*;
public class Formulario extends JFrame implements ActionListener {
	private JTextArea t1,t2;
	private JScrollPane s1,s2;
	private JButton b1;
	
	public Formulario()
	{
		setLayout(null);
		t1 = new JTextArea ();
		s1 = new JScrollPane(t1);
		s1.setBounds(1,1,400,200);
		add(s1);
		
		t2 = new JTextArea();
		s2  = new JScrollPane (t2);
		s2.setBounds(1,220,400,200);
		add(s2);
		
		b1 = new JButton ("VERIFICAR");
		b1.setBounds(100,700,120,40);
		add(b1);
		b1.addActionListener(this);
	}
	
	public void actionPerformed (ActionEvent e)
	{
		if(e.getSource() ==  b1)
		{
			String tex1 = t1.getText ();
			String tex2 = t2.getText ();
			if(tex1.equals (tex2))
			{
				setTitle("Ambos textos son iguales.");
			}
			else
			{
				setTitle ("No hay igualdad entre textos.");
			}
		}
		
	}
	public static void main (String []ar)
	{
		Formulario formulario1 = new Formulario ();
		formulario1.setBounds(1,1,600,780);
		formulario1.setVisible(true);
		
	}

}
