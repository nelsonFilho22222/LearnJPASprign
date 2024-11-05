package com.nelson.MusicasApplication.principal;

import com.nelson.MusicasApplication.modelo.Artista;
import com.nelson.MusicasApplication.modelo.TipoArtista;
import com.nelson.MusicasApplication.repository.ArtistaRepository;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);

    private final ArtistaRepository repositorio;


   // public Principal() {}
    public Principal(ArtistaRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void exibeMenu() {

        var opcao = -1;

        while (opcao!= 9) {
            var menu = """
                *** Screen Sound Músicas ***
                                    
                1- Cadastrar artistas
                2- Cadastrar músicas
                3- Listar músicas
                4- Buscar músicas por artistas
                5- Pesquisar dados sobre um artista
                                
                9 - Sair
                """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArtistas();
                    break;
                case 2:
                    cadastrarMusicas();
                    break;
                case 3:
                    listarMusicas();
                    break;
                case 4:
                    buscarMusicasPorArtista();
                    break;
                case 5:
                    pesquisarDadosDoArtista();
                    break;
                case 9:
                    System.out.println("Encerrando a aplicação!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }


    private void pesquisarDadosDoArtista() {
    }

    private void buscarMusicasPorArtista() {

    }

    private void listarMusicas() {

    }

    private void cadastrarMusicas() {

    }

    private void cadastrarArtistas() {
        var novoCadastro = "S";
        while(novoCadastro.equalsIgnoreCase("S")) {
            System.out.println("Digite o NOME do artista: ");
            var nomeArtista = leitura.nextLine();
            System.out.println("Digite o TIPO do artista: ");
            var tipo = leitura.nextLine();
            TipoArtista tipoArtista = TipoArtista.valueOf(tipo.toUpperCase());
            Artista artista = new Artista(nomeArtista, tipoArtista);
            System.out.println("Deseja salvar o artista? S/N");
            novoCadastro = leitura.nextLine();
            if (novoCadastro.equalsIgnoreCase("S")) {
                repositorio.save(artista);
                System.out.println("Artista cadastrada com sucesso! \n ** S/N para continuar **");
                novoCadastro = leitura.nextLine();
            } else {
                System.out.println("Não foi salvo!! \n S/N para continuar ");
                novoCadastro = leitura.nextLine();

            }
        }

    }


}
