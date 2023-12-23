package Elevators;

public class Main {
    public static void main(String[] args) throws ElevatorFullException {

        Elevators elevators = new Elevators(); // Создание списка лифтов

        elevators.add(new EvenElevator()); // Создаем лифты для чётных этажей
        elevators.add(new EvenElevator());
        elevators.add(new EvenElevator());

        elevators.add(new NonEvenElevator()); // Создаем лифты для нечётных этажей
        elevators.add(new NonEvenElevator());
        elevators.add(new NonEvenElevator());

        elevators.add(new EmployeeElevator()); // Создаем лифт для сотрудников

        for (int i = 0; i < 4; i++) {
            elevators.callElevator(Type.EVEN);
        }
        elevators.callElevator(Type.EMPLOYEE);
        elevators.callElevator(Type.NON_EVEN);

    }
}
