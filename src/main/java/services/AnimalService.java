package services;

import dao.AbsTable;
import dao.AnimalTable;
import dao.IAnimalTable;
import dto.Animal;
import factory.TablesFactory;

import java.util.List;

public class AnimalService {
    private IAnimalTable animalTable;
    //private AbsTable roomTable;

    public AnimalService(IAnimalTable iAnimalTable){
        animalTable = iAnimalTable;
    }

    public List<Animal> getAllAnimals(){
        return animalTable.findAll();
    }

}
