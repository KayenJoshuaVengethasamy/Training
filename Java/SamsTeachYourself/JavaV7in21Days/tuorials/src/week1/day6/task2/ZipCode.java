package week1.day6.task2;

public class ZipCode {
    private String zipCode = "";

    public ZipCode(String inZipCode) {
        setZipCode(inZipCode);
    }

    public void setZipCode(String inZipCode) {
        if ((inZipCode.length() == 5) | (inZipCode.length() == 9))
            zipCode = inZipCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public static void main(String[] arguments) {
        ZipCode zip1 = new ZipCode("75044");
        ZipCode zip2 = new ZipCode("320840");
        if (zip1.getZipCode() != "")
            System.out.println("Zip1: " + zip1.getZipCode());
        if (zip2.getZipCode() != "")
            System.out.println("Zip2: " + zip2.getZipCode());
    }
}
