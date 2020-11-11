public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(100);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        for (int i = 0; i < 90; i ++) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }

        System.out.println(gumballMachine);
    }
}
