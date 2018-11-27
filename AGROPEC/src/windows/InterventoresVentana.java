package windows;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class InterventoresVentana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCif;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDireccion;
	private JTextField txtEmail;
	private JTextField txtTelefono;

	public InterventoresVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		setTitle("Interventores");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInterventores = new JLabel("INTERVENTORES ");
		lblInterventores.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblInterventores.setBounds(315, 11, 264, 60);
		contentPane.add(lblInterventores);
		
		JButton btnAgregar = new JButton("AGREGAR");
		btnAgregar.setBounds(180, 115, 114, 46);
		contentPane.add(btnAgregar);
						
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.setBounds(304, 115, 114, 46);
		contentPane.add(btnBorrar);
		
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnModificar.setBounds(428, 115, 114, 46);
		contentPane.add(btnModificar);
		
		JButton btnListar = new JButton("LISTAR");
		btnListar.setBounds(552, 115, 114, 46);
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
		
		txtCif = new JTextField();
		txtCif.setColumns(10);
		txtCif.setBounds(180, 250, 114, 20);
		contentPane.add(txtCif);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(332, 250, 114, 20);
		contentPane.add(txtNombre);
		
		JLabel label = new JLabel("CIF");
		label.setBounds(180, 224, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("NOMBRE");
		label_1.setBounds(332, 225, 46, 14);
		contentPane.add(label_1);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(493, 250, 114, 20);
		contentPane.add(txtApellidos);
		
		JLabel label_2 = new JLabel("DIRECCI\u00D3N");
		label_2.setBounds(180, 293, 86, 14);
		contentPane.add(label_2);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(180, 318, 114, 20);
		contentPane.add(txtDireccion);
		
		JLabel label_3 = new JLabel("EMAIL");
		label_3.setBounds(332, 293, 46, 14);
		contentPane.add(label_3);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(332, 318, 114, 20);
		contentPane.add(txtEmail);
		
		JLabel label_4 = new JLabel("TEL\u00C9FONO");
		label_4.setBounds(493, 293, 86, 14);
		contentPane.add(label_4);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(493, 318, 114, 20);
		contentPane.add(txtTelefono);
		
		JLabel lblApellidos = new JLabel("APELLIDOS");
		lblApellidos.setBounds(496, 224, 96, 14);
		contentPane.add(lblApellidos);
		

		
		
	}
}
