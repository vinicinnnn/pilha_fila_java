//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        System.out.println("Adicionando: " + fila.adicionar("Abelha"));
        System.out.println("Adicionando: " + fila.adicionar("bernardo"));
        System.out.println("Adicionando: " + fila.adicionar("Casa"));
        System.out.println("Adicionando: " + fila.adicionar("Dragrão"));
        System.out.println("Adicionando: " + fila.adicionar("Enzo"));

        System.out.println("A fila está vazia? " +fila.estaVazia());

        System.out.println("Primeiro elemento da fila: " + fila.primeiro());
        System.out.println("Tamanho da fila " + fila.tamnho());

        while (!fila.estaVazia()){
            System.out.println("Removendo da fila: " + fila.remover());
        }

        System.out.println("A fila está vazia? " +fila.estaVazia());

        //Testando Pilha
        Pilha pilha = new Pilha(5);
        System.out.println();

        System.out.println("Adicionando: " + pilha.empilhar("Fabio"));
        System.out.println("Adicionando: " + pilha.empilhar("Geraldo"));
        System.out.println("Adicionando: " + pilha.empilhar("Helicopitêro"));
        System.out.println("Adicionando: " + pilha.empilhar("I-Pajé"));

        System.out.println("A fila está vazia? " +pilha.estaVazia());

        System.out.println("Topo: " + pilha.topo());
        System.out.println("Tamanho da Pilha " + pilha.tamanho());

        while (!pilha.estaVazia()){
            System.out.println("Removendo da Pilha: " + pilha.desempilhar());
        }

        System.out.println("A Pilha está vazia? " +pilha.estaVazia());

        System.out.println("acabou");
    }
}
