public class Vetor {
    int[]vetor;
    public Vetor(int tamanho) {
       int[]Novovetor=new int[tamanho];
        vetor=Novovetor;

    }
    public void add(int dado){
        for (int i=0;i<vetor.length-1;i++){
            if (vetor[i]==0){
                vetor[i]=dado;
                break;
            }

        }

    }
    public void alterar(int indice,int valor){
        vetor[indice]=valor;
    }
    public int buscar(int dado){
        for (int i=0;i< vetor.length-1;i++){
            if (dado==vetor[i]){
                return i;
            }
        }
        return -1;
    }


    public void mostrar(){
        for(int dado:vetor){
                System.out.println(dado);
        }
    }
}
