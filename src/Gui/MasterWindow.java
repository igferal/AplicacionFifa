package Gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.CardLayout;

import javax.swing.JButton;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.BoxLayout;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JTable;

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
	private JPanel panel_1;
	private JLabel lblSeleccioneElNmero;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel4Jugadores;
	private JSpinner spinner;
	private JPanel Generar;
	private JButton btnNewButton;
	private JPanel panel4izqda;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel panel4dcha;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel label;
	private JTable table;
	private JPanel panel8Jugadores;
	private JPanel panel_7;
	private JButton button;
	private JPanel panel_8;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel label_1;
	private JTextField textField_8;
	private JTextField textField_9;
	private JPanel panel_9;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_10;
	private JTextField textField_11;
	private ArrayList<String> al;
	private JPanel panel16Jugadores;
	private JPanel panel_5;
	private JButton button_1;
	private JPanel panel_6;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JPanel panel_4;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JLabel label_2;

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
		al = new ArrayList<String>();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 442);
		cardLayoutPrincipal = new JPanel();
		cardLayoutPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cardLayoutPrincipal);
		cardLayoutPrincipal.setLayout(new CardLayout(0, 0));
		cardLayoutPrincipal
				.add(getPanelSeleccionNumJugadores(), "numJugadores");
		cardLayoutPrincipal.add(getPanel4Jugadores(), "4jugadores");
		cardLayoutPrincipal.add(getPanel8Jugadores(), "8Jugadores");
		cardLayoutPrincipal.add(getPanel16Jugadores(), "16jugadores");
	}

	private JPanel getPanelSeleccionNumJugadores() {
		if (panelSeleccionNumJugadores == null) {
			panelSeleccionNumJugadores = new JPanel();
			panelSeleccionNumJugadores.setLayout(new BorderLayout(0, 0));
			panelSeleccionNumJugadores.add(getPanelSur(), BorderLayout.SOUTH);
			panelSeleccionNumJugadores.add(getPanel(), BorderLayout.NORTH);
			panelSeleccionNumJugadores.add(getPanel_1(), BorderLayout.CENTER);
		}
		return panelSeleccionNumJugadores;
	}

	private JPanel getPanelSur() {
		if (panelSur == null) {
			panelSur = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panelSur.getLayout();
			flowLayout.setAlignment(FlowLayout.RIGHT);
			panelSur.add(getPanel_2());
		}
		return panelSur;
	}

	private JButton getBtnContinuar() {
		if (btnContinuar == null) {
			btnContinuar = new JButton("Continuar");
			btnContinuar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					int numero = (int) spinner.getValue();

					if (numero <= 4) {
						((CardLayout) cardLayoutPrincipal.getLayout()).show(
								cardLayoutPrincipal, "4jugadores");
					} else if (numero <= 8) {
						((CardLayout) cardLayoutPrincipal.getLayout()).show(
								cardLayoutPrincipal, "8Jugadores");
					}
					else if(numero>8)
						((CardLayout) cardLayoutPrincipal.getLayout()).show(
								cardLayoutPrincipal, "16jugadores");

				}
			});
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
			labelLogo.setIcon(new ImageIcon(MasterWindow.class
					.getResource("/files/img/FIFA.png")));
		}
		return labelLogo;
	}

	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.add(getPanel_3());
			panel_1.add(getSpinner());
		}
		return panel_1;
	}

	private JLabel getLblSeleccioneElNmero() {
		if (lblSeleccioneElNmero == null) {
			lblSeleccioneElNmero = new JLabel(
					"Seleccione el  n\u00FAmero de jugadores del torneo");
			lblSeleccioneElNmero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblSeleccioneElNmero;
	}

	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.add(getBtnContinuar());
		}
		return panel_2;
	}

	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setBounds(163, 5, 292, 27);
			panel_3.add(getLblSeleccioneElNmero());
		}
		return panel_3;
	}

	private JPanel getPanel4Jugadores() {
		if (panel4Jugadores == null) {
			panel4Jugadores = new JPanel();
			panel4Jugadores.setLayout(null);
			panel4Jugadores.add(getGenerar());
			panel4Jugadores.add(getPanel_4_1());
			panel4Jugadores.add(getPanel_5_1());
			panel4Jugadores.add(getLabel());
		}
		return panel4Jugadores;
	}

	private JSpinner getSpinner() {
		if (spinner == null) {
			spinner = new JSpinner();
			spinner.setModel(new SpinnerNumberModel(0, 0, 32, 1));
			spinner.setBounds(460, 8, 90, 20);
		}
		return spinner;
	}

	private JPanel getGenerar() {
		if (Generar == null) {
			Generar = new JPanel();
			Generar.setBounds(0, 370, 653, 33);
			Generar.add(getBtnNewButton());
		}
		return Generar;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Generar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					rellenarParticipantes(panel4dcha);
					rellenarParticipantes(panel4izqda);

					rellenoAleatorio();

					colocarEquipos(panel4izqda);
					colocarEquipos(panel4dcha);
				}
			});
		}
		return btnNewButton;
	}

	private JPanel getPanel_4_1() {
		if (panel4izqda == null) {
			panel4izqda = new JPanel();
			panel4izqda.setBounds(10, 52, 157, 213);
			panel4izqda.setLayout(null);
			panel4izqda.add(getTextField_4());
			panel4izqda.add(getTextField_1_1());
		}
		return panel4izqda;
	}

	private JTextField getTextField_4() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(0, 51, 160, 27);
			textField.setColumns(10);
		}
		return textField;
	}

	private JTextField getTextField_1_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(0, 158, 160, 27);
		}
		return textField_1;
	}

	private JPanel getPanel_5_1() {
		if (panel4dcha == null) {
			panel4dcha = new JPanel();
			panel4dcha.setLayout(null);
			panel4dcha.setBounds(479, 52, 164, 213);
			panel4dcha.add(getTextField_2_1());
			panel4dcha.add(getTextField_3_1());
		}
		return panel4dcha;
	}

	private JTextField getTextField_2_1() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(0, 54, 160, 27);
		}
		return textField_2;
	}

	private JTextField getTextField_3_1() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(0, 156, 160, 27);
		}
		return textField_3;
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
			label.setIcon(new ImageIcon(MasterWindow.class
					.getResource("/files/img/FIFA.png")));
			label.setBounds(122, 52, 445, 294);
		}
		return label;
	}

	private JPanel getPanel8Jugadores() {
		if (panel8Jugadores == null) {
			panel8Jugadores = new JPanel();
			panel8Jugadores.setLayout(null);
			panel8Jugadores.add(getPanel_7());
			panel8Jugadores.add(getPanel_8());
			panel8Jugadores.add(getLabel_1_1());
			panel8Jugadores.add(getPanel_9());
		}
		return panel8Jugadores;
	}

	private JPanel getPanel_7() {
		if (panel_7 == null) {
			panel_7 = new JPanel();
			panel_7.setBounds(0, 370, 653, 33);
			panel_7.add(getButton());
		}
		return panel_7;
	}

	private JButton getButton() {
		if (button == null) {
			button = new JButton("Generar");
		}
		return button;
	}

	private JPanel getPanel_8() {
		if (panel_8 == null) {
			panel_8 = new JPanel();
			panel_8.setLayout(null);
			panel_8.setBounds(10, 52, 157, 213);
			panel_8.add(getTextField_4_1());
			panel_8.add(getTextField_5());
			panel_8.add(getTextField_8());
			panel_8.add(getTextField_9());
		}
		return panel_8;
	}

	private JTextField getTextField_4_1() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(0, 23, 160, 27);
		}
		return textField_4;
	}

	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(0, 136, 160, 27);
		}
		return textField_5;
	}

	private JLabel getLabel_1_1() {
		if (label_1 == null) {
			label_1 = new JLabel("");
			label_1.setIcon(new ImageIcon(MasterWindow.class
					.getResource("/files/img/FIFA.png")));
			label_1.setBounds(122, 52, 445, 294);
		}
		return label_1;
	}

	private JTextField getTextField_8() {
		if (textField_8 == null) {
			textField_8 = new JTextField();
			textField_8.setBounds(0, 78, 160, 27);
			textField_8.setColumns(10);
		}
		return textField_8;
	}

	private JTextField getTextField_9() {
		if (textField_9 == null) {
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(0, 186, 160, 27);
		}
		return textField_9;
	}

	private JPanel getPanel_9() {
		if (panel_9 == null) {
			panel_9 = new JPanel();
			panel_9.setLayout(null);
			panel_9.setBounds(486, 52, 157, 213);
			panel_9.add(getTextField_6());
			panel_9.add(getTextField_7());
			panel_9.add(getTextField_10());
			panel_9.add(getTextField_11());
		}
		return panel_9;
	}

	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(0, 23, 160, 27);
		}
		return textField_6;
	}

	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(0, 136, 160, 27);
		}
		return textField_7;
	}

	private JTextField getTextField_10() {
		if (textField_10 == null) {
			textField_10 = new JTextField();
			textField_10.setColumns(10);
			textField_10.setBounds(0, 78, 160, 27);
		}
		return textField_10;
	}

	private JTextField getTextField_11() {
		if (textField_11 == null) {
			textField_11 = new JTextField();
			textField_11.setColumns(10);
			textField_11.setBounds(0, 186, 160, 27);
		}
		return textField_11;
	}

	private void rellenarParticipantes(JPanel panel) {

		Component[] array = panel.getComponents();

		for (int i = 0; i < array.length; i++) {

			JTextField textField = (JTextField) array[i];
			String equipo = textField.getText();
			if (equipo.equals("")) {
				equipo = "nulo";
			}

			al.add(equipo);
		}

	}

	private void rellenoAleatorio() {

		ArrayList<String> auxiliar = new ArrayList<String>();
		Random r = new Random();

		while (!al.isEmpty()) {

			int alatorio = r.nextInt(al.size());
			String aQuitar = al.get(alatorio);
			auxiliar.add(aQuitar);
			al.remove(alatorio);

		}

		al = auxiliar;

	}

	private void colocarEquipos(JPanel panel1) {

		Component[] array1 = panel1.getComponents();

		for (int i = 0; i < array1.length; i++) {

			JTextField textField = (JTextField) array1[i];
			textField.setText(al.get(i));
			al.remove(i);

		}

	}

	private JPanel getPanel16Jugadores() {
		if (panel16Jugadores == null) {
			panel16Jugadores = new JPanel();
			panel16Jugadores.setLayout(null);
			panel16Jugadores.add(getLabel_2());
			panel16Jugadores.add(getPanel_5());
			panel16Jugadores.add(getPanel_6());
			panel16Jugadores.add(getPanel_4());
		}
		return panel16Jugadores;
	}
	private JPanel getPanel_5() {
		if (panel_5 == null) {
			panel_5 = new JPanel();
			panel_5.setBounds(0, 370, 653, 33);
			panel_5.add(getButton_1());
		}
		return panel_5;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("Generar");
		}
		return button_1;
	}
	private JPanel getPanel_6() {
		if (panel_6 == null) {
			panel_6 = new JPanel();
			panel_6.setLayout(null);
			panel_6.setBounds(10, 11, 141, 294);
			panel_6.add(getTextField_12());
			panel_6.add(getTextField_13());
			panel_6.add(getTextField_14());
			panel_6.add(getTextField_15());
			panel_6.add(getTextField_20());
			panel_6.add(getTextField_21());
			panel_6.add(getTextField_22());
			panel_6.add(getTextField_23());
		}
		return panel_6;
	}
	private JTextField getTextField_12() {
		if (textField_12 == null) {
			textField_12 = new JTextField();
			textField_12.setColumns(10);
			textField_12.setBounds(0, 0, 160, 27);
		}
		return textField_12;
	}
	private JTextField getTextField_13() {
		if (textField_13 == null) {
			textField_13 = new JTextField();
			textField_13.setColumns(10);
			textField_13.setBounds(0, 76, 160, 27);
		}
		return textField_13;
	}
	private JTextField getTextField_14() {
		if (textField_14 == null) {
			textField_14 = new JTextField();
			textField_14.setColumns(10);
			textField_14.setBounds(0, 38, 160, 27);
		}
		return textField_14;
	}
	private JTextField getTextField_15() {
		if (textField_15 == null) {
			textField_15 = new JTextField();
			textField_15.setColumns(10);
			textField_15.setBounds(0, 114, 160, 27);
		}
		return textField_15;
	}
	private JTextField getTextField_20() {
		if (textField_20 == null) {
			textField_20 = new JTextField();
			textField_20.setColumns(10);
			textField_20.setBounds(0, 152, 160, 27);
		}
		return textField_20;
	}
	private JTextField getTextField_21() {
		if (textField_21 == null) {
			textField_21 = new JTextField();
			textField_21.setColumns(10);
			textField_21.setBounds(0, 190, 160, 27);
		}
		return textField_21;
	}
	private JTextField getTextField_22() {
		if (textField_22 == null) {
			textField_22 = new JTextField();
			textField_22.setColumns(10);
			textField_22.setBounds(0, 228, 160, 27);
		}
		return textField_22;
	}
	private JTextField getTextField_23() {
		if (textField_23 == null) {
			textField_23 = new JTextField();
			textField_23.setColumns(10);
			textField_23.setBounds(0, 266, 160, 27);
		}
		return textField_23;
	}
	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.setLayout(null);
			panel_4.setBounds(502, 11, 141, 294);
			panel_4.add(getTextField_16());
			panel_4.add(getTextField_17());
			panel_4.add(getTextField_18());
			panel_4.add(getTextField_19());
			panel_4.add(getTextField_24());
			panel_4.add(getTextField_25());
			panel_4.add(getTextField_26());
			panel_4.add(getTextField_27());
		}
		return panel_4;
	}
	private JTextField getTextField_16() {
		if (textField_16 == null) {
			textField_16 = new JTextField();
			textField_16.setColumns(10);
			textField_16.setBounds(0, 0, 160, 27);
		}
		return textField_16;
	}
	private JTextField getTextField_17() {
		if (textField_17 == null) {
			textField_17 = new JTextField();
			textField_17.setColumns(10);
			textField_17.setBounds(0, 76, 160, 27);
		}
		return textField_17;
	}
	private JTextField getTextField_18() {
		if (textField_18 == null) {
			textField_18 = new JTextField();
			textField_18.setColumns(10);
			textField_18.setBounds(0, 38, 160, 27);
		}
		return textField_18;
	}
	private JTextField getTextField_19() {
		if (textField_19 == null) {
			textField_19 = new JTextField();
			textField_19.setColumns(10);
			textField_19.setBounds(0, 114, 160, 27);
		}
		return textField_19;
	}
	private JTextField getTextField_24() {
		if (textField_24 == null) {
			textField_24 = new JTextField();
			textField_24.setColumns(10);
			textField_24.setBounds(0, 152, 160, 27);
		}
		return textField_24;
	}
	private JTextField getTextField_25() {
		if (textField_25 == null) {
			textField_25 = new JTextField();
			textField_25.setColumns(10);
			textField_25.setBounds(0, 190, 160, 27);
		}
		return textField_25;
	}
	private JTextField getTextField_26() {
		if (textField_26 == null) {
			textField_26 = new JTextField();
			textField_26.setColumns(10);
			textField_26.setBounds(0, 228, 160, 27);
		}
		return textField_26;
	}
	private JTextField getTextField_27() {
		if (textField_27 == null) {
			textField_27 = new JTextField();
			textField_27.setColumns(10);
			textField_27.setBounds(0, 266, 160, 27);
		}
		return textField_27;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("");
			label_2.setIcon(new ImageIcon(MasterWindow.class.getResource("/files/img/FIFA.png")));
			label_2.setBounds(123, 77, 445, 294);
		}
		return label_2;
	}
}
