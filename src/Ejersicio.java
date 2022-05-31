public class Ejersicio {
    public static  int factorial(int n){
        int factorial;
        if(n == 1){
           //caso base
           factorial= n;
        }else{
            factorial= n * factorial(n-1);
        }
        return factorial;

    }
    /*
    maximo comun divisor (mcd) , algoritmo de euclides
    */
    public static  int mcd(int a, int b){
        int mcd;

        if(a==b){
            mcd = b;
        }  else {
            if(a>b){
                a=a-b;
            }  else {
                b=b -a;
            }
            mcd =mcd(a,b);
        }
        return mcd;

    }
    public int sumador(int[]vector){
        int suma = 0;
        for(int i=0;i<vector.length; i++){
            suma=suma+vector[i];
        }
        return suma;
    }

}
