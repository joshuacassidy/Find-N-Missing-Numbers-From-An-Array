public class Main {
    public static void main(String[] args) {

        FindNMissingNumbers findNMissingNumbers = new FindNMissingNumbers(new Integer[100]);
        findNMissingNumbers.populateArr();
        findNMissingNumbers.removeItems();
        findNMissingNumbers.listMissingNumbers();

    }
}
