package info.fandroid.game.states;

import com.badlogic.gdx.garphics.Color;
import com.badlogic.gdx.garphics.g2d.BitmapFont;
import com.badlogic.gdx.garphics.g2d.GlyphLayot;
import com.badlogic.gdx.garphics.g2d.SpriteBatch;

public class TextManager {

    static BitmapFont font;

    static float width,height;

    public static void initialize(float width,float height){

        font = new BitmapFont();
        TextManager.width = width;
        TextManager.height= height;

        font.setColor(Color.RED);

        font.getData().setScale(width/1000f);
    }

    public static void displayMessage(SpriteBatch batch){


        GlyphLayout glyphLayout = new GlyphLayout();
        glyphLayout.setText(font, "Score: " + GameManager.score);


        font.draw(batch, glyphLayout, width - width/15f, height*0.95f);

        font.draw(batch,"High Score:" + PlayState.highScore, width/40f, height*0.95f);
    }

}
}
