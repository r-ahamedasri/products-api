package uk.ac.westminster.lecture4.dto;

public class DigitalProduct extends Product{
        private String downloadUrl;
        private Double fileSizeMB;

    public DigitalProduct(Long id, String name, Double price, String downloadUrl, Double fileSizeMB) {
        super(id, name, price);
        this.downloadUrl =downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

//    public DigitalProduct(Long id, String name, Double price, String downloadUrl, Double fileSizeMB) {
//        super(id, name, price);
//        this.downloadUrl = downloadUrl;
//        this.fileSizeMB = fileSizeMB;
//    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public Double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public void setFileSizeMB(Double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

//    public void applyDiscount() {
//        price = 0.0; // Compilation error!
//    }


    @Override
    public void displayDetails() {
        System.out.println("Downloadable product");
    }
}



