package com.example.customdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button fancyButton;
    Button winButton;
    Button loseButton;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fancyButton=findViewById(R.id.fancyBTN);
        winButton=findViewById(R.id.winBTN);
        loseButton=findViewById(R.id.loseBTN);
        dialog=new Dialog(this);

        fancyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFancyDialog();
            }
        });

        winButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWinDialog();

            }
        });

        loseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoseDialog();
                
            }
        });
    }

    private void openLoseDialog() {
        dialog.setContentView(R.layout.lose_layout);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ImageView imageViewClose=dialog.findViewById(R.id.imageViewCloseLose);
        Button buttonOk=dialog.findViewById(R.id.buttonOkLose);
        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(getApplicationContext(), "Dialog close", Toast.LENGTH_SHORT).show();
            }
        });
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(getApplicationContext(), "Ok clicked", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();
    }

    private void openWinDialog() {
        dialog.setContentView(R.layout.win_layout);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ImageView imageViewClose=dialog.findViewById(R.id.imageViewClose);
        Button buttonOk=dialog.findViewById(R.id.buttonOkLose);
        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(getApplicationContext(), "Dialog close", Toast.LENGTH_SHORT).show();
            }
        });
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(getApplicationContext(), "Ok clicked", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();
    }

    private void openFancyDialog() {
    }

}