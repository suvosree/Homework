package colourButton;


import java.awt.FlowLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;



//Define the class ChangeCircleIconColor extending

//JFrame class.

@SuppressWarnings("serial")
public class ChangeCircleIcon extends JFrame

{

     //Define the method createButton().

     private static JButton createButton(int i, JLabel circle_label, CreateCircularIcon circle_icon)

     {

          //Create an array of colors.

          final String[] colors = new String[] {"RED", "GREEN", "BLUE"};

         

          //Create a temporary button and pass required

          //color to its constructor.

          JButton curr_btn = new JButton(colors[i]);

         

          //Add an action listener to the current button.

          curr_btn.addActionListener(new ActionListener()

          {

               @Override

               //Define the overridden method

               //actionPerformed().

               public void actionPerformed(ActionEvent my_event)

               {

                     //Call the function fillPaint() of the

                     //CreateCircularIcon class and pass the

                     //required color.

                    circle_icon.fillPaint(colors[i]);

                    

                     //Call the repaint() method of the

                     //JLabel class.

                     circle_label.repaint();

               }

              

          });

         

          //Return the current button.

          return curr_btn;

     }

    

     //Start the execution of the main() method.

     public static void main(String[] args)

     {

          //Declare required variables.

          int i;

         

          //Create an object of JFrame class.

          JFrame j_frame = new JFrame();

         

          //Set the layout of the frame.

          j_frame.setLayout(new FlowLayout());

         

          //Create required buttons of JButton class.

          JButton btnRed = new JButton();

          JButton btnGreen = new JButton();

          JButton btnBlue = new JButton();

         

          //Create a JPanel class object.

          JPanel j_panel = new JPanel();

         

          //Create an array of JButtons created.

          JButton j_btn[] = {btnGreen, btnRed, btnBlue};

         

          //Create an object of the CreateCircularIcon

          //class and pass the required value to its

          //constructor.

          CreateCircularIcon circle_icon = new CreateCircularIcon(50);

         

          //Create a JLabel class object and pass the

          //object created above to its constructor.

          JLabel circle_label = new JLabel(circle_icon);

         

          //Add the label to the panel object.

          j_panel.add(circle_label);

         

          //Start a for loop from i = 0 to 3.

          for(i = 0; i < 3; i++)

          {

               //Call the method createButton() and pass

               //the required values.

               j_btn[i] = createButton(i, circle_label, circle_icon);

              

               //Add the returned button objects to the

               //panel class object.

               j_panel.add(j_btn[i]);

          }

         

          //Add the panel class object to the JFrame

          //class object.

          j_frame.add(j_panel);

         

          //Set the default close operation of the

          //j_frame object.

     j_frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

         

          //Call the function pack() of JFrame class.

          j_frame.pack();

         

          //Call the function setVisible() of JFrame

          //class and pass true.

          j_frame.setVisible(true);

         

          //Set the flow layout of frame.

          j_frame.setLayout(new FlowLayout());

     }

}