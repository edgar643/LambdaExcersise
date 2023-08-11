public class Main {
    public static void main(String[] args) {

MyValue myVal=()-> Math.random()*100;
System.out.println(myVal.getValue());
MyParamValue myParamValue = (n) ->1.0/n;
        System.out.println("Reciprocal: "+ myParamValue.getValue(4.0));

    }
}