package solid.ocp;


public class Enemy extends Character {
    private PathPattern pathPattern;

    public Enemy(PathPattern pathPattern) {
        this.pathPattern = pathPattern;
    }
    
    @Override
    public void draw() {
        int x = pathPattern.nextX();
        int y = pathPattern.nextY();
    }
}
