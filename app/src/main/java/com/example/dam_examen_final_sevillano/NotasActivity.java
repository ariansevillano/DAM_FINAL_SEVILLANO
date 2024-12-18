package com.example.dam_examen_final_sevillano;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.dam_examen_final_sevillano.databinding.ActivityNotasBinding;

public class NotasActivity extends AppCompatActivity implements NotasInteractionListener {

    private ActivityNotasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityNotasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Configurar el Toolbar como ActionBar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Configurar los destinos principales
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_notas);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

    @Override
    public boolean onSupportNavigateUp() {
        // Manejar la navegación hacia arriba
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_notas);
        return navController.navigateUp() || super.onSupportNavigateUp();
    }

    @Override
    public void editNotaClick(Nota nota) {
        // Implementación de editar nota
    }

    @Override
    public void eliminaNotaClick(Nota nota) {
        // Implementación de eliminar nota
    }

    @Override
    public void favoritaNotaClick(Nota nota) {
        // Implementación de marcar nota como favorita
    }
}