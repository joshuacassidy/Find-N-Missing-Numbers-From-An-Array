import java.util.Random;

public class FindNMissingNumbers {

    private Integer[] arr;

    public FindNMissingNumbers(Integer[] arr) {
        this.arr = arr;
    }

    public void populateArr() {
        for (int i = 1; i <= arr.length; i++) {
            arr[i-1] = i;
        }

    }

    public void removeItems() {
        Random random = new Random();
        for (int i = 0; i < random.nextInt(arr.length); i++) {
            arr[random.nextInt(arr.length - 1)] = null;
        }
    }

    public int findAmountofMissingNumber() {
        int missingNo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                missingNo++;
            }
        }
        return missingNo;
    }

    public Integer[] findMissingNumber() {
        Integer[] missingNumbers = new Integer[findAmountofMissingNumber()];
        for (int i =0, index = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                missingNumbers[index] =i;
                index++;
            }
        }
        return missingNumbers;
    }

    public void listMissingNumbers() {
        Integer[] missingNumbers = findMissingNumber();
        System.out.print("Missing numbers: [");
        for (int i=0; i < missingNumbers.length; i++) {
            System.out.print(i==missingNumbers.length-1 ? missingNumbers[i] : missingNumbers[i]+", ");
        }
        System.out.print("]");
    }



}

