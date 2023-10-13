import java.util.HashMap;
import java.util.Map;

public class HuffmanEncoded {

    private static final Map<Character, String> huffmanCodes = new HashMap<>();

    static {
        huffmanCodes.put('E', "00");
        huffmanCodes.put('A', "010");
        huffmanCodes.put('B', "011");
        huffmanCodes.put('C', "10");
        huffmanCodes.put('D', "11");
    }

    public static void main(String[] args) {
        String sequence = "ABCCDDEEEEABCCDDEEEEABCCDDEEEEABCCDDEEEE";
        StringBuilder compressedSequence = new StringBuilder();

        for (char c : sequence.toCharArray()) {
            compressedSequence.append(huffmanCodes.get(c));
        }

        System.out.println("Saída desejada: " + compressedSequence);
    }
}
