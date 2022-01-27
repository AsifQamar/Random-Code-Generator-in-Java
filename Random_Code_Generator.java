import java.util.Random;
public class Random_Code_Generator {
    public static void main(String[] args) {
        Random rand = new Random();
        int letter = rand.nextInt(25);
        int letter1 = rand.nextInt(25);
        int letter2= rand.nextInt(25);
        int letter3 = rand.nextInt(25);
        int letter4 = rand.nextInt(25);
        char alph = 'a';
        char alph1 = 'a';
        char alph2 = 'a';
        char alph3 = 'a';
        char alph4 = 'a';
        for (int i = -1;i<=25;i++){
            if (i == letter){
                alph++;
                break;
            }
            alph++;
        }
        for (int i = -1;i<=25;i++){
            if (i == letter1){
                alph1++;
                break;
            }
            alph1++;
        }
        for (int i = -1;i<=25;i++){
            if (i == letter2){
                alph2++;
                break;
            }
            alph2++;
        }
        for (int i = -1;i<=25;i++){
            if (i == letter3){
                alph3++;
                break;
            }
            alph3++;
        }
        for (int i = -1;i<=25;i++){
            if (i == letter4){
                alph4++;
                break;
            }
            alph4++;
        }
        System.out.print(alph);
        System.out.print(alph1);
        System.out.print(alph2);
        System.out.print(alph3);
        System.out.print(alph4);
    }
}
