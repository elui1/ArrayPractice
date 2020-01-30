public class SevenToNine {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        String[] letters = {"w","t","y","h","k"};

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == "t") {
                letters[i] = "hello";
            }
        }

        int[] numbers1 = {1, 7, 6, 5, 9};
        int[] numbers2 = {2, 7, 6, 3, 4};

        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers1[i] == numbers2[j]) {
                    System.out.println(numbers1[i] + " " + numbers2[j]);
                }
            }
        }
    }

}
