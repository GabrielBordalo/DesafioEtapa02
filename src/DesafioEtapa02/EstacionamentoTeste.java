package DesafioEtapa02;

import java.util.Scanner;

public class EstacionamentoTeste {

        public static void main(String[] args) {

            String operacao = "";
            Ticket ticket = new Ticket();

            Scanner entrada = new Scanner(System.in);

            while (!operacao.equalsIgnoreCase("E")) {

                System.out.println("A - Gerar ticket.  B - Pagar ticket. \n C - Ver saldo.  D - Status. \n E - Sair.");
                System.out.println("Selecione uma operação: ");
                operacao = entrada.next();


                if (operacao.equalsIgnoreCase("E")){
                    System.out.println("Encerrando...");
                    break;
                }

                switch (operacao.toUpperCase()){

                    case "A":
                        ticket.gerarTicket();

                        break;

                    case "B":
                        ticket.pagarTicket();

                        break;

                    case "C":
                        ticket.verSaldo();

                        break;

                    case "D":
                        ticket.status();

                        break;

                }
            }
            entrada.close();
        }
    }

