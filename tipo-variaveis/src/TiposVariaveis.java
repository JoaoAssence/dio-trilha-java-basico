import java.util.Date;

public class TiposVariaveis {
    public static void main(String[] args)  {
        
        String nomeUm = "João";
        String nomeDois = "João";
        System.out.println(nomeUm == nomeDois);
        
        
        int numero1 = 1;
        int numero2 = 2;
        
        boolean simNao = numero1 == numero2;
       
        System.out.println("numeroUm é igual a numeroDois?" + simNao);

         simNao = numero1 != numero2;
       
        System.out.println("numeroUm é diferente de numeroDois?" + simNao);

         simNao = numero1 > numero2;
       
        System.out.println("numeroUm é maior que numeroDois?" + simNao);

        simNao = numero1 < numero2;
       
        System.out.println("numeroUm é menor que numeroDois?" + simNao);

    }
}
