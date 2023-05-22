package sg.edu.rp.c346.id21023395.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView moduleCodeResult, moduleNameResult,
            academicyrResult, semesterResult,
            moduleCreditResult, venueResult;
    TextView tvHeader;
    Button gobackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        moduleCodeResult = findViewById(R.id.tvModuleCodeResult);
        moduleNameResult = findViewById(R.id.tvModuleNameResult);
        academicyrResult = findViewById(R.id.tvAcademicYearResult);
        semesterResult = findViewById(R.id.tvSemesterResult);
        moduleCreditResult = findViewById(R.id.tvModuleCreditResult);
        venueResult = findViewById(R.id.tvVenueResult);
        tvHeader = findViewById(R.id.header);
        gobackBtn = findViewById(R.id.goBackBtn);

        Intent intentReceived = getIntent();

        String modCode = intentReceived.getStringExtra("ModuleCode");
        moduleCodeResult.setText(modCode);

        String modName = intentReceived.getStringExtra("ModuleName");
        moduleNameResult.setText(modName);

        int acYr = intentReceived.getIntExtra("AcademicYear", 0);
        academicyrResult.setText(String.valueOf(acYr));

        int semester = intentReceived.getIntExtra("Semester", 0);
        semesterResult.setText(String.valueOf(semester));

        int modCredit = intentReceived.getIntExtra("ModuleCredit", 0);
        moduleCreditResult.setText(String.valueOf(modCredit));

        String venue = intentReceived.getStringExtra("Venue");
        venueResult.setText(venue);

        tvHeader.setText(modCode + " Module Information" );

        gobackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}