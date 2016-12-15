import java.io.IOException;

/**
 * Created by shiva on 12/13/16.
 */
public class LLRemoveDuplicates
{
    private static class Node
    {
        char value;
        Node next;
    }

    public static class LinkedList
    {
        Node head;

        public LinkedList()
        {
            head = null;
        }

        public void insert(char value)
        {
            if (head == null)
            {
                head = new Node();
                head.value = value;
                head.next = null;
            }
            else
            {
                Node newNode = new Node();
                newNode.value = value;
                newNode.next = null;
                Node node = head;
                while(node.next != null)
                {
                    node = node.next;
                }
                node.next = newNode;
            }
        }

        public void display()
        {
            Node node = head;
            while (node != null)
            {
                System.out.println(node.value);
                node = node.next;
            }
        }

        public void removeDuplicates()
        {
            char[] buffer = new char[257];
            if (head != null)
            {
                Node node = head;
                int index = node.value;
                buffer[index] = node.value;
                while (node != null && node.next != null)
                {
                    index = node.next.value;
                    if (buffer[index] == 0)
                    {
                        buffer[index] = node.next.value;
                        node = node.next;
                    }
                    else
                    {
                        node.next = node.next.next;
                    }
                }
            }
        }

        public void removeDuplicatesRunner()
        {
            Node headNode = head;
            while (headNode != null)
            {
                Node tailNode = headNode;
                while (tailNode.next != null)
                {
                    if (headNode.value == tailNode.next.value)
                    {
                        tailNode.next = tailNode.next.next;
                    }
                    else
                        tailNode = tailNode.next;
                }

                headNode = headNode.next;
            }
        }
    }

    public static void main(String[] args)
    {
        LinkedList linkedList = new LinkedList();
        int counter = 0;
        while (counter < 9)
        {
            try
            {
                System.out.println("Enter a value: ");
                char input = (char)System.in.read();
                char enterKey = (char)System.in.read();
                linkedList.insert(input);
                counter++;
            }
            catch (IOException e)
            {
                System.out.println("Error reading input!");
            }
        }

        System.out.println();
        linkedList.display();

        //linkedList.removeDuplicates();
        //System.out.println("After duplicates removal:");
        //linkedList.display();

        linkedList.removeDuplicatesRunner();
        System.out.println("After duplicates removal:");
        linkedList.display();
    }
}
