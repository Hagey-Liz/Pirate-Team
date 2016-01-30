
package byui.cit260.piratesOfTheOpenSeas.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author RJ
 */
public class Map implements Serializable{
    
    //Class instatnce variable
    private double rowCount;
    private double columnCount;

public Map(){
    
}

public double getRowCount(){
    return rowCount;
}

public void  setRowCount(double rowCount){
    this.rowCount = rowCount;
}

public double getColumnCount(){
    return columnCount;
}

public void setColumnCount(double columnCount){
    this.columnCount = columnCount;
}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }





}
