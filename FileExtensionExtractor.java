import java.util.Scanner;

class FileExtensionExtractor {
    String fileName;

    FileExtensionExtractor(String fileName) {
        this.fileName = fileName;
    }

    void extractExtension() {
        int dotIndex  = fileName.lastIndexOf('.');
        if (dotIndex != -1 && dotIndex < fileName.length() - 1) {
            String extension = fileName.substring(dotIndex + 1);
            System.out.println("File Name  : " + fileName);
            System.out.println("Extension  : " + extension);
        } else {
            System.out.println("File Name  : " + fileName);
            System.out.println("No valid extension found.");
        }
    }
}

public class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("  Question 5 - File Extension Extractor ");
        System.out.println("========================================");
        System.out.print("Enter File Name  : ");
        String fileName = sc.nextLine();
        FileExtensionExtractor fe = new FileExtensionExtractor(fileName);
        fe.extractExtension();

        sc.close();
    }
}
