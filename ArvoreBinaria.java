class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    No inserirRecursivo(No raiz, int valor) {
        if (raiz == null) {
            raiz = new No(valor);
            return raiz;
        }

        if (valor < raiz.valor)
            raiz.esquerdo = inserirRecursivo(raiz.esquerdo, valor);
        else if (valor > raiz.valor)
            raiz.direito = inserirRecursivo(raiz.direito, valor);

        return raiz;
    }

    void percorrerEmOrdem() {
        percorrerEmOrdemRecursivo(raiz);
    }

    void percorrerEmOrdemRecursivo(No raiz) {
        if (raiz != null) {
            percorrerEmOrdemRecursivo(raiz.esquerdo);
            System.out.print(raiz.valor + " ");
            percorrerEmOrdemRecursivo(raiz.direito);
        }
    }

    boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor) != null;
    }

    No buscarRecursivo(No raiz, int valor) {
        if (raiz == null || raiz.valor == valor)
            return raiz;

        if (raiz.valor > valor)
            return buscarRecursivo(raiz.esquerdo, valor);

            return buscarRecursivo(raiz.direito, valor);
    }
}