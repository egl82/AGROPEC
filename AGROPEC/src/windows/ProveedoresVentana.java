package windows;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProveedoresVentana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		

		
		
	}
}
