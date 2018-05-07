import java.util.Scanner;
public class String_matcher {
    public static void main(String[] args) {
        String text; String pattern; 
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter the text"); 
        text = sc.nextLine();
        System.out.println("Enter the pattern");
        pattern = sc.nextLine(); 
        String[] pat = pattern.split(" ");
        int i = 0;
        int[] index = new int[text.length()];
        for(String p:pat){
            System.out.println("Occurences of "+p+" at positions: ");
            i++;
            for (int j = text.indexOf(p); j >= 0; j = text.indexOf(p, j + 1)){
                index[j] = i; 
                System.out.print(j+1+"\t");
            } 
            System.out.println("");
        }
        System.out.print("Index positions: ");
        for(int m = 0; m<text.length();m++){
            System.out.print(" " + index[m]);
        }
        System.out.println("");
        System.out.println("Pattern matched at the following positions: ");
        for(int x = 0 ; x<index.length;x++){
            if(index[x] == 1){
                for(int y =x; y<index.length;y++){
                    if(index[y] == index[x]+1){
                        for(int z = y; z<index.length;z++){
                            if(index[z] == index[y]+1){
                                System.out.print(x+1 + " ");
                                System.out.print(y+1 + " ");
                                System.out.print(z+1 + " ");
                                System.out.println("");
                            }
                
                        }
                    }
                }
            }
        }
    }
}
