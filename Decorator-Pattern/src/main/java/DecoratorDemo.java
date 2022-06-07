import decorator.EncodedDataDecorator;
import domain.Data;
import domain.FileData;

public class DecoratorDemo {
    public static void main(String[] args) {
        Data fileData = new FileData();
        fileData.write("Hello World!!");
        System.out.println(fileData.readData());

        Data encodedFileData = new EncodedDataDecorator(new FileData());
        encodedFileData.write("Hello World!!");
        System.out.println(encodedFileData.readData());
    }
}
