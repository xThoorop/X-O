package org.example;

/**
 * Hello world!
 *
 */
public class App 
{



    private static Enum[] one = {Enum.X,Enum.BRAK,Enum.BRAK};
    private static Enum[] two = {Enum.BRAK,Enum.X,Enum.BRAK};
    private static Enum[] three = {Enum.BRAK,Enum.BRAK,Enum.X};

    public static void main( String[] args )
    {
        System.out.println(checkWin(Enum.X));
    }




    public static boolean checkWin(Enum winners){
        if(one[0].equals(winners) &&one[1].equals(winners) &&one[2].equals(winners)){// X X X
            return true;
        }
        if(two[0].equals(winners) &&two[1].equals(winners) &&two[2].equals(winners)){// X X X
            return true;
        }
        if(three[0].equals(winners) &&three[1].equals(winners) &&three[2].equals(winners)){// X X X
            return true;
        }
        if(one[0].equals(winners) &&two[1].equals(winners) &&three[2].equals(winners)){ //X
            return true;                                                                // X
        }                                                                               //  X

        if(one[2].equals(winners) &&two[1].equals(winners) &&three[0].equals(winners)){ //   X
            return true;                                                                //  X
        }                                                                               // X

        if(one[0].equals(winners) &&two[0].equals(winners) &&three[0].equals(winners)){//X
            return true;                                                               //X
        }                                                                              //X

        if(one[1].equals(winners) &&two[1].equals(winners) &&three[1].equals(winners)){//X
            return true;                                                               //X
        }                                                                              //X

        if(one[2].equals(winners) &&two[2].equals(winners) &&three[2].equals(winners)){//X
            return true;                                                               //X
        }                                                                              //X
        return false;
    }
}
