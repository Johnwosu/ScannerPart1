
        void main() {
            //declare new variables:
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to our first project");
            //declare new variables:
            System.out.print("Enter the emp name: ");
            String empName = sc.nextLine();
            double salary = 1000;
            System.out.println("Enter your salary: ");
            double tax = 0.25;
            double netSalary = salary * (1 - tax);
            System.out.println("The net salary for: " + empName + " is: $" + netSalary);
        }
