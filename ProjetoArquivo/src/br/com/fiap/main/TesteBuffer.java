package br.com.fiap.main;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class TesteBuffer {

	public static void main(String[] args) throws FileNotFoundException {
		String caminho = "D:\\Projeto\\teste.txt";
		FileReader lerArquivo = new FileReader(caminho);
		JOptionPane.showInputDialog(lerArquivo);

	}

}
