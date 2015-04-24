package graphic;

import graphic.fxmlcontrollers.AbstractController;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class GameLoop {

	private Timeline gameLoop;
	private Class<? extends AbstractController> gameAreaController;
	
	public GameLoop(Class<? extends AbstractController> gameAreaController) {
		this.gameAreaController = gameAreaController;
		
		buildGameLoop();
	}
	
	private void buildGameLoop() {
		Duration loopSpeed = Duration.millis(1000 / (float) 60);
		KeyFrame loopFrame = new KeyFrame(loopSpeed, actionEvent -> {
			// instructions called for each iteration
			// checks collisions
			
			// checks user event
			
			// move the player
			
		});
		
		Timeline gameLoop = new Timeline();
		gameLoop.setCycleCount(Timeline.INDEFINITE); // while true
		gameLoop.getKeyFrames().add(loopFrame);
		
		setGameLoop(gameLoop);
	}
	
	private void setGameLoop(Timeline gameLoop) {
		this.gameLoop = gameLoop;
	}
	
	public Timeline getGameLoop() {
		return gameLoop;
	}
	
	public void startGame() {
		getGameLoop().playFromStart();
	}
	
	public void stopGame() {
		getGameLoop().stop();
	}
}