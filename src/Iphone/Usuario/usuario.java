package Iphone.Usuario;

import java.util.Scanner;

import Iphone.Aple.Aple;
import Iphone.Discador.Discar;
import Iphone.ReprodutorDeMusica.ReprodutorDeMusica;

public class usuario {
    public static void main(String[] args) {
      Aple em = new Aple();
      
      Scanner scanner = new Scanner(System.in);

      Discar Discar = em ;
      ReprodutorDeMusica ReprodutorDeMusica = em ;
      Iphone.Navegador.Safari Safari = em;

      ReprodutorDeMusica.tocar();
      ReprodutorDeMusica.pausar();
      ReprodutorDeMusica.SelecionarMusica();

      Discar.Ligar();
      Discar.Atender();
      Discar.IniciarCorreioDeVoz();

      Safari.AdicionarNovaAba();
      Safari.AtualizarPagina();
      Safari.ExibirPagina();

      


    }
}
