package star

class Draw {

    String drawDate;

    int ballOne;

    int ballTwo;

    int ballThree;

    int ballFour;

    int ballFive;


    static constraints = {
    }

    @Override
    public String toString() {
        return "Draw{" +
                "drawDate='" + drawDate + '\'' +
                ", ballOne=" + ballOne +
                ", ballTwo=" + ballTwo +
                ", ballThree=" + ballThree +
                ", ballFour=" + ballFour +
                ", ballFive=" + ballFive +
                '}';
    }
}
