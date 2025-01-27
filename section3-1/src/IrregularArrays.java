public class IrregularArrays {
    public static void main(String[] args){
        int[][] irregularArr = new int[4][];

        int[] rowZero = new int[1];
        rowZero[0] = 1;
        irregularArr[0] = rowZero;

        int[] rowTwo = new int[2];
        rowTwo[0] = 2;
        rowTwo[1] = 3;
        irregularArr[1] = rowTwo;

        int[] rowThree = new int[3];
        rowThree[0] = 4;
        rowThree[1] = 5;
        rowThree[2] = 6;
        irregularArr[2] = rowThree;

        int[] rowFour = new int[4];
        rowFour[0] = 7;
        rowFour[1] = 8;
        rowFour[2] = 9;
        rowFour[3] = 10;
        irregularArr[3] = rowFour;

        for(int i = 0; i < irregularArr.length; i ++){
            for(int j = 0; j < irregularArr[i].length; j++){
                System.out.print(irregularArr[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
