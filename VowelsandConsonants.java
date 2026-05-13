package String;

public class VowelsandConsonants {
    public static void main(String[] args) {

        String name = "vignesh";
        int v = 0;
        int c = 0;

        for(char s:name.toCharArray())
        {
            if("aeiou".indexOf(s) != -1)
            {
                v++;
            }else {
                c++;
            }
        }

        System.out.println("The vowel are : "+v);
        System.out.println("The consonants are : "+c);
    }
}
