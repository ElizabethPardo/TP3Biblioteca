package com.example.trabajopractico3;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.trabajopractico3.modelo.DetalleLibro;
import com.example.trabajopractico3.modelo.Libro;

public class DetalleLibroViewModel extends AndroidViewModel {

    private MutableLiveData<DetalleLibro> detalleLibroM = new MutableLiveData<>();

    public DetalleLibroViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<DetalleLibro> getdetalleLibroM(){

        if(detalleLibroM == null)
            detalleLibroM = new MutableLiveData<>();
        return detalleLibroM;
    }

    public void armarVista(Libro libro){

        if (libro == null) return;

        String titulo = libro.getTitulo();
        String autor = getApplication().getString(R.string.autor, libro.getAutor());
        String paginas = getApplication().getString(R.string.paginas, libro.getPaginas());
        String anios = getApplication().getString(R.string.anios, libro.getAnio());
        String generos = getApplication().getString(
                R.string.generos,
                String.join(", ", libro.getGenero())
        );
        String descripcion = getApplication().getString(R.string.descripcion, libro.getDescripcion());
        int idFoto = libro.getIdFoto();

        DetalleLibro detalleLibroVista = new DetalleLibro(
                titulo, autor, descripcion, paginas, anios, generos, idFoto
        );

        detalleLibroM.setValue(detalleLibroVista);
    }
}
