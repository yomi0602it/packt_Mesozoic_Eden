package MesozoicEden.src.Dinosaurs;

public class dinoProfileGenerator {

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
        public dinoProfileGenerator(String name, String breed, double height, double length, double weight, int age, boolean carnivore) {
            this.name = name;
            this.breed = breed;
            this.height = height;
            this.length = length;
            this.weight = weight;
            this.age = age;
            this.carnivore = carnivore;

            numDinos ++;
        }

        public dinoProfileGenerator() {

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

        public static void isCarnivore() {
            String is = carnivore ? " is a carnivore!" : " is not a carnivore!";
            System.out.println(name + is);           
        }

        

        public String dinoName() { //First lettter of name + breed + dinoNumber
            return null;
        }

        //Create array of Dinos for inventory
        //Create array of Breeds with height/weight/length generator Breeds()
    
}
