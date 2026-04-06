package dsa.linear_search;

public class Linearsearch {
    
    public static int linearSearch(int numbers[], int target, int start, int end) {
        for(int index = start; index <= end; index++) {
            if(numbers[index] == target) {
                return index;
            }
        }
        return -1;
    }

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        for(int index = 0; index < numbers.length; index++) {
            if(largest < numbers[index]) {
                largest = numbers[index];
            }
        }
        return largest;
    }
    
    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE; // +infinity
        for(int i = 0; i < numbers.length; i++) {
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {
        int[] numbers = {18, 12, -7, 3, 14, 28};
        int target = -7;
        int index = linearSearch(numbers, target, 1, 4);

        if (index != -1) {
            System.out.println("target " + target + " found at index: " + index);
        } else {
            System.out.println("index of target " + target + " not found.");
        }


    // --> Largest of 3 no.s
        int numberArr[] = {1, 2, 6, 3, 9};
        System.out.println("Largest no. is: " + getLargest(numberArr));
        System.out.println("smallest no. is: " + getSmallest(numberArr));

    }
}