package windows;




import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;
import java.awt.Choice;
import javax.swing.JTextField;
import com.toedter.calendar.JYearChooser;

import utils.Calendario;

import com.toedter.calendar.JDayChooser;
import java.awt.Panel;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;



public class ControlSalidaVentana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtProveedor;
	private JTextField txtLote;
	private JTextField txtAlbaran;
	private JTextField txtFirmados;

	
	
	public ControlSalidaVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd/MM/yyyy");
		dateChooser.setBounds(111, 279, 135, 20);
		contentPane.add(dateChooser);
		
		JButton button = new JButton("SALIR");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final MenuVentana menuV = new MenuVentana();
				menuV.setVisible(true);
				dispose(); 
			}
		});
		button.setBounds(10, 11, 114, 46);
		contentPane.add(button);
		
		JLabel lblControlEntradas = new JLabel("CONTROL DE SALIDAS");
		lblControlEntradas.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblControlEntradas.setBounds(284, 11, 425, 60);
		contentPane.add(lblControlEntradas);
		
		JLabel lblFechaSalida = new JLabel("Fecha salida");
		lblFechaSalida.setBounds(111, 254, 115, 14);
		contentPane.add(lblFechaSalida);
		
		JButton button_1 = new JButton("AGREGAR");
		button_1.setBounds(137, 139, 114, 46);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("BORRAR");
		button_2.setBounds(261, 139, 114, 46);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("MODIFICAR");
		button_3.setBounds(385, 139, 114, 46);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("LISTAR");
		button_4.setBounds(509, 139, 114, 46);
		contentPane.add(button_4);
		
		txtProveedor = new JTextField();
		txtProveedor.setBounds(269, 279, 135, 20);
		contentPane.add(txtProveedor);
		txtProveedor.setColumns(10);
		
		JLabel lblProveedor = new JLabel("PROVEEDOR ");
		lblProveedor.setBounds(269, 254, 108, 14);
		contentPane.add(lblProveedor);
		
		txtLote = new JTextField();
		txtLote.setBounds(443, 279, 135, 20);
		contentPane.add(txtLote);
		txtLote.setColumns(10);
		
		JLabel lblLote = new JLabel("LOTE ");
		lblLote.setBounds(443, 254, 46, 14);
		contentPane.add(lblLote);
		
		txtAlbaran = new JTextField();
		txtAlbaran.setBounds(613, 279, 135, 20);
		contentPane.add(txtAlbaran);
		txtAlbaran.setColumns(10);
		
		JLabel lblNumeroDeAlbaran = new JLabel("N\u00BA DE ALBAR\u00C1N  ");
		lblNumeroDeAlbaran.setBounds(613, 254, 135, 14);
		contentPane.add(lblNumeroDeAlbaran);
		
		txtFirmados = new JTextField();
		txtFirmados.setBounds(111, 388, 135, 20);
		contentPane.add(txtFirmados);
		txtFirmados.setColumns(10);
		
		JLabel lblFirmados = new JLabel("FIRMADOS ");
		lblFirmados.setBounds(111, 337, 87, 14);
		contentPane.add(lblFirmados);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(634, 139, 114, 46);
		contentPane.add(btnBuscar);
		
		JRadioButton rdbtnSi = new JRadioButton("SI");
		rdbtnSi.setBounds(111, 358, 50, 23);
		contentPane.add(rdbtnSi);
		
		JRadioButton rdbtnNo = new JRadioButton("NO");
		rdbtnNo.setBounds(163, 358, 46, 23);
		contentPane.add(rdbtnNo);
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbtnSi);
		grupo1.add(rdbtnNo);
				
	
	

		
		
		 
		
	}
}
