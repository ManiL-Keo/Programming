package chapter05;

import java.util.Arrays;

public class Challenge01 {

    public static int getMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int getMin(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int getSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double getAverage(int[] numbers) {
        int sum = 0;
        double avg = 0;
        for (int number : numbers) {
            sum += number;
        }
        avg = (double) sum / numbers.length;
        return avg;
    }

    public static int countEven(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countOdd(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 1) {
                count++;
            }
        }
        return count;
    }

    public static boolean contains(int[] numbers, int target) {
        boolean contain = false;
        for (int num : numbers) {
            if (num == target) {
                contain = true;
                break;
            }
        }
        return contain;
    }

    public static int findIndex(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int[] reverse(int[] numbers) {
        int[] reverseArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reverseArray[i] = numbers[numbers.length - 1 - i];
        }
        return reverseArray;
    }

    public static int[] copy(int[] numbers) {
        int[] copyArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            copyArray[i] = numbers[i];
        }
        return copyArray;
    }

    public static int largestEven(int[] numbers) {
        int lint = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] > lint) {
                lint = numbers[i];
            }

        }
        return lint;
    }

    public static int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }

    public static boolean isSorted(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean palindrome(int[] numbers) {
        System.out.println(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != numbers[numbers.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] rotateLeft(int[] numbers, int n) {
        int[] rotateArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            rotateArray[(i - n + numbers.length) % numbers.length] = numbers[i];
        }
        return rotateArray;
    }

    public static int[] rotateRight(int[] numbers, int n) {
        int[] rotateArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            rotateArray[(i + n) % numbers.length] = numbers[i];
        }
        return rotateArray;
    }

    public static int[] mergeArray(int[] n1, int[] n2) {
        int[] merge = new int[n1.length + n2.length];

        for (int i = 0; i < n1.length; i++) {
            merge[i] = n1[i];
        }

        for (int i = 0; i < n2.length; i++) {
            merge[n1.length + i] = n2[i];
        }
        return merge;
    }

    public static int missingNumber(int[] numbers) {
        int n = numbers.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int currentSum = 0;
        for (int a : numbers) {
            currentSum += a;
        }

        int missingNumber = expectedSum - currentSum;
        return missingNumber;
    }

    public static void frequencyCount(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            boolean counted = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    counted = true;
                }
            }
            if (counted) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    count++;
                }
            }
            System.out.println(numbers[i] + "->" + count);
        }
    }

    public static int secondLargest(int[] numbers) {
        int secondlargest = Integer.MIN_VALUE;
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondlargest = largest;
                largest = numbers[i];
            } else if ((numbers[i] < largest) && (numbers[i] > secondlargest)) {
                secondlargest = numbers[i];
            }
        }
        return secondlargest;
    }

    public static int[] duplicatedArray(int[] numbers){
        int[] dup = new int[]
    }

    public static void main(String[] args) {
        // int[] numbers = { 70, 80, 90 };
        // int[] reverse = reverse(numbers);

        // int index = findIndex(numbers, 90);

        // boolean contain = contains(numbers, 65);

        // int[] numbers2 = { 5, 2, 9, 1, 3 };

        // int[] sort = sort(numbers2);

        // int[] numbers3 = { 6, 6, 7, 8, 2, 3, -1, 10 };
        // int[] numbers4 = { 1, 2, 4, 6, 8, 10 };

        // int[] numbers5 = { 1, 6, 3, 2, 1 };
        // System.out.println("-----start");
        // boolean palindrome = palindrome(numbers5);
        // System.out.println("-----end");

        // boolean isSort1 = isSorted(numbers3);
        // System.out.println("-----(1)");
        // boolean isSort2 = isSorted(numbers4);
        // System.out.println("-----(2)");
        // System.out.println(Arrays.toString(reverse));
        // System.out.println(index);
        // System.out.println(contain);
        // System.out.println("-----(3)");
        // System.out.println();
        // System.out.println(Arrays.toString(sort));
        // System.out.println();
        // System.out.println("-----(4)");
        // System.out.println(isSort1);
        // System.out.println(isSort2);
        // System.out.println("-----(5)");
        // System.out.println(palindrome);

        // int[] numbers = { 1,2,3,4,5,6,7,8,9 };
        // int[] rotateleft = rotateLeft(numbers, 1);
        // System.out.println(Arrays.toString(rotateleft));

        // int[] numbers = { 1,2,3,4,5,6,7,8,9 };
        // int[] rotateRight = rotateRight(numbers, 2);
        // System.out.println(Arrays.toString(rotateRight));

        // int[] n1 = {1,2,3};
        // int[] n2 = {4,5,6,7};
        // System.out.println(Arrays.toString(mergeArray(n1, n2)));

        // int[] numbers = {1,2,2,3,2,4};
        // frequencyCount(numbers);

        int[] numbers = { 78, 56, 23, 67, 99 };
        System.out.println(secondLargest(numbers));

    }
}