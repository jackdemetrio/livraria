// Classe DoublyLinkedList para implementar a lista duplamente ligada de livros
public class DoublyLinkedList {
    DoublyNode head, tail; // Início e fim da lista

    // Método para adicionar um livro no início da lista
    public void addAtStart(int id, String title, String author) {
        DoublyNode newNode = new DoublyNode(id, title, author);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Método para adicionar um livro no final da lista
    public void addAtEnd(int id, String title, String author) {
        DoublyNode newNode = new DoublyNode(id, title, author);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Método para remover o livro do início da lista
    public void removeAtStart() {
        if (head == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        System.out.println("Livro removido: ID " + head.id + ", Título: " + head.title);
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Método para remover o livro do final da lista
    public void removeAtEnd() {
        if (tail == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        System.out.println("Livro removido: ID " + tail.id + ", Título: " + tail.title);
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Método para buscar um livro por ID
    public void searchById(int id) {
        DoublyNode current = head;
        while (current != null) {
            if (current.id == id) {
                System.out.println("Livro encontrado: ID " + current.id + ", Título: " + current.title + ", Autor: " + current.author);
                return;
            }
            current = current.next;
        }
        System.out.println("Livro com ID " + id + " não encontrado.");
    }

    // Método para imprimir os livros na ordem original
    public void printOriginalOrder() {
        DoublyNode current = head;
        while (current != null) {
            System.out.println("ID: " + current.id + ", Título: " + current.title + ", Autor: " + current.author);
            current = current.next;
        }
    }

    // Método para imprimir os livros na ordem inversa
    public void printReverseOrder() {
        DoublyNode current = tail;
        while (current != null) {
            System.out.println("ID: " + current.id + ", Título: " + current.title + ", Autor: " + current.author);
            current = current.prev;
        }
    }
}
