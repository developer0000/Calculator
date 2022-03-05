public class Calculator {



    public int add(int a,int b)
    {
        int suma=0;

        suma=a+b;

        System.out.println("suma wynosi: "+suma);
        return suma;
    }

    public int odd(int a,int b)
    {
        int suma=0;
        suma=a-b;
        System.out.print("roznica wynosi: "+suma);
        return suma;
    }


    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.add(2,2);
        calculator.odd(10,5);


    }

}