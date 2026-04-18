package com.example.trabajopractico3;


import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.trabajopractico3.modelo.Libro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    private MutableLiveData<Libro> libroM;
    private MutableLiveData<String> mensajeM = new MutableLiveData<>();
    private List<Libro> libros = new ArrayList<>();

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        cargarLibros();
    }

    public LiveData<Libro> getlibroM() {
        if(libroM == null)
            libroM= new MutableLiveData<>();
        return libroM;
    }
    public LiveData<String> getMensajeM()
    {
        if(mensajeM == null)
            mensajeM= new MutableLiveData<>();
        return mensajeM;
    }

    public void buscar(String nombre) {
        for (Libro l : libros) {
            if (l.getTitulo().toLowerCase().contains(nombre.toLowerCase())) {
                libroM.setValue(l);
                return;
            }
        }
        mensajeM.setValue("Libro no encontrado");
    }

    private void cargarLibros() {

        libros = new ArrayList<>(Arrays.asList(

                new Libro(
                        "Los juegos del hambre",
                        "Suzanne Collins",
                        374,
                        2008,
                        new String[]{"Distopía", "Aventura", "Ciencia Ficción"},
                        "Katniss Everdeen se ofrece como voluntaria para participar en un brutal evento televisado donde solo puede haber un sobreviviente.",
                        R.drawable.juegos_hambre
                ),

                new Libro(
                        "El código Da Vinci",
                        "Dan Brown",
                        454,
                        2003,
                        new String[]{"Misterio", "Thriller", "Historia"},
                        "El profesor Robert Langdon se ve envuelto en una investigación tras un asesinato en el Louvre.",
                        R.drawable.codigo_da_vinci
                ),

                new Libro(
                        "Orgullo y prejuicio",
                        "Jane Austen",
                        279,
                        1813,
                        new String[]{"Romance", "Clásico", "Drama"},
                        "Elizabeth Bennet enfrenta las normas sociales de su época mientras lidia con el orgullo del señor Darcy.",
                        R.drawable.orgullo_prejuicio
                ),

                new Libro(
                        "El principito",
                        "Antoine de Saint-Exupéry",
                        96,
                        1943,
                        new String[]{"Fábula", "Filosofía", "Infantil"},
                        "Un aviador se encuentra con un pequeño príncipe que le enseña lecciones sobre la vida.",
                        R.drawable.principito
                ),

                new Libro(
                        "La chica del tren",
                        "Paula Hawkins",
                        395,
                        2015,
                        new String[]{"Thriller", "Misterio", "Psicológico"},
                        "Rachel observa a una pareja desde el tren hasta que un día la mujer desaparece.",
                        R.drawable.chica_tren
                ),

                new Libro(
                        "It",
                        "Stephen King",
                        1138,
                        1986,
                        new String[]{"Terror", "Suspenso", "Ficción"},
                        "Un grupo de amigos enfrenta a una entidad maligna que toma forma de payaso.",
                        R.drawable.it
                ),

                new Libro(
                        "La sombra del viento",
                        "Carlos Ruiz Zafón",
                        565,
                        2001,
                        new String[]{"Misterio", "Drama", "Histórico"},
                        "Un joven descubre un libro maldito que lo lleva a investigar la vida de su autor.",
                        R.drawable.sombra_viento
                ),

                new Libro(
                        "Sapiens: De animales a dioses",
                        "Yuval Noah Harari",
                        498,
                        2011,
                        new String[]{"Historia", "Ensayo", "Ciencia"},
                        "Un recorrido por la historia de la humanidad desde sus orígenes hasta hoy.",
                        R.drawable.sapiens
                )

        ));
    }
}