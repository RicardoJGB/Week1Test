package com.mobileapps.week1test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tvTigerSpecies;
    TextView tvTigerPhyl;
    TextView tvMonkeyPhyl;
    TextView tvMonkeySpecies;
    TextView tvSnakePhyl;
    TextView tvSnakeSpecies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTigerSpecies=findViewById(R.id.TigerSpecies);
        tvTigerPhyl=findViewById(R.id.TigerPhyl);
        tvMonkeySpecies=findViewById(R.id.MonkeySpecies);
        tvMonkeyPhyl=findViewById(R.id.MonkeyPhyl);


        Animal RandomAnimal= new Animal();
        RandomAnimal.getAnimalName();

        Tiger tigre = new Tiger();
        tigre.Roar();
        tigre.Eat();
        tigre.Sleep();

        Monkey mono = new Monkey();
        mono.Screech();
        mono.Eat();
        mono.Sleep();

        Snake serpiente = new Snake();
        serpiente.Hiss();
        serpiente.Eat();
        serpiente.Sleep();

        tvTigerSpecies.setText(tigre.getPhylum());
        tvTigerPhyl.setText(tigre.getSpecies());
        tvMonkeySpecies.setText((mono.getPhylum()));
        tvMonkeyPhyl.setText(mono.getSpecies());

    }
}
