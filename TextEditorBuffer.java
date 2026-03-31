class TextEditorBuffer {
    void process() {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("After Append   : " + sb);

        sb.insert(6, "Java ");
        System.out.println("After Insert   : " + sb);

        sb.reverse();
        System.out.println("After Reverse  : " + sb);
    }
}

public class TextEditorBuffer {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   Question 7 - TextEditorBuffer        ");
        System.out.println("========================================");
        TextEditorBuffer teb = new TextEditorBuffer();
        teb.process();
    }
}
