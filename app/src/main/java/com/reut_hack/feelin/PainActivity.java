package com.reut_hack.feelin;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;
import android.content.Intent;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PainActivity extends AppCompatActivity {

    @BindView(R.id.draw)
    MyDrawView myDrawView;

    @BindView(R.id.rude_seekbar)
    SeekBar mRudeSeekbar;

    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain);
        ButterKnife.bind(this);

        mContext = this;
        myDrawView.mPaint.setXfermode(null);


        int seekBarVisibility = mRudeSeekbar.getVisibility();
        mRudeSeekbar.setVisibility(View.VISIBLE);


        mRudeSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                int myColor = -1;
                switch(progress){

                    case 1:
                        myColor = mContext.getResources().getColor(R.color.slider_gradient_bottom);
                        break;

                    case 2:
                        myColor = mContext.getResources().getColor(R.color.slider_gradient_3);
                        break;

                    case 3:
                        myColor = mContext.getResources().getColor(R.color.slider_gradient_3);
                        break;

                    case 4:
                        myColor = mContext.getResources().getColor(R.color.slider_gradient_4);
                        break;

                    case 5:
                        myColor = mContext.getResources().getColor(R.color.slider_gradient_bottom);
                        break;

                    case 6:
                        myColor = mContext.getResources().getColor(R.color.slider_gradient_6);
                        break;

                    case 7:
                        myColor = mContext.getResources().getColor(R.color.slider_gradient_7);
                        break;

                    case 8:
                        myColor = mContext.getResources().getColor(R.color.slider_gradient_8);
                        break;

                    case 9:
                        myColor = mContext.getResources().getColor(R.color.slider_gradient_9);
                        break;

                    case 10:
                        myColor = mContext.getResources().getColor(R.color.slider_gradient_top);
                        break;

                    default:
                        myColor = mContext.getResources().getColor(R.color.slider_gradient_bottom);
                }

                myDrawView.mPaint.setColor(myColor);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void goBackToMainActivity(View view){
        Intent returnIntent = new Intent();
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
}
