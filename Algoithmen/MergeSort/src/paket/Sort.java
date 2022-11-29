package paket;


import java.util.Random;

public class Sort {
    private static final int SIZE = 100;

    static int insSort(int[] a) {
        int vergleiche = 0;
        int i;
        for(int u=1; u<a.length; u++) {
            int akt = a[u];
            for(i = u-1; i>=0 && a[i] > akt; i--){
                vergleiche++;
                a[i+1] = a[i];
            }
            a[i+1] = akt;
        }
        return vergleiche;
    }

    static void fillArray(int a[])  {
        Random rand = new Random();
        int n = a.length;
        for (int i = 0; i < n; ++i)
            a[i] = rand.nextInt(n*10); // Damit sich die Anzahl an Duplikaten in Grenzen hält
    }

    static void printArray(int a[])  {
        int n = a.length;
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = new int[SIZE];
        fillArray(a);
        System.out.println("Original");
        printArray(a);

        int[] aInsSort = a.clone();  // damit das Originalarray a nicht verändert wird
        System.out.println("\nInsertion Sort: " + insSort(aInsSort) + " Vergleiche");
        printArray(aInsSort);
    }
}

