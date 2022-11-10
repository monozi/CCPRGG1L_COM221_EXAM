public class FinalExam {
    public static void main(String[] args) throws Exception {

        // Print the words in their given pattern.

        char[][] array = {
                { 'A', 'S', 'R', 'S', 'S', 'U', 'U', 'I', 'O', 'L', 'M', 'A', 'U', 'Z', 'F' },
                { 'Q', 'B', 'N', 'E', 'H', 'U', 'W', 'E', 'B', 'E', 'S', 'K', 'G', 'I', 'T' },
                { 'B', 'A', 'N', 'A', 'N', 'A', 'Q', 'U', 'E', 'N', 'U', 'R', 'N', 'U', 'H' },
                { 'Q', 'U', 'K', 'N', 'Q', 'L', 'S', 'L', 'X', 'O', 'M', 'A', 'J', 'S', 'G' },
                { 'L', 'T', 'W', 'O', 'C', 'E', 'H', 'I', 'R', 'V', 'L', 'W', 'M', 'L', 'I' },
                { 'M', 'I', 'T', 'U', 'V', 'Z', 'S', 'E', 'O', 'E', 'Y', 'B', 'G', 'E', 'L' },
                { 'Q', 'W', 'K', 'L', 'E', 'C', 'U', 'J', 'X', 'M', 'N', 'F', 'W', 'K', 'G' },
                { 'K', 'L', 'G', 'Y', 'N', 'Q', 'P', 'A', 'L', 'B', 'A', 'U', 'X', 'T', 'I' },
                { 'M', 'O', 'U', 'H', 'E', 'B', 'M', 'T', 'M', 'E', 'J', 'I', 'R', 'F', 'M' },
                { 'Y', 'U', 'T', 'B', 'P', 'U', 'M', 'H', 'Z', 'R', 'D', 'T', 'F', 'Y', 'N' },
                { 'S', 'J', 'R', 'K', 'J', 'S', 'B', 'X', 'I', 'S', 'S', 'D', 'P', 'Y', 'A' },
                { 'P', 'A', 'D', 'Y', 'I', 'N', 'U', 'X', 'D', 'R', 'G', 'Q', 'H', 'L', 'S' },
                { 'B', 'R', 'L', 'P', 'Q', 'T', 'I', 'H', 'O', 'F', 'S', 'U', 'M', 'R', 'Y' },
                { 'K', 'S', 'O', 'N', 'I', 'C', 'C', 'U', 'P', 'P', 'A', 'R', 'F', 'M', 'X' },
                { 'D', 'W', 'O', 'T', 'M', 'M', 'Q', 'B', 'O', 'U', 'H', 'J', 'L', 'G', 'C' }
        };

        System.out.println("__________________________________________________________________________________" + "\n");
        // =============================================================
        // BANANAQUE - (10 points)
        System.out.println(" ");
        System.out.println("1. BANANAQUE ");
            for (int i = 0; i < 9; i++) {
                System.out.println("");
                for (int j = 0; j < 9; j++) {
                    if (i == 2){
                        System.out.print(" " + array[i][j]);
                    }else{
                        System.out.print(" ");
                    }
                }
            }

            System.out.println("\n__________________________________________________________________________________" + "\n");

        // =============================================================
        // FRAPPUCCINO - (10 points)
        System.out.println("");
        System.out.println("2. FRAPPUCCINO ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j < array.length; j++) {
                if ((i == 13 && j == 12) || (i == 13 && j == 11) || (i == 13 && j == 10) || (i == 13 && j == 9) 
                || (i == 13 && j == 8) || (i == 13 && j == 7) || (i == 13 && j == 6) || (i == 13 && j == 5) 
                || (i == 13 && j == 4) || (i == 13 && j == 3) || (i == 13 && j == 2)) {
                    System.out.print(" " + array[i][j]);
                } else{
                    System.out.print(" ");
                }
            }
        }
        

        System.out.println("\n__________________________________________________________________________________" + "\n");

        // =============================================================
        // NOVEMBER - (10 points)
        System.out.println(" ");
        System.out.println("3. NOVEMBER ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j < array.length; j++) {
                if ((j == 9 && i == 2) || (j == 9 && i == 3) || (j == 9 && i == 4) || (j == 9 && i == 5) 
                    || (j == 9 && i == 6) || (j == 9 && i == 7) || (j == 9 && i == 8) || (j == 9 && i == 9)){
                    System.out.println(array[i][j]);
                } else{
                    System.out.print(" ");
                }
            }
        }

        System.out.println("\n__________________________________________________________________________________" + "\n");
        // =============================================================
        // TIKTOK - (10 points)
        System.out.println(" ");
        System.out.println("4. TIKTOK ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j < array.length; j++) {
                if((i == 12 && j == 5) || (i == 11 && j == 4) || (i == 10 && j == 3) || (i == 9 && j == 2) 
                    || (i == 8 && j == 1) || (i == 7 && j == 0)) {
                    System.out.println(" " + array[i][j]);
                }else{
                    System.out.print(" ");
                }
            }
        }

        System.out.println("\n__________________________________________________________________________________" + "\n");
        // =============================================================
        // BARBEQUE - (10 points)
        System.out.println(" ");
        System.out.println("5. BARBEQUE ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j < array.length; j++) {
                if ((i == 12 && j == 0) || (i == 11 && j == 1) || (i == 10 && j == 2) || (i == 9 && j == 3) 
                    || (i == 8 && j == 4) || (i == 7 && j == 5) || (i == 6 && j == 6) || (i == 5 && j == 7)){
                    System.out.println(" " + array[i][j]);
                }else{
                    System.out.print(" ");
                }
            }
        }

        System.out.println("\n__________________________________________________________________________________" + "\n");
        // =============================================================
        // HUWEBES - (10 points)
        System.out.println(" ");
        System.out.println("6. HUWEBES ");
        for (int i = 0; i < 11; i++) {
            System.out.println("");
            for (int j = 4; j < 11; j++) {
                if (i == 1){
                    System.out.print(" " + array[i][j]);
                }else{
                    System.out.print(" ");
                }
            }
        }

        System.out.println("\n__________________________________________________________________________________" + "\n");
        // =============================================================
        // SANMIGLIGHT - (10 points)
        System.out.println(" ");
        System.out.println("7. SANMIGLIGHT ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j < array.length; j++) {
                if ((i == 11 && j == 14) || (i == 10 && j == 14) || (i == 9 && j == 14) 
                    || (i == 8 && j == 14) || (i == 7 && j == 14) || (i == 6 && j == 14) 
                    || (i == 5 && j == 14) || (i == 4 && j == 14) || (i == 3 && j == 14) 
                    || (i == 2 && j == 14) || (i == 1 && j == 14)){
                    System.out.print(" " + array[i][j]);
                }else{
                    System.out.print(" ");
                }
            }
        }

        System.out.println("\n__________________________________________________________________________________" + "\n");
        // =============================================================
        // FINALEXAM - (10 points)
        System.out.println(" ");
        System.out.println("8. FINALEXAM ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j < array.length; j++) {
                if ((i == 0 && j == 14) || (i == 1 && j == 13) || (i == 2 && j == 12) 
                    || (i == 3 && j == 11) || (i == 4 && j == 10) || (i == 5 && j == 9) 
                    || (i == 6 && j == 8) || (i == 7 && j == 7) || (i == 8 && j == 6)){
                    System.out.print(" " + array[i][j]);
                }else{
                    System.out.print(" ");
                }
            }
        }        
        System.out.println("\n__________________________________________________________________________________" + "\n");
        // =============================================================
        // LUNES - (10 points)
        System.out.println(" ");
        System.out.println("9. LUNES ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j < array.length; j++) {
                if ((i == 0 && j == 4) || (i == 1 && j == 3) || (i == 2 && j == 2) 
                    || (i == 3 && j == 1) || (i == 4 && j == 0)){
                    System.out.print(" " + array[i][j]);
                }else{
                    System.out.print(" ");
                }
            }
        }

        System.out.println("\n__________________________________________________________________________________" + "\n");
        // =============================================================
        // SIOMAI - (10 points)
        System.out.println(" ");
        System.out.println("10. SIOMAI ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j < array.length; j++) {
                if ((i == 3 && j == 6) || (i == 4 && j == 7) || (i == 5 && j == 8) 
                    || (i == 6 && j == 9) || (i == 7 && j == 10) || (i == 8 && j == 11)){
                    System.out.print(" " + array[i][j]);
                }else{
                    System.out.print(" ");
                }
            }
        }

        System.out.println("\n__________________________________________________________________________________" + "\n");
        
        // Maraming salamat po sa pagturo sa amin, Sir Elizer!! Marami po kaming naidulot na aral at madadala namin ito sa aming kinabukasan.
        // Hindi ko na po masasagutan ang number 11 at 12 dahil hindi pa po ganun kalawak ang aking kaalaman sa coding.
        // Hanggang sa muli po, Sir!! Hindi kita kakalimutan.

    }
}
