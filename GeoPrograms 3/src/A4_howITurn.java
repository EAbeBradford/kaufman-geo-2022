

public class A4_howITurn extends World {

    public void square(){
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(200, 0, 0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(100);
    }
    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        house();
plane.teleport(800, 631);
//        plane.turn(180);
//        plane.isTrail = false;
//        plane.move(200);

        house();
    }

    public void tri(){
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth =12;
        plane.move(100);
        plane.turn(120);
        plane.move(100);
        plane.turn(120);
        plane.move(100);
        plane.turn(120);

    }

    public void house() {
        tri();
        square();
    }
}
