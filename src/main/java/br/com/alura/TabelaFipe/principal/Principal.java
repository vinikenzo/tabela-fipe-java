package br.com.alura.TabelaFipe.principal;

import br.com.alura.TabelaFipe.service.ConsumoApi;

import java.util.Scanner;

public class Principal {
    private Scanner scanner = new Scanner(System.in);
    private final String URL = "https://parallelum.com.br/fipe/api/v1/";
    private ConsumoApi consumo = new ConsumoApi();

    public void exibeMenu(){
        var menu = """
                ***OPÇÕES***
                Carro
                Moto
                Caminhão
                
                
                Digite uma das opções para consultar: 
                """;

        System.out.println(menu);

        var opcao = scanner.nextLine();

        String endereco;

        if(opcao.toLowerCase().contains("carro")){
            endereco = URL + "carros/marcas";
        } else if (opcao.toLowerCase().contains("moto")) {
            endereco = URL + "motos/marcas";
        } else {
            endereco = URL + "caminhoes/marcas";
        }

        var json = consumo.obterDados(endereco);
        System.out.println(json);


    }
}
