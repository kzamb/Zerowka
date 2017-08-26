package pl.sages.trzecidzien;

public class Przypomnienie {
    public String publiczba ="widoczna";
    private String prywatna= "prywatne";
    protected String chroniona= "chroniona";
    String domyslna = "domyslna";

    public static void main(String[] args) {

        boolean prawda = true;
        int siedemnascie = 17;
        long stoMiliardow = 100_000_000_000L;
        double pi = 3.1415;
        float e = 2.73f;

        char literkaA = 'A';
        char literkaB=66;
        String napis = "dzisiaj jest piękna pogoda";
        String napis2 = "Ala ma kota";


        System.out.println(""+literkaA+literkaB+'C');

        if (literkaA>literkaA) {
            System.out.println(""+ literkaA+" jest większa niż "+literkaB);
        } else
            System.out.println(""+ literkaA+" jest mniejsza niż "+literkaB);

        int[] tab = {1,2,3,4,5,6,7};
        System.out.println("Ala ma asa");
        System.out.println(napis);


        //for
        for(int i=0;i<10;i++) {
            System.out.println(i);
        }
        //foreach
        for (int poz: tab) {
            System.out.println(poz);

        }
        System.out.println("");
        //while
        int i=0;
        while(i<10) {
            System.out.println(i);
            i++;
        }
        do {
            System.out.println(i);
            i--;
        } while (i>0);


        int [][] tab2 = {{1,1},{2,2,2},{3}};

        for (int[] tabx: tab2) {
            System.out.println("");
            for (int x:tabx) {
                System.out.print(x+ " ");
            }

        }
    }
}
