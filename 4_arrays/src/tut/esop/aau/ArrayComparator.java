package tut.esop.aau;

public class ArrayComparator {
    public static void main(String[] args) {
        int[] a = {15, 11, 12, 18};
        int[] b = {10, 10, 10, 12};

        boolean everyElementIsSmaller = true;

        // assuming both arrays are the same length
        for(int i = 0; i < a.length; i++) {
            if(b[i] > a[i]) {
                everyElementIsSmaller = false;
                break;
            }
        }

        if(everyElementIsSmaller) {
            System.out.println("Every element of array b is smaller than in array a on the same position");
        } else {
            System.out.println("At least one element in b is bigger than in a on the same position");
        }

        boolean smallerThanEveryElement = true;
        // check if EVERY element in b is smaller than or equal to EVERY element in a
        for(int i = 0; i < b.length; i++) {
            for(int j = 0; j < a.length; j++) {
                if(b[i] > a[j]) {
                    smallerThanEveryElement = false;
                    break;
                }
            }
        }

        if(smallerThanEveryElement) {
            System.out.println("EVERY element in b is smaller than every element in a");
        } else {
            System.out.println("At least one element in b is bigger than some element in a");
        }
    }
}
