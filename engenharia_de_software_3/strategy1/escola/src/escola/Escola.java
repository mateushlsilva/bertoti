package escola;

import nota.Nota;

import java.util.Scanner;

public class Escola {

    private Nota nota;

    public void setNota(Nota lancar){
        nota = lancar;
    }
    public void realizarNota(){
        nota.nota();
    }
}
