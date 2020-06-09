public class DreamFactory {
    public static void main(String[] args) {
        Person person = new Person("Petyr");
        Person person1 = new Person("Pesho");
        Person person2 = new Person("Kiro");
        Person person3 = new Person("Georgi");
        Person person4 = new Person("Ivan");

        HeatManager machineFirst = new HeatEngine(21, 56, "green", person1);
        HeatManager machineSecond = new HeatEngine(23, 24, "white", person2);
        HeatManager machineThird = new HeatEngine(40, 53, "black", person3);
        HeatManager machineFourth = new WrapperEngine(32, 63, "purple", person2);
        HeatManager machineFifth = new WrapperEngine(23, 26, "yellow", person);
        HeatManager machineSixth = new WrapperEngine(12, 74, "gold", person4);
        Machine machineSeventh = new Engine(53, 76, "blue");
        Machine machineEighth = new ProductionEngine(23, 56, "silver");

        HeatManager[] heatManagers = {machineFirst, machineSecond, machineThird, machineFourth, machineFifth, machineSixth};

        for (int i = 0; i < heatManagers.length; i++) {
            System.out.println((i + 1) + "-а машина:  ");
            System.out.println("Максималната температура на машината е: " + heatManagers[i].getTemperature());
        }
        System.out.println("----------------------------------------------");
        Machine[] machines = {machineSeventh, machineEighth};

        for (int i = 0; i < machines.length; i++) {
            System.out.println((i + 1) + "-а машина:  ");
            System.out.println("Мощноста на машината е: " +machines[i].getPower());
        }
    }
}


