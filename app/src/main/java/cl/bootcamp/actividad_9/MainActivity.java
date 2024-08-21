package cl.bootcamp.actividad_9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void onImageClick(View view) {
            Intent intent = new Intent(this, MainActivity2.class);

            int id = view.getId();
            if (id == R.id.image1) {
                intent.putExtra("image", R.drawable.imagen1);
            } else if (id == R.id.image2) {
                intent.putExtra("image", R.drawable.imagen2);
            } else if (id == R.id.image3) {
                intent.putExtra("image", R.drawable.imagen3);
            } else if (id == R.id.image4) {
                intent.putExtra("image", R.drawable.imagen4);
            }

            startActivity(intent);
        }

        public void onCloseAppClick(View view) {
            finishAffinity();  // Cierra todas las actividades y libera recursos
        }
    }
