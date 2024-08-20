import java.util.*;
class Solution {
    public boolean isValidSudoku(char[][] block) {
        for(int i=0;i<9;i++){
            HashSet<Character> row=new HashSet<>();
            HashSet<Character> col=new HashSet<>();
            
            for(int j=0;j<9;j++){
                if(block[i][j]!='.'&& !row.add(block[i][j]))
                return false;
                if(block[j][i]!='.'&& !col.add(block[j][i]))
                return false;
                

            }

        }
       
        for(int row=0;row<9;row+=3){
            for(int col=0;col<9;col+=3){
                HashSet<Character> cube=new HashSet<>();
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
               
                if(block[j+col][i+row]!='.'&& !cube.add(block[j+col][i+row]))
                return false;
                

                    }
                }
                

            }
            }
            return true;
        }
       

        
    }
