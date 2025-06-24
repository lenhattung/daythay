/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class ItemList {

    Item[] list;
    int numberOfItems;
    int MAX = 100;

    public ItemList() {
        init(MAX);
    }

    public ItemList(int capacity) {
        init(capacity);
    }

    public void init(int capacity) {
        MAX = capacity;
        list = new Item[MAX];
        numberOfItems = 0;
    }

    public Item[] getList() {
        return list;
    }

    public void setList(Item[] list) {
        this.list = list;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public int getMAX() {
        return MAX;
    }

    public void setMAX(int MAX) {
        this.MAX = MAX;
    }

    public boolean addItem(Item item) {
        if (list == null || numberOfItems > MAX) {
            return false;
        }
        list[numberOfItems] = item; // Them item vao vi tri cuoi
        numberOfItems++;
        return true;
    }

    public void displayAll() {
        if (numberOfItems == 0) {
            System.out.println("The list is empty!");
        }
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println(list[i]);
        }
    }

    public Item findItem(String creator) {
        for (int i = 0; i < numberOfItems; i++) {
            if (list[i].getCreator().equals(creator)) {
                return list[i];
            }
        }
        return null;
    }

    //this method returns the zero_based index of the first occurrence.
    public int findItemIndex(String creator) {
        for (int i = 0; i < numberOfItems; i++) {
            if (list[i].getCreator().equals(creator)) {
                return i;
            }
        }
        return -1;
    }
    //this method updates the item at the specified position in this list
    //input: the index you wish to update

    public boolean updateItem(int index) {
        if (index >= 0 && index < numberOfItems) {
            list[index].input();
            return true;
        }
        return false;
    }

    //this method removes the item at the specified position in this list. 
    //Shifts any subsequent elements to the left   
    //input: the index you wish to remove    
    public boolean removeItem(int index) {
        if (index >= 0 && index < numberOfItems) {
            for (int j = index; j < numberOfItems; j++) {
                list[j] = list[j + 1];
            }
            numberOfItems--;
            return true;
        }
        return false;
    }

    public void displayItemsByType(String type) {

        if (type.equals("Vase")) {
            for (int i = 0; i < numberOfItems; i++) {
                if (list[i] instanceof Vase) {
                    System.out.println(list[i]);
                }
            }
        } else if (type.equals("Statue")) {
            for (int i = 0; i < numberOfItems; i++) {
                if (list[i] instanceof Statue) {
                    System.out.println(list[i]);
                }
            }
        } else {
            for (int i = 0; i < numberOfItems; i++) {
                if (list[i] instanceof Painting) {
                    System.out.println(list[i]);
                }
            }
        }
    }
    //this method sorts items in ascending order based on their values.

    public void sortItems() {
        for (int i = 0; i < numberOfItems; i++) {
            for (int j = numberOfItems - 1; j > i; j--) {
                if (list[i].getValue() < list[j - 1].getValue()) {
                    Item tmp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = tmp;
                }
            }
        }
    }

}
