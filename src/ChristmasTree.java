public class ChristmasTree {
    public static void main(String[] args) {

        int hight = 10;

        for (int i=hight; i>0; i--){
            for (int j=i;j>0;j--)
                System.out.print(" "); //zamiast gwiazdki spacja żeby sie formowała choinka
//            tworzenie drzewka choinki
            for (int k=2*(hight-i)+1;k>0;k--)
                System.out.print("-");
            System.out.println();
        }
//

    }
}

