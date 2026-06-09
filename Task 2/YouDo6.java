
// Base class
class Applet {
    public void launch() {
        System.out.println("Applet launched");
    }
}

// Derived class
class GameApplet extends Applet {
    public void play() {
        System.out.println("Playing game");
    }
}

// Main class
public class Main6 {
    public static void main(String[] args) {
        GameApplet game = new GameApplet();

        // Call inherited method
        game.launch();

        // Call derived class method
        game.play();
    }
}
