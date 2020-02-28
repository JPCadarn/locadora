package locadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;

public class Locadora {

	private JFrame frame;
	private JTextField txtPlaca;
	private JTextField txtNomeCarro;
	private JTextField txtPreco;
	private JTextField txtValorLocacao;
	private JTextField txtNomeUsuario;
	private JTextField txtSobrenome;
	private JTextField txtNroCnh;
	private JTextField txtDataNascimento;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTextField txtRua;
	private JTextField txtComplemento;
	private JTextField txtCep;
	private JTextField txtCidade;
	private JTextField txtEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Locadora window = new Locadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Locadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1249, 809);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 21, 919, 595);
		frame.getContentPane().add(tabbedPane);
		
		JPanel pnlListaCarros = new JPanel();
		tabbedPane.addTab("Ve\u00EDculos", null, pnlListaCarros, null);
		tabbedPane.setEnabledAt(0, true);
		
		JPanel pnlCadastroCarro = new JPanel();
		tabbedPane.addTab("Cadastrar Carro", null, pnlCadastroCarro, null);
		pnlCadastroCarro.setLayout(null);
		
		txtPlaca = new JTextField();
		txtPlaca.setBounds(176, 10, 306, 25);
		pnlCadastroCarro.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPlaca.setBounds(23, 12, 96, 25);
		pnlCadastroCarro.add(lblPlaca);
		
		JLabel lblNomeCarro = new JLabel("Nome");
		lblNomeCarro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNomeCarro.setBounds(23, 47, 96, 25);
		pnlCadastroCarro.add(lblNomeCarro);
		
		JLabel lblPreco = new JLabel("Pre\u00E7o");
		lblPreco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPreco.setBounds(23, 86, 96, 25);
		pnlCadastroCarro.add(lblPreco);
		
		JLabel lblValorLocacao = new JLabel("Valor de Loca\u00E7\u00E3o:");
		lblValorLocacao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValorLocacao.setBounds(23, 121, 143, 25);
		pnlCadastroCarro.add(lblValorLocacao);
		
		txtNomeCarro = new JTextField();
		txtNomeCarro.setColumns(10);
		txtNomeCarro.setBounds(176, 45, 306, 25);
		pnlCadastroCarro.add(txtNomeCarro);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(176, 84, 306, 25);
		pnlCadastroCarro.add(txtPreco);
		
		txtValorLocacao = new JTextField();
		txtValorLocacao.setColumns(10);
		txtValorLocacao.setBounds(176, 119, 306, 25);
		pnlCadastroCarro.add(txtValorLocacao);
		
		JPanel pnlCadastrarUsuario = new JPanel();
		tabbedPane.addTab("Cadastrar Usu\u00E1rio", null, pnlCadastrarUsuario, null);
		pnlCadastrarUsuario.setLayout(null);
		
		JLabel lblNomeUsuario = new JLabel("Nome");
		lblNomeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNomeUsuario.setBounds(10, 12, 96, 25);
		pnlCadastrarUsuario.add(lblNomeUsuario);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setColumns(10);
		txtNomeUsuario.setBounds(163, 10, 306, 25);
		pnlCadastrarUsuario.add(txtNomeUsuario);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(163, 45, 306, 25);
		pnlCadastrarUsuario.add(txtSobrenome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSobrenome.setBounds(10, 47, 96, 25);
		pnlCadastrarUsuario.add(lblSobrenome);
		
		JLabel lblNroCnh = new JLabel("N\u00FAmero CNH");
		lblNroCnh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNroCnh.setBounds(10, 86, 96, 25);
		pnlCadastrarUsuario.add(lblNroCnh);
		
		txtNroCnh = new JTextField();
		txtNroCnh.setColumns(10);
		txtNroCnh.setBounds(163, 84, 306, 25);
		pnlCadastrarUsuario.add(txtNroCnh);
		
		JLabel lblCtgCnh = new JLabel("Categoria CNH");
		lblCtgCnh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCtgCnh.setBounds(10, 121, 143, 25);
		pnlCadastrarUsuario.add(lblCtgCnh);
		
		JLabel lblDataNascimento = new JLabel("Data de Nascimento");
		lblDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataNascimento.setBounds(10, 156, 126, 25);
		pnlCadastrarUsuario.add(lblDataNascimento);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setColumns(10);
		txtDataNascimento.setBounds(163, 154, 306, 25);
		pnlCadastrarUsuario.add(txtDataNascimento);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(163, 189, 306, 25);
		pnlCadastrarUsuario.add(txtTelefone);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefone.setBounds(10, 191, 96, 25);
		pnlCadastrarUsuario.add(lblTelefone);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(10, 230, 96, 25);
		pnlCadastrarUsuario.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(163, 228, 306, 25);
		pnlCadastrarUsuario.add(txtEmail);
		
		txtRua = new JTextField();
		txtRua.setColumns(10);
		txtRua.setBounds(163, 263, 306, 25);
		pnlCadastrarUsuario.add(txtRua);
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRua.setBounds(10, 265, 143, 25);
		pnlCadastrarUsuario.add(lblRua);
		
		JComboBox cbCnh = new JComboBox();
		cbCnh.setBounds(163, 121, 152, 25);
		pnlCadastrarUsuario.add(cbCnh);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComplemento.setBounds(10, 300, 143, 25);
		pnlCadastrarUsuario.add(lblComplemento);
		
		txtComplemento = new JTextField();
		txtComplemento.setColumns(10);
		txtComplemento.setBounds(163, 298, 306, 25);
		pnlCadastrarUsuario.add(txtComplemento);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCep.setBounds(10, 337, 143, 25);
		pnlCadastrarUsuario.add(lblCep);
		
		txtCep = new JTextField();
		txtCep.setColumns(10);
		txtCep.setBounds(163, 335, 306, 25);
		pnlCadastrarUsuario.add(txtCep);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCidade.setBounds(10, 374, 143, 25);
		pnlCadastrarUsuario.add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(163, 372, 306, 25);
		pnlCadastrarUsuario.add(txtCidade);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEstado.setBounds(10, 411, 143, 25);
		pnlCadastrarUsuario.add(lblEstado);
		
		txtEstado = new JTextField();
		txtEstado.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtEstado.setColumns(10);
		txtEstado.setBounds(163, 409, 306, 25);
		pnlCadastrarUsuario.add(txtEstado);
	}
}
