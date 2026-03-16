import java.util.List;
import java.util.Map;

public class WingBuilder {

    String airfoil;
    int pointsPerSection;
    List <Map<String, Double>> wingParameters;


    WingModelData modelData;

    public static WingModelData generateData(String airfoil) {
        WingModelData data = new WingModelData();

        return data;
    }
}
