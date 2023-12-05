package domain.GameObjects.ArtifactEffects;

import domain.Game;

/**
 * ElixirOfInsightEffect is an implementation of the ArtifactEffect interface.
 * This effect allows a player to view and rearrange the top three cards of the ingredient deck.
 */

public class ElixirOfInsightEffect implements ArtifactEffect {

    @Override
    public void apply(Game game) {
        if( game.getIngredientDeck().size() >= 3) {
            
        }
    }

    

    
    
}
