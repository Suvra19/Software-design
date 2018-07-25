package funkySignsGui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FunkySignsDisplayFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** The Panel on which the Signs will display. */
    private JPanel signsDisplayPanel;

    /** Create new form JFrame */
    public FunkySignsDisplayFrame() {
        initialiseGui();
        pack();

        // Centre the frame on screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
    }

    /** Initialize the form. */
    private void initialiseGui() {
        getContentPane().setLayout(new BorderLayout());

		// Set up the animationPanel.
		signsDisplayPanel = new JPanel();
        signsDisplayPanel.setPreferredSize(new Dimension(1080, 720));
        signsDisplayPanel.setSize(new Dimension(1080, 720));
        signsDisplayPanel.setLayout(null); // Use absolute positioning instead.
        signsDisplayPanel.setBackground(new Color(0,0,0));
        getContentPane().add(signsDisplayPanel, BorderLayout.CENTER);

        // set title
        setTitle("SENG301 Funky Signs Program");

        // add menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        menuFile.setMnemonic('F');

        // create Exit menu item
        JMenuItem fileExit = new JMenuItem("Exit");
        fileExit.setMnemonic('E');
        
        fileExit.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
        
        menuFile.add(fileExit);
        menuBar.add(menuFile);

        // sets menu bar
        setJMenuBar(menuBar);

        addWindowListener(
            new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent evt) {
                    exitForm(evt);
                }
            });
    }

	/**
	 * Getter for the signsDisplayPanel.
	 * Used by SignsApp so it can tell Signs where to draw themselves.
	 */
	public JPanel getSignsDisplayPanel() {
    	return signsDisplayPanel;
    }

    /** Exit the Application */
    private void exitForm(WindowEvent evt) {
        System.exit(0);
    }
}
