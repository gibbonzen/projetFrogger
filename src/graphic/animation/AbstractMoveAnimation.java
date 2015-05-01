package graphic.animation;

import javafx.animation.Transition;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;


public abstract class AbstractMoveAnimation extends Transition {
	
	protected int gapX;
	protected int gapY;
	public void setJump(int gapX, int gapY) {
		this.gapX = gapX;
		this.gapY = gapY;
	}
	
	protected Node tile;
	public abstract void setTile(Node tile);
	
	protected double x, y;
	public void setDirection(KeyCode direction) {
		x = y = 0;
		switch(direction) {
		case UP:
			y = -gapY;
			break;
		case DOWN:
			y = gapY;
			break;
		case LEFT:
			x = -gapX;
			break;
		case RIGHT:
			x = gapX;
			break;
		default:
			break;
		}
		
		setCoordinates(x, y);
	}

	protected void setCoordinates(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Double[] getCoordinates() {
		if(x != 0 || y != 0) {
			return new Double[] {x, y};
		}
		return null;
	}
	
	public abstract void play();
	
	@Override
	protected void interpolate(double frac) {
	}
}
