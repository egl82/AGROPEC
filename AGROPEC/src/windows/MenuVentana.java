package windows;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import utils.Calendario;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuVentana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public MenuVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		setTitle("Menu principal");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnEntrada = new JButton("ENTRADA");
		btnEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			final ControlEntradaVentana ctrEntVentana = new ControlEntradaVentana(); 
			ctrEntVentana.setVisible(true);
			dispose(); 
			
			}
		});
		btnEntrada.setBounds(199, 185, 166, 46);
		contentPane.add(btnEntrada);

		JButton btnSalida = new JButton("SALIDA");
		btnSalida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ControlSalidaVentana ctrSalidaVentana = new ControlSalidaVentana();
				ctrSalidaVentana.setVisible(true);
				dispose(); 
				
			}
		});
		btnSalida.setBounds(199, 254, 166, 46);
		contentPane.add(btnSalida);

		JButton btnClientes = new JButton("CLIENTES");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ClientesVentana ClientesV = new ClientesVentana();
				ClientesV.setVisible(true);
				dispose(); 				
			}
		});
		btnClientes.setBounds(199, 326, 166, 46);
		contentPane.add(btnClientes);

		JButton btnProveedores = new JButton("PROVEEDORES");
		btnProveedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ProveedoresVentana ProveedoresV = new ProveedoresVentana();
				ProveedoresV.setVisible(true);
				dispose(); 
				
			}
		});
		btnProveedores.setBounds(464, 185, 166, 46);
		contentPane.add(btnProveedores);

		JButton btnBusquedasGenerales = new JButton("BUSQUEDAS GENERALES");
		btnBusquedasGenerales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BusquedasGeneralesVentana BusGeneralVen = new BusquedasGeneralesVentana();
				BusGeneralVen.setVisible(true);
				dispose();
				
			}	
	});
		btnBusquedasGenerales.setBounds(464, 254, 166, 46);
		contentPane.add(btnBusquedasGenerales);
					
		
		JButton btnInterventores = new JButton("INTERVENTORES");
		btnInterventores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final InterventoresVentana InterV = new InterventoresVentana();
				InterV.setVisible(true);
				dispose();
			}
		});
		btnInterventores.setBounds(464, 326, 166, 46);
		contentPane.add(btnInterventores);

		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Metodo que sale de la aplicacion 
				int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere salir de la aplicación?", "Confimar salida", JOptionPane.OK_CANCEL_OPTION);
				if (seleccion == 0){
					System.exit(0);	
				}
			}
		});
		btnSalir.setBounds(785, 11, 89, 46);
		contentPane.add(btnSalir);

		JLabel lblNombreApp = new JLabel("------------------"); //Cambiar al nombre de la aplicacion 
		lblNombreApp.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNombreApp.setBounds(165, 34, 581, 68);
		contentPane.add(lblNombreApp);
		
		JButton btnCalendar = new JButton("");
		btnCalendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Calendario calendario = new Calendario(); 
				calendario.setVisible(true);
						
			}
		});
		btnCalendar.setBounds(795, 510, 33, 23);
		contentPane.add(btnCalendar);
		
		JLabel lblCalendario = new JLabel("Calendario");
		lblCalendario.setBounds(785, 491, 69, 14);
		contentPane.add(lblCalendario);
	}
}
