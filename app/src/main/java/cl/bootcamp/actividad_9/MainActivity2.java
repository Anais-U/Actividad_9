package cl.bootcamp.actividad_9;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            ImageView imageView = findViewById(R.id.selectedImage);
            int imageResId = getIntent().getIntExtra("image", 0);
            imageView.setImageResource(imageResId);
        }


        public void onBackClick(View view) {
            finish();  // Finaliza la actividad actual y vuelve a la anterior
        }
    }
