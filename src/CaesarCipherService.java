import java.util.Scanner;

public class CaesarCipherService {

    private static final char[] LOVER_CASE_CHARACTERS = { 'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
            'з', 'и','й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с',
            'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э','ю', 'я' };
    private static final char[] UPPER_CASE_CHARACTERS = { 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж',
            'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х',
            'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я' };
    
    public static String decipherCaesar(String cipherPhrase) {
        char[] textChar = cipherPhrase.toCharArray();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key: ");
        int step = scanner.nextInt();
        for (int i = 0; i < textChar.length - 1; i++) {
            int index = 0;
            boolean isLetter = !Character.isWhitespace(textChar[i]);
            if (isLetter) {
                if (Character.isLowerCase(textChar[i])) {
                    while (textChar[i] != LOVER_CASE_CHARACTERS[index]) {
                        index++;
                    }
                    index +=step;
                    if (index > 32){
                        index -= 33;
                    }
                    textChar[i] = LOVER_CASE_CHARACTERS[index];
                } else if (Character.isUpperCase(textChar[i])) {
                    while (textChar[i] != UPPER_CASE_CHARACTERS[index]) {
                        index++;
                    }
                    index +=step;
                    if (index > 32) {
                        index -= 33;
                    }
                    textChar[i] = UPPER_CASE_CHARACTERS[index];
                }
            }
        }
        char[] decipheredPhrase = new char[textChar.length];
        if (textChar.length-1>= 0) System.arraycopy(textChar, 0, decipheredPhrase, 0,
      textChar.length);
        return convertCharArrayToReadableString(decipheredPhrase);
    }

    public static String convertCharArrayToReadableString(char[] decipheredPhrase){
        StringBuilder stringBuilder = new StringBuilder();
        for (char phraseCharacter : decipheredPhrase
        ) {
            stringBuilder.append(phraseCharacter);
        }
        return stringBuilder.toString();
    }

}