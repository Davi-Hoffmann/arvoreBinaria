public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(70);
        arvore.inserir(80);
        arvore.inserir(60);

        System.out.println("Arvore em ordem:");
        arvore.percorrerEmOrdem();
        System.out.println(" ");
        System.out.println("-------------------------");
        System.out.println("Buscando o valor 40:");
        if (arvore.buscar(40)) {
            System.out.println("Valor encontrado");
        } else {
            System.out.println("Valor não encontrado");
        }
    }
}
