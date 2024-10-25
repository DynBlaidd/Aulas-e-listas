import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Qst1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[3];
        int[] idades= new int[3];
        int med;
        nomes = preencheNomes(nomes);
        idades = preencheIdades(idades, nomes);
        med=mediaIdade(idades);
        acimaDaMedia(med,idades,nomes);
    }
    public static String[] preencheNomes(String[] n){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<n.length;i++){
            System.out.println("Qual nome da "+(i+1)+"ª pessoa?");
            n[i]=sc.nextLine();
        }
        return n;
    }
    public static int[] preencheIdades(int[] v, String[] n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<v.length;i++){
            System.out.println("Insira a idade de "+n[i]);
            v[i]=sc.nextInt();
        }
        return v;
    }
    public static int mediaIdade(int[] v){
        int m=0, med=0;
        for(int i=0;i<v.length;i++){
           m+=v[i];
        }
        med=m/v.length;
        return med;
    }
    public static void acimaDaMedia(int med, int[] v, String[] n){
        System.out.println("As pessoas com idade acima da média, que é "+med+", são:");
        for(int i=0;i<n.length;i++){
            if (v[i]>med){
               System.out.println(n[i]);

            }
        }

    }
}
