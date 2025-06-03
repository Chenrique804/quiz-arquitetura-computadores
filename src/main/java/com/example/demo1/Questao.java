package com.example.demo1;

import java.util.Scanner;

public class Questao {
    String pergunta = "";
    String opcaoA = "";
    String opcaoB = "";
    String opcaoC = "";
    String opcaoD = "";
    String opcaoE = "";
    String correta = "";

    public boolean isCorreta(String resposta){
        if(resposta.equalsIgnoreCase(this.correta)){
            System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
            System.out.println();
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println();
            return false;
        }
    }

    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    private boolean respostaValida(String resp){
        if(resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")){
            return true;
        }
        System.out.println("Resposta inválida! Digite opção A, B, C, D ou E.");
        System.out.println();
        return false;
    }

    public void escrevaQuestao(){
        System.out.println(this.pergunta);
        System.out.println();
        System.out.println("A) " + this.opcaoA);
        System.out.println("B) " + this.opcaoB);
        System.out.println("C) " + this.opcaoC);
        System.out.println("D) " + this.opcaoD);
        System.out.println("E) " + this.opcaoE);
        System.out.println();
    }

    public static void main(String[] args) {
        Questao[] questoes = new Questao[15];

        // Perguntas sobre o reino animal
        questoes[0] = new Questao();
        questoes[0].pergunta = "Questão 1 - Qual desses animais é o maior mamífero terrestre?";
        questoes[0].opcaoA = "Elefante Africano";
        questoes[0].opcaoB = "Girafa";
        questoes[0].opcaoC = "Búfalo";
        questoes[0].opcaoD = "Rinoceronte";
        questoes[0].opcaoE = "Hipopótamo";
        questoes[0].correta = "A";

        questoes[1] = new Questao();
        questoes[1].pergunta = "Questão 2 - Qual é o maior animal do planeta?";
        questoes[1].opcaoA = "Tubarão-baleia";
        questoes[1].opcaoB = "Orca";
        questoes[1].opcaoC = "Baleia-azul";
        questoes[1].opcaoD = "Cachalote";
        questoes[1].opcaoE = "Manta gigante";
        questoes[1].correta = "C";

        questoes[2] = new Questao();
        questoes[2].pergunta = "Questão 3 - Qual é o animal mais rápido do mundo?";
        questoes[2].opcaoA = "Guepardo";
        questoes[2].opcaoB = "Águia";
        questoes[2].opcaoC = "Leão";
        questoes[2].opcaoD = "Falcão peregrino";
        questoes[2].opcaoE = "Antílope";
        questoes[2].correta = "A";

        questoes[3] = new Questao();
        questoes[3].pergunta = "Questão 4 - Qual desses animais é um mamífero marinho?";
        questoes[3].opcaoA = "Golfinho";
        questoes[3].opcaoB = "Tartaruga";
        questoes[3].opcaoC = "Peixe-boi";
        questoes[3].opcaoD = "Polvo";
        questoes[3].opcaoE = "Siri";
        questoes[3].correta = "A";

        questoes[4] = new Questao();
        questoes[4].pergunta = "Questão 5 - Qual animal é conhecido por ter uma memória excelente?";
        questoes[4].opcaoA = "Golfinho";
        questoes[4].opcaoB = "Elefante";
        questoes[4].opcaoC = "Corvo";
        questoes[4].opcaoD = "Cachorro";
        questoes[4].opcaoE = "Chimpanzé";
        questoes[4].correta = "B";

        questoes[5] = new Questao();
        questoes[5].pergunta = "Questão 6 - Qual animal é conhecido por migrar milhares de quilômetros?";
        questoes[5].opcaoA = "Búfalo";
        questoes[5].opcaoB = "Cervo";
        questoes[5].opcaoC = "Golfinho";
        questoes[5].opcaoD = "Andorinha";
        questoes[5].opcaoE = "Tubarão";
        questoes[5].correta = "D";

        questoes[6] = new Questao();
        questoes[6].pergunta = "Questão 7 - Qual animal tem a maior envergadura de asas?";
        questoes[6].opcaoA = "Águia";
        questoes[6].opcaoB = "Condor";
        questoes[6].opcaoC = "Cegonha";
        questoes[6].opcaoD = "Albatroz";
        questoes[6].opcaoE = "Falcão";
        questoes[6].correta = "B";

        questoes[7] = new Questao();
        questoes[7].pergunta = "Questão 8 - Qual desses animais é conhecido por sua habilidade de camuflagem?";
        questoes[7].opcaoA = "Camaleão";
        questoes[7].opcaoB = "Lince";
        questoes[7].opcaoC = "Leopardo";
        questoes[7].opcaoD = "Mantis religiosa";
        questoes[7].opcaoE = "Corvo";
        questoes[7].correta = "A";

        questoes[8] = new Questao();
        questoes[8].pergunta = "Questão 9 - Qual desses animais é considerado o rei da selva?";
        questoes[8].opcaoA = "Leão";
        questoes[8].opcaoB = "Tigre";
        questoes[8].opcaoC = "Lobo";
        questoes[8].opcaoD = "Onça";
        questoes[8].opcaoE = "Elefante";
        questoes[8].correta = "A";

        questoes[9] = new Questao();
        questoes[9].pergunta = "Questão 10 - Qual animal possui o maior cérebro em relação ao tamanho do corpo?";
        questoes[9].opcaoA = "Cachorro";
        questoes[9].opcaoB = "Orangotango";
        questoes[9].opcaoC = "Elefante";
        questoes[9].opcaoD = "Golfinho";
        questoes[9].opcaoE = "Baleia";
        questoes[9].correta = "D";

        questoes[10] = new Questao();
        questoes[10].pergunta = "Questão 11 - Qual é o maior réptil do mundo?";
        questoes[10].opcaoA = "Crocodilo de água salgada";
        questoes[10].opcaoB = "Anaconda";
        questoes[10].opcaoC = "Lagarto Komodo";
        questoes[10].opcaoD = "Tartaruga gigante";
        questoes[10].opcaoE = "Iguana";
        questoes[10].correta = "A";

        questoes[11] = new Questao();
        questoes[11].pergunta = "Questão 12 - Qual animal é o símbolo da paz?";
        questoes[11].opcaoA = "Coração";
        questoes[11].opcaoB = "Pombo";
        questoes[11].opcaoC = "Coelho";
        questoes[11].opcaoD = "Girafa";
        questoes[11].opcaoE = "Dromedário";
        questoes[11].correta = "B";

        questoes[12] = new Questao();
        questoes[12].pergunta = "Questão 13 - Qual desses animais é conhecido por sua habilidade de voar para trás?";
        questoes[12].opcaoA = "Beija-flor";
        questoes[12].opcaoB = "Andorinha";
        questoes[12].opcaoC = "Pica-pau";
        questoes[12].opcaoD = "Águia";
        questoes[12].opcaoE = "Corvo";
        questoes[12].correta = "A";

        questoes[13] = new Questao();
        questoes[13].pergunta = "Questão 14 - Qual é o animal mais pesado do mundo?";
        questoes[13].opcaoA = "Baleia-azul";
        questoes[13].opcaoB = "Elefante Africano";
        questoes[13].opcaoC = "Tubarão-baleia";
        questoes[13].opcaoD = "Girafa";
        questoes[13].opcaoE = "Cachalote";
        questoes[13].correta = "A";

        questoes[14] = new Questao();
        questoes[14].pergunta = "Questão 15 - Qual desses animais é capaz de produzir eletricidade?";
        questoes[14].opcaoA = "Anguila elétrica";
        questoes[14].opcaoB = "Raia";
        questoes[14].opcaoC = "Tubarão";
        questoes[14].opcaoD = "Salmão";
        questoes[14].opcaoE = "Camarão";
        questoes[14].correta = "A";

        // Ciclo para aplicar as questões
        new Scanner(System.in);
        int score = 0;
        for (int i = 0; i < 15; i++) {
            questoes[i].escrevaQuestao();
            String resposta = questoes[i].leiaResposta();
            if (questoes[i].isCorreta(resposta)) {
                score++;
            }
        }

        System.out.println("Você acertou " + score + " de 15 perguntas!");
    }
}