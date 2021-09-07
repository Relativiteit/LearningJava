package chapter6.anonymousInnerClass;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;

/**
 * This program demonstrates anonymous inner classes
 * @author Alejo Cain
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        {
            var clock = new TalkingClock();
            clock.start(1000, true);

            // keep program running until the user selects "OK"
            JOptionPane.showMessageDialog(null, "QUit program?");
            System.exit();
        }
    }
}
/**
 * A clock that prints the time in regular intervals
 */
class TalkingClock
{
    /**
     * Start the clock
     * @param interval the interval between messages (in milliseconds)
     * @param beep true if the clock should beep
     */
    public void start(int interval, boolean beep)
    {
        var listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                System.out.println("At the tone, the time is" + Instant.ofEpochMilli(event.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        var timer = new Timer(interval, listener);
        timer.start();
    }
}