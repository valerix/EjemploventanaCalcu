import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Calculadora extends Ventana implements Operaciones, MouseListener{
	
	private JTextField txt;
	private JLabel lbl;
	private JButton btnSuma ,btnResta,btnMulti,btnDiv;
	private int total;
	
	public Calculadora(){
		this.setLayout(null);
		this.btnSuma=new JButton("+");
		this.btnSuma.setName("+");
		this.btnSuma.setBounds(400, 100, 50, 50);
		this.btnSuma.addMouseListener(this);
		
		this.btnResta=new JButton("-");
		this.btnResta.setBounds(400, 160, 50, 50);
		
		this.btnMulti=new JButton("*");
		this.btnMulti.setBounds(400, 220, 50, 50);
		this.btnDiv=new JButton("/");
		this.btnDiv.setBounds(400, 280, 50, 50);
		
		this.add(btnSuma);
		this.add(btnResta);
		this.add(btnMulti);
		this.add(btnDiv);
		
		this.txt=new JTextField();
		this.txt.setBounds(50, 100, 250, 50);
		this.add(txt);
		
		this.lbl=new JLabel("0");
		this.lbl.setBounds(50, 10, 250, 50);
		this.add(lbl);
	}

	@Override
	public float suma(float a) {
		// TODO Auto-generated method stub
	
		return this.total+=a;
	}

	@Override
	public float resta(float a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float multiplicacion(float a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float divicion(float a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		String name=e.getComponent().getName();
		if(name=="+"){
			this.lbl.setText(Float.toString(this.suma(Float.parseFloat(this.txt.getText()))));
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
