import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class CadastroClientes {
    private HashMap<String, Cliente> tabelaHash;

    public CadastroClientes() {
        tabelaHash = new HashMap<>();

        // Configurar a interface gráfica
        JFrame frame = new JFrame("Cadastro de Clientes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel labelNome = new JLabel("Nome:");
        labelNome.setBounds(10, 10, 80, 25);
        panel.add(labelNome);

        JTextField fieldNome = new JTextField(20);
        fieldNome.setBounds(100, 10, 160, 25);
        panel.add(fieldNome);

        JLabel labelCPF = new JLabel("CPF:");
        labelCPF.setBounds(10, 40, 80, 25);
        panel.add(labelCPF);

        JTextField fieldCPF = new JTextField(20);
        fieldCPF.setBounds(100, 40, 160, 25);
        panel.add(fieldCPF);

        JLabel labelEmail = new JLabel("Email:");
        labelEmail.setBounds(10, 70, 80, 25);
        panel.add(labelEmail);

        JTextField fieldEmail = new JTextField(20);
        fieldEmail.setBounds(100, 70, 160, 25);
        panel.add(fieldEmail);

        JLabel labelTelefone = new JLabel("Telefone:");
        labelTelefone.setBounds(10, 100, 80, 25);
        panel.add(labelTelefone);

        JTextField fieldTelefone = new JTextField(20);
        fieldTelefone.setBounds(100, 100, 160, 25);
        panel.add(fieldTelefone);

        JButton buttonCadastrar = new JButton("Cadastrar");
        buttonCadastrar.setBounds(10, 130, 100, 25);
        buttonCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = fieldNome.getText();
                String cpf = fieldCPF.getText();
                String email = fieldEmail.getText();
                String telefone = fieldTelefone.getText();

                Cliente cliente = new Cliente(nome, cpf, email, telefone);
                tabelaHash.put(cpf, cliente);
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
            }
        });
        panel.add(buttonCadastrar);

        JLabel labelBuscarCPF = new JLabel("Buscar por CPF:");
        labelBuscarCPF.setBounds(10, 160, 120, 25);
        panel.add(labelBuscarCPF);

        JTextField fieldBuscarCPF = new JTextField(20);
        fieldBuscarCPF.setBounds(130, 160, 130, 25);
        panel.add(fieldBuscarCPF);

        JButton buttonBuscar = new JButton("Buscar");
        buttonBuscar.setBounds(270, 160, 100, 25);
        buttonBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cpfBusca = fieldBuscarCPF.getText();
                Cliente cliente = tabelaHash.get(cpfBusca);
                if (cliente != null) {
                    JOptionPane.showMessageDialog(null, "Cliente encontrado:\nNome: " + cliente.getNome() + "\nCPF: " + cliente.getCpf() + "\nEmail: " + cliente.getEmail() + "\nTelefone: " + cliente.getTelefone());
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                }
            }
        });
        panel.add(buttonBuscar);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CadastroClientes();
            }
        });
    }
}
