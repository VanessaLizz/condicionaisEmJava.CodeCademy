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

        System.out.println(toDoList);


    }

}