package foo.bar.performer.impl;

import foo.bar.song.Song;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-config.xml")
public class PlayerVocalistTest {

    @Autowired
    PlayerVocalist p;

    Song song;

    @Before
    public void setUp(){
        song = p.getSong();
    }

    @Test
    public void getSongName(){
        Assert.assertEquals("song name","Название песни", song.getName());
    }

    @Test
    public void getSongText(){
        Assert.assertEquals("song text","Текст песни", song.getText());
    }

}
