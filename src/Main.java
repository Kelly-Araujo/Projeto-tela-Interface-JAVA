import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JPanel mainPanel;

    public Main(){
        setContentPane(mainPanel);
        setTitle("Login ou Cadastro");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Menu menu = new Menu();
                menu.setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
