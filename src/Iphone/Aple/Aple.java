package Iphone.Aple;

import Iphone.Discador.Discar;
import Iphone.ReprodutorDeMusica.ReprodutorDeMusica;
import Iphone.Navegador.Safari;

public class Aple implements Discar, ReprodutorDeMusica , Safari {
    public void IniciarCorreioDeVoz(){
        System.out.println("Inciando correio de voz");
    }
    
    public void Atender(){
        System.out.println("Atendendo");
    }
    public void Ligar(){
        System.out.println("Discando");
    }

    public void tocar(){
        System.out.println("Reproduzindo musica");
    }

    public void pausar(){
        System.out.println("Reproduzindo musica");
    }

    public void SelecionarMusica(){
        System.out.println("Pausando musica");
    }

    public void ExibirPagina(){
        System.out.println("Exibindo pagina");
    }

    public void AdicionarNovaAba(){
        System.out.println("Adicinando nova aba");
    }

    public void AtualizarPagina(){
        System.out.println("Atualizando pagina");
    }


    

}
