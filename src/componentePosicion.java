import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class componentePosicion extends Ventana implements MouseListener{
	
	private JButton btn;
	private JTextField txt;
	private JLabel lbl;
	
	public componentePosicion(){
		this.setLayout(null);
		
		btn=new JButton("click");
		btn.setBounds(50, 50, 150, 30);
		btn.addMouseListener(this);
		this.add(btn);
		
		txt=new JTextField();
		txt.setBounds(10, 10, 300, 30);
		this.add(txt);
		
		lbl=new JLabel("Esta es mi etiqueta");
		lbl.setBounds(400, 10, 300, 100);
		this.add(lbl);
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Clicked: "+e.getX()+"y: "+e.getY());
		lbl.setText(txt.getText());//lo que tiene la caja de texto  se lo asigna al label
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Pressed: "+e.getX()+"y: "+e.getY());
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
