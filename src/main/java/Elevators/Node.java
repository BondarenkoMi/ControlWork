package Elevators;

public class Node {
    public Elevator elevator;
    Node next;

    public Node(Elevator elevator) {
        this.elevator = elevator;
    }

    public Status getElevatorStatus() {
        return this.elevator.status;
    }

    public Type getElevatorType() {
        return this.elevator.type;
    }
}
