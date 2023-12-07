package UI.Swing;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;

public class BoardScreen extends JFrame {

    private JPanel contentPane;

    /**
     * Create the frame.
     */
    public BoardScreen() {
    	DeductionBoard deductionBoard = new DeductionBoard(this); // Pass 'this' as the reference to the BoardScreen
 
        setTitle("Ku Alchemist Game Board");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 505); // Adjust the size accordingly
        setResizable(false);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);
        
        JPanel publicationPanel = new JPanel();
        publicationPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        publicationPanel.setBackground(new Color(254, 255, 255));
        publicationPanel.setBounds(6, 62, 275, 291);
        contentPane.add(publicationPanel);
        
        JLabel publicationNameLabel = new JLabel("Publication Area");
        publicationPanel.add(publicationNameLabel);
        
        JPanel potionBrewingPanel = new JPanel();
        potionBrewingPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        potionBrewingPanel.setBackground(Color.WHITE);
        potionBrewingPanel.setBounds(6, 353, 444, 118);
        contentPane.add(potionBrewingPanel);
        potionBrewingPanel.setLayout(null);
        
        JPanel cauldronPanel = new JPanel();
        cauldronPanel.setBackground(new Color(255, 255, 255));
        cauldronPanel.setBounds(6, 6, 150, 105);
        potionBrewingPanel.add(cauldronPanel);
        
        JLabel cauldronLabel = new JLabel("");
        
        
        
        ImageIcon preResizeCauldronImageIcon = new ImageIcon(BoardScreen.class.getResource("/UI/Swing/Images/gameBoardUI/cauldronImage.png"));
        Image preResizeCauldronImage = preResizeCauldronImageIcon.getImage();

        // Resize the image
        Image resizedCauldronImage = preResizeCauldronImage.getScaledInstance(cauldronPanel.getWidth(), cauldronPanel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon postResizedCauldronImageIcon = new ImageIcon(resizedCauldronImage);
        
        cauldronLabel.setIcon(postResizedCauldronImageIcon);
        cauldronPanel.add(cauldronLabel);
        
        JLabel potionBrewingNameLabel = new JLabel("Potion Brewing Area");
        potionBrewingNameLabel.setBounds(234, 6, 137, 16);
        potionBrewingPanel.add(potionBrewingNameLabel);
        
        JPanel playerIdNamePanel = new JPanel();
        playerIdNamePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
        playerIdNamePanel.setBackground(new Color(254, 255, 255));
        playerIdNamePanel.setBounds(6, 6, 275, 58);
        contentPane.add(playerIdNamePanel);
        playerIdNamePanel.setLayout(new GridLayout(0, 1, 0, 0));
        
        JLabel playerIdNameLabel = new JLabel("Player ID:");
        playerIdNamePanel.add(playerIdNameLabel);
        
        JPanel menuPanel = new JPanel();
        menuPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        menuPanel.setBackground(Color.WHITE);
        menuPanel.setBounds(619, 6, 275, 58);
        contentPane.add(menuPanel);
        menuPanel.setLayout(new GridLayout(0, 2, 20, 0));
        
        JButton menuButton = new JButton("Menu");
        menuButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        menuPanel.add(menuButton);
        
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(254, 255, 255));
        titlePanel.setBounds(280, 6, 340, 58);
        contentPane.add(titlePanel);
        titlePanel.setLayout(new GridLayout(0, 1, 0, 0));
        
        JLabel gameBoardImage = new JLabel("");
        gameBoardImage.setBackground(new Color(255, 255, 255));
        gameBoardImage.setHorizontalAlignment(SwingConstants.CENTER);
        gameBoardImage.setIconTextGap(0);
        gameBoardImage.setFocusable(false);
        // Load the original image
        ImageIcon preResizeMenuImageIcon = new ImageIcon(BoardScreen.class.getResource("/UI/Swing/Images/gameBoardUI/kuAlchemistGameBoardTitleImage.png"));
        Image preResizeMenuImage = preResizeMenuImageIcon.getImage();

        // Resize the image
        Image resizedMenuImage = preResizeMenuImage.getScaledInstance(menuPanel.getWidth(), menuPanel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon postResizeMenuImageIcon = new ImageIcon(resizedMenuImage);

        // Set the resized icon to the JLabel
        gameBoardImage.setIcon(postResizeMenuImageIcon);
        titlePanel.add(gameBoardImage);
        
        JPanel dashboardPanel = new JPanel();
        dashboardPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        dashboardPanel.setBackground(Color.WHITE);
        dashboardPanel.setBounds(362, 88, 174, 58);
        contentPane.add(dashboardPanel);
        
        JLabel playerDashboardNameLabel = new JLabel("Player Dashboard");
        dashboardPanel.add(playerDashboardNameLabel);
        
        JPanel ingredientCardPanel = new JPanel();
        ingredientCardPanel.setBackground(Color.WHITE);
        ingredientCardPanel.setBounds(363, 158, 170, 183);
        contentPane.add(ingredientCardPanel);
        ingredientCardPanel.setLayout(new GridLayout(0, 1, 0, 0));
        
        JLabel ingredientCardImage = new JLabel("");
        
        ImageIcon preResizeIngredientCardImageIcon = new ImageIcon(BoardScreen.class.getResource("/UI/Swing/Images/gameBoardUI/gameBoardIngredientCardBacksideImage.png"));
        Image preResizeIngredientCardImage = preResizeIngredientCardImageIcon.getImage();

        // Resize the image
        Image resizedIngredientCardImage = preResizeIngredientCardImage.getScaledInstance(ingredientCardPanel.getWidth(), ingredientCardPanel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon postResizedIngredientCardImageIcon = new ImageIcon(resizedIngredientCardImage);

        ingredientCardImage.setIcon(postResizedIngredientCardImageIcon);
        ingredientCardPanel.add(ingredientCardImage);
        
        JPanel artifactCardPanel = new JPanel();
        artifactCardPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        artifactCardPanel.setBackground(Color.WHITE);
        artifactCardPanel.setBounds(450, 353, 444, 118);
        contentPane.add(artifactCardPanel);
        
        JLabel artifactCardsNameLabel = new JLabel("Artifact Cards");
        artifactCardPanel.add(artifactCardsNameLabel);
        
        JPanel deductionBoardPanel = new JPanel();
        deductionBoardPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
        deductionBoardPanel.setBackground(Color.WHITE);
        deductionBoardPanel.setBounds(619, 62, 275, 291);
        contentPane.add(deductionBoardPanel);
        
        JLabel deductionBoardNameLabel = new JLabel("Deduction Board");
        deductionBoardPanel.add(deductionBoardNameLabel);
        
        JButton deductionPageButton = new JButton("Click to go to the deduction board!");
        deductionBoardPanel.add(deductionPageButton);
        
        deductionPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create an instance of DeductionBoard and display it
               
                deductionBoard.display();
            }
        });
    }


    public void display() {
        setVisible(true); // Show the board
    }
}
