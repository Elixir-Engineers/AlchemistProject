package ui.swing.screens.screencontrollers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import ui.swing.screens.scenes.HostGameScreen;
import ui.swing.screens.scenes.PlayerIngredientsScreen;
import domain.controllers.GameController;
import domain.gameobjects.IngredientCard;

import java.io.InputStream;
import java.util.List;

import javax.swing.JFrame;

public class PlayerIngredientsScreenController {

    @FXML
    private HBox ingredientsContainer;
    @FXML
    private Button quitButton;

    private GameController gameController;
    private JFrame playerIngredientsScreen;

    public void initialize() {
        gameController = GameController.getInstance();
        addIngredients();
    }

    private void addIngredients() {
        List<IngredientCard> ingredientCards = gameController.getCurrentPlayer().getIngredientInventory();
        for (IngredientCard card : ingredientCards) {
            Label ingredientLabel = new Label(card.getName());
            setImage(card.getImagePath(), ingredientLabel);
            ingredientsContainer.getChildren().add(ingredientLabel);
        }
    }
    
    public void setPlayerIngredientsScreenFrame(PlayerIngredientsScreen playerIngredientsScreen) {
		// TODO Auto-generated method stub
		this.playerIngredientsScreen = playerIngredientsScreen;
	}

    private void setImage(String path, Label label) {
        try (InputStream is = getClass().getResourceAsStream(path)) {
            Image image = new Image(is);
            ImageView imageView = new ImageView(image);
            // Adjust the size of the image if necessary
            imageView.setFitHeight(165); // example height
            imageView.setFitWidth(139); // example width
            label.setGraphic(imageView);
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception (e.g., image not found)
        }
    }

    @FXML
    private void handleQuitAction() {
        // Close the window. Implementation depends on how you want to manage your windows.
        // For example, if this is part of a larger application, you might need to notify a parent controller.
    	if (playerIngredientsScreen != null) {
    		playerIngredientsScreen.dispose(); // Close the JFrame
        }
    }
}