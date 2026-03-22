public class WingSection {
    final double location;
    final double chord;

    public WingSection (double location, double chord) {
        if (location < 0 || chord <= 0) {
            throw new IllegalArgumentException("location must be positive number, chord must be positive non-zero number");
        }

        this.location = location;
        this.chord = chord;
    }

    public double getLocation() {
        return this.location;
    }

    public double getChord() {
        return chord;
    }
}
