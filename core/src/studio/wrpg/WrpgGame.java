package studio.wrpg;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import studio.wrpg.screens.MainMenu;

class WrpgGame extends Game {

	@Override
	public void create () {
		setScreen(new MainMenu(this));
	}

	public void render() {
		super.render(); // important!
	}

}
