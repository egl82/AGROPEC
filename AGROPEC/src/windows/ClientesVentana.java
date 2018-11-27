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

public class ClientesVentana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public ClientesVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		setTitle("Clientes");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInterventores = new JLabel("CLIENTES ");
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
			public void actionPerformed(ActionEvent arg0) {
				
				final MenuVentana menuV = new MenuVentana();
				menuV.setVisible(true);
				dispose(); 
			}
		});
		btnSalir.setBounds(10, 11, 114, 46);
		contentPane.add(btnSalir);
		
		textField = new JTextField();
		textField.setBounds(180, 227, 114, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(332, 227, 114, 20);
		contentPane.add(textField_1);
		
		JLabel lblCif = new JLabel("CIF");
		lblCif.setBounds(180, 201, 46, 14);
		contentPane.add(lblCif);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(332, 202, 46, 14);
		contentPane.add(lblNombre);
		
		textField_2 = new JTextField();
		textField_2.setBounds(493, 227, 114, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("DIRECCI\u00D3N");
		lblNewLabel.setBounds(493, 201, 86, 14);
		contentPane.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(180, 295, 114, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setBounds(180, 270, 46, 14);
		contentPane.add(lblEmail);
		
		textField_4 = new JTextField();
		textField_4.setBounds(332, 295, 114, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblTelfono = new JLabel("TEL\u00C9FONO");
		lblTelfono.setBounds(332, 270, 86, 14);
		contentPane.add(lblTelfono);
		
		
	}
}
