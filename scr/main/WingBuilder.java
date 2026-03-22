import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WingBuilder {

    String airfoil;
    int pointsPerSection;
    List <WingSection> WingSections;

    public WingBuilder(String airfoil, int poinsPerSection, double[] locations, double[] chords) {
        this.airfoil = airfoil;
        this.pointsPerSection = poinsPerSection;

        WingSections = new ArrayList<>();
        for (int i = 0; i < locations.length; i++) {
            WingSection WS = new WingSection(locations[i],chords[i]);
            WingSections.add(WS);
        }
    }

    public double[] generateSectionPoints(WingSection Section) {
        double chord = Section.getLocation();
        double location = Section.getChord();
        int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;

        double[] points = new double[pointsPerSection * 3];

        double x_index = 0;
        double y_index = 1;
        double z_index = 3;

        for (int i = 0; i < pointsPerSection; i++) {
            double xi = chord/2 * (1 - Math.cos(i * Math.PI/pointsPerSection));

            double x = 0; //To implement
            double y = 0; //To implement
            double z = chord; //To implement

        }

        return points;
    }


}
