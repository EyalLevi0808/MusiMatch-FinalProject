package com.example.studentsrepository;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class StudentDetailsActivity extends AppCompatActivity {

    private TextView studentName;
    private TextView studentId;
    private TextView studentPhone;
    private TextView studentAddress;
    private CheckBox flagCB;
    private int index = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_details);

        String[] studentDetails = getIntent().getStringArrayExtra("STUDENT_DETAILS_ARRAY");
        boolean flag = getIntent().getBooleanArrayExtra("IS_VALID_STUDENT")[0];
        index = getIntent().getIntArrayExtra("INDEX")[0];

        studentName = findViewById(R.id.details_name);
        studentId = findViewById(R.id.details_id);
        studentPhone = findViewById(R.id.details_phone);
        studentAddress = findViewById(R.id.details_address);
        flagCB = findViewById(R.id.details_cb);

        studentName.setText(studentDetails[0]);
        studentId.setText(studentDetails[1]);
        studentPhone.setText(studentDetails[2]);
        studentAddress.setText(studentDetails[3]);
        flagCB.setChecked(flag);
        flagCB.setEnabled(false);

    }

    public void OnClickEditButton(View view)
    {
        Intent intent = new Intent(this, EditStudentActivity.class);
        intent.putExtra("STUDENT_DETAILS_ARRAY",
                new String[] {studentName.getText().toString(), studentId.getText().toString(),
                        studentPhone.getText().toString(), studentAddress.getText().toString()});
        intent.putExtra("IS_VALID_STUDENT", new boolean[] {flagCB.isChecked()});
        intent.putExtra("INDEX", index);
        startActivity(intent);
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            