public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(" Details ");
        System.out.println(" - Names [ Ali , Mona , Ahmed , Sara , Amr, Laila , Kareem , Nada , Nour , Samy , null ]");
        System.out.println(" - Numbers [ 10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4 ]");
        System.out.println(" ");

        // Answer Task 1
        // Names [ "Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null ]
        System.out.println("Names longer than 5 chars: " + solution.countNamesLongerThan5());

        // Answer Task 2
        // Numbers [ 10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4 ]
        System.out.println("First number [ x > 7] : " + solution.getFirstNumberGreaterThan7());

        // Answer Task 3
        System.out.println("Any divisible by [5] : " + solution.isAnyDivisibleBy5());

        // Answer Task 4
        System.out.println("Numbers as Set : " + solution.getNumbersAsSet());

        // Answer Task 5
        System.out.println("Skip first [3] : " + solution.skipFirst3());

    }
}