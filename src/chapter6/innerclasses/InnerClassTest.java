package chapter6.innerclasses;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;

/**
 * This rogram demonstrates the use of inner classes.
 * @author ALejo CAin
 */
public class InnerClassTest {
    public static void main(String[] args)
    {
        var clock = new TalkingClock(1000, true);
        clock.start();

        // keep programs running until the user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }

}
/**
 * A clock tht prints the time in regular intervals
 */
class TalkingClock
{
    private int interval;
    private boolean beep;
    /**
     * COnstructs a talking clock
     * @param interval the interval between messages (in milliseconds)
     * @param beep true if the clock should beep
     */

    public TalkingClock(int interval, boolean beep)
    {
        this.interval = interval;
        this.beep = beep;
    }

    /**
     * Start the clock
     */

    public void start()
    {
        var listener = new TimePrinter();
        var timer = new Timer(interval, listener);
        timer.start();
    }

    public class TimePrinter implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("At the tone, the time is" + Instant.ofEpochMilli((event.getWhen())));
            if (beep) Toolkit.getDefaultToolkit().beep();

        }
    }
}