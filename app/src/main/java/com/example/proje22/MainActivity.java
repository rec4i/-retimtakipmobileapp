package com.example.proje22;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.proje22.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private Button ToplaButton;
    private EditText Deger1;
    private EditText Deger2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




        Deger1 = (EditText)findViewById(R.id.EditText1);
        Deger2 = (EditText)findViewById(R.id.EditText2);
        ToplaButton = (Button) findViewById(R.id.Topla);

        ToplaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Deger1Int = Integer.parseInt(Deger1.getText().toString());
                int Deger2Int = Integer.parseInt(Deger2.getText().toString());
                Log.d("BanaBas", "Toplam Deger"+(Deger1Int+Deger2Int));

            }
        });


    }





}