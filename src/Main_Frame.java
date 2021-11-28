import javax.swing.*;
import java.awt.*;

public class Main_Frame extends JFrame
{
    private static final int width = 800;
    private static final int height = 600;

    private JTextField x_field;
    private JTextField y_field;
    private JTextField z_field;


    public Main_Frame() {
        super("Вычисление формулы");
        setSize(width,height);
        Toolkit kit = Toolkit.getDefaultToolkit();
        setLocation((kit.getScreenSize().width-width)/2,
                (kit.getScreenSize().height-height)/2);

        Box data=Box.createHorizontalBox();                 // область с полями ввода значений
        x_field = new JTextField("0",10);
        x_field.setMaximumSize(x_field.getPreferredSize());
        y_field = new JTextField("0",10);
        y_field.setMaximumSize(x_field.getPreferredSize());
        z_field = new JTextField("0",10);
        z_field.setMaximumSize(x_field.getPreferredSize());
        JLabel x_label = new JLabel("X:", JLabel.LEFT);
        JLabel y_label = new JLabel("Y:", JLabel.CENTER);
        JLabel z_label = new JLabel("Z:", JLabel.RIGHT);
        data.add(x_label);
        data.add(Box.createHorizontalStrut(10));
        data.add(x_field);
        data.add(Box.createHorizontalGlue());
        data.add(Box.createHorizontalStrut(100));
        data.add(y_label);
        data.add(Box.createHorizontalStrut(10));
        data.add(y_field);
        data.add(Box.createHorizontalGlue());
        data.add(Box.createHorizontalStrut(100));
        data.add(z_label);
        data.add(Box.createHorizontalStrut(10));
        data.add(z_field);
        data.setBorder(BorderFactory.createLineBorder(Color.GREEN));

        Box contentBox = Box.createVerticalBox();
        contentBox.add(Box.createVerticalGlue());
        contentBox.add(data);

        getContentPane().add(contentBox, BorderLayout.CENTER);
    }
}
