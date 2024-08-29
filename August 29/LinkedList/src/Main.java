public class Main {
    public static void main(String[] args){
        LinkedList myList = new LinkedList();
        myList.add(13);
        myList.add(15);
        myList.addAtBeginning(14);
        myList.add(20);
        myList.addAtBeginning(25);
        myList.printList();
        System.out.println(myList.searchList(13));
    }
}
