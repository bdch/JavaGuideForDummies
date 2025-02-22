package Solution.Levels;

public class Level_4 {

    class Earth {
        String name;
        double size;
        int population;

        public Earth(String name, double size, int population) {
            this.name = name;
            this.size = size;
            this.population = population;
        }

        public void addCountry(String countryName, int countryPopulation) {
            this.population += countryPopulation;
            System.out.println("The population of " + this.name + " is now " + this.population);
        }
    }
}
