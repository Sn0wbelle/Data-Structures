import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Lab 2 - Lists, Stacks, and Queues
// Your Name: Shaundra Nieves

public class Main {
  public static void main(String[] args) {
    Lab2 lab = new Lab2();
    lab.linkedList();
    lab.queue();
    lab.stack();
  }
}

class Lab2 {
  public void linkedList() {
    // 1. Create a LinkedList<String> object called progLanguages
    LinkedList<String> progLanguages = new LinkedList<>();

    // 2. Add elements to progLanguages: "Java", "Python", "JavaScript", "C++"
    progLanguages.add("Java");
    progLanguages.add("Python");
    progLanguages.add("JavaScript");
    progLanguages.add("C++");

    // 3. Remove the element "C++" from the list using .remove()
    progLanguages.remove("C++");

    // 4. Add an element "HTML" at index 2.
    progLanguages.add(2, "HTML");

    // 5. Iterate over progLanguages and use println() to output each element.
    //    You must create an Iterator<string> and use hasNext(), and next()
    Iterator<String> iterator = progLanguages.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
  
  public void queue() {
    // 6. Create a Queue<String> called q
    Queue<String> q = new LinkedList<>();

    // 7. Add 5 first names to q.
    q.add("John");
    q.add("Maria");
    q.add("Alex");
    q.add("Sophie");
    q.add("Daniel");

    // 8. Uncomment the following line: System.out.println("Elements of queue: " + q);
    System.out.println("Elements of queue: " + q);

    // 9. Remove the head of the queue and assign it to a String variable removedElement.
    //    Display the value of "Removed element: " + removedElement
    String removedElement = q.remove();
    System.out.println("Removed element: " + removedElement);

    // 10. View the head of the queue using peek(). Output it's value.
    System.out.println("Head of queue: " + q.peek());

    // 11. Using for(String element : q), output all of the values in the queue
    for (String element : q) {
      System.out.println(element);
    }
  }

  public void stack() {
    // 13. Create a Stack<String> called bookStack
    Stack<String> bookStack = new Stack<>();

    // 14. Push the following book titles onto bookStack:
    //     "Clean Code", "Design Patterns", "Pragmatic Programmer"
    bookStack.push("Clean Code");
    bookStack.push("Design Patterns");
    bookStack.push("Pragmatic Programmer");

    // 15. pop() 1 book off the stack. Display it's value
    String poppedBook = bookStack.pop();
    System.out.println("Popped book: " + poppedBook);

    // 16. Use the peek() method to view the top book on the stack
    System.out.println("Top book: " + bookStack.peek());

    // 17. push() "Web DB Technologies" onto the stack
    bookStack.push("Web DB Technologies");

    // 18. Use the peek() method to view the top book on the stack
    System.out.println("Top book after push: " + bookStack.peek());

    // 19. Search for "Design Patterns" in the stack. Display the results of the search.
    System.out.println("Position of 'Design Patterns': " + bookStack.search("Design Patterns"));

    // 20. Call empty(). Output the results
    System.out.println("Is stack empty? " + bookStack.empty());

    // 21. Print the titles of all of the books on the stack
    for (String book : bookStack) {
      System.out.println(book);
    }
  }
}
