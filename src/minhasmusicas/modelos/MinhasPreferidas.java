package minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " eh considerado sucesso absoluto" + " e preferido por todos");
        } else {
            System.out.println(audio.getTitulo() + " tambem eh um dos que todo mundo esta curtindo");
        }
    }
}
