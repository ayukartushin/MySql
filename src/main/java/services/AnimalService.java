package services;

import dao.AbsTable;
import dao.AnimalTable;
import dto.Animal;

import java.util.List;

public class AnimalService {
    private AnimalTable animalTable;
    //private AbsTable roomTable;

    public AnimalService(){
        animalTable = new AnimalTable();
    }

    public List<Animal> getAllAnimals(){
        return animalTable.findAll();
    }

}
