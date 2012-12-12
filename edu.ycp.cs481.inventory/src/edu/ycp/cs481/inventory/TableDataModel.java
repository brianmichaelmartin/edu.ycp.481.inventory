package edu.ycp.cs481.inventory;

import javax.swing.table.AbstractTableModel;

public class TableDataModel extends AbstractTableModel{
	private String[] columnNames = {"Product ID",
									"Style",
									"Category",
									"Gender",
									"Size",
									"Number in Inventory",
									"Disabled",
									"In Stock",
									"Date Added",
									"Last Modified"};
	private Object[][] data;
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return data.length;
	}
	public void setDataLength(int length){
		data = new Object[length][10];
	}
	@Override
	public Object getValueAt(int row, int col){
		return data[row][col];
	}
	public void setValueAt(Object value, int row, int col) {
		
        /*System.out.println("Setting value at " + row + "," + col
                               + " to " + value
                               + " (an instance of "
                               + value.getClass() + ")");
        */

        data[row][col] = value;
        fireTableCellUpdated(row, col);
        
    }
	public void resetArray(int length){
		data = new Object[length][10];
		fireTableDataChanged();
	}
	@Override
	public String getColumnName(int column) {
	    return columnNames[column];
	}

}