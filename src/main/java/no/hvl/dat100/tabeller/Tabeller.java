package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

        for (int tall: tabell) {
            System.out.println(tall);
        }
        System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {

        String t = "[";
        for (int i = 0; i < tabell.length; i++) {
            t += tabell[i];
            if (i != tabell.length - 1) {
                t += ",";
            }
        }
        t += "]";
        System.out.println(t);
        return t;
    }

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        System.out.println(sum);
        return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

            for (int i = 0; i < tabell.length; i++) {
                if (tabell[i] == tall) {
                    return true;
                }
            }
            return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
