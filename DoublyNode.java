// Classe DoublyNode representa um nó em uma lista duplamente ligada
public class DoublyNode {
    int id; // ID do livro
    String title; // Título do livro
    String author; // Autor do livro
    DoublyNode prev; // Nó anterior na lista
    DoublyNode next; // Próximo nó na lista

    // Construtor do nó
    public DoublyNode(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.prev = null;
        this.next = null;
    }
}
