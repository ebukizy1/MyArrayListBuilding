package ArrayListBuilding;

import java.util.Objects;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;
    private boolean isEmpty;


    public void add(String input) {
        array[size] = input;
        size++;
        boolean isEqualToArrayLength = size == array.length;
        if (isEqualToArrayLength) {
            String[] newArrays = new String[array.length * 2];
            for (int index = 0; index < array.length; index++)
                newArrays[index] = array[index];

            array = newArrays;
        }

    }

    public String[] getArrays() {
        return array;
    }

    public void remove(int index) {
        if (index >= 0 && index < size)
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
        array[size - 1] = null;
        size--;
    }

    public int getSize() {
        return size;
    }

    public String get(int index) {
        return array[index];
    }

    public void remove(String input) {
        int index = -1;
        for (int i = 0; i < size; i++)
            if (input.equals(array[i])) {
                index = 1;
                break;
            }
        if (index != -1)
            remove(index);
    }


    public void clear() {
        for (int i = 0; i < size; i++)
            array[i] = null;
        size = 0;
    }

    public void set(int index, String update) {
        for (int i = 0; i < size; i++) {
            boolean isIndexEqualsCount = index == i;
            if (isIndexEqualsCount)
                array[index] = update;
        }
    }

    public boolean isEmpty() {
        boolean isSizeEqualToZero = size == 0;
        if (isSizeEqualToZero) return true;
        else
            return false;
    }

    public int indexOf(String value) {
        for (int i = 0; i < array.length; i++) {
            boolean isEqualsToTheInputtedValue = array[i]!= null && array[i].equals(value);

            if (isEqualsToTheInputtedValue)
                return i;
        }
        return -1;
    }

    public int lastIndexOf(String value) {
        for (int i = array.length - 1; i >= 0; i--) {
            boolean isEqualsToTheInputtedValue = array[i]!= null && array[i].equals(value);
            if (isEqualsToTheInputtedValue)
                return i;
        }
        return -1;
    }

    public boolean contains(String value){
        for(int i = 0; i < array.length; i++)
            if(Objects.equals(array[i], value))return true;
        return false;
    }

}







