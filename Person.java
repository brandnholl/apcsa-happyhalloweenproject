public class Person {
    private String name;
    private String costume;
    private int piecesOfCandy;
    private int numHousesVisited;

    private int tricksPlayed;

    public Person(String name, String costume) {
        this.name = name;
        this.costume = costume;
        this.piecesOfCandy = 0;
        this.numHousesVisited = 0;
        this.tricksPlayed = 0;
    }

    public String getName() {
        return name;
    }

    public String getCostume() {
        return costume;
    }


    public int getPiecesOfCandy() {
        return piecesOfCandy;
    }

    public void addPiecesOfCandy(int piecesOfCandy) {
        this.piecesOfCandy += piecesOfCandy;
    }

    public int getTricksPlayed() {
        return tricksPlayed;
    }

    public void incrementTricksPlayed() {
        this.tricksPlayed++;
    }

    public int getNumHousesVisited() {
        return numHousesVisited;
    }

    public void visitHouse(House house) {
        if (house.isDecorated()) {
            addPiecesOfCandy(house.getTreatsPerTreater());
        } else {
            incrementTricksPlayed();
        }
    }

}
