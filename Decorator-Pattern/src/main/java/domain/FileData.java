package domain;

public class FileData implements Data {

    private String data = "";

    @Override
    public void write(String data) {
        this.data += data;
    }

    @Override
    public String readData() {
        return data;
    }
}
