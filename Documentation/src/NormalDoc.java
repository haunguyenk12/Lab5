public class NormalDoc implements Document {
    private String extension;
    private String encryption;

    @Override
    public void SetExtension() {
        extension = ".txt";
    }

    @Override
    public void SetEncryption() {
        encryption = "None";
    }

    @Override
    public Document BuildDoc() {
        System.out.println("Normal Document Created: " + extension + ", Encryption: " + encryption);
        return this;
    }

    // Optional: Save file logic
    public void SaveFile() {
        System.out.println("Saving normal document as " + extension);
    }
}
