
class Quack{
 
        private static class StackNode{
            //instance variables
            Patient patient;
            StackNode nextNode;

            // Constructor for objects of class StackNode
            StackNode(Patient newPatient){
                patient = newPatient;
            }
        }

        // Instance variable for class Quack
        StackNode front = null;
        StackNode back = null;
        
        public void push(Patient newPatient){
            StackNode newNode = new StackNode(newPatient);
            if (front == null){
                front = newNode;
                back = newNode;
                front.nextNode = null;
            }
            else{
                newNode.nextNode = front;
                front = newNode;
            }
        }

        public Patient pop(){
            Patient returnedPatient;
            // ASSERT top points to the first free element on top of the stack
            returnedPatient = front.patient;
            front = front.nextNode;
            return(returnedPatient);                
        }
        
        public void add(Patient newPatient){
        	StackNode newNode = new StackNode(newPatient);
        	if(front == null){
        		back = newNode;
        		front = newNode;
        		front.nextNode = null;
        	}
        	else{
        		back.nextNode = newNode;
        		back = newNode;
        	}
        }
        public Boolean isEmpty(){
            if (front == null)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        
        public void print(){
            if (front == null){
                System.out.println("The stack is empty!");
                System.out.println();
            }
            else {
                StackNode temp = front;
                System.out.println("Current stack contents");
                System.out.println();
                while (temp != null) {
                    System.out.println("     " + temp.patient.getId() + " " 
                        + temp.patient.getPriority());
                    temp = temp.nextNode;
                }
                System.out.println();                
            }
        }
    }
