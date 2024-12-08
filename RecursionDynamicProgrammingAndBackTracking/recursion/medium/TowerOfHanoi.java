package recursion.medium;

public class TowerOfHanoi {

    static void tower_Of_Hanoi(int n, char src_rod, char aux_rod, char dest_rod)
    {
        if(n==0)
        {
            return;
        }
        tower_Of_Hanoi(n-1,src_rod,dest_rod,aux_rod);
        System.out.println("Move disk " + n + " from rod "
                + src_rod + " to rod "
                + dest_rod);

        tower_Of_Hanoi(n-1,aux_rod,src_rod,dest_rod);//Src= S, Aux=D,Dest=A
    }

    public static void main(String[] args) {
        int n=3;
        tower_Of_Hanoi(n,'S','A','D');
    }
}
