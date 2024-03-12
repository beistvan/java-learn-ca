public class MadLibs {
  /*
  Your description here:
  This program generates a mad libbed story.
  Author: István
  Date: 3/12/2024
  */
    public static void main(String[] args){
      String name1 = "John";

      String adjective1 = "good";
      String adjective2 = "nice";
      String adjective3 = "proud";

      String verb1 = "dance";

      String noun1 = "people";
      String noun2 = "beef";
      String noun3 = "music";
      String noun4 = "kid";
      String noun5 = "ice";
      String noun6 = "fire";

      String name2 = "Jack";

      int number = 10;

      String place1 = "London";
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}

