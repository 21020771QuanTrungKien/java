import java.util.List;

public class ShapeUtil {

    /**
     * info.
     */
    public String printInfo(List<GeometricObject> shapes) {
        String circle = "circle" + "\n";
        String triangle = "triangle" + "\n";
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                circle +=  shapes.get(i).getInfo() + "\n";
            }
            if (shapes.get(i) instanceof Triangle) {
                triangle += shapes.get(i).getInfo() + "\n";
            }
        }
        return circle + triangle;
    }
}