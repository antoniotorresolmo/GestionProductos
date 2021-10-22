package views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.List;
import java.awt.Toolkit;

public class FrmPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JPanel pnlPrincipal;

	public FrmPrincipal() {
		int iX, iY;
		
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iX = (screensize.width - 600) / 2;
		iY = (screensize.height - 400) / 2;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(iX, iY, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		List list = new List();
		contentPane.add(list, BorderLayout.WEST);
		
		pnlPrincipal = new PnlCrearProducto();
		contentPane.add(pnlPrincipal, BorderLayout.CENTER);
		
		setVisible(true);
	}

}
