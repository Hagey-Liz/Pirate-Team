
package byui.cit260.piratesOfTheOpenSeas.model;
import java.io.Serializable;

/**
 *
 * @author RJ Phelps
 */
public class Map implements Serializable{
    
    //Class instatnce variable
    private double rowCount;
    private double columnCount;
    private Location[] [] locations;

  public Map(){
    
}

    public Map(int rowCount, int columnCount) {
        
       if (rowCount < 1 || columnCount <1) {
           System.out.println("The number of rows and columns must be > zero");
           return;
       }
       
       this.rowCount = rowCount;
       this.columnCount = columnCount;
       
       //create 2-D array for location objects
       this.locations = new Location[rowCount] [columnCount];
       
       for (int row = 0; row < rowCount; row++) {
           for(int column = 0; column < columnCount; column++){
               //create and initialize new Locatoin object instance
               Location location = new Location();
               location.setRow(row);
               location.setColumn(column);

               location.setVisited(false);
               
               //assign the location object to the current position in array
               locations[row] [column] = location;
           }
       }
    }

  public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
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
