package com.codewithadolfo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GerenciadorArquivo {
    private String nomeArquivo;

    // Construtor
    public GerenciadorArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    // Método para salvar o resultado no arquivo
    public void salvarResultado(double valorgerado) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
            writer.write("Resultado da soma: " + valorgerado);
            writer.newLine();
            System.out.println("Resultado salvo em " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}