import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends JFrame {
    private JPanel menuPanel;

    public Menu() {
        initComponents();
        setupUI();
    }

    private void initComponents() {
        menuPanel = new JPanel();
        menuPanel.setLayout(new BorderLayout());
        add(menuPanel);
    }

    private void setupUI() {
        setTitle("Menu");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headerPanel.setBackground(new Color(173, 216, 230));
        menuPanel.add(headerPanel, BorderLayout.NORTH);

        JLabel optionsLabel = new JLabel("Opções");
        optionsLabel.setFont(new Font("Arial", Font.BOLD, 20));
        optionsLabel.setForeground(Color.BLACK);
        headerPanel.add(optionsLabel);

        optionsLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (SwingUtilities.isLeftMouseButton(e)) {
                    JPopupMenu popupMenu = createPopupMenu();
                    popupMenu.show(optionsLabel, e.getX(), e.getY());
                }
            }
        });
    }

    private JPopupMenu createPopupMenu() {
        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem adicionarTarefaItem = new JMenuItem("Adicionar Tarefa");
        adicionarTarefaItem.addActionListener(e -> updateSelectedOption("Adicionar Tarefa"));
        popupMenu.add(adicionarTarefaItem);

        JMenuItem atualizarTarefaItem = new JMenuItem("Atualizar Tarefa");
        atualizarTarefaItem.addActionListener(e -> updateSelectedOption("Atualizar Tarefa"));
        popupMenu.add(atualizarTarefaItem);

        JMenuItem excluirTarefaItem = new JMenuItem("Excluir Tarefa");
        excluirTarefaItem.addActionListener(e -> updateSelectedOption("Excluir Tarefa"));
        popupMenu.add(excluirTarefaItem);

        JMenuItem sairItem = new JMenuItem("Sair");
        sairItem.addActionListener(e -> System.exit(0));
        popupMenu.add(sairItem);

        return popupMenu;
    }

    private void updateSelectedOption(String option) {
        System.out.println("Opção selecionada: " + option);
    }


}
