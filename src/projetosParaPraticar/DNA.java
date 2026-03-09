package projetosParaPraticar;

public class DNA {

    //Sequenciamento de DNA
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna3;

    public static void main(String[] args) {
        // Find the length:
        DNA sequence = new DNA();
        int length = sequence.dna.length();
        System.out.println("Length is: " + length);

        // Find start codon:
        int start = sequence.dna.indexOf("ATG");
        System.out.println("Start in: " + start);

        //Find end codon:
        int end = sequence.dna.indexOf("TGA");
        System.out.println("End in: " + end);

        //Find protein:
        if (start != -1 && end != -1 && (end - start) % 3 == 0){
            String protein = sequence.dna.substring(start, end+2);
            System.out.println("Condition 1 and 2 are satisfied!");
            System.out.println("Protein is: " + protein);
        } else {
            System.out.println("No protein!");
        }


        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

    }

}


