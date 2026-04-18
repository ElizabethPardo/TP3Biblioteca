package com.example.trabajopractico3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.trabajopractico3.databinding.ActivityDetalleLibroBinding;
import com.example.trabajopractico3.modelo.DetalleLibro;
import com.example.trabajopractico3.modelo.Libro;

public class DetalleLibroActivity extends AppCompatActivity {
    private ActivityDetalleLibroBinding binding;
    private  DetalleLibroViewModel detalleLibroViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetalleLibroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        detalleLibroViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(DetalleLibroViewModel.class);

        Libro libro = (Libro) getIntent().getSerializableExtra("libro");

        detalleLibroViewModel.armarVista(libro);


        detalleLibroViewModel.getdetalleLibroM().observe(this, new Observer<DetalleLibro>() {
            @Override
            public void onChanged(DetalleLibro detalleLibro) {
                binding.tvTitulo.setText(detalleLibro.getTitulo());
                binding.tvAutor.setText(detalleLibro.getAutor());
                binding.tvPag.setText(detalleLibro.getPaginas());
                binding.tvAnio.setText(detalleLibro.getAnio());
                binding.tvGenero.setText(detalleLibro.getGenero());
                binding.tvDescripcion.setText(detalleLibro.getDescripcion());
                binding.ivLibro.setImageResource(detalleLibro.getIdFoto());
            }
        });
    }
}