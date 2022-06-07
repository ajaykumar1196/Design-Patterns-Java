package decorator;

import domain.Data;

public class DataDecorator implements Data {

    private Data data;

    public DataDecorator(Data data) {
        this.data = data;
    }

    @Override
    public void write(String data) {
        this.data.write(data);
    }

    @Override
    public String readData() {
        return this.data.readData();
    }
}
