package Project.common;

public class Player {

    private boolean isReady = false;

    public void setReady(boolean isReady) {
        this.isReady = isReady;
    }

    public boolean isReady() {
        return this.isReady;
    }


    private boolean isOut = false;

    public void setIsOut(boolean isOut) {
        this.isOut = isOut;
    }

    public boolean isOut() {
        return isOut;
    }

    private int points = 0;

    public void setPoints(int points) {
        this.points = points;
    }

    public void changePoints(int points) {
        this.points += points;
        if (this.points < 0) {
            this.points = 0;
        }
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Is ready: %s", isReady));
        return sb.toString();
    }
}