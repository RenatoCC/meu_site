package com.example.renato.placar;

public class Dados {


    int aux_1,aux_2,aux_3,aux_4,aux_1_2,aux_2_2,aux_3_2,aux_4_2;
    int parcial_1,parcial_2,final_1,final_2;
    int campeao = 2000;


    public Dados(){

    }

    public Dados(int final_1,int final_2,int aux_1,int aux_2, int aux_3, int aux_4, int parcial_1, int aux_1_2,
                 int aux_2_2, int aux_3_2, int aux_4_2 ,int parcial_2,int campeao){

        this.aux_1 = aux_1;
        this.aux_2 = aux_2;
        this.aux_3 = aux_3;
        this.aux_4 = aux_4;
        this.parcial_1 = parcial_1;

        this.aux_1_2 = aux_1_2;
        this.aux_2_2 = aux_2_2;
        this.aux_3_2 = aux_3_2;
        this.aux_4_2 = aux_4_2;
        this.parcial_2 = parcial_2;

        this.final_1 = final_1;
        this.final_2 = final_2;
        this.campeao = campeao;


    }


    public void setAux_1(int aux_1) {
        this.aux_1 = aux_1;
    }

    public void setAux_2(int aux_2) {
        this.aux_2 = aux_2;
    }

    public void setAux_3(int aux_3) {
        this.aux_3 = aux_3;
    }

    public void setAux_4(int aux_4) {
        this.aux_4 = aux_4;
    }

    public int getParcial_1() {
        return parcial_1;
    }

    public void soma() {
        parcial_1 = aux_1 + aux_2 + aux_3 + aux_4;
        final_1 = parcial_1;
    }

    public void setAux_1_2(int aux_1_2) {
        this.aux_1_2 = aux_1_2;
    }

    public void setAux_2_2(int aux_2_2) {
        this.aux_2_2 = aux_2_2;
    }

    public void setAux_3_2(int aux_3_2) {
        this.aux_3_2 = aux_3_2;
    }

    public void setAux_4_2(int aux_4_2) {
        this.aux_4_2 = aux_4_2;
    }

    public int getParcial_2() {
        return parcial_2;
    }
    public void soma_2(){
        parcial_2 = aux_1_2 + aux_2_2 + aux_3_2 + aux_4_2;
        final_2 = parcial_2;
    }

    public int getFinal_1() {
        return final_1;
    }

    public int getCampeao() {
        return campeao;
    }

    public void setFinal_1(int final_1) {
        this.final_1 = final_1;
    }

    public int getFinal_2() {
        return final_2;
    }

    public void setFinal_2(int final_2) {
        this.final_2 = final_2;
    }
}

