package windows;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProveedoresVentana extends JFrame {
	
	private JTextField txtCif;
	private JTextField txtNombre; 
	private JTextField txtDireccion;
	private JTextField txtEmail;
	private JTextField txtTelefono;
	
	
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public ProveedoresVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		setTitle("Proveedores");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInterventores = new JLabel("PROVEEDORES ");
		lblInterventores.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblInterventores.setBounds(305, -4, 264, 60);
		contentPane.add(lblInterventores);
		
		JButton btnAgregar = new JButton("AGREGAR");
		btnAgregar.setBounds(121, 115, 114, 46);
		contentPane.add(btnAgregar);
						
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.setBounds(245, 115, 114, 46);
		contentPane.add(btnBorrar);
		
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnModificar.setBounds(369, 115, 114, 46);
		contentPane.add(btnModificar);
		
		JButton btnListar = new JButton("LISTAR");
		btnListar.setBounds(493, 115, 114, 46);
		contentPane.add(btnListar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final MenuVentana menuV = new MenuVentana();
				menuV.setVisible(true);
				dispose(); 
			}
		});
		btnSalir.setBounds(10, 11, 114, 46);
		contentPane.add(btnSalir);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(621, 115, 114, 46);
		contentPane.add(btnBuscar);
		
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNombre.setBounds(121, 228, 76, 20);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField(); 
		txtNombre.setColumns(10);
		txtNombre.setBounds(121, 252, 137, 20);
		contentPane.add(txtNombre);
		
		JLabel lblCif = new JLabel("CIF");
		lblCif.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCif.setBounds(282, 228, 52, 20);
		contentPane.add(lblCif);
		
		txtCif = new JTextField();
		txtCif.setColumns(10);
		txtCif.setBounds(459, 253, 137, 18);
		contentPane.add(txtCif);
		
		JLabel lblDireccion = new JLabel("Dirección");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDireccion.setBounds(459, 228, 137, 20);
		contentPane.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(277, 253, 137, 18);
		contentPane.add(txtDireccion);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(121, 325, 137, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(277, 325, 137, 20);
		contentPane.add(textField_1);
		
		JLabel lblEmail = new JLabel("EMAIL ");
		lblEmail.setBounds(121, 300, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblNewLabel = new JLabel("TELEFONO ");
		lblNewLabel.setBounds(282, 300, 77, 14);
		contentPane.add(lblNewLabel);
		
		
	}
}
