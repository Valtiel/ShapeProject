import com.cesarrosales.ve.shape.Shape;
import com.cesarrosales.ve.shape.factory.ShapeFactory;
import com.cesarrosales.ve.shape.factory.ShapeType;
import com.testwithshapes.ve.Rectangle;

/**
 * Created by cesar
 */
public class MainTest {

    public static void main(String[] args){
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = null;

        //Shape null
        log(shape);

        //Shapes with simple initializer
        log("");
        log("-----------------------------------------------------------");
        log("Shapes with simple initializer");
        shape = factory.createShape(ShapeType.CIRCLE);
        log(shape);

        shape = factory.createShape(ShapeType.SQUARE);
        log(shape);

        shape = factory.createShape(ShapeType.TRIANGLE);
        log(shape);

        shape = factory.createShape(ShapeType.NOT_REGISTERED);
        log(shape);

        //Shape with custom values for constructor using reflection
        log("");
        log("-----------------------------------------------------------");
        log("Shape with custom values for constructor using reflection");
        shape = factory.createShape(ShapeType.CIRCLE, new Class[] {double.class}, 9);
        log(shape);

        shape = factory.createShape(ShapeType.SQUARE, new Class[] {double.class}, 9);
        log(shape);

        shape = factory.createShape(ShapeType.TRIANGLE, new Class[] {double.class}, 9);
        log(shape);

        shape = factory.createShape(ShapeType.TRIANGLE, new Class[] {double.class , double.class , double.class}, 9,9,2);
        log(shape);

        shape = factory.createShape(ShapeType.NOT_REGISTERED, new Class[] {double.class}, 9);
        log(shape);

        log("");
        log("-----------------------------------------------------------");
        log("Shape with unregistered and external class");
        shape = factory.createShape(Rectangle.class);
        log(shape);

    }

    public static void log(String string){
            System.out.println(string);
    }

    public static void log(Shape shape){
        if(shape == null){
            System.out.println("Shape is NULL");
        }else{
            System.out.println(shape);
        }
    }

}
