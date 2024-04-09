package ThucHanh2;

import javax.swing.*;
import java.awt.event.*;
public class MenuDisplay implements ActionListener{
	JFrame frame;
    JMenuBar menuBar;
    JMenu fileMenu, editMenu, optionMenu;
    JMenuItem newItem, openItem, saveItem, exitItem, cutItem, copyItem, pasteItem, firstItem, secondItem, thirdItem, protectedItem;

    MenuDisplay() {
        frame = new JFrame("Menu Example");
        
      
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        optionMenu = new JMenu("Option");


        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        cutItem = new JMenuItem("Cut");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");
        firstItem = new JMenuItem("First");
        secondItem = new JMenuItem("Second");
        thirdItem = new JMenuItem("Third");
        protectedItem = new JMenuItem("Protected");

 
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); 
        fileMenu.add(exitItem);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.addSeparator(); 
        editMenu.add(optionMenu);

        optionMenu.add(firstItem);
        optionMenu.add(secondItem);
        optionMenu.add(thirdItem);

        editMenu.add(protectedItem);

    
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

   
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);
        firstItem.addActionListener(this);
        secondItem.addActionListener(this);
        thirdItem.addActionListener(this);
        protectedItem.addActionListener(this);


        frame.setJMenuBar(menuBar);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newItem) {
            JOptionPane.showMessageDialog(frame, "New Item Clicked");
        } else if (e.getSource() == openItem) {
            JOptionPane.showMessageDialog(frame, "Open Item Clicked");
        } else if (e.getSource() == saveItem) {
            JOptionPane.showMessageDialog(frame, "Save Item Clicked");
        } else if (e.getSource() == exitItem) {
            System.exit(0);
        } else if (e.getSource() == cutItem) {
            JOptionPane.showMessageDialog(frame, "Cut Item Clicked");
        } else if (e.getSource() == copyItem) {
            JOptionPane.showMessageDialog(frame, "Copy Item Clicked");
        } else if (e.getSource() == pasteItem) {
            JOptionPane.showMessageDialog(frame, "Paste Item Clicked");
        } else if (e.getSource() == firstItem) {
            JOptionPane.showMessageDialog(frame, "First Item Clicked");
        } else if (e.getSource() == secondItem) {
            JOptionPane.showMessageDialog(frame, "Second Item Clicked");
        } else if (e.getSource() == thirdItem) {
            JOptionPane.showMessageDialog(frame, "Third Item Clicked");
        } else if (e.getSource() == protectedItem) {
            JOptionPane.showMessageDialog(frame, "Protected Item Clicked");
        }
    }

    public static void main(String[] args) {
        new MenuDisplay();
    }
}
