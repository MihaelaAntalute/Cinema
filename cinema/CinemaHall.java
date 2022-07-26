package cinema;

public class CinemaHall {
    private int numberOfRowls;
    private int numbersOfColons;
    private char[][] grid;

    public CinemaHall(int numberOfRowls, int numbersOfColons) {
        this.numberOfRowls = numberOfRowls;
        this.numbersOfColons = numbersOfColons;
        this.grid = new char[numberOfRowls][numbersOfColons];
    }

    public int getNumberOfRowls() {
        return numberOfRowls;
    }

    public void setNumberOfRowls(int numberOfRowls) {
        this.numberOfRowls = numberOfRowls;
    }

    public int getNumbersOfColons() {
        return numbersOfColons;
    }

    public void setNumbersOfColons(int numbersOfColons) {
        this.numbersOfColons = numbersOfColons;
    }

    public char[][] getGrid() {
        return grid;
    }

    public void setGrid(char[][] grid) {
        this.grid = grid;
    }

    public void initialGridWithEmptySeets(){
        for (int i = 0; i < numberOfRowls; i++) {
            for (int j = 0; j < numbersOfColons; j++) {
                grid[i] [j] = 'e';
            }

        }
    }

}
