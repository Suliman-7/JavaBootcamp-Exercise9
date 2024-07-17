//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Book b1 = new Book("Ali","return",100);

        Movie m2 = new Movie("Ali","return",100);

        System.out.println(b1.getDiscount());

        System.out.println(m2.getDiscount());

        System.out.println(b1.getPrice());

        System.out.println(m2.getPrice());



//        b2.setName("Walk");

//        System.out.println(b2.getName());

        MovablePoint mp1 = new MovablePoint(1,2,3,4);

        mp1.moveUp();

        System.out.println(mp1.getY());

        mp1.moveDown();

        System.out.println(mp1.getY());

        mp1.moveRight();

        System.out.println(mp1.getX());

        mp1.moveLeft();

        System.out.println(mp1.getX());




    }
}