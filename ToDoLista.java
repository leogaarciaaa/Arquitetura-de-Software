import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoLista {
    private static List<String> lista = new ArrayList<String>();
    public static void main(String[] args) {
        int menu = -1;
        while (menu != 0) {
            menu = menu();
            switch (menu) {
            case 1:
                exibeLista();
                break;
            case 2:
                addItem();
                break;
            case 3:
                removeItem();
                break;
            case 0:
                break;
            default:
                System.out.println("Selecione uma operacao valida");
            }
        }
    }
    public static int menu() {
		int choice;
		Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("            Menu");
        System.out.println("|---------------------------");
        System.out.println("|0 - Sair do Programa");
        System.out.println("|1 - Exibir a Lista");
        System.out.println("|2 - Adicionar uma tarefa");
        System.out.println("|3 - Remover uma tarefa");
		System.out.println("|---------------------------");
        System.out.println();
        System.out.print("Insira sua escolha: ");
        choice = scanner.nextInt();
        return choice;
    }
    public static void exibeLista() {
        System.out.println();    
        System.out.println("Tarefas");
        System.out.println("|---------------------------");
        int n = 0;
        for (String item : lista) {
            System.out.println(++n + " " + item);
        }
        System.out.println("|---------------------------");
    }
    public static void addItem() {
        System.out.println("Adicionar tarefa");
        System.out.println("|---------------------------");
        System.out.print("Digite a tarefa: ");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        lista.add(item);
        exibeLista();
    }
    public static void removeItem() {
        System.out.println("Remover tarefa");
        System.out.println("|---------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecione o numero da tarefa que deseja excluir:");
        int index = scanner.nextInt();
        if((index-1)<0 || index>lista.size()) {
            System.out.println("Por favor, selecione um numero valido! "+lista.size());            
        }else {
            lista.remove(index-1);
        }
        System.out.println("|---------------------------");
        exibeLista();
    }
}