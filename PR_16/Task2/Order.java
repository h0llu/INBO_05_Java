package Task2;

import java.util.Arrays;

public final class Order {
    private int size;
    private Item[] items;

    public Order() {
        size = 0;
        items = new Item[0];
    }

    public int indexOf(String itemName) {
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(Item item) {
        if (item == null) {
            return false;
        }
        Item[] newItems = new Item[size + 1];
        for (int i = 0; i < size; i++) {
            newItems[i] = items[i];
        }
        newItems[size++] = item;
        items = newItems;
        return true;
    }

    public boolean remove(String itemName) {
        int indexOfRemove = indexOf(itemName);
        if (indexOfRemove == -1) {
            return false;
        }
        Item[] newItems = new Item[size - 1];
        for (int i = 0; i < indexOfRemove; i++) {
            newItems[i] = items[i];
        }
        for (int i = indexOfRemove + 1; i < size; i++) {
            newItems[i - 1] = items[i];
        }
        size--;
        items = newItems;
        return true;
    }

    public void removeAll(String itemName) {
        int indexOfRemove = indexOf(itemName);
        while (indexOfRemove != -1) {
            remove(items[indexOfRemove].getName());
            indexOfRemove = indexOf(itemName);
        }
    }

    public int itemQuantity() {
        return size;
    }

    public int itemQuantity(String itemName) {
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                quantity++;
            }
        }
        return quantity;
    }

    public Item[] getItems() {
        return items;
    }

    public double totalCost() {
        double totalCost = 0;
        for (int i = 0; i < size; i++) {
            totalCost += items[i].getCost();
        }
        return totalCost;
    }

    public String[] itemsNames() {
        String[] itemsNames = new String[size];
        for (int i = 0; i < size; i++) {
            itemsNames[i] = items[i].getName();
        }
        return itemsNames;
    }

    public Item[] sortedItemsByCost() {
        Item[] sortedItems = itemsCopy();
        quickSort(sortedItems, 0, size - 1);
        return sortedItems;
    }

    private Item[] itemsCopy() {
        Item[] newItems = new Item[size];
        for (int i = 0; i < size; i++) {
            newItems[i] = items[i];
        }
        return newItems;
    }

    private void quickSort(Item[] sortedItems, int low, int high) {
        if (sortedItems.length == 0)
            return;
        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        double pillar = sortedItems[middle].getCost();
        int i = low, j = high;

        while (i <= j) {
            while (sortedItems[i].getCost() < pillar) {
                i++;
            }
            while (sortedItems[j].getCost() > pillar) {
                j--;
            }
            if (i <= j) {
                Item temp = sortedItems[i];
                sortedItems[i] = sortedItems[j];
                sortedItems[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(sortedItems, low, j);
        if (high > i)
            quickSort(sortedItems, i, high);
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}