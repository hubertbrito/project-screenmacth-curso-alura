package br.com.alura.screenmatch.service;

public interface IconverteDados {

    <T> T obtendoEConvertendoDados(String json, Class<T> classe);
}
