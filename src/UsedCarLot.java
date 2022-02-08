import java.util.ArrayList;
/**This class represents a user car lot
 *
 * @author Aaron Cheng
 */
public class UsedCarLot {
    /**Inventory of car lot*/
    private ArrayList<Car> inventory;

    /**
     * Creates a UsedCarLot object and defines car lot's inventory
     */
    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    /**
     * Instance method that returns the car lot's inventory
     *
     * @return The inventory
     */
    public ArrayList<Car> getInventory(){
        return inventory;
    }

    /**
     * Instance method to add a new car to the inventory at the end of the list, increases size pf inventory by 1
     *
     * @param newCar Car to be added to lot
     */
    public void addCar(Car newCar){
        inventory.add(newCar);
    }

    /**
     * Swaps location of cars at index1 and index2
     * <p>
     * PRECONDITION: 0 &lt;= index1 &lt; inventory.size()
     *               0 &lt;= index2 &lt; inventory.size()
     * @param index1 index of first car to be swapped with second
     * @param index2 index of second car to be swapped first
     * @return Whether or not the swap of cars was successful
     */
    public boolean swap(int index1, int index2){
        if (0 < index1 && index1 < inventory.size() && 0 < index2 && index2 < inventory.size()){
            Car temp = inventory.get(index1);
            inventory.set(index1, inventory.get(index2));
            inventory.set(index2, temp);
            return true;
        }
        else {
            return false;
        }
    }

    /* Adds a Car to the inventory list at the index specified
        by indexToAdd; this method increases the size of inventory by 1
        PRECONDITION: 0 <= indexToAdd < inventory.size()
        DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
        like you did the other addCar method; also note that this method is void
    */

    /**
     * Instance method that adds car to a list and the index provided, moves index of all cars to the right of it up by 1, size of inventory inc by 1
     * <p>
     * PRECONDITION:  0 &lt;= indexToAdd &lt; inventory.size()
     * @param indexToAdd index of where car is going to be added
     * @param carToAdd Car to be added
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /* "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifting the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1

        Returns the Car that is being "sold" (removed from lot)

        PRECONDITION: indexOfCarToSell < inventory.size()

        HINT: the ArrayList remove() method returns the removed element while also
              removing it from the ArrayList
      */

    /**
     * Sells the car at the index provided, removing it from the list and changing index of cars to the right down by 1 and size of inventory decreases by 1
     * <p>
     * PRECONDITION: 0 &lt;= indexOfCarToSell &lt; inventory.size()
     * @param indexOfCarToSell index of the car to be removed
     * @return Car removed
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);
    }

    /* "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell < inventory.size()

       This method returns the Car that is being "sold" (replaced with null)
     */

    /**
     * Sells the car at the index provided, but replaces the car with null at its position
     * <p>
     * PRECONDITION: 0 &lt;= indexOfCarToSell &lt; inventory.size()
     * @param indexOfCarToSell index of car to be removed
     * @return Car removed
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        return inventory.set(indexOfCarToSell, null);
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory; if destinationIndex < indexOfCarToMove, moves the
       Car to the left in the inventory. All other cars in the inventory
       should shift accordingly

       PRECONDITIONS: indexOfCarToMove < inventory.size()
                      destinationIndex < inventory.size()
     */

    /**
     * Removes car at indexOfCarToMove, pushing cars to its right down 1 index, and adds it at destinstionindex, pushing cars at its right there up by 1
     * <p>
     * PRECONDITIONS: 0 &lt;= indexOfCarToMove &lt; inventory.size()
     *                0 &lt;= destinationIndex &lt; inventory.size()
     * @param indexOfCarToMove Index of car to be moved
     * @param destinationIndex Where the car will be moved
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car movedCar = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, movedCar);
    }

}
