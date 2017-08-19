package pl.sages.pierwszydzen.zadania;

/**
 * Created by vjdwmx on 8/19/2017
 */
public class CountSheeps {

    public static void main(String[] args) {

    Boolean[] arrs = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true };


        int n = countSheeps( arrs );
        System.out.println(n);

        String str = "aabb";
        System.out.println(str.toUpperCase());
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count=0;
        for(int i=0;i<arrayOfSheeps.length;i++) {
            if (arrayOfSheeps[i])
                count++;
        }
        return count;
    }
}
