import java.awt.*;
import java.awt.event.*;
public class Formcreation {
public static void main(String[] args) {
    Form obj= new Form();
    obj.create();
}
}
class Form extends Frame{
    public void create(){
        setTitle("FORM CREATION");
        setVisible(true);
        setLayout(null);
        setSize(500,250);
       setBackground(Color.BLACK);
        //email
        Label email= new Label("EMAIL-ID:");
        email.setBounds(30,50,100,50);
        email.setFont(new Font("Arial", Font.BOLD|Font.PLAIN, 20));
        email.setForeground(Color.GREEN);
        add(email);
        //password
        Label password= new Label("PASSWORD:");
        password.setBounds(30,100,130,50);
        password.setFont(new Font("Arial",Font.BOLD|Font.PLAIN,20));
        password.setForeground(Color.GREEN);
        add(password);
        //text field for email
        TextField mailtextfield= new TextField("ENTER YOUR EMAIL-ID");
        mailtextfield.setBounds(160,60,300,30);
        mailtextfield.setFont(new Font("Arial",Font.BOLD,15));
        add(mailtextfield);
        //text field for password
        TextField passwordtextfield= new TextField("ENTER THE PASSWORD");
        passwordtextfield.setBounds(160,110,300,30);
        passwordtextfield.setEchoChar('*'); 
        passwordtextfield.setFont(new Font("Arial",Font.BOLD,15));
        add(passwordtextfield);
        //submit button 
        
        Button b1 = new Button("SUBMIT");
        b1.setFont(new Font("Time new Roman",Font.BOLD,25));
        b1.setBounds(200,150,100,50);
        b1.setBackground(new Color(193,28,132));
        b1.setForeground(Color.WHITE);
        add(b1); 
        //calling thee buttonlisnter
        Buttonlistener listener= new Buttonlistener(mailtextfield, passwordtextfield); 
        b1.addActionListener(listener);        //exit the code 
        addWindowListener(new  WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }
    }
    class Buttonlistener implements ActionListener{
        TextField emailid;
        TextField password;
        Buttonlistener(TextField emailid,TextField password){
             this.emailid=emailid;
             this.password=password;
        }
        public void actionPerformed(ActionEvent e){
            String email=emailid.getText();
            String pass=password.getText();
            System.out.println("EMAIL-ID ="+email);
            System.out.println("PASSWORD="+pass);

        }
       
    }
    
