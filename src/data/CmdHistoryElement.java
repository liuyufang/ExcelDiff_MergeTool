package data;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by apple on 1/13/17.
 */
public class CmdHistoryElement {
    public static final String[] HISTORY_COLS = {"Sheet", "Old Row", "New Row",  "Old Value",
    "New Value", "Description"};

    public static final String[] PROPERTIES = {"sheetName", "oldRow", "newRow", "oldValue",
            "newValue", "desc"};

    private final StringProperty sheetName;
    private final IntegerProperty oldRow;
    private final IntegerProperty newRow;
    private final StringProperty oldValue;
    private final StringProperty newValue;
    private final StringProperty desc;

    public CmdHistoryElement(String sheetName, int oldRow, int newRow, String oldValue, String newValue, String desc) {
        this.sheetName = new SimpleStringProperty(sheetName);
        this.oldRow = new SimpleIntegerProperty(oldRow);
        this.newRow = new SimpleIntegerProperty(newRow);
        this.oldValue = new SimpleStringProperty(oldValue);
        this.newValue = new SimpleStringProperty(newValue);
        this.desc = new SimpleStringProperty(desc);
    }

    public String getSheetName() {
        return sheetName.get();
    }

    public int getOldRow() {
        return oldRow.get();
    }

    public int getNewRow() {
        return newRow.get();
    }

    public String getOldValue() {
        return oldValue.get();
    }

    public String getNewValue() {
        return newValue.get();
    }

    public String getDesc() {
        return desc.get();
    }

    public boolean equals(Object other) {
        if(other instanceof CmdHistoryElement) {
            CmdHistoryElement otherE = (CmdHistoryElement) other;
            return this.getSheetName().equals(otherE.getSheetName()) &&
                    this.getOldRow() == otherE.getOldRow() &&
                    this.getNewRow() == otherE.getNewRow() &&
                    this.getOldValue().equals(otherE.getOldValue()) &&
                    this.getNewValue().equals(otherE.getNewValue()) &&
                    this.getDesc().equals(otherE.getDesc());
        }else {
            return false;
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getSheetName());
        builder.append(" ");
        builder.append(getOldRow());
        builder.append(" ");
        builder.append(getNewRow());
        builder.append(" ");
        builder.append(getOldValue());
        builder.append(" ");
        builder.append(getNewValue());
        builder.append(" ");
        builder.append(getDesc());
        return builder.toString();
    }

}