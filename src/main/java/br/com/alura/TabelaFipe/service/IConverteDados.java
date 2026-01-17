package br.com.alura.TabelaFipe.service;

import java.util.List;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);

    <T> List<T> obterListas(String json, Class<T> classe);
}
