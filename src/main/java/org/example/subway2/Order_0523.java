package org.example.subway2;

//2019/5/1 JCheckBox陣列群組範例(朱老師>JAVA程式設計>課堂練習與解答>2019-05-01)
//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//import javax.swing.JFormattedTextField;
//import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
////import javax.swing.DefaultListCellRenderer;

import java.awt.Font;
//import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
//import javax.swing.JButton;
//import javax.swing.border.BevelBorder;

public class Order_0523 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JComboBox comboBox_6;
	private TextArea textArea;
	private Button button_1;
	private Button button_2;
	private Button button_3;

	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private JRadioButton[] JRadioButtons = { new JRadioButton("黃芥末醬"), new JRadioButton("蜂蜜芥末醬"),
			new JRadioButton("紅酒醋"), new JRadioButton("橄欖油"), new JRadioButton("甜蔥醬"), new JRadioButton("鄉村醬"),
			new JRadioButton("墨西哥西南醬"), new JRadioButton("水牛城辣醬") };
	private JRadioButton[] JRadioButtons2 = { new JRadioButton("白巧克力餅乾"), new JRadioButton("黑巧克力餅乾"),
			new JRadioButton("m&m 餅乾"), new JRadioButton("原味餅乾") };
	private JRadioButton[] JRadioButtons3 = { new JRadioButton("可樂"), new JRadioButton("雪碧"), new JRadioButton("瓶裝果汁"),
			new JRadioButton("湯品") };
	private JCheckBox[] JcheckBoxs = { new JCheckBox("蔬菜全選"), new JCheckBox("不要蔬菜"), new JCheckBox("生菜"),
			new JCheckBox("蕃茄"), new JCheckBox("大黃瓜"), new JCheckBox("青椒"), new JCheckBox("洋蔥"), new JCheckBox("酸黃瓜"),
			new JCheckBox("墨西哥辣椒"), new JCheckBox("橄欖") };
	private JTextField textField_2;
	private JTextField textField_3;

	// JRadioButton[] JRadioButtons;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order_0523 frame = new Order_0523();
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
	public Order_0523() {

		int x = 0, y = 0;

		// 價位陣列
		int[][] textField_int = { { 110, 99, 105, 105, 115 }, { 186, 173, 181, 181, 193 },
				{ 140, 129, 135, 135, 145 } };

		// 設定showMessageDialog，的字型跟大小
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("宋体", Font.PLAIN, 20)));

		// 建構一個2維的ArrayList來接所有訂購資料
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<Integer>> listInt = new ArrayList<ArrayList<Integer>>();
		// 建構一個ArrayList來接新增的資料
		ArrayList<Integer> listRB1 = new ArrayList<Integer>();

		int aaa1;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1390, 900);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("新細明體", Font.PLAIN, 22));
		tabbedPane.setBounds(0, 0, 1100, 650);
		getContentPane().add(tabbedPane);
		contentPane = new JPanel();
		tabbedPane.addTab("點餐", null, contentPane, null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// setContentPane(contentPane);
		contentPane.setLayout(null);

		comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int A1 = comboBox.getSelectedIndex();
				int A2 = comboBox_1.getSelectedIndex();
				int A3 = comboBox_2.getSelectedIndex();
				int a1a2 = 0;
				if (A2 == 0) {
					textField_1.setText("請選擇麵包尺寸或沙拉");
				} else if (A1 == 0) {
					textField_1.setText("請選擇餐點");
				} else {
					a1a2 = textField_int[A2 - 1][A1 - 1];

					if (A3 == 0) {
						String s = Integer.toString(a1a2);
						textField_1.setText(s);

					} else if (A3 == 1) {
						a1a2 += 20;
						String s = Integer.toString(a1a2);
						textField_1.setText(s);

					} else if (A3 == 2) {
						a1a2 += 15;
						String s = Integer.toString(a1a2);
						textField_1.setText(s);

					} else if (A3 == 3) {

						a1a2 += 29;
						String s = Integer.toString(a1a2);
						textField_1.setText(s);

					}
					if (A2 == 0) {
						comboBox_3.setEnabled(false);
						comboBox_3.setSelectedIndex(0);

					} else if (A2 == 1) {
						comboBox_3.setEnabled(true);

					} else if (A2 == 2) {
						comboBox_3.setEnabled(true);

					} else if (A2 == 3) {
						comboBox_3.setSelectedIndex(0);
						comboBox_3.setEnabled(false);

					}
				}
			}

		});
		comboBox_1.setModel(new DefaultComboBoxModel(
				new String[] { "\u9078\u5C3A\u5BF8\u6216\u6C99\u62C9", "6 \u540B", "12 \u540B", "\u6C99\u62C9" }));
		comboBox_1.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(46, 111, 145, 37);
		contentPane.add(comboBox_1);

		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int A1 = comboBox.getSelectedIndex();
				int A2 = comboBox_1.getSelectedIndex();
				int A3 = comboBox_2.getSelectedIndex();
				int a1a2 = 0;

				if (A2 == 0) {
					textField_1.setText("請選擇麵包尺寸或沙拉");
				} else if (A1 == 0) {
					textField_1.setText("請選擇餐點");
				} else {
					a1a2 = textField_int[A2 - 1][A1 - 1];

					if (A3 == 0) {
						String s = Integer.toString(a1a2);
						textField_1.setText(s);

					} else if (A3 == 1) {
						a1a2 += 20;
						String s = Integer.toString(a1a2);
						textField_1.setText(s);

					} else if (A3 == 2) {
						a1a2 += 15;
						String s = Integer.toString(a1a2);
						textField_1.setText(s);

					} else if (A3 == 3) {
						a1a2 += 29;
						String s = Integer.toString(a1a2);
						textField_1.setText(s);

					}
				}
			}

		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "\u9078\u64C7\u9910\u9EDE\u53E3\u5473",
				"\u767E\u5473\u4FF1\u6A02\u90E8", "\u9BAE\u5AE9\u96DE\u67F3", "\u706B\u96DE\u80F8\u8089",
				"\u9999\u70E4\u96DE\u8089", "\u71D2\u70E4\u725B\u8089" }));
		comboBox.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		comboBox.setEditable(true);
		comboBox.setBounds(46, 59, 145, 37);
		contentPane.add(comboBox);

		comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int A1 = comboBox.getSelectedIndex();
				int A2 = comboBox_1.getSelectedIndex();
				int A3 = comboBox_2.getSelectedIndex();
				if (A2 == 0) {
					textField_1.setText("請選擇麵包尺寸或沙拉");
				} else if (A1 == 0) {
					textField_1.setText("請選擇餐點");
				} else {
					int a1a2 = textField_int[A2 - 1][A1 - 1];
					if (A3 == 0) {
						String s = Integer.toString(a1a2);
						textField_1.setText(s);

					} else if (A3 == 1) {
						a1a2 += 20;
						String s = Integer.toString(a1a2);
						textField_1.setText(s);

					} else if (A3 == 2) {
						a1a2 += 15;
						String s = Integer.toString(a1a2);
						textField_1.setText(s);

					} else if (A3 == 3) {
						a1a2 += 29;
						String s = Integer.toString(a1a2);
						textField_1.setText(s);
						textField_1.setText(s);

					}

				}
				if (A3 == 0) {

					for (int i = 0; i < JRadioButtons2.length; i++)
						JRadioButtons2[i].setEnabled(false);
					for (int i = 0; i < JRadioButtons3.length; i++)
						JRadioButtons3[i].setEnabled(false);
				} else if (A3 == 1) {

					for (int i = 0; i < JRadioButtons2.length; i++)
						JRadioButtons2[i].setEnabled(true);
					for (int i = 0; i < JRadioButtons3.length; i++)
						JRadioButtons3[i].setEnabled(false);
				} else if (A3 == 2) {

					for (int i = 0; i < JRadioButtons2.length; i++)
						JRadioButtons2[i].setEnabled(false);
					for (int i = 0; i < JRadioButtons3.length; i++)
						JRadioButtons3[i].setEnabled(true);
				} else if (A3 == 3) {

					for (int i = 0; i < JRadioButtons2.length; i++)
						JRadioButtons2[i].setEnabled(true);
					for (int i = 0; i < JRadioButtons3.length; i++)
						JRadioButtons3[i].setEnabled(true);

				}
			}
		});
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "\u662F\u5426\u5347\u7D1A\u5957\u9910",
				"A \u5957\u9910\t", "B \u5957\u9910\t", "C \u5957\u9910" }));
		comboBox_2.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		comboBox_2.setBounds(46, 163, 145, 37);
		contentPane.add(comboBox_2);

		comboBox_3 = new JComboBox();
		comboBox_3.setEnabled(false);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "\u9EB5\u5305\u7E3D\u985E",
				"\u5168\u9EA5\u9EB5\u5305", "\u8702\u871C\u71D5\u9EA5\u9EB5\u5305",
				"\u7FA9\u5927\u5229\u767D\u9EB5\u5305", "\u5DF4\u99AC\u4E7E\u916A\u9EB5\u5305",
				"\u5BB6\u9109\u9EB5\u5305", "\u767E\u5473\u4FF1\u6A02\u90E8\u9EB5\u5305" }));
		comboBox_3.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		comboBox_3.setEditable(true);
		comboBox_3.setBounds(46, 215, 145, 37);
		contentPane.add(comboBox_3);

		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] { "\u9078\u64C7\u8089\u985E\u53E3\u5473",
				"\u9BAE\u5AE9\u96DE\u67F3", "\u706B\u96DE\u80F8\u8089", "\u9999\u70E4\u96DE\u8089",
				"\u71D2\u70E4\u725B\u8089", "\u7FA9\u5927\u5229\u7D93\u5178", "\u7FA9\u5927\u5229\u725B\u8089\u4E38",
				"\u5AE9\u5207\u96DE\u8089", "\u706B\u96DE\u706B\u817F", "\u706B\u817F", "\u9BAA\u9B5A",
				"\u54C8\u71D2\u8D77\u53F8\u7E3D\u532F", "\u9109\u6751\u57F9\u6839\u96DE\u8089",
				"\u7167\u71D2\u96DE\u8089", "\u6C34\u725B\u57CE\u8FA3\u96DE", "\u539A\u5207\u5AE9\u725B",
				"\u57F9\u6839" }));
		comboBox_4.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		comboBox_4.setEditable(true);
		comboBox_4.setBounds(46, 267, 145, 37);
		contentPane.add(comboBox_4);

		JLabel label = new JLabel("\u8ACB\u9EDE\u9910\uFF1A");
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font("新細明體", Font.PLAIN, 30));
		label.setBounds(46, 0, 255, 50);
		contentPane.add(label);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u8ACB\u9078\u64C7\u852C\u83DC",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setFont(new Font("微軟正黑體", Font.BOLD | Font.ITALIC, 24));
		panel.setBounds(250, 60, 320, 273);
		contentPane.add(panel);
		panel.add(JcheckBoxs[0]);
		panel.add(JcheckBoxs[1]);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u8ACB\u9078\u64C7\u91AC\u6599",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(590, 60, 320, 229);
		contentPane.add(panel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u5957\u9910\u9905\u4E7E",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(930, 60, 160, 229);
		contentPane.add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u5957\u9910\u98F2\u6599",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(1110, 60, 160, 229);
		contentPane.add(panel_3);

		textField = new JTextField();
		textField.setFont(new Font("新細明體", Font.PLAIN, 20));
		textField.setText("0");
		textField.setColumns(10);
		textField.setBounds(1053, 653, 131, 29);
		contentPane.add(textField);

		comboBox_5 = new JComboBox();
		comboBox_5.setEditable(true);
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
		comboBox_5.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		comboBox_5.setBounds(95, 388, 54, 37);
		contentPane.add(comboBox_5);

		Button button = new Button("\u52A0\u5165");
		button.setFont(new Font("Dialog", Font.PLAIN, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(buttonGroup.getSelection());
				ArrayList<String> list1 = new ArrayList<String>();
				ArrayList<String> list2 = new ArrayList<String>();
				ArrayList<Integer> list3 = new ArrayList<Integer>();
				ArrayList<Integer> list4 = new ArrayList<Integer>();
				int a1a2 = 0;
				String str_A1 = "";
				int A1 = comboBox.getSelectedIndex();
				System.out.println("A1:" + A1);
				int A2 = comboBox_1.getSelectedIndex();
				System.out.println(A2);
				int A3 = comboBox_2.getSelectedIndex();
				System.out.println(A3);
				int A4 = comboBox_3.getSelectedIndex();
				System.out.println(A4);
				int A5 = comboBox_4.getSelectedIndex();
				System.out.println(A5);
				int A6 = comboBox_5.getSelectedIndex();
				System.out.println(A6);
				int sum1 = 0;
				System.out.println("listRB1.size()" + listRB1);

				if (A1 == 0) {
					JOptionPane.showMessageDialog(null, "請選擇餐點", "Warning Message", JOptionPane.WARNING_MESSAGE);
				} else if (A2 == 0) {
					JOptionPane.showMessageDialog(null, "請選擇6 吋、12 吋或沙拉", "Warning Message",
							JOptionPane.WARNING_MESSAGE);
				} else {
					a1a2 = textField_int[A2 - 1][A1 - 1];
					System.out.println(a1a2);
					if (A3 == 1) {
						a1a2 += 20;
					} else if (A3 == 2) {
						a1a2 += 15;
					} else if (A3 == 3) {
						a1a2 += 29;
					}
					a1a2 *= (A6 + 1);
					String s = Integer.toString(a1a2);

					System.out.println(A6);
					if (A2 == 1 && A4 == 0) {
						JOptionPane.showMessageDialog(null, "請選擇麵包", "Warning Message", JOptionPane.WARNING_MESSAGE);
					} else if (A2 == 2 && A4 == 0) {
						JOptionPane.showMessageDialog(null, "請選擇麵包", "Warning Message", JOptionPane.WARNING_MESSAGE);
					} else if (A5 == 0) {
						JOptionPane.showMessageDialog(null, "請選擇肉類", "Warning Message", JOptionPane.WARNING_MESSAGE);
					} else {
						for (int i = 1; i < JcheckBoxs.length; i++) {
							System.out.println(JcheckBoxs[i].isSelected());
							if (JcheckBoxs[i].isSelected() == true) {
								sum1++;
								if (i != 1) {
									list2.add(JcheckBoxs[i].getText().toString());

									list4.add(300 + i - 1);
								}
							}
						}
						if (sum1 == 1 && JcheckBoxs[1].isSelected() == true) {
							list2.add(JcheckBoxs[1].getText().toString());

						}

						if (sum1 == 0) {
							JOptionPane.showMessageDialog(null, "請選擇蔬菜", "Warning Message",
									JOptionPane.WARNING_MESSAGE);
						} else if (buttonGroup.getSelection() == null) {
							JOptionPane.showMessageDialog(null, "請選擇醬料", "Warning Message",
									JOptionPane.WARNING_MESSAGE);
						} else if (buttonGroup_1.getSelection() == null && (A3 == 1 || A3 == 3)) {
							JOptionPane.showMessageDialog(null, "請選擇餅乾", "Warning Message",
									JOptionPane.WARNING_MESSAGE);
						} else if (buttonGroup_2.getSelection() == null && (A3 == 2 || A3 == 3)) {
							JOptionPane.showMessageDialog(null, "請選擇飲料", "Warning Message",
									JOptionPane.WARNING_MESSAGE);
						} else {

							for (int i = 0; i < JRadioButtons.length; i++) {
								if (JRadioButtons[i].isSelected() == true) {
									list2.add(JRadioButtons[i].getText().toString());
									list4.add(400 + i + 1);
								}
							}
							for (int i = 0; i < JRadioButtons2.length; i++) {
								if (JRadioButtons2[i].isSelected() == true) {
									list2.add(JRadioButtons2[i].getText().toString());
									list4.add(500 + i + 1);
								}
							}
							for (int i = 0; i < JRadioButtons3.length; i++) {
								if (JRadioButtons3[i].isSelected() == true) {
									list2.add(JRadioButtons3[i].getText().toString());
									list4.add(600 + i + 1);
								}
							}

							list1.add(comboBox.getSelectedItem().toString());
							list1.add(comboBox_1.getSelectedItem().toString());
							list1.add(comboBox_2.getSelectedItem().toString());
							list1.add(comboBox_3.getSelectedItem().toString());
							list1.add(comboBox_4.getSelectedItem().toString());
							list1.add(comboBox_5.getSelectedItem().toString());
							list1.add(s);
							list.add(list1);
							list.add(list2);

							list3.add(comboBox.getSelectedIndex());
							list3.add(comboBox_1.getSelectedIndex());
							list3.add(comboBox_2.getSelectedIndex());

							list4.add(0, comboBox_4.getSelectedIndex() + 200);
							if (comboBox_3.getSelectedIndex() != 0)
								list4.add(0, comboBox_3.getSelectedIndex() + 100);
							list3.add(comboBox_5.getSelectedIndex() + 1);
							System.out.println("list3" + list3);
							System.out.println("list4" + list4);

							listInt.add(list3);
							listInt.add(list4);
							System.out.println("listInt" + listInt);
							// list.add(list3);
							System.out.println("<----------------------------------------------->");
							System.out.println(list.get(0));
							for (int i = 1; i <= list.size(); i++) {

								if (i % 2 != 0) {
									str_A1 += i / 2 + 1 + "\t";
									for (int j = 0; j < list.get(i - 1).size(); j++) {
										str_A1 += list.get(i - 1).get(j) + "\t";
									}
								} else {
									str_A1 += "\t";
									for (int j = 0; j < list.get(i - 1).size(); j++)
										str_A1 += list.get(i - 1).get(j) + "、";
								}
								str_A1 += "\n";
							}
							textArea.setText(str_A1);
							System.out.print(list1);

							int sum = 0;
							for (int i = 1; i <= list.size(); i += 2) {
								System.out.println(list.get(i - 1).get(list.get(i - 1).size() - 1));
								sum += Integer.parseInt(list.get(i - 1).get(list.get(i - 1).size() - 1));
							}
							textField.setText(Integer.toString(sum));

							button_1.setEnabled(true);
							button_2.setEnabled(true);
							button_3.setEnabled(true);
							comboBox_6.setEnabled(true);
							comboBox_1.setSelectedIndex(0);
							comboBox_2.setSelectedIndex(0);
							comboBox_3.setSelectedIndex(0);
							comboBox_4.setSelectedIndex(0);
							comboBox_5.setSelectedIndex(0);
							comboBox.setSelectedIndex(0);
							for (int i = 0; i < JcheckBoxs.length; i++) {
								JcheckBoxs[i].setSelected(false);
								if (i < 4) {
									JRadioButtons2[i].setEnabled(false);
									JRadioButtons3[i].setEnabled(false);
								}
							}

							buttonGroup.clearSelection();
							buttonGroup_1.clearSelection();
							buttonGroup_2.clearSelection();
							buttonGroup_3.clearSelection();
							label.setText("請點餐：");
							textArea.setEditable(true);
							label.setForeground(new Color(0, 0, 0));
						}
					}

				}
			}
		});
		button.setBounds(60, 447, 105, 30);
		contentPane.add(button);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		textField_1.setText("0");
		textField_1.setColumns(10);
		textField_1.setBounds(95, 342, 131, 29);
		contentPane.add(textField_1);

		textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Dialog", Font.PLAIN, 20));
		textArea.setBounds(260, 342, 994, 281);
		contentPane.add(textArea);

		JLabel label_1 = new JLabel("\u55AE\u50F9\uFF1A");
		label_1.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		label_1.setBounds(15, 345, 70, 23);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("\u6578\u91CF\uFF1A");
		label_2.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		label_2.setBounds(15, 395, 70, 23);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("\u7E3D\u50F9\uFF1A");
		label_3.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		label_3.setBounds(978, 654, 70, 23);
		contentPane.add(label_3);

		button_1 = new Button("\u7D50\u5E33");
		button_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println(textField_2.getText());
				int money = Integer.valueOf(textField_2.getText());
				// int total;
				int sum = 0;
				for (int i = 1; i <= list.size(); i += 2) {
					System.out.println(list.get(i - 1).get(list.get(i - 1).size() - 1));
					sum += Integer.parseInt(list.get(i - 1).get(list.get(i - 1).size() - 1));
				}
				if (money < sum) {
					JOptionPane.showMessageDialog(null, "金額不足", "Warning Message", JOptionPane.WARNING_MESSAGE);
				} else {

					textField_3.setText(Integer.toString(money - sum));
					JOptionPane.showMessageDialog(null, "找零" + (money - sum), "Warning Message",
							JOptionPane.WARNING_MESSAGE);

					MariaDB MDB = new MariaDB();
					MDB.Mariadb();
					MariaDB2 MDB2 = new MariaDB2();
					String input = "";
					String rs = MDB2.Mariadb(0, " ");
					System.out.println(rs);
					int num = Integer.parseInt(rs);
					num += 1;

					System.out.println(listInt);
					System.out.println(rs);

					for (int i = 0; i < listInt.size(); i += 2) {
						// rs="U"+String.format("%03d",i+1);

						rs = "('" + String.format("%010d", num) + "','U" + String.format("%03d", (i + 2) / 2) + "','F"
								+ String.format("%03d", listInt.get(i).get(1) * 10 + listInt.get(i).get(0)) + "',"
								+ Integer.toString(listInt.get(i).get(3)) + ",'";
						System.out.println(rs);

						for (int j = 0; j < listInt.get(i + 1).size() - (listInt.get(i).get(2) + 1) / 2; j++) {
							System.out.println("input" + j + ":" + input);
							input = input + rs + "G" + Integer.toString(listInt.get(i + 1).get(j)) + "')";
							System.out.println("j" + j + "," + "i" + i);
							if (j != listInt.get(i + 1).size() - 1 || i != listInt.size() - 2) {
								input = input + ",";
							}
						}
						rs = "('" + String.format("%010d", num) + "','U" + String.format("%03d", (i + 2) / 2) + "','F"
								+ Integer.toString(listInt.get(i).get(2) * 100) + "','"
								+ Integer.toString(listInt.get(i).get(3)) + "','";
						System.out.println(rs);

						for (int j = listInt.get(i + 1).size() - (listInt.get(i).get(2) + 1) / 2; j < listInt.get(i + 1)
								.size(); j++) {
							System.out.println("input" + j + ":" + input);
							input = input + rs + "G" + Integer.toString(listInt.get(i + 1).get(j)) + "')";
							System.out.println("j" + j + "," + "i" + i);
							if (j != listInt.get(i + 1).size() - 1 || i != listInt.size() - 2) {
								System.out.println("j" + j + "," + "i" + i);
								input = input + ",";
							}
						}
						// input="";
					}
					System.out.println(input);
					String rs2 = MDB2.Mariadb(1, input);
					String rs3 = MDB2.Mariadb(2, input);
				}
				// textField.setText(Integer.toString(sum));
			}
		});
		button_1.setEnabled(false);
		button_1.setBounds(582, 652, 105, 30);
		contentPane.add(button_1);

		button_2 = new Button("\u4FEE\u6539");
		button_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str_A1 = "";
				int in = comboBox_6.getSelectedIndex() * 2 - 1;
				if (list.size() >= in && in > 0) {
					for (int j = 1; j < 6; j++) {
						if (comboBox.getItemAt(j).toString() == list.get(in - 1).get(0)) {
							System.out.println("j:" + j);
							comboBox.setSelectedIndex(j);

						}

					}

					System.out.println(list.get(in - 1).get(1));
					// System.out.println(comboBox.getItemAt(1).toString());
					for (int j = 1; j < 4; j++) {
						if (comboBox_1.getItemAt(j).toString() == list.get(in - 1).get(1)) {
							System.out.println("j:" + j);
							comboBox_1.setSelectedIndex(j);

						}

					}
					for (int j = 1; j < 4; j++) {
						if (comboBox_2.getItemAt(j).toString() == list.get(in - 1).get(2)) {
							System.out.println("j:" + j);
							comboBox_2.setSelectedIndex(j);

						}

					}

					for (int j = 1; j < 7; j++) {
						if (comboBox_3.getItemAt(j).toString() == list.get(in - 1).get(3)) {
							System.out.println("j:" + j);
							comboBox_3.setSelectedIndex(j);

						}

					}
					for (int j = 1; j < 17; j++) {
						if (comboBox_4.getItemAt(j).toString() == list.get(in - 1).get(4)) {
							System.out.println("j:" + j);
							comboBox_4.setSelectedIndex(j);

						}

					}
					for (int j = 1; j < 9; j++) {
						if (comboBox_5.getItemAt(j).toString() == list.get(in - 1).get(5)) {
							System.out.println("j:" + j);
							comboBox_5.setSelectedIndex(j);

						}

					}

					for (int i = 0; i < list.get(in).size(); i++) {
						for (int j = 2; j < 10; j++) {
							if (JcheckBoxs[j].getText() == list.get(in).get(i)) {
								System.out.println("j:" + j);
								JcheckBoxs[j].setSelected(true);
							}
						}
						for (int j = 0; j < 8; j++) {
							if (JRadioButtons[j].getText() == list.get(in).get(i)) {
								System.out.println("j:" + j);
								JRadioButtons[j].setSelected(true);

							}
						}

						for (int j = 0; j < 4; j++) {
							if (JRadioButtons2[j].getText() == list.get(in).get(i)) {
								System.out.println("j:" + j);
								JRadioButtons2[j].setSelected(true);

							}
						}
						for (int j = 0; j < 4; j++) {
							if (JRadioButtons3[j].getText() == list.get(in).get(i)) {
								System.out.println("j:" + j);
								JRadioButtons3[j].setSelected(true);

							}
						}

					}

					textArea.setEditable(false);
					button_1.setEnabled(false);
					button_2.setEnabled(false);
					button_3.setEnabled(false);
					list.remove(in - 1);
					list.remove(in - 1);
					label.setText("修改" + (in - 1) + "號餐點");
					comboBox_6.setSelectedIndex(0);
					label.setForeground(new Color(255, 0, 0));
				} else {
					// UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("宋体",
					// Font.ITALIC, 13)));
					UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("宋体", Font.ITALIC, 20)));
					JOptionPane.showMessageDialog(null, "請選擇要修改的餐點號碼", "Warning Message", JOptionPane.WARNING_MESSAGE);
				}

				// button_3.setEnabled(false);
				// comboBox_6.setEnabled(false);

			}
		});
		button_2.setEnabled(false);
		button_2.setActionCommand("\u7E3D\u50F9");
		button_2.setBounds(135, 507, 105, 30);
		contentPane.add(button_2);

		JLabel label_4 = new JLabel("\u8ACB\u9078\u64C7\u8981\u4FEE\u6539\u7684\u9910\u9EDE\uFF1A");
		label_4.setFont(new Font("新細明體", Font.PLAIN, 20));
		label_4.setBounds(15, 575, 223, 23);
		contentPane.add(label_4);

		comboBox_6 = new JComboBox();
		comboBox_6.setEnabled(false);
		comboBox_6
				.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
		comboBox_6.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		comboBox_6.setBounds(97, 613, 54, 37);
		contentPane.add(comboBox_6);

		button_3 = new Button("\u522A\u9664");
		button_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str_A1 = "";

				if (list.size() > comboBox_6.getSelectedIndex() && comboBox_6.getSelectedIndex() != 0) {
					list.remove(comboBox_6.getSelectedIndex() - 1);
					list.remove(comboBox_6.getSelectedIndex() - 1);
				} else {

					JOptionPane.showMessageDialog(null, "請選擇要刪除的餐點號碼", "Warning Message", JOptionPane.WARNING_MESSAGE);
				}
				for (int i = 1; i <= list.size(); i++) {

					if (i % 2 != 0) {
						str_A1 += i / 2 + 1 + "\t";
						for (int j = 0; j < list.get(i - 1).size(); j++) {
							str_A1 += list.get(i - 1).get(j) + "\t";
						}
					} else {
						str_A1 += "\t";
						for (int j = 0; j < list.get(i - 1).size(); j++)
							str_A1 += list.get(i - 1).get(j) + "、";
					}
					str_A1 += "\n";
				}
				textArea.setText(str_A1);

				if (list.size() == 0) {
					button_2.setEnabled(false);
					button_3.setEnabled(false);
					comboBox_6.setEnabled(false);
				}
			}
		});
		button_3.setEnabled(false);
		button_3.setActionCommand("\u7E3D\u50F9");
		button_3.setBounds(15, 507, 105, 30);
		contentPane.add(button_3);

		JLabel label_5 = new JLabel("\u4ED8\u6B3E\u91D1\u984D\uFF1A");
		label_5.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		label_5.setBounds(725, 655, 105, 23);
		contentPane.add(label_5);

		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setFont(new Font("新細明體", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(816, 653, 131, 29);
		contentPane.add(textField_2);

		JLabel label_6 = new JLabel("\u627E\u96F6\uFF1A");
		label_6.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		label_6.setBounds(978, 717, 70, 23);
		contentPane.add(label_6);

		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setFont(new Font("新細明體", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(1053, 716, 131, 29);
		contentPane.add(textField_3);

		JPanel panel_11 = new JPanel();
		tabbedPane.addTab("進貨", null, panel_11, null);

		JcheckBoxs[0].setBounds(6, 25, 150, 31);
		JcheckBoxs[0].setFont(new Font("Dialog", Font.PLAIN, 20));
		JcheckBoxs[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 2; i < JcheckBoxs.length; i++) {
					JcheckBoxs[i].setSelected(true);

				}
			}
		});
		buttonGroup_3.add(JcheckBoxs[0]);

		JcheckBoxs[1].setBounds(156, 25, 150, 31);
		JcheckBoxs[1].setFont(new Font("Dialog", Font.PLAIN, 20));
		JcheckBoxs[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 2; i < JcheckBoxs.length; i++) {
					JcheckBoxs[i].setSelected(false);
				}
			}
		});
		buttonGroup_3.add(JcheckBoxs[1]);

		x = 6;
		y = 75;
		for (int i = 2; i < JcheckBoxs.length; i++) {
			JcheckBoxs[i].setBounds(x, y, 150, 31);
			panel.add(JcheckBoxs[i]);
			JcheckBoxs[i].setFont(new Font("Dialog", Font.PLAIN, 20));
			y += 50;
			if ((i - 1) % 4 == 0) {
				y = 75;
				x += 150;
			}
		}

		x = 6;
		y = 25;
		for (int i = 0; i < JRadioButtons.length; i++) {
			buttonGroup.add(JRadioButtons[i]);
			JRadioButtons[i].setBounds(x, y, 150, 47);
			JRadioButtons[i].setFont(new Font("Dialog", Font.PLAIN, 20));
			y += 50;
			panel_1.add(JRadioButtons[i]);
			if ((i + 1) % 4 == 0) {
				x += 150;
				y = 25;
			}

		}

		x = 6;
		y = 25;
		for (int i = 0; i < JRadioButtons2.length; i++) {
			buttonGroup_1.add(JRadioButtons2[i]);
			JRadioButtons2[i].setBounds(x, y, 150, 47);
			JRadioButtons2[i].setEnabled(false);
			JRadioButtons2[i].setFont(new Font("Dialog", Font.PLAIN, 20));
			y += 50;
			panel_2.add(JRadioButtons2[i]);
			if ((i + 1) % 4 == 0) {
				x += 160;
				y = 25;
			}

		}

		x = 6;
		y = 25;
		for (int i = 0; i < JRadioButtons3.length; i++) {
			buttonGroup_2.add(JRadioButtons3[i]);
			JRadioButtons3[i].setBounds(x, y, 150, 47);
			JRadioButtons3[i].setEnabled(false);
			JRadioButtons3[i].setFont(new Font("Dialog", Font.PLAIN, 20));
			y += 50;
			panel_3.add(JRadioButtons3[i]);
			if ((i + 1) % 4 == 0) {
				x += 160;
				y = 25;
			}

		}

	}
}
