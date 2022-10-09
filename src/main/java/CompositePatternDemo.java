public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee mainBoss = new Employee("Oleksandra Hryshchenko", "Board of directors", 1000000, 1);

        Employee managerBoss = new Employee("Vladislav Bondar", "Board of directors", 500000, mainBoss.getID());
        Employee salesBoss = new Employee("Ilya Piskuryov", "Board of directors", 500000, mainBoss.getID());
        mainBoss.add(managerBoss);
        mainBoss.add(salesBoss);

        Employee manager1 = new Employee("Dmitriy Bondarev", "Management", 10000, managerBoss.getID());
        Employee manager2 = new Employee("Volodimir Shishkin", "Management", 10000, managerBoss.getID());
        managerBoss.add(manager1);
        managerBoss.add(manager2);

        Employee salesman1 = new Employee("Stanislav Borshch", "Sales", 5000, salesBoss.getID());
        Employee salesman2 = new Employee("Grigoriy Pivovarow", "Sales", 5000, salesBoss.getID());
        salesBoss.add(salesman1);
        salesBoss.add(salesman2);

        System.out.println(mainBoss.toString());
        for(Employee bossEmployee : mainBoss.getSubordinates()) {
            System.out.println(bossEmployee.toString());
            for(Employee simpleEmployee : bossEmployee.getSubordinates()) {
                System.out.println(simpleEmployee.toString());
            }
        }

        System.out.println();
        mainBoss.remove(managerBoss);
        System.out.println("His department was hired with him :(");
        /* manager1 = new Employee("Dmitriy Bondarev", "Management", 10000, mainBoss.getID()); // if you want not to hire all department with their boss
        manager2 = new Employee("Volodimir Shishkin", "Management", 10000, mainBoss.getID());
        mainBoss.add(manager1);
        mainBoss.add(manager2); */
        System.out.println(mainBoss.toString());
        for(Employee bossEmployee : mainBoss.getSubordinates()) {
            System.out.println(bossEmployee.toString());
            for(Employee simpleEmployee : bossEmployee.getSubordinates()) {
                System.out.println(simpleEmployee.toString());
            }
        }
    }
}
