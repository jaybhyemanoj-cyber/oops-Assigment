/*
 * Difference between StringBuilder and StringBuffer:
 *
 * StringBuffer  : Thread-safe (synchronized). Slower due to synchronization.
 *                 Use when multiple threads access the same string object.
 *
 * StringBuilder : Not thread-safe (not synchronized). Faster than StringBuffer.
 *                 Use when only a single thread accesses the string object.
 *
 * Both are mutable and have the same methods (append, insert, delete, reverse).
 * Prefer StringBuilder for single-threaded programs for better performance.
 */

class TextProcessingBuilder {
    void process() {
        StringBuilder sb = new StringBuilder("Welcome");

        sb.append(" to Java");
        System.out.println("After Append   : " + sb);

        sb.append(" Programming");
        System.out.println("After Append   : " + sb);

        sb.delete(8, 13);
        System.out.println("After Delete   : " + sb);

        sb.replace(0, 7, "Hello");
        System.out.println("After Replace  : " + sb);

        System.out.println("Final String   : " + sb.toString());
    }
}

public class TextProcessingBuilder {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  Question 8 - TextProcessingBuilder    ");
        System.out.println("========================================");
        TextProcessingBuilder tpb = new TextProcessingBuilder();
        tpb.process();
    }
}
