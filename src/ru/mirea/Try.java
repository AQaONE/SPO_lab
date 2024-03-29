package ru.mirea;

public class Try {

    public static void main(String[] args) {

        Lexer lexer = new Lexer("C:/Users/Пк/Input.txt");

        System.out.println("Lexical Analysis");
        System.out.println("-----------------");
        while (!lexer.isExausthed()) {
            System.out.printf("%-18s :  %s \n",lexer.currentLexema() , lexer.currentToken());
            lexer.moveAhead();
        }

        if (lexer.isSuccessful()) {
            System.out.println("Ok!");
        } else {
            System.out.println(lexer.errorMessage());
        }
    }
}
