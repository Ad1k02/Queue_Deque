import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Стек First in - Last out
        Deque<String> stack = new LinkedList<>();
        stack.push("6-Шестой");
        stack.push("5-Пятый");
        stack.push("4-Четвертый");
        stack.push("3-Третий");
        stack.push("2-Второй");
        stack.push("1-Первый");
        while(!stack.isEmpty()){
            System.out.println(stack.poll());
        }

        //Очередь First in - First out
        Queue<String> queue = new LinkedList<>();
        queue.add("7-Седьмой");
        queue.add("8-Восьмой");
        queue.add("9-Девятый");
        queue.add("10-Десятый");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}