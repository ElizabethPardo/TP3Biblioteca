package com.example.trabajopractico3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.trabajopractico3.databinding.ActivityMainBinding;
import com.example.trabajopractico3.modelo.Libro;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainActivityViewModel vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        vm = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);

        vm.getlibroM().observe(this, new Observer<Libro>() {
            @Override
            public void onChanged(Libro libro) {
                Intent intent = new Intent(MainActivity.this, DetalleLibroActivity.class);
                intent.putExtra("libro", libro);
                startActivity(intent);
            }
        });

        vm.getMensajeM().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
            }
        });

        binding.btBuscar.setOnClickListener(v -> { // [cite: 15]
            String texto = binding.etBuscador.getText().toString();
            vm.buscar(texto);
        });
    }
}