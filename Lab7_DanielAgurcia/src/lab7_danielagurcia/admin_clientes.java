package lab7_danielagurcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class admin_clientes {

    private ArrayList<Clientes> lista_clientes = new ArrayList();
    private File archivo = null;

    public admin_clientes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Clientes> getlista_clientes() {
        return lista_clientes;
    }

    public void setListaPersonas(ArrayList<Clientes> lista_clientes) {
        this.lista_clientes = lista_clientes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "admin_clientes{" + "listaPersonas=" + lista_clientes + ", archivo=" + archivo + '}';
    }

    //metodos extra
    public void setPersona(Clientes c) {
        this.lista_clientes.add(c);
    }

    public void cargarArchivo() {
        lista_clientes = new ArrayList();
        Clientes temp;
        try {
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Clientes) objeto.readObject()) != null) {
                        lista_clientes.add(temp);
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
            for (Clientes c : lista_clientes) {
                bw.writeObject(c);
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
