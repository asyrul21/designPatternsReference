package ProxyPattern.Example2;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
    volatile ImageIcon imageIcon;
    final URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL url){
        this.imageURL = url;
    }

    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    synchronized void setImageIcon(ImageIcon icon){
        this.imageIcon = icon;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if(imageIcon != null){
            // if there is an Icon, paint it
            imageIcon.paintIcon(c,g,x,y);
        }
        // otherwise
        else{
            // render Loading
            g.drawString("Loading CD cover, please wait...", x+300, y+190);
            // if we are not already retrieving the image
            if (!retrieving) {
                retrieving = true;

                // to prevent hanging up on the user, we use another thread
                // to do the retrieving
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            // this part is SYNCHRONUS: the ImageIcon Constructor
                            // will not return until the Image is loaded.
                            // While waiting, the "Loading" string is being displayed
                            setImageIcon(new ImageIcon(imageURL, "CD Cover"));

                            // when we have the image, we repaint it
                            c.repaint();
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }
}
