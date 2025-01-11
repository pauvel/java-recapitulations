class ForLoop {
    public static void main(String args[]){

        outer: for(int i = 0; i<=10; i++){
            System.out.println("Imprimiendo tabla del " + i);
           inner: for(int j = 0; j<=10 ; j++){
                System.out.println(i + "x" + j + "=" + i*j );
                if(j ==  9 && i == 9)
                    break outer;
            }
        }
    }
}