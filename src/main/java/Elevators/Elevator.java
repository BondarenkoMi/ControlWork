package Elevators;

abstract class Elevator {
    protected Type type;    // Тип лифта
    protected Status status; // Статус лифта (занят, свободен)

    public Elevator(Type type) {
        this.type = type;
        this.status = Status.FREE; // При создании лифта он всегда свободен
    }

    public Status getElevatorStatus() {
        return this.status;
    }

    public Type getElevatorType() {
        return this.type;
    }
    public void changeCondition() {
        if (status == Status.BUSY) {
            status = Status.FREE;
        }
    }


}
