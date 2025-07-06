package mesozoiceden_.dinos;

public class speciesGen {
//Instance Variables
        static String name;
        double minWeight; double maxWeight;
        double minHeight; double maxHeight;
        double minLength; double maxLength;
        int lifeExpect;
        static boolean carnivore;
        /* Climate?
            Period
            etc */
            
    //Constructors
        public speciesGen(String name, double minWeight, double maxWeight, double minHeight, double maxHeight, double minLength, double maxLength, int lifeExpect, boolean carnivore) {
            this.name = name;
            this.minWeight = minWeight;
            this.maxWeight = maxWeight;
            this.minHeight = minHeight;
            this.maxHeight = maxHeight;
            this.minLength = minLength;
            this.maxLength = maxLength;
            this.lifeExpect = lifeExpect;
            this.carnivore = carnivore;
        }

        public speciesGen() {

        }

    //Methods
        
        public String getName() {return name;}
        public double getMinWeight() {return minWeight;}
        public double getMaxWeight() {return maxWeight;}
        public double getMinHeight() {return minHeight;}
        public double getMaxHeight() {return maxHeight;}
        public double getMinLength() {return minLength;}
        public double getMaxLength() {return maxLength;}
        public int getLife() {return lifeExpect;}
        public void isCarnivore() {
            String is = carnivore ? " is a carnivore!" : " is not a carnivore!"; //herbivore
            System.out.println(name + is); 
        }
}
