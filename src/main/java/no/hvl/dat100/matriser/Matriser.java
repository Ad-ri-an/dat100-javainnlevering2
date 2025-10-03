package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad : matrise) {
            for (int elem : rad) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String result = "";
        for (int[] rad : matrise) {
            for (int elem : rad) {
                result += elem + " ";
            }
            result += "\n";
        }
		return result;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int antRad = matrise.length;
        int antKol = matrise[0].length;
        int[][] nymatrise = new int[antRad][antKol];

        for (int i = 0; i < antRad; i++) {
            for (int j = 0; j < antKol; j++) {
                nymatrise[i][j] = matrise[i][j] * tall;
            }
        }
	    return nymatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if  (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) {
                return false;
            }
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int n = matrise.length;
        int[][] speil = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                speil[j][i] = matrise[i][j];
            }
        }
	    return speil;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] result =  new int[a.length][b[0].length];
	    for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
	}
}
