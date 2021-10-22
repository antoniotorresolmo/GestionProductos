package views;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PnlCategoriaVacia extends JPanel {

	private static final long serialVersionUID = 1L;

	public PnlCategoriaVacia() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblCrearProducto = new JLabel("Crear producto", JLabel.CENTER);
		lblCrearProducto.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				FrmPrincipal.pnlPrincipal = new PnlCrearProducto();
		}
		});
		add(lblCrearProducto, BorderLayout.CENTER);
		
	}

}
