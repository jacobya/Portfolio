

/**
 *
 * @author Adam Jacoby
 */

    class Patient{
        // Instance variables for Patient objects
        private int id, priority;

        // Constructor for patient objects
        public Patient(int idNumber, int priorityNumber){
            id = idNumber;
            priority = priorityNumber;
        }

        public int getId(){
            return id;
        }

        public int getPriority(){
            return priority;
        }
    }