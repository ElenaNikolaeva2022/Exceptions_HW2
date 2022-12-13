// Если необходимо, исправьте данный код (задание 2
// https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

public class Task2 {
    public static void main(String[] args) {
        int d = 1;
        int[] intArray = new int[8];
        double[] ansArray = new double[8];
        for (int i = 0; i < ansArray.length; i++) {
            try {
                ansArray[i] = intArray[i] / d;
                System.out.println("caughtRes1 = " + ansArray[i]);
            } catch (Exception e) {
                System.out.println("Catching exception: " + e.getClass().getSimpleName());
            }
        }

    }
}
