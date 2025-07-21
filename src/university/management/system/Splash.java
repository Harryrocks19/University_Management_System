package university.management.system;


import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{

    Thread t;


    Splash(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/first.png"));
        Image i2 = i1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);

        t = new Thread(this);
        t.start();
        setVisible(true);

        int X =1;
        for (int i =2; i<=600; i+=4 ,  X+=1){
            setLocation(600 - ((i + X)/2), 350 - (i/2));
            setSize(i + 3 *X, i+X/2);

        }

        setVisible(true);
    }

    public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
            new Login();




        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[]arg){
        new Splash();

    }

}
