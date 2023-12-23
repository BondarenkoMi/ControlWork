package Elevators;

public interface Available {
    Elevator free(Type type) throws ElevatorFullException;
}
