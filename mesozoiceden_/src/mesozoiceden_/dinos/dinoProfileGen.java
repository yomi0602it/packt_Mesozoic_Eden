package mesozoiceden_.dinos;

public class dinoProfileGen {
//Instance Variables
        static String name;
        String breed;
        double height;
        double length;
        double weight;
        int age;
        static boolean carnivore;

        int numDinos;
        double yearlyCost;

    //Constructors
        public dinoProfileGen(String name, String breed, double height, double length, double weight, int age, boolean carnivore) {
            this.name = name;
            this.breed = breed;
            this.height = height;
            this.length = length;
            this.weight = weight;
            this.age = age;
            this.carnivore = carnivore;

            numDinos ++;
        }

        public dinoProfileGen() {

        }
    //Methods

        public String getName() {
            return name;
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

        /* public static void isCarnivore() {
            String is = carnivore ? " is a carnivore!" : " is not a carnivore!";
            System.out.println(name + is);           
        }
        */
        

        public String dinoName() { //First lettter of name + breed + dinoNumber
            return null;
        }

        //"Meet [Name], a [Age]-year-old [Species]. As a [Diet], it has a robust weight of [Weight] kilograms.".

        //Create array of Dinos for inventory
        //Create array of Breeds with height/weight/length generator speciesGenerator()
    
}
