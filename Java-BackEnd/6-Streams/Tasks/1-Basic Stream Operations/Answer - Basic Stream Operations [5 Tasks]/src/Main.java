public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(" Details ");
        System.out.println(" - Names [ Ali , Mona , Ahmed , Sara , Amr, Laila , Kareem , Nada , Nour , Samy , null ]");
        System.out.println(" - Numbers [ 10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4 ]");
        System.out.println(" ");

        // Answer Task 1
        // Number >> [ 10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4 ]
        System.out.println("Even Numbers : " + solution.getEvenNumbers());

        // Answer Task 2
        // Name >>  [ "Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null ]
        System.out.println("Names starting with [A] : " + solution.getNamesStartingWith('A'));

        // Answer Task 3
        System.out.println("Uppercase Names : " + solution.getUpperCaseNames());

        // Answer Task 4
        System.out.println("Sorted Descending : " + solution.getSortedDescending());

        // Answer Task 5
        System.out.println("Distinct Numbers : " + solution.getDistinctNumbers());

    }
}