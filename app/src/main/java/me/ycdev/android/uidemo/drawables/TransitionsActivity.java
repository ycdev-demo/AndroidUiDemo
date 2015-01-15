package me.ycdev.android.uidemo.drawables;

import me.ycdev.android.uidemo.R;

import android.app.Activity;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransitionsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawables_transitions);
        initViews();
    }

    private void initViews() {
        final Button transition1Btn = (Button) findViewById(R.id.transition1);
        transition1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionDrawable drawable = (TransitionDrawable) transition1Btn.getBackground();
                drawable.reverseTransition(500);
            }
        });

        final Button transition2Btn = (Button) findViewById(R.id.transition2);
        transition2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionDrawable drawable = (TransitionDrawable) transition2Btn.getBackground();
                drawable.startTransition(500);
            }
        });
    }
}
