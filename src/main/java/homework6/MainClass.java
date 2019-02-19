package homework6;

public class MainClass {
    private static int[] arr = {1, 2, 3, 4, 5, 6, 7, 4, 9, 0};

    static class MyException extends RuntimeException {
        MyException(String msg) {
            super(msg);
        }
    }

    public static boolean checkArrayOne(int[] arr) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean checkArrayFour(int[] arr) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static int[] getArr (int[] arr) {
        int[] arrTmp;
        if (!checkArrayFour(arr)) {
            throw new MyException("RuntimeException");
        } else {
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 4) {
                    index = i;
                }
            }
            int size = arr.length - index - 1;
            arrTmp = new int[size];
            System.arraycopy(arr, index + 1, arrTmp, 0, size);
        }
        return arrTmp;
    }

    public static void main(String[] args) {
        //2
        int [] arrNew = getArr(arr);
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i] + " ");
        }

        System.out.println();

        //3
        System.out.println(checkArrayOne(arr) || checkArrayFour(arr));
    }

}