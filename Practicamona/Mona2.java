package Practicamona;

public class Mona2 extends HerenciaMona{
       private String foodwear;

        public Mona2 (String name, String body, String face, String foodwear){
            super(name, body, face);
            this.foodwear = foodwear;

        }
        public String getFoodwear() {
            return foodwear;
        }

        @Override
        public String mostrarDatos(){

            return "Name: "+getName()+
                    "\nBody: "+getBody()+
                    "\nFace: "+getFace()+
                    "\nFoodwear: "+foodwear;
        }

   }
