package com.example.renato.placar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText edt_d1,edt_d2,edt_d1_1,edt_d2_2,edt_r1,edt_r2,edt_r3,edt_r4,edt_r1_2,edt_r2_2,edt_r3_2,edt_r4_2;
private TextView txt_x,txt_x_2,txt_r1,txt_r2,txt_r3,txt_r4,txt_r1_2,txt_r2_2,txt_r3_2,txt_r4_2,txt_resultados,txt_parcial_1,txt_r_parcial_1,txt_parcial_2,txt_r_parcial_2,
    txt_campeao,txt_r_campeao,txt_r_campeao_2,txt_empate;
private Button btn_salvar;


    int parcial_1, parcial_2;
    Dados dados = new Dados();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edt_d1 = findViewById(R.id.edt_d1);
        edt_d2 = findViewById(R.id.edt_d2);
        edt_d1_1 = findViewById(R.id.edt_d1_1);
        edt_d2_2 = findViewById(R.id.edt_d2_2);
        edt_r1 = findViewById(R.id.edt_r1);
        edt_r2 = findViewById(R.id.edt_r2);
        edt_r3 = findViewById(R.id.edt_r3);
        edt_r4 = findViewById(R.id.edt_r4);
        edt_r1_2 = findViewById(R.id.edt_r1_2);
        edt_r2_2 = findViewById(R.id.edt_r2_2);
        edt_r3_2 = findViewById(R.id.edt_r3_2);
        edt_r4_2 = findViewById(R.id.edt_r4_2);
        txt_x = findViewById(R.id.txt_x);
        txt_x_2 = findViewById(R.id.txt_x_2);
        txt_r1 = findViewById(R.id.txt_r1);
        txt_r2 = findViewById(R.id.txt_r2);
        txt_r3 = findViewById(R.id.txt_r3);
        txt_r4 = findViewById(R.id.txt_r4);
        txt_r1_2 = findViewById(R.id.txt_r1_2);
        txt_r2_2 = findViewById(R.id.txt_r2_2);
        txt_r3_2 = findViewById(R.id.txt_r3_2);
        txt_r4_2 = findViewById(R.id.txt_r4_2);
        txt_resultados = findViewById(R.id.txt_resultados);
        txt_parcial_1 = findViewById(R.id.txt_parcial_1);
        txt_r_parcial_1 = findViewById(R.id.txt_r_parcial_1);
        txt_parcial_2 = findViewById(R.id.txt_parcial_2);
        txt_r_parcial_2 = findViewById(R.id.txt_r_parcial_2);
        txt_campeao = findViewById(R.id.txt_campeao);
        txt_r_campeao_2 = findViewById(R.id.txt_r_campeao_2);
        txt_empate = findViewById(R.id.txt_empate);
        txt_r_campeao = findViewById(R.id.txt_r_campeao);
        btn_salvar = findViewById(R.id.btn_salvar);


        edt_r1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void afterTextChanged(Editable editable) {
                if (edt_r1.getText().toString().equals("") || edt_r1.getText().toString().equals("-")){
                        dados.setAux_1(0);
                        dados.soma();
                        txt_r_parcial_1.setText(String.valueOf(dados.getParcial_1()));

                }else {
                    parcial_1 = Integer.parseInt(edt_r1.getText().toString());
                    dados.setAux_1(parcial_1);
                    dados.soma();
                    txt_r_parcial_1.setText(String.valueOf(dados.getParcial_1()));

                    testa_1();
                }
            }

        });
        edt_r2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (edt_r2.getText().toString().equals("")|| edt_r2.getText().toString().equals("-")){
                        dados.setAux_2(0);
                        dados.soma();
                        txt_r_parcial_1.setText(String.valueOf(dados.getParcial_1()));


                }else {
                    parcial_1 = Integer.parseInt(edt_r2.getText().toString());
                    dados.setAux_2(parcial_1);
                    dados.soma();
                    txt_r_parcial_1.setText(String.valueOf(dados.getParcial_1()));

                    testa_1();
                }
            }
        });
        edt_r3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (edt_r3.getText().toString().equals("")|| edt_r3.getText().toString().equals("-")){
                    dados.setAux_3(0);
                    dados.soma();
                    txt_r_parcial_1.setText(String.valueOf(dados.getParcial_1()));

                }else {
                    parcial_1 = Integer.parseInt(edt_r3.getText().toString());
                    dados.setAux_3(parcial_1);
                    dados.soma();
                    txt_r_parcial_1.setText(String.valueOf(dados.getParcial_1()));

                    testa_1();
                }
            }
        });
        edt_r4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (edt_r4.getText().toString().equals("")|| edt_r4.getText().toString().equals("-")){
                    dados.setAux_4(0);
                    dados.soma();
                    txt_r_parcial_1.setText(String.valueOf(dados.getParcial_1()));

                }else {
                    parcial_1 = Integer.parseInt(edt_r4.getText().toString());
                    dados.setAux_4(parcial_1);
                    dados.soma();
                    txt_r_parcial_1.setText(String.valueOf(dados.getParcial_1()));
                    testa_1();
                }
            }

        });

//----------------------------------------------------------------------------------------------

        edt_r1_2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
            if (edt_r1_2.getText().toString().equals("")|| edt_r1_2.getText().toString().equals("-")){
                dados.setAux_1_2(0);
                dados.soma_2();
                txt_r_parcial_2.setText(String.valueOf(dados.getParcial_2()));

            }else {
                parcial_2 = Integer.parseInt(edt_r1_2.getText().toString());
                dados.setAux_1_2(parcial_2);
                dados.soma_2();
                txt_r_parcial_2.setText(String.valueOf(dados.getParcial_2()));

                testa_2();

            }

            }
        });
        edt_r2_2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (edt_r2_2.getText().toString().equals("")|| edt_r2_2.getText().toString().equals("-")){
                    dados.setAux_2_2(0);
                    dados.soma_2();
                    txt_r_parcial_2.setText(String.valueOf(dados.getParcial_2()));
                }else {
                    parcial_2 = Integer.parseInt(edt_r2_2.getText().toString());
                    dados.setAux_2_2(parcial_2);
                    dados.soma_2();
                    txt_r_parcial_2.setText(String.valueOf(dados.getParcial_2()));

                    testa_2();
                }

            }
        });
        edt_r3_2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (edt_r3_2.getText().toString().equals("")|| edt_r3_2.getText().toString().equals("-")){
                    dados.setAux_3_2(0);
                    dados.soma_2();
                    txt_r_parcial_2.setText(String.valueOf(dados.getParcial_2()));
                }else {
                    parcial_2 = Integer.parseInt(edt_r3_2.getText().toString());
                    dados.setAux_3_2(parcial_2);
                    dados.soma_2();
                    txt_r_parcial_2.setText(String.valueOf(dados.getParcial_2()));

                   testa_2();
                }
            }
        });
        edt_r4_2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (edt_r4_2.getText().toString().equals("")|| edt_r4_2.getText().toString().equals("-")){
                    dados.setAux_4_2(0);
                    dados.soma_2();
                    txt_r_parcial_2.setText(String.valueOf(dados.getParcial_2()));
                }else {
                    parcial_2 = Integer.parseInt(edt_r4_2.getText().toString());
                    dados.setAux_4_2(parcial_2);
                    dados.soma_2();
                    txt_r_parcial_2.setText(String.valueOf(dados.getParcial_2()));

                   testa_2();
                }

            }
        });
    }

    public void testa_1(){

        if (dados.getFinal_1() >= dados.campeao && dados.getFinal_1() > dados.getFinal_2()){
            txt_r_campeao.setVisibility(View.VISIBLE);
            txt_r_campeao_2.setVisibility(View.INVISIBLE);
            txt_empate.setVisibility(View.INVISIBLE);
        }else
            if (dados.getFinal_1() <= dados.campeao && dados.getFinal_1() < dados.getFinal_2()){
                txt_r_campeao.setVisibility(View.INVISIBLE);
                txt_r_campeao_2.setVisibility(View.VISIBLE);
                txt_empate.setVisibility(View.INVISIBLE);
        }
    }
    public void testa_2(){
        if (dados.getFinal_2() >= dados.campeao && dados.getFinal_2() > dados.getFinal_1()) {
            txt_r_campeao_2.setVisibility(View.VISIBLE);
            txt_r_campeao.setVisibility(View.INVISIBLE);
            txt_empate.setVisibility(View.INVISIBLE);

        } else if (dados.getFinal_2() <= dados.campeao && dados.getFinal_2() < dados.getFinal_1()) {
            txt_r_campeao_2.setVisibility(View.INVISIBLE);
            txt_r_campeao.setVisibility(View.VISIBLE);
            txt_empate.setVisibility(View.INVISIBLE);
        }
    }
}












