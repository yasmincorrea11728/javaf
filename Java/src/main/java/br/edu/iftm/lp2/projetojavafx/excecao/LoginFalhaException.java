package br.edu.iftm.lp2.projetojavafx.excecao;

public class LoginFalhaException extends Exception{

    public LoginFalhaException() {
        super("Errou a senha ou usuario");
    }

}
