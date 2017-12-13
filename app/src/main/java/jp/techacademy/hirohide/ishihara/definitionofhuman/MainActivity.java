package jp.techacademy.hirohide.ishihara.definitionofhuman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("ドラえもん", 5,"アプリゲーム");
        human.say();
        human.think();

    }
}
