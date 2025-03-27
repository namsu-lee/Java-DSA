public class ReverseString {
    public static void main(String[] args) {
        String originalString = "ABCD";
        StringBuilder reversedString = new StringBuilder(originalString).reverse();

        System.out.println(reversedString);
    }
}