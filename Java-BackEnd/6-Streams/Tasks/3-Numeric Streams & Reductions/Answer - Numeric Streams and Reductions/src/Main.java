public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(" Details ");
        System.out.println(" - Numbers [ 10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4 ]");
        System.out.println(" ");


        // Answer Task 1
        System.out.println("Sum with Reduce : " + solution.getSumWithReduce());

        // Answer Task 2
        System.out.println("Max : " + solution.getMax());
        System.out.println("Min : " + solution.getMin());

        // Answer Task 3
        System.out.println("Average : " + solution.getAverage());

        // Answer Task 4
        System.out.println("Product with Reduce : " + solution.getProductWithReduce());

        // Answer Task 5
        System.out.println("Positive Numbers Count: " + solution.countPositiveNumbers());

    }
}