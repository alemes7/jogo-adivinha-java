import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        while (x == 0){
        Random_A valor = new Random_A();
        String menu = JOptionPane.showInputDialog(null, "Seja bem vindo ao jogo de adivinhação!\n[1] - Jogar\n[2] - Sair\nEscolha sua opção: ");

        int menus = Integer.parseInt(menu);
        int s = valor.valor_aleatorio();

            switch (menus) {
                case 1 -> {
                    int cont = 1;
                    JOptionPane.showMessageDialog(null, """
                            Você escolheu jogar!
                            Escolha um número de 1 a 100.
                            Lembre-se, você tem apenas 5 chances para acertar esse número.
                            Caso você erre todas as 5 chances,
                            será sorteado outro número aleatorio com mais 5 chances.""");
                    while (cont < 6) {
                        int escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Tentativa "+cont +
                                " - Digite um número: "));

                        if (escolha == s) {
                            JOptionPane.showMessageDialog(null, "WOOOWWWW, VOCÊ ACERTOU!!");
                            break;
                        } else if (escolha > s) {
                            JOptionPane.showMessageDialog(null, "Resposta errada, digite um número menor que " + escolha);
                        } else {
                            JOptionPane.showMessageDialog(null, "Resposta errada, digite um número maior que " + escolha);
                        }
                        cont++;
                    }
                    if (cont == 5) {
                        JOptionPane.showMessageDialog(null, "Você fez 5 tentativas, tente novamente.\nResposta certa: " + s);
                    }
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, "Obrigado por jogar. Até a proxima!");
                    x = 1;
                }
                default -> JOptionPane.showMessageDialog(null, "valor incorreto");
            }
        }
    }
}