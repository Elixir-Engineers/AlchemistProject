package domain.GameObjects;

import domain.Game;
import domain.GameObjects.ArtifactEffects.ArtifactEffect;

public class ArtifactCard {
	
    private String name;
    private int goldValue;
    private ArtifactEffect effect;
    private boolean isOneTimeUse; // Indicates if the card is for one-time use
    private boolean isUsed;       // Tracks whether the card has been used
    private boolean isImmadiate; // Indicates if the card is immediately applied or Whenever is used.
    private String imagePath;

    
    public ArtifactCard(String name, int goldValue, ArtifactEffect effect, boolean isOneTimeUse, boolean isImmadiate, String imagePath) {
        this.name = name;
        this.goldValue = goldValue;
        this.effect = effect;
        this.isOneTimeUse = isOneTimeUse;
        this.isUsed = false;
        this.isImmadiate = isImmadiate;
        this.imagePath = imagePath;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public int getGoldValue() {
        return goldValue;
    }

    public ArtifactEffect getEffect() {
        return effect;
    }  

    public boolean isOneTimeUse(){
        return isOneTimeUse;
    }

    public boolean isUsed(){
        return isUsed;
    }

    public boolean isImmadiate(){
        return isImmadiate;
    }

    public String getImagePath(){
        return imagePath;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGoldValue(int goldValue){
        this.goldValue = goldValue;
    }

    public void setEffect(ArtifactEffect effect){
        this.effect = effect;
    }

    public void isOneTimeUse(Boolean isOneTimeUse){
        this.isOneTimeUse = isOneTimeUse;
    }

    public void isUsed(Boolean isUsed){
        this.isUsed = isUsed;
    }

    public void setImagePath(String imagePath){
        this.imagePath = imagePath;
    }
    
    public void applyEffect(Game game) {
        if(isUsed == false ){ 
            effect.apply(game);
            isUsed = true;

        } else if(isUsed == true && isOneTimeUse == false){
            throw new IllegalStateException("This one-per-round use artifact has already been used.");
        } else if ( isUsed == true && isOneTimeUse == true){
            throw new IllegalStateException("This one-time use artifact has already been used.");
        }  else { 
            System.out.println("I dont think is there any situation but will see");
        }
    }

    public void resetForNewRound() {
        if ( !isOneTimeUse) {
            isUsed = false;
        }
    }
    
    @Override
    public String toString() {
        return "ArtifactCard{" +
                "\n\tname='" + name + 
                "\n\tgoldValue=" + goldValue +
                "\n\tisOneTimeUse=" + isOneTimeUse +
                "\n\tisUsed=" + isUsed +
                "\n\tisImmediate=" + isImmadiate +
                "\n}";
    }

}
