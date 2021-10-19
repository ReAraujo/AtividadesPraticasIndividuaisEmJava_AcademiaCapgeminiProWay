public class Dados {
    private Object[] dados;
    public int posicaoAtual = 0;
    public int tamanhoAtual = 5;


    public Dados(){
        this.dados = new Object[tamanhoAtual];
    }

    public String adicionar(Object obj){
        String mensagem = "Dados salvos com sucesso!";
        
        if(posicaoAtual < dados.length){
            dados[posicaoAtual] = obj;
            posicaoAtual++;
        }else {
            tamanhoAtual = tamanhoAtual+5;
            Object[] dados1 = new Object[tamanhoAtual];

            for (int i = 0; i < dados.length; i++) {
                dados1[i] = dados[i];
            }
            dados = dados1;
        }
        return mensagem;
    }

    public int tamanhoLista(){
        return posicaoAtual;
    }

    public String remover(Object obj){

        for (int i = 0; i < dados.length; i++) {
            if(dados[i].equals(obj)){
                reorganizar(i);
                posicaoAtual --;
                return "Dados removidos com sucesso!";
            }
        }
        return "Os dados não foram encontrados!";
    }

    public void reorganizar(int posicao){

        for (int i = posicao; i < dados.length-1; i++) {
            this.dados[i] = this.dados[i+1];
        }
    }

    public boolean contains(Object obj){
        for (int i = 0; i < posicaoAtual-1; i++) {
            if(dados[i].equals(obj)){
                return true;
            }
        }

        return false;
    }

    
}
