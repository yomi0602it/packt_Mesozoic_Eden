package mesozoiceden.dinos;

public class dinoProfileGen extends speciesGen{
//Instance Variables
        String dName;
        String breed;
        double height;
        double length;
        double weight;
        int age;
        static int dinoNumber;
        //speciesGen species;

        //static double yearlyCost;

    //Constructors
        public dinoProfileGen(String dName, String breed, double height, double length, double weight, int age, boolean carnivore) {
            this.dName = dName;
            this.breed = breed;
            this.height = height;
            this.length = length;
            this.weight = weight;
            this.age = age;
            this.carnivore = carnivore;
            //this.species = speciesGen(); //Assuming speciesGen is a class that generates species data

            dinoNumber ++;
            //yearlyCost = carnivore ? 5000.0 : 3000.0; //Carnivores are more expensive to feed and maintain
            //Create formula for yearlyCost based on weight, height, length, and age, species
            //yearlyCost = (weight * 0.1) + (height * 0.05) + (length * 0.03) + (age * 1000) + (carnivore ? 2000 : 1000);
            System.out.println("Dino Created: " + dName + " the " ); //Add breed and dinoNumber
        }

        public dinoProfileGen() {

        }
    //Methods

        public String getDName() {
            return dName;
        }

        public String getBreed() {
            return breed;
        }

        public double getHeight() {
            return height;
        }

        public double getLength() {
            return length;
        }

        public double getWeight() {
            return weight;
        }

        public int getAge() { //Add feature to concat Xyears + Ymonths
            return age;
        }
        

        public String dinoName() { //First lettter of name + breed + dinoNumber
            return null;
        }

        //"Meet [Name], a [Age]-year-old [Species]. As a [Diet], it has a robust weight of [Weight] kilograms.".

        //Create array of Dinos for inventory
        //Create array of Breeds with height/weight/length generator speciesGenerator()
    
}
