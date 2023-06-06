import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBrowser1 extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField filePathField;
	private JTextArea fileContentArea;
	private JButton browseButton;
	private JButton readButton;
	private JButton saveButton;
	private String filePath;
	
	public FileBrowser1() {
		setTitle("File Browser");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);
		//create components
		filePathField = new JTextField();
		fileContentArea = new JTextArea();
		browseButton = new JButton("Browse");
		readButton = new JButton("Read");
		saveButton = new JButton("Save");
		saveButton.setEnabled(false); //initially disabled
		//set layouts
		setLayout(new BorderLayout());
		JPanel topPanel = new JPanel(new BorderLayout());
		JPanel buttonPanel = new JPanel(new FlowLayout());
		//add components to panels
		topPanel.add(filePathField, BorderLayout.CENTER);
		buttonPanel.add(browseButton);
		buttonPanel.add(readButton);
		buttonPanel.add(saveButton);
		//add panels to main frame
		add(topPanel, BorderLayout.NORTH);
		add(new JScrollPane(fileContentArea), BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		//add action listeners
		browseButton.addActionListener(this);
		readButton.addActionListener(this);
		saveButton.addActionListener(this);
		
		setVisible(true);
	}
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == browseButton) {
		JFileChooser fileChooser = new JFileChooser();
		int result = fileChooser.showOpenDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {
			filePath = fileChooser.getSelectedFile().getAbsolutePath();
			filePathField.setText(filePath);
			saveButton.setEnabled(true); //enable the save button
		}
	} else if (e.getSource() == readButton) {
		try {
			String fileContent = readFileContent(filePath);
			fileContentArea.setText(fileContent);
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(this, "Error reading file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	} else if (e.getSource() == saveButton) {
		try {
			String content = fileContentArea.getText();
			saveFileContent(filePath, content);
			JOptionPane.showMessageDialog(this, "File Saved Successfully!!", "Success", JOptionPane.INFORMATION_MESSAGE);
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(this, "Error saving file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
		
	private String readFileContent(String filePath) throws IOException {
		StringBuilder content = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				content.append(line).append("\n");
			}
		}
		return content.toString();
	}

	private void saveFileContent(String filePath, String content) throws IOException {
		try (FileWriter writer = new FileWriter(filePath)) {
			writer.write(content);
		}
	}
	
	public static void main(String[] args) {
		new FileBrowser1();
	}
}