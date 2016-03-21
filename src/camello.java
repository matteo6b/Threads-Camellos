import java.awt.*;
import javax.swing.*;
import java.io.*;
import sun.audio.*;


public class camello extends Thread {
    private String nombre;
    private int y ;
    private    String gongFile ;
    int total=0;
    JLabel img = new JLabel(" ");



    public camello(String nombre,int y,String song){
        this.nombre=nombre;
        this.y=y;
    this.gongFile=song;



    }



    public void imagen(Frame a) throws Exception{







        ImageIcon image = new ImageIcon("/Users/Mateo/Desktop/threads/camello.gif");
        img.setIcon(image);
        img.setSize(135,135);
        img.setLocation(total,y);
        img.setText(nombre);
        img.setVisible(true);
        a.add(img);


    }


    public void run()
    {

        long es=0;


        while(true){
            try{
                es=(long)(Math.random()*3+1)*100;


                InputStream in = new FileInputStream(gongFile);

                // create an audiostream from the inputstream
                AudioStream audioStream = new AudioStream(in);

                System.out.println(nombre+" corriendo a "+es+"segundos");
                Thread.sleep(es);
                int a = (int) es;

                total=total+a/10;
                img.setLocation(total,y);

                AudioPlayer.player.start(audioStream);

                if(total>900){

                    break;


                }

            }
            catch (Exception e){

                e.printStackTrace();
            }



        }


        System.out.println(nombre+" ha pasado la meta");




    }



}
