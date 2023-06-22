package journee_5_22_juin_2023.cours;

class Rectangle{
   double longueur;
   double largeur;
//   double surface;
//   double perimetre;

   double calculSurface(){
       return longueur*largeur;
   }

   double calculPerimetre(){
       return 2*(longueur+largeur);
   }
}
