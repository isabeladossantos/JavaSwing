package br.univille.isa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;



public class Paineis extends JFrame {

	public Paineis() {
		JPanel panel = new JPanel();
		
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout(1,1));
		
		JPanel norte = criarPanel(Color.RED,"Norte");
        JPanel leste = criarPanel(Color.YELLOW,"Leste");
        JPanel oeste = criarPanel(Color.BLUE,"Oeste");
        JPanel sul = criarPanel(Color.WHITE,"Sul");
        JPanel centro = criarPanel(Color.GREEN,"Centro");
        
        p1.add(norte, BorderLayout.NORTH);
        p1.add(leste, BorderLayout.EAST);
        p1.add(oeste, BorderLayout.WEST);
        p1.add(sul, BorderLayout.SOUTH);
        p1.add(centro, BorderLayout.CENTER);
        
        JPanel p2 = new JPanel();
        
        JCheckBox check = createCheckBoxFlag("Norte", norte);
		check.setSelected(true);
		
		JCheckBox c2 = createCheckBoxFlag("Sul", sul);
		c2.setSelected(true);
		
		JCheckBox c3 = createCheckBoxFlag("Leste", leste);
		c2.setSelected(true);
		
		JCheckBox c4 = createCheckBoxFlag("Oeste", oeste);
		c2.setSelected(true);
		
		JCheckBox c5 = createCheckBoxFlag("Centro", centro);
		c2.setSelected(true);

		p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
		p2.add(check);
		p2.add(c2);
		p2.add(c3);
		p2.add(c4);
		p2.add(c5);
		
		panel.add(p2);
		panel.add(p1);
		add(panel);
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paineis paineis = new Paineis();
		paineis.setSize(400, 200);
		paineis.setResizable(false);
		paineis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		paineis.setVisible(true);
        
	}
	
	private static JCheckBox createCheckBoxFlag(String text, JPanel panel) {
		JCheckBox checkbox = new JCheckBox();
		checkbox.setText(text);
		checkbox.setSelected(true);
		
		checkbox.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(checkbox.isSelected());
			}
		});
		return checkbox;
	}
	
	private static JPanel criarPanel(Color color, String texto) {
    	JPanel panel = new JPanel();
    	panel.setBackground(color);
    	panel.add(new JLabel(texto));
    	// Configurar tamanho padrao para o painel
    	return panel;
    }

}
