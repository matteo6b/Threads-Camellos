import javax.swing.*;
import java.awt.*;
public class app {


    public static void main(String[] args){
        Frame marco=new Frame();
        marco.setSize(1080,620);
        marco.setTitle("Carrera de camellos");
        marco.setVisible(true);



try {
    camello a1 = new camello("baloo", 300,"/Users/Mateo/Desktop/Sockets/camel.wav");
    camello a2 = new camello("pistolo", 200,"/Users/Mateo/Desktop/Sockets/c.wav");
    camello a3 = new camello("mateo", 400,"/Users/Mateo/Desktop/Sockets/c.wav");
    a1.imagen(marco);
    a2.imagen(marco);
    a3.imagen(marco);


    a1.start();
    a2.start();
    a3.start();
}
catch (Exception E){

}

    }
}
