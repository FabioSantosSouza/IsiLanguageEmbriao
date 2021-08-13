import java.util.Scanner;
public class MainClass{ 
  public static void main(String args[]){
       Scanner _key = new Scanner(System.in);
double  p;
double[]  a;
String[]  b;
boolean[]  temp;
double  iterador;
double  dez;
double  doze;
p = 1;
temp = new boolean[]{true,false,true};
a = new double[]{1,2,3,4};
b = new String[]{"ABELHA","AMORA","sadas"};
a[ (int)1] = 10;
dez = a[(int)3];
temp[ (int)p] = false;
for (iterador=0;iterador<3;iterador=iterador+1) {
temp[ (int)iterador] = false;}
for (iterador=0;iterador<3;iterador=iterador+1) {
System.out.println(a[(int)iterador]);}
for (iterador=0;iterador<3;iterador=iterador+1) {
System.out.println(temp[(int)iterador]);}
  }}