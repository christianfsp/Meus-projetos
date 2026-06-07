package org.example;
import java.util.Scanner;

import java.util.Random;

class Main {    public static void main(String[] args) {

    Scanner user = new Scanner(System.in);

    System.out.println("-----PEDRA, PAPEL E TESOURA-----");

    System.out.println("ESCOLHA UM NUMERO: 1-PEDRA, 2-PAPEL, 3 TESOURA ");

    int maoUser = user.nextInt();

    Random escsystem = new Random(); //escolha do sistema

    int[] opcoes = {1, 2, 3};

    int indice = escsystem.nextInt(opcoes.length);

    int escolha = opcoes[indice];

    System.out.println("---Escolha do sistema:---");

    if (escolha==1){

        System.out.println("1 - PEDRA");

    }else if(escolha==2){

        System.out.println("2 - PAPEL");

    }else if(escolha == 3){

        System.out.println("3 - TESOURA");

    }

    if(maoUser < 1 || maoUser > 3){
        System.out.println("Digite um numero valido");
        return; // encerra o programa aqui
    }else{

        if (maoUser==escolha){

            System.out.println("empate");

        }else if(maoUser==1 && escolha==2){

            System.out.println("perdeu");

        }else if(maoUser==1 && escolha==3){

            System.out.println("venceu");

        }else if(maoUser==2 && escolha==1){

            System.out.println("venceu");

        }else if(maoUser==2 && escolha==3){

            System.out.println("perdeu");

        }else if(maoUser==3 && escolha==1){

            System.out.println("perdeu");

        }else if(maoUser==3 && escolha==2){

            System.out.println("venceu");

        }
    }

}

}