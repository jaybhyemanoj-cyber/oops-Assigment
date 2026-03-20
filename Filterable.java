interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

class ImageProcessor implements Filterable {
    String imageName;
    String currentFilter;

    ImageProcessor(String imageName) {
        this.imageName = imageName;
        this.currentFilter = "None";
    }

    public void apply_filter(String filter_type) {
        currentFilter = filter_type;
        System.out.println("ImageProcessor : Applying '" + filter_type + "' filter to image '" + imageName + "'");
        switch (filter_type.toLowerCase()) {
            case "grayscale":
                System.out.println("Converting image to grayscale...");
                break;
            case "blur":
                System.out.println("Applying blur effect to image...");
                break;
            case "sharpen":
                System.out.println("Sharpening the image...");
                break;
            default:
                System.out.println("Unknown filter type for image.");
        }
    }

    public void reset_filter() {
        System.out.println("ImageProcessor : Resetting filter on image '" + imageName + "'");
        currentFilter = "None";
        System.out.println("Image restored to original state.");
    }
}

class DataAnalyzer implements Filterable {
    String datasetName;
    String currentFilter;

    DataAnalyzer(String datasetName) {
        this.datasetName = datasetName;
        this.currentFilter = "None";
    }

    public void apply_filter(String filter_type) {
        currentFilter = filter_type;
        System.out.println("DataAnalyzer : Applying '" + filter_type + "' filter to dataset '" + datasetName + "'");
        switch (filter_type.toLowerCase()) {
            case "sort":
                System.out.println("Sorting data in ascending order...");
                break;
            case "remove duplicates":
                System.out.println("Removing duplicate entries from dataset...");
                break;
            case "normalize":
                System.out.println("Normalizing data values between 0 and 1...");
                break;
            default:
                System.out.println("Unknown filter type for data.");
        }
    }

    public void reset_filter() {
        System.out.println("DataAnalyzer : Resetting filter on dataset '" + datasetName + "'");
        currentFilter = "None";
        System.out.println("Dataset restored to original state.");
    }
}

public class Main {
    public static void main(String[] args) {

        ImageProcessor img = new ImageProcessor("photo.jpg");
        System.out.println("===== Image Processor =====");
        img.apply_filter("Grayscale");
        System.out.println("Current Filter : " + img.currentFilter);
        System.out.println("-------------------");
        img.apply_filter("Blur");
        System.out.println("Current Filter : " + img.currentFilter);
        System.out.println("-------------------");
        img.reset_filter();
        System.out.println("Current Filter : " + img.currentFilter);

        System.out.println();

        DataAnalyzer data = new DataAnalyzer("sales_data.csv");
        System.out.println("===== Data Analyzer =====");
        data.apply_filter("Sort");
        System.out.println("Current Filter : " + data.currentFilter);
        System.out.println("-------------------");
        data.apply_filter("Remove Duplicates");
        System.out.println("Current Filter : " + data.currentFilter);
        System.out.println("-------------------");
        data.reset_filter();
        System.out.println("Current Filter : " + data.currentFilter);
    }
}
