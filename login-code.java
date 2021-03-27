package work;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 public class work extends JFrame  {
private JLabel title;
private JLabel title2;
private JTextField name;
private JTextField ho;
private JComboBox lan;
private JButton button;
private String lang[]={"Arabic","English"};
public   work ()
{   
    setLayout(null);
    title =new JLabel("Dosed Horror");
    title.setFont(new Font("Arial",Font.PLAIN,30));
    title.setSize(600,50);
    title.setLocation(120,20);
    add(title);
    title2 =new JLabel("Welcome Back");
    title2.setFont(new Font ("Arial" ,Font.PLAIN, 30));
    title2.setSize(500,50);
    title2.setLocation(50,60);
    add(title2);
    name =new JTextField("Username or email");
    name.setFont(new Font("Arial",Font.PLAIN,15));
    name.setSize(190,20);
    name.setLocation(150,120);
    add(name);
    ho =new JTextField("Password");
    ho.setFont(new Font("Arial",Font.PLAIN,15));
    ho.setSize(190,20);
    ho.setLocation(150,150);
    add(ho);
    lan =new JComboBox(lang);
    lan.setFont(new Font("Arial",Font.PLAIN,15));
    lan.setSize(150,20);
    lan.setLocation(150,180);
   add(lan);
    button =new JButton("Click");
    button.setSize(100,20);
    button.setLocation(150,215);
    add(button);
    ButtonHandler hand= new ButtonHandler();
    button.addActionListener(hand);    
}     
private class ButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent a)
{
    if (a.getSource()== button){
        String dataa="amaniabdallah200@gmail.com";
        String data="12345";
        name.setText(dataa);
        ho.setText(data);
        lan.setSelectedIndex(1);}}
}} 
 class Amani{ 
    public static void main(String[] args)
    {
        work ani= new work();
       ani.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ani.setBounds(200,90,500,400);
       ani.setVisible(true);} 
 }
