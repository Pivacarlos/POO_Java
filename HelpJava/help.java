import java.util.Scanner;

class help {
    public static void main (String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Help Java \n1 - Instrução IF Simples\n2 - Instrução IF com blocos de comandos\n3 - Instrução IF aninhado\n4 - Instrução SWITCH");
        System.out.println("Escolha uma opção:");
        int opcao = Ler.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("\n-> ESTRUTURA IF SIMPLES <-\n\nif (condicao)  instrucao;\nelse  instrucao;\n");
                break;
            case 2:
                System.out.println("-> ESTRUTURA IF COM BLOCOS DE COMANDOS <-\n\nif (condicao) { \n    instrucao1;\n    instrucao2; \n} else { \n    instrucao3; \n    instrucao4; \n}");
                break;
            case 3:
                System.out.println("-> ESTRUTURA IF ANINHADO <-\n\nif (condicao1) { \n  instrucao1; \n  instrucao2;\n} else if (condicao2) { \n    instrucao3; \n    instrucao4;\n} else { \n    instrucao5; \n}");
                break;
            case 4:
                System.out.println("-> ESTRUTURA SWITCH <-\n\nswitch (expressão) { \ncase constante1: \n instrucao1;\n instrucao2; \n break; \ncase costante2: \n instrucao3;\n instrucao4; \n break; \ndefault: \n instrucao5; \n}\n");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}