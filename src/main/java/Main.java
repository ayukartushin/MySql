import dao.AbsTable;
import dao.AnimalTable;
import dto.Animal;
import services.AnimalService;
import utils.ConnectionManager;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        AnimalService service = new AnimalService();
        System.out.println(service.getAllAnimals());
    }
}