public class DocumentManager {
    public static void main(String[] args) {
        try {
            Document normalDoc = new NormalDoc("text", "This is a text");
            //Document confidentialDoc = new EncryptDoc("hau", "This is not a text ?");

            String savePath = "Documentation";
            normalDoc.save(savePath);
            //confidentialDoc.save(savePath);

            System.out.println("Documents saved successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
