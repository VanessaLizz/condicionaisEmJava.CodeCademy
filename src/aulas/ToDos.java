package aulas;
import java.util.ArrayList;

class ToDos {

    public static void main(String[] args) {

        ArrayList<String> toDoList = new ArrayList<String>();
        String toDo1 = "Water plants";
        String toDo2 = "Water animals";
        String toDo3 = "Water insects";
        String toDo4 = "Earth insects";

        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);
        toDoList.add(toDo4);

        System.out.println(toDoList);

        ArrayList<String> sherlocksToDos = new ArrayList<String>();

        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");

        ArrayList<String> poirotsToDos = new ArrayList<String>();

        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all suspects together");
        poirotsToDos.add("reveal the truth of the crime");

        System.out.println(sherlocksToDos.size());
        System.out.println(poirotsToDos.size());
        System.out.println("Poirot");

        // Set each to-do below:
        sherlocksToDos.set(1, "listen to Dr. Watson for amusement");
        poirotsToDos.set(3, "listen to Captain Hastings for amusement");

        // Remove each to-do below:
        sherlocksToDos.remove("visit the crime scene");
        sherlocksToDos.remove("play violin");
        poirotsToDos.remove("visit the crime scene");

        //acessando um índice - get

        System.out.println(sherlocksToDos.get(2));
        System.out.println(poirotsToDos.get(1));

        // Calculate to-dos until case is solved:
        System.out.println(sherlocksToDos.indexOf("solve the case"));
    }
}