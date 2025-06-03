package com.example.ifrs_campusrolante;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.ifrs_campusrolante.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;

        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_rolante,
                R.id.nav_cursos,
                R.id.nav_inscricao,
                R.id.nav_oportunidades,
                R.id.nav_nucleos,
                R.id.nav_auxilio,
                R.id.nav_transporte,
                R.id.nav_redes,
                R.id.nav_desenvolvedoras
        ).setOpenableLayout(drawer).build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(navigationView, navController);

        // Evita navegar para a mesma tela repetidamente
        navigationView.setNavigationItemSelectedListener(item -> {
            int id = item.getItemId();

            if (navController.getCurrentDestination() == null || navController.getCurrentDestination().getId() != id) {
                navController.navigate(id);
            }

            drawer.closeDrawer(GravityCompat.START);
            return true;
        });

        // Define a toolbar como ActionBar
        setSupportActionBar(binding.appBarMain.toolbar);

        // Configura o ActionBar para funcionar com NavController e DrawerLayout
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}