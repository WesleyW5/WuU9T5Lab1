import java.util.ArrayList;
public class Vet {

    private String name;
    private ArrayList<Animal> animals;

    public Vet(String name){
        this.name = name;
        this.animals = new ArrayList();
    }

    public void addClient(Animal a){
      if(!animals.contains(a)){
          animals.add(a);
          System.out.println("Welcome to " + name + "'s office " + a.getName() + "!");
      } else {
          System.out.println(a.getName() + " is already a client of " + name);
      }
    }
}
