package decorator;

import domain.Data;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncodedDataDecorator extends DataDecorator {

    public EncodedDataDecorator(Data data) {
        super(data);
    }

    @Override
    public void write(String data) {
        super.write(encode(data));
    }

    private String encode(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String decode(String data) {
        return new String(Base64.getDecoder().decode(data));
    }
}
