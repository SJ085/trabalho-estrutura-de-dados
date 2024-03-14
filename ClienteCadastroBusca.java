import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClienteCadastroBusca extends JFrame {
    private JTextField nomeField, cpfField, emailField, telefoneField, buscarField;

    public ClienteCadastroBusca() {
        setTitle("Cadastro e Busca de Cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        JPanel cadastroPanel = new JPanel(new GridLayout(5, 2));
        cadastroPanel.setBorder(BorderFactory.createTitledBorder("Cadastro de Cliente"));
        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();
        JLabel cpfLabel = new JLabel("CPF:");
        cpfField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneField = new JTextField();
        JButton cadastrarButton = new JButton("Cadastrar");

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para cadastrar o cliente
            }
        });

        cadastroPanel.add(nomeLabel);
        cadastroPanel.add(nomeField);
        cadastroPanel.add(cpfLabel);
        cadastroPanel.add(cpfField);
        cadastroPanel.add(emailLabel);
        cadastroPanel.add(emailField);
        cadastroPanel.add(telefoneLabel);
        cadastroPanel.add(telefoneField);
        cadastroPanel.add(new JLabel());
        cadastroPanel.add(cadastrarButton);

        JPanel buscaPanel = new JPanel(new GridLayout(2, 2));
        buscaPanel.setBorder(BorderFactory.createTitledBorder("Buscar Cliente"));
        JLabel buscarLabel = new JLabel("Buscar por CPF:");
        buscarField = new JTextField();
        JButton buscarButton = new JButton("Buscar");

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para buscar o cliente
            }
        });

        buscaPanel.add(buscarLabel);
        buscaPanel.add(buscarField);
        buscaPanel.add(new JLabel());
        buscaPanel.add(buscarButton);

        add(cadastroPanel);
        add(buscaPanel);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClienteCadastroBusca().setVisible(true);
            }
        });
    }
}
