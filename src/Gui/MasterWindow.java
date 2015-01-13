package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class MasterWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel cardLayoutPrincipal;
	private JPanel panelSeleccionNumJugadores;
	private JPanel panelSur;
	private JButton btnContinuar;
	private JPanel panel;
	private JLabel labelLogo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MasterWindow frame = new MasterWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MasterWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 442);
		cardLayoutPrincipal = new JPanel();
		cardLayoutPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cardLayoutPrincipal);
		cardLayoutPrincipal.setLayout(new CardLayout(0, 0));
		cardLayoutPrincipal.add(getPanelSeleccionNumJugadores(), "name_118920630072690");
	}

	private JPanel getPanelSeleccionNumJugadores() {
		if (panelSeleccionNumJugadores == null) {
			panelSeleccionNumJugadores = new JPanel();
			panelSeleccionNumJugadores.setLayout(new BorderLayout(0, 0));
			panelSeleccionNumJugadores.add(getPanelSur(), BorderLayout.SOUTH);
			panelSeleccionNumJugadores.add(getPanel(), BorderLayout.NORTH);
		}
		return panelSeleccionNumJugadores;
	}
	private JPanel getPanelSur() {
		if (panelSur == null) {
			panelSur = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panelSur.getLayout();
			flowLayout.setAlignment(FlowLayout.RIGHT);
			panelSur.add(getBtnContinuar());
		}
		return panelSur;
	}
	private JButton getBtnContinuar() {
		if (btnContinuar == null) {
			btnContinuar = new JButton("Continuar");
		}
		return btnContinuar;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getLabel_1());
		}
		return panel;
	}
	private JLabel getLabel_1() {
		if (labelLogo == null) {
			labelLogo = new JLabel("");
		}
		return labelLogo;
	}
}
