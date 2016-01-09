package com.massivcode.radiobuttonexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout mResultContainer;
    private EditText mNameEditText;
    private RadioButton mMaleRadioButton, mFemaleRadioButton;
    private Button mJoinButton;
    private TextView mNameTextView, mGenderTextView;

    private String mName;
    private String mGender;
    private boolean mIsMale, mIsFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mResultContainer = (LinearLayout) findViewById(R.id.container);

        mNameEditText = (EditText) findViewById(R.id.et_name);
        mMaleRadioButton = (RadioButton) findViewById(R.id.radio_male);
        mFemaleRadioButton = (RadioButton) findViewById(R.id.radio_female);
        mJoinButton = (Button) findViewById(R.id.btn_join);
        mNameTextView = (TextView) findViewById(R.id.tv_name);
        mGenderTextView = (TextView) findViewById(R.id.tv_gender);

        mJoinButton.setOnClickListener(this);
        mMaleRadioButton.setOnClickListener(this);
        mFemaleRadioButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_join:
                mName = mNameEditText.getText().toString();
                mNameTextView.setText("이름 : " + mName);
                mGenderTextView.setText("성별 : " + mGender);
                mResultContainer.setVisibility(View.VISIBLE);
                break;
            case R.id.radio_male:
                mIsMale = true;
                mIsFemale = false;
                mGender = "남성";
                Toast.makeText(MainActivity.this, "남성 ? : " + mIsMale + " , 여성 ? : " + mIsFemale, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_female:
                mIsMale = false;
                mIsFemale = true;
                mGender = "여성";
                Toast.makeText(MainActivity.this, "남성 ? : " + mIsMale + " , 여성 ? : " + mIsFemale, Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
