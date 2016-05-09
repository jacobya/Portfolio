import java.util.Scanner;

class StackLinkedList{
        /**
        * @param args the command line arguments
        */
        public static void main(String[] args) {
            int choice, id, priority;
            Patient patient;
            Boolean done = false;
            Quack stack = new Quack();
            Scanner keyboard = new Scanner(System.in);

            // This while statement continuously executes a loop that allows the
            // user to continuously test the stak implementation.
            // It is an example of how a class can be tested prior to its use in
            // a real program.
            while (!done) 
            {
                // Each time the loop starts, the user is presented with a menu with items for exercising
                // each method of clsss Stack2, in this case, push and pop. There is also a menu item for
                // terminating the loop.
                System.out.print("Enter 1 to push, 2 to pop, 3 to add,  4 to print, and 5 to quit: ");
                choice = keyboard.nextInt();
                System.out.println();

                //This switch statement selects the proper case for the menu choice made by the user.
                switch (choice)
                {
                case 1: // Exercise the push method of class Stack2
                    System.out.print("Enter the new patient's id and priority: ");
                    id = keyboard.nextInt(); priority = keyboard.nextInt();
                    patient = new Patient(id, priority);
                    stack.push(patient);
                    System.out.println();
                    break;
                case 2: // Exercise the pop method of class Stack2
                    if (stack.isEmpty()) {
                        System.out.println("Cannot pop; stack is empty!");
                    }
                    else{
                        patient = stack.pop();
                        System.out.println("The top patient on the stack had id " + patient.getId() 
                                + " and priority " + patient.getPriority());                          
                    }
                    System.out.println();
                    break;
                case 3:
                	System.out.print("Enter the new patient's id and priority: ");
                    id = keyboard.nextInt(); priority = keyboard.nextInt();
                    patient = new Patient(id, priority);
                    stack.add(patient);
                    System.out.println();
                    break;
                case 4: // Print the stack
                    stack.print();
                    break;
                case 5: // Set done to true so that the loop will end
                    done = true;
                    break;
                default: 
                    // This default clause handles the case that the user has typed in an integer
                    // that is not one of the valid choices
                    System.out.println("The number you entered, "+ choice + ", + is not 1, 2, or 3. Try again!");
                    System.out.println();
                    break;
                }
            }
            System.out.println("...quitting");
        }         
    }