package BorientacaoObjetos.Linterfaces.Test;

import BorientacaoObjetos.Linterfaces.Dominio.DataLoader;
import BorientacaoObjetos.Linterfaces.Dominio.DatabaseLoader;
import BorientacaoObjetos.Linterfaces.Dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
