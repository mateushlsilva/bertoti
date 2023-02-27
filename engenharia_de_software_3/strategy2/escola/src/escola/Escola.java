package escola;

import nota.Nota;


public class Escola {

    private Nota nota;


    public void setNota(Nota lancar){
        nota = lancar;
    }
    public void realizarNota(){
        nota.nota();
    }
}
