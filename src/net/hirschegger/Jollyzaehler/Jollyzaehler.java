package net.hirschegger.Jollyzaehler;

import android.app.Activity;
import android.os.Handler;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.Hashtable;

import android.widget.AdapterView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.view.View.OnKeyListener;
import android.view.KeyEvent;
import android.widget.ProgressBar;

import java.util.Random;

import android.widget.TextView;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;

//EndImports

@SuppressWarnings("unused")

public class Jollyzaehler extends Activity {
    public int iscVs1 = 0;
    public int iscVs2 = 0;
    public int iscVs3 = 0;
    public int iscVs4 = 0;
    public String iscVpunkteeingabe = "0";
    public int iscVpunkte = 0;
    public String iscVs1b = "0";
    public String iscVs1n = "Uma-Ruth";
    private TextView iscWindow7Label0;
    private Button iscWindow7Knopf10;
    private Button iscWindow7Button10;
    private Button iscWindow7Knopf40;
    private Button iscWindow7Knopf20;
    private Button iscWindow7Knopf30;
    private EditText iscWindow7TextField0;

    // EndOfGlobalVariables

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        iscWindow7();
        // iscApp1Launched
    }

    private class ISCWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    public void iscCombineText1() {
        iscVs1b = iscVs1n + iscVs1b;
        iscSetButton2();
        // iscCombineText1Done
    }

    public void iscSetButton2() {
        iscWindow7Knopf10 = (Button) this.findViewById(R.id.iscWindow7Knopf10);
        iscWindow7Knopf10.setText(iscVs1b);
        // iscSetButton2Done
    }

    public void iscAdd3() {
        iscVs1 = iscVs1 + iscVpunkte;
        iscConvertNumberToText4();
        // iscAdd3Done
    }

    public void iscConvertNumberToText4() {
        iscVs1b = String.valueOf(iscVs1);
        iscCombineText1();
        // iscConvertNumberToText4Done
    }

    public void iscConvertTextToNumber5() {
        iscVpunkte = Integer.parseInt(iscVpunkteeingabe);
        iscAdd3();
        // iscConvertTextToNumber5Done
    }

    public void iscGetTextField6() {
        iscWindow7TextField0 = (EditText) this
                .findViewById(R.id.iscWindow7TextField0);
        String strThisString = iscWindow7TextField0.getText().toString();
        iscVpunkteeingabe = strThisString;
        iscConvertTextToNumber5();
        // iscGetTextField6Done
    }

    public void iscWindow7() {
        setContentView(R.layout.iscwindow7layout);
        iscWindow7Knopf10 = (Button) this.findViewById(R.id.iscWindow7Knopf10);
        iscWindow7Knopf10.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                iscGetTextField6();
                // iscWindow7Knopf1Clicked
            }
        });
        iscWindow7Button10.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // iscWindow7Button1Clicked
            }
        });
        iscWindow7Knopf40 = (Button) this.findViewById(R.id.iscWindow7Knopf40);
        iscWindow7Knopf40.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // iscWindow7Knopf4Clicked
            }
        });
        iscWindow7Knopf20 = (Button) this.findViewById(R.id.iscWindow7Knopf20);
        iscWindow7Knopf20.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // iscWindow7Knopf2Clicked
            }
        });
        iscWindow7Knopf30 = (Button) this.findViewById(R.id.iscWindow7Knopf30);
        iscWindow7Knopf30.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // iscWindow7Knopf3Clicked
            }
        });
        findViewById(R.id.iscwindow7).setBackgroundColor(
                Color.argb(255, 255, 255, 255));
        // iscWindow7Opened
    }

    public void iscAppQuit8() {
        this.finish();
    }

    // EndOfFunctions

}
