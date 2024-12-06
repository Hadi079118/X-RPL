public class operatorstring13 {
    public static void main(String[] args) {
        String kata = "hummasoft";

        char[] charArray = kata.toCharArray();

        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }

        String hasil = new String(charArray);

        System.out.println("Kata asli: " + kata);
        System.out.println("Kata setelah dibalik: " + hasil);
    }
}
