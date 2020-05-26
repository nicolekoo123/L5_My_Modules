package sg.edu.rp.c346.id19047433.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailsActivity extends AppCompatActivity {
    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);
        tvAnswer = findViewById(R.id.textView);
        Intent getIntent = getIntent();
        String code = getIntent.getStringExtra("code");
        String name = getIntent.getStringExtra("name");
        int year = getIntent.getIntExtra("year", 0);
        String sem = getIntent.getStringExtra("sem");
        String credit = getIntent.getStringExtra("credit");
        String venue = getIntent.getStringExtra("venue");
        tvAnswer.setText("Module Code: " + code + "\nModule Name: " + name + "\nAcademic Year: " + year + "\nSemester: " + sem +"\nModule Credit: " + credit + "\nVenue: " + venue);
    }
}
