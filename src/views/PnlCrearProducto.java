package views;

import javax.swing.JPanel;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PnlCrearProducto extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JTextField txtStock;

	public PnlCrearProducto() {
		setLayout(null);
		
		JLabel lblImagen = new JLabel("");
		lblImagen.setBounds(30, 30, 170, 162);
		lblImagen.setOpaque(true);
		lblImagen.setBackground(Color.GREEN);
		add(lblImagen);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(210, 58, 46, 14);
		add(lblNombre);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(210, 88, 46, 14);
		add(lblPrecio);
		
		JLabel lblStock = new JLabel("Stock");
		lblStock.setBounds(210, 118, 46, 14);
		add(lblStock);
		
		JCheckBox cbFragil = new JCheckBox("Fr\u00E1gil");
		cbFragil.setBounds(206, 144, 97, 23);
		add(cbFragil);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(266, 55, 174, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(312, 85, 86, 20);
		add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtStock = new JTextField();
		txtStock.setBounds(312, 115, 86, 20);
		add(txtStock);
		txtStock.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(93, 232, 107, 39);
		add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(266, 232, 107, 39);
		add(btnCancelar);

	}
}
