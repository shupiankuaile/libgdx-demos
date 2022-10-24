package studio.wrpg;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

class WrpgGame extends Game {
	public SpriteBatch batch;
	public BitmapFont font;

//	TiledMap map = new TmxMapLoader().load("level1.tmx");


	public void create() {
		batch = new SpriteBatch();
		font = new BitmapFont(); // use libGDX's default Arial font
//		this.setScreen(new MainMenuScreen(this));
	}

	public void render() {
		super.render(); // important!
	}

	public void dispose() {
		batch.dispose();
		font.dispose();
	}
}
