package pl.sages.drugidzien;

/**
 * Created by vjdwmx on 8/20/2017
 */
public class BreakContinue {
    public static void main(String[] args) {

    int[] tab = {1, 2, 3, 4, 5, 6, 7, -9, 3, 4, 5, 6};
    for(int i:tab) {
        if (i < 0)
            break;
        if (i % 2 != 0)
            continue;
        System.out.println(i);
    }
}
}
