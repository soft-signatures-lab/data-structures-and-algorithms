import java.util.HashSet;

public class ArraySubset {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 1, 2, 3, 4, 10 };

        boolean subset = isSubset(arr1, arr2);

        if (subset) {
            System.out.println("Array 2 is a Subset of Array 1");
        } else {
            System.out.println("Array 2 is a not Subset of Array 1");
        }

    }

    public static boolean isSubset(int[] arr1, int[] arr2) {

        HashSet<Integer> hashSet = new HashSet<>();

        // Keep all the values of the first array in an Hashet
        for (int el : arr1) {
            hashSet.add(el);
        }

        for (int el : arr2) {
            if (!hashSet.contains(el))
                return false;
        }

        return true;
    }
}
