public class Robot {
    int x=0;
    int y=0;
    Direction direction = Direction.UP;

    Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;

    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        System.out.println("Counterclockwise rotation");
        if (direction == Direction.DOWN){
            this.direction = Direction.RIGHT;
            return;
        }

        if (direction == Direction.UP){
            this.direction = Direction.LEFT;
            return;
        }

        if (direction == Direction.LEFT){
            this.direction = Direction.DOWN;
            return;
        }

        if (direction == Direction.RIGHT){
            this.direction = Direction.UP;
            return;
        }
    }

    public void turnRight() {
        System.out.println("turn clockwise");
        if (this.direction == Direction.DOWN){
            System.out.println("down -> left");
            this.direction = Direction.LEFT;
            return;
        }

        if (this.direction == Direction.UP){
            System.out.println("up -> right");
            this.direction = Direction.RIGHT;
            return;
        }

        if (this.direction == Direction.LEFT){
            System.out.println("left -> up");
            this.direction = Direction.UP;
            return;
        }

        if (this.direction == Direction.RIGHT){
            System.out.println("right -> down");
            this.direction = Direction.DOWN;
            return;
        }
    }

    public void stepForward() {
        System.out.println("move");
        if (direction == Direction.DOWN){
            System.out.println("down");
            this.y--;
        }

        if (direction == Direction.UP){
            System.out.println("up");
            this.y++;
        }

        if (direction == Direction.LEFT){
            System.out.println("left");
            this.x--;
        }

        if (direction == Direction.RIGHT){
            System.out.println("right");
            this.x++;
        }
    }

    //My cod:

    public static void moveRobot(Robot robot, int toX, int toY) {
        while (toX != robot.getX()) {
            if (robot.getX() < toX) {
                while (robot.getDirection() != Direction.RIGHT){
                    robot.turnLeft();
                }
            }
            else if (robot.getX() > toX){
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            }
            robot.stepForward();
        }
        while (toY != robot.getY()) {
            if (robot.getY() < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
            }
            else if (robot.getY() > toY) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
            }
            robot.stepForward();
        }
        System.out.println(robot.getX() +" "+ robot.getY());
    }
}

