public class DNA {
    public static void main(String[] args) {

        // DNA sequencing
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        // test it 
        String dna = dna2;
        System.out.println(dna.length());

        // Set a start
        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);

        // Set a stop
        int stop = dna.indexOf("TGA");
        System.out.println("Stop: " + stop);

        // See whether it is or not a protein
        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
            String protein = dna.substring(start, stop + 3);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("No protein");
        }
    }
}