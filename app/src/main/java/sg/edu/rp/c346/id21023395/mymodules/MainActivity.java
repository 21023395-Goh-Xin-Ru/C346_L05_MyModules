package sg.edu.rp.c346.id21023395.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC346;
    TextView tvC286;
    TextView tvC303;
    TextView tvC300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.textViewc346);
        tvC286 = findViewById(R.id.textViewC286);
        tvC303 = findViewById(R.id.textViewC303);
        tvC300 = findViewById(R.id.textViewC300);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C346");
                intent.putExtra("ModuleName", "Mobile App Development");
                intent.putExtra("AcademicYear", 2023);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "E63A");
                startActivity(intent);
            }
        });

        tvC286.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C286");
                intent.putExtra("ModuleName", "Advanced Web App Development in .NET");
                intent.putExtra("AcademicYear", 2023);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "E53D");
                startActivity(intent);
            }
        });

        tvC303.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C303");
                intent.putExtra("ModuleName", "IT Project Management");
                intent.putExtra("AcademicYear", 2023);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "W66L");
                startActivity(intent);
            }
        });

        tvC300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C300");
                intent.putExtra("ModuleName", "Project");
                intent.putExtra("AcademicYear", 2023);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "-");
                startActivity(intent);
            }
        });
    }
}