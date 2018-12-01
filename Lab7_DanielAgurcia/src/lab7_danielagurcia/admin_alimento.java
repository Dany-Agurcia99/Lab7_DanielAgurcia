package lab7_danielagurcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class admin_alimento {

    ArrayList<Alimento> lista_alimentos = new ArrayList();
    File archivo;

    public ArrayList<Alimento> getLista_alimentos() {
        return lista_alimentos;
    }

    public void setLista_alimentos(ArrayList<Alimento> lista_alimentos) {
        this.lista_alimentos = lista_alimentos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public admin_alimento(String path) {
        archivo = new File(path);
    }

    public void setAlimento(Alimento a) {
        this.lista_alimentos.add(a);
    }

    public void cargarArchivo() {
        lista_alimentos = new ArrayList();
        Alimento temp;
        try {
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Alimento) objeto.readObject()) != null) {
                        lista_alimentos.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Alimento a : lista_alimentos) {
                bw.writeObject(a);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
