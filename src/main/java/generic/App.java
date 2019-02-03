package generic;

import java.util.ArrayList;
import java.util.Arrays;

public class App<T> {
    private ArrayList<T> arrayList;

    private T[] swap(T[] array, int firstElement, int secondElement) {
        if (firstElement > 0 && secondElement > 0 && firstElement <= array.length && secondElement <= array.length) {
            T temp = array[firstElement - 1];
            array[firstElement - 1] = array[secondElement - 1];
            array[secondElement - 1] = temp;
            return array;
        }
        return null;
    }

    private ArrayList convertArray(T[] array) {
        ArrayList<T> al = new ArrayList(Arrays.asList(array));
        return al;
    }

    private void infoArray(T[] array) {
        for (T element : array) {
            System.out.printf("%s ", element);
        }
    }

    public static void main(String[] args) {
        App obj = new App();
        String[] stringArray = {"apple", "orange", "cherry", "strawberry"};
        Integer[] intArray = {1, 2, 5, 6, 8};

        obj.swap(stringArray, 1, 3);
        obj.infoArray(stringArray);
        System.out.printf("\n");

        obj.swap(intArray, 2, 5);
        obj.infoArray(intArray);
        System.out.printf("\n\n");

        obj.arrayList = obj.convertArray(intArray);
        System.out.println(obj.arrayList);
    }
}
