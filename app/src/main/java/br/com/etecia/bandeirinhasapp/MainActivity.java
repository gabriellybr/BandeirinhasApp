package br.com.etecia.bandeirinhasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Array;

import Model.State;

public class MainActivity extends AppCompatActivity {

    State State = new State("Teste","Teste","Teste","Teste");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
