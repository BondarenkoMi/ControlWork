package Elevators;

public class Elevators implements Available, Call {
    Node root;
    Node current;


    private static void print() {
        System.out.println("Лифт скоро приедет");
    }

    @Override
    public Elevator free(Type type) throws ElevatorFullException {

        try {
            if (root == null) {
                throw new ElevatorFullException("Лифтов нет");
            } else if (root.getElevatorStatus() == Status.FREE && root.getElevatorType() == type) {
                root.elevator.status = Status.BUSY;
            } else {
                Node nowCurrent = root.next;
                while (nowCurrent != root) {
                    if (nowCurrent.getElevatorStatus() == Status.FREE && nowCurrent.getElevatorType() == type) {
                        nowCurrent.elevator.status = Status.BUSY;
                        return nowCurrent.elevator;
                    }
                    nowCurrent = nowCurrent.next;
                }
                throw new ElevatorFullException("Нет подходящих лифтов");
            }
        } catch (ElevatorFullException e) {
            System.out.println(e.getMessage());
            return null;
        } catch (Exception e) {
            System.out.println("Error");
            return null;
        }
        return null;
    }

    public void callElevator(Type type) throws ElevatorFullException {
        if (free(type) != null) {
            print();

        }

    }

    public void add(Elevator elevator) {
        if (root == null) {
            root = new Node(elevator);
            current = root;
            root.next = current;

        } else {
            current.next = new Node(elevator);
            current = current.next;
            current.next = root;
        }

    }
}
