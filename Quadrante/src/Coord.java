public class Coord {
    private float x = 0f;
    private float y = 0f;

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void quadrante() {
        if (this.x == 0 && this.y == 0) {
            System.out.println("Origem");
        }
        else if (this.x == 0) {
            System.out.println("Eixo X");
        } 
        else if (this.y == 0) {
            System.out.println("Eixo Y");
        }
        else if (this.x > 0 && this.y > 0) {
            System.out.println("Q1");
        }
        else if (this.x < 0 && this.y > 0) {
            System.out.println("Q2");
        }
        else if (this.x < 0 && this.y < 0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }
    }
}
