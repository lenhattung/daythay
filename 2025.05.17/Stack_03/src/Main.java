public class Main {
    public static void main(String[] args) {
        // Creating books to use with our stack
        Book b1 = new Book(01, "LT Java", "Le Nhat Tung", 10000);
        Book b2 = new Book(02, "Data Structures", "Robert Lafore", 15000);
        Book b3 = new Book(03, "Clean Code", "Robert Martin", 12000);
        Book b4 = new Book(04, "Effective Java", "Joshua Bloch", 13500);
        
        // Creating a stack and performing operations
        MyStack stack = new MyStack();
        
        // Push operations
        System.out.println("Pushing books onto the stack:");
        stack.push(b1);
        stack.push(b2);
        stack.push(b3);
        
        stack.push(new Integer(3));
        
        // Display the stack
        System.out.println("\nDisplaying the stack:");
        stack.display();
        
        // Peek operation
        System.out.println("\nPeeking at the top element:");
        Book topBook = (Book) stack.peek();
        if (topBook != null) {
            System.out.println("Top book: " + topBook.getTitle() + " by " + topBook.getAuthor());
        }
        
        // Pop operation
        System.out.println("\nPopping a book from the stack:");
        Book poppedBook = (Book) stack.pop();
        if (poppedBook != null) {
            System.out.println("Popped book: " + poppedBook.getTitle() + " by " + poppedBook.getAuthor());
        }
        
        // Display the stack after pop
        System.out.println("\nDisplaying the stack after pop:");
        stack.display();
        
        // Push another book
        System.out.println("\nPushing another book:");
        stack.push(b4);
        
        // Display the stack after new push
        System.out.println("\nDisplaying the stack after new push:");
        stack.display();
        
        // Pop all remaining books
        System.out.println("\nPopping all remaining books:");
        while (!stack.isEmpty()) {
            Book book = (Book) stack.pop();
            System.out.println("Popped: " + book.getTitle());
        }
        
        // Check if stack is empty
        System.out.println("\nIs stack empty? " + stack.isEmpty());
        
        // Try to peek on empty stack
        System.out.println("\nTrying to peek on empty stack:");
        Book emptyPeek = (Book) stack.peek();
        if (emptyPeek == null) {
            System.out.println("Stack is empty, nothing to peek.");
        }
        
        // Try to pop from empty stack
        System.out.println("\nTrying to pop from empty stack:");
        Book emptyPop = (Book) stack.pop();
        if (emptyPop == null) {
            System.out.println("Stack is empty, nothing to pop.");
        }
    }
}