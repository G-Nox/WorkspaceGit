package view;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.RowFilter.Entry;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import skills.Workout;

/**
 * reperesents the visual Timetable
 * 
 * @author Ludwig Kaftan
 */
@SuppressWarnings("serial")
public class TabTimer extends JPanel {

	private List<Workout> myWorkouts = new ArrayList<Workout>();
	private Timestamp timeStart;
	private JTable table;
	private String[] columnNames = { "Start", "End", "Duration" };
	private DefaultTableModel tableModel;
	private boolean ok = false;
	private TableRowSorter<TableModel> rowSorter;

	//Layout
	public TabTimer() {
		this.setLayout(new BorderLayout());
		JPanel btnPanel = new JPanel();
		GridBagLayout gbl = new GridBagLayout();
		btnPanel.setLayout(gbl);

		//btn1
		GridBagConstraints gbc = Utility.makegbc(0, 0, 1, 1);
		JButton btnStart = new JButton("Start");
		gbc.anchor = GridBagConstraints.EAST;
		btnPanel.add(btnStart, gbc);
		//btn2
		GridBagConstraints gbc2 = Utility.makegbc(1, 0, 1, 1);
		JButton btnStop = new JButton("Stop");
		gbc2.anchor = GridBagConstraints.WEST;
		btnPanel.add(btnStop, gbc2);
		
		this.add(btnPanel, BorderLayout.NORTH);

		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				timeStart = new Timestamp(System.currentTimeMillis());
				ok = true;

			}
		});

		btnStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (ok == true) {
					Timestamp timeStop = new Timestamp(System.currentTimeMillis());
					int duration = (int) (timeStop.getTime() - timeStart.getTime());
					Workout w = new Workout(timeStart, timeStop, duration);
					myWorkouts.add(w);

					String start = new SimpleDateFormat("dd.MM.yyyy HH:mm").format(w.getStart());
					String stop = new SimpleDateFormat("dd.MM.yyyy HH:mm").format(w.getFinish());
					String time = Integer.toString(w.getDuration());
					Object[] data = { start, stop, time };
					tableModel.addRow(data);
				}
				ok = false;
			}
		});

		// table

		tableModel = new DefaultTableModel(columnNames, 0);
		table = new JTable(tableModel);
		table.setRowSelectionAllowed(false);

		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		rowSorter = new TableRowSorter<>(table.getModel());
		table.setRowSorter(rowSorter);

		this.add(scrollPane, BorderLayout.CENTER);

		// filter
		JPanel filterPanel = new JPanel();

		GridBagLayout gbl2 = new GridBagLayout();
		filterPanel.setLayout(gbl2);

		GridBagConstraints gbc3 = Utility.makegbc(0, 0, 1, 1);
		Choice choice = new Choice();
		choice.addItem("none");
		choice.addItem("< 15min");
		choice.addItem("15min - 59min");
		choice.addItem(">=60min");
		filterPanel.add(choice, gbc3);

		GridBagConstraints gbc4 = Utility.makegbc(1, 0, 1, 1);
		JButton btnFilter = new JButton("filter");
		filterPanel.add(btnFilter, gbc4);

		this.add(filterPanel, BorderLayout.SOUTH);

		btnFilter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				switch (choice.getSelectedItem()) {
				case "none":
					RowFilter<Object, Object> filter = new RowFilter<Object, Object>() {

						@Override
						public boolean include(@SuppressWarnings("rawtypes") Entry entry) {
							int duration = Integer.parseInt((String) entry.getValue(2));

							return duration >= 0;
						}
					};
					rowSorter.setRowFilter(filter);
					break;

				case "< 15min":
					RowFilter<Object, Object> filter2 = new RowFilter<Object, Object>() {

						@Override
						public boolean include(@SuppressWarnings("rawtypes") Entry entry) {
							int duration = Integer.parseInt((String) entry.getValue(2));

							return duration < 15;
						}
					};
					rowSorter.setRowFilter(filter2);
					break;
				case "15min - 59min":
					RowFilter<Object, Object> filter3 = new RowFilter<Object, Object>() {

						@Override
						public boolean include(@SuppressWarnings("rawtypes") Entry entry) {
							int duration = Integer.parseInt((String) entry.getValue(2));

							return duration > 15 && duration < 59;
						}
					};
					rowSorter.setRowFilter(filter3);
					break;
				case ">=60min":

					rowSorter.setRowFilter(RowFilter.regexFilter("([6-9][0-9]+)|([1-9][0-9][0-9]+)", 2));
					break;
				}
			}
		});

	}
}