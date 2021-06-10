import java.sql.SQLOutput;

public class CaesarCipherDecoder {

    public static void main(String[] args) {
        CaesarCipherDecoder cipher = new CaesarCipherDecoder("Еъёчхф Вхзёюлх, адздёиу ф ждэщхб, црбх еёдюэчъщъгюъв южаижжзчх, ждчъёнъгжзчдв. Ъы зёюивй жёхчгюв бюнс ж ъы вдгивъгзхбсгрв аёхкдв. \n" +
                "Зъеъёс вгъ дмъчющгд, мзд гъюэцъьгджзс тздшд аёхкх фчбфъзжф жбъщжзчюъв гъждчъёнъгжзчх мъбдчъмъжадшд югщючющиивх. \n" +
                "Ф юэимюб чхни южздёюу ю чгыж юэвъгъгюф, здмгъъ дзёхэюч еджздфггиу юэвъгмючджзс мъбдчъмъжаюк едёдадч. \n" +
                "Ю зъв гъ въгъъ, еджбъщдчхбх гъищхмх. Ф еёюнъб а чрчдщи, мзд чюгдя чжъви вдя югзъббъаз, х чдэвдьгд, вды мёъэвъёгдъ жзёъвбъгюъ ад чжъви шхёвдгюмгдви. \n" +
                "Гхязю ёънъгюъ вгъ едвдшбх еёдшёхввх югзиюзючгдшд зюех, жеълюхбсгд ждэщхггхф щбф юэимъгюф деёъщъбъггрк жздёдг мъбдчъмъжадя щиню. \n" +
                "Въгф вдьгд гхэчхзс дзлдв Вхзёюлр, х ъы, цъэ еёъичъбюмъгюф, вхзъёсу.");
        for (int step = 1; step <= CaesarCipherService.CHARACTERS_IN_ALPHABET; step++) {
        System.out.println(decipherPhrase(cipher.phraseToDeCipher, step));
        System.out.println();
        }
    }

    private String phraseToDeCipher;

    public CaesarCipherDecoder() {
    }

    public CaesarCipherDecoder(String phraseToDeCipher) {
        this.phraseToDeCipher = phraseToDeCipher;
    }

    public String getPhraseToDeCipher() {
        return phraseToDeCipher;
    }

    public void setPhraseToDeCipher(String phraseToDeCipher) {
        this.phraseToDeCipher = phraseToDeCipher;
    }

    public static String decipherPhrase(String cipherPhrase, int step){
        return CaesarCipherService.decipherCaesar(cipherPhrase, step);
    }
}
