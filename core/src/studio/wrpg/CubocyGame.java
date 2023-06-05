package studio.wrpg;

import com.badlogic.gdx.Game;
import studio.wrpg.cubocy.screens.MainMenu;

public class CubocyGame extends Game {

	@Override
	public void create () {
		setScreen(new MainMenu(this));
	}

	public void render() {
		super.render(); // important!
	}

}
