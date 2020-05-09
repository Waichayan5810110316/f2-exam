import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui {

    public static void main(String[] args) {
		JLabel label;
		JFrame frame = new JFrame("myframe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		
		JPanel facesPanel = new JPanel();
		JPanel labelPanel = new JPanel();
		GridLayout layout = new GridLayout(0, 3);
        
		facesPanel.setLayout(layout);
        
		label = new JLabel("");
		label.setFont(label.getFont().deriveFont(16.0f));

        JButton button = new JButton("insert key");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("key");
            }
        });

		JButton buttont = new JButton("insert line");
        buttont.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("line");
            }
		});
		

		
		facesPanel.add(button, BorderLayout.PAGE_END);
        facesPanel.add(buttont, BorderLayout.PAGE_END);
		
		labelPanel.add(label);

		frame.getContentPane().setLayout(new BorderLayout());
				
		frame.add(facesPanel, BorderLayout.PAGE_START);
		frame.add(labelPanel, BorderLayout.PAGE_END);
		
		frame.setVisible(true);
	}
}