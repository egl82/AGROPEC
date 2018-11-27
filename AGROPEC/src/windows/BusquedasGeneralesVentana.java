package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BusquedasGeneralesVentana extends JFrame {

	private JPanel contentPane;

	public BusquedasGeneralesVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 60, 884, 501);
		contentPane.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel.add(tabbedPane, "name_8966460065533");
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Por Fechas", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblBusqueda = new JLabel("Busqueda por fecha (anteriores a dicha fecha )");
		lblBusqueda.setBounds(303, 11, 290, 14);
		panel_1.add(lblBusqueda);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Por Lote", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar por lote(todo lo relacionado con el lote)");
		lblNewLabel.setBounds(279, 11, 278, 14);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Por Producto", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblBuscarPorProducto = new JLabel("Buscar por producto ");
		lblBuscarPorProducto.setBounds(337, 11, 192, 14);
		panel_3.add(lblBuscarPorProducto);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Por Fecha y Producto", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblBuscarPorFecha = new JLabel("Buscar por fecha y producto(producto en la fecha indicada)");
		lblBuscarPorFecha.setBounds(277, 11, 375, 14);
		panel_4.add(lblBuscarPorFecha);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final MenuVentana menuV = new MenuVentana();
				menuV.setVisible(true);
				dispose();
			}
		});
		btnSalir.setBounds(769, 11, 89, 38);
		contentPane.add(btnSalir);
		
	
	}
}
