package analyse1;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;
public class dichotomie {

public static void main(String[] args) {

	        Scanner scanner=new Scanner(System.in);

	        int choix;   double a; double b;   double ε; double x; fonction f1=new fonction(); double fx=0,fa=0,fb=0;
	        System.out.println("entrez l'intervalle de la fonction  [a,b] : ");
	        System.out.println("entrez a : ");
	        a=scanner.nextFloat();
	        System.out.println("entrez b : ");
	        b=scanner.nextFloat();
	        x=(a+b)/2;
	        int k=0;
	        ArrayList <Double> A =new ArrayList<Double>();
	        ArrayList <Double> B =new ArrayList<Double>();
	        ArrayList <Double> X =new ArrayList<Double>();
	        A.add(a);B.add(b);X.add(x);

	        System.out.println("entrez le type de fonction: ");
	        System.out.println("entrez 1-polynome: ");
	        System.out.println("entrez 2-exponentielle: ");
	        System.out.println("entrez 3-trigonométrie: ");
	        System.out.println("entrez 4-racine: ");
	        System.out.println("entrez 5-logarithme: ");

	        choix=scanner.nextInt();


	        switch (choix) { /////////////////////////////////CHOIX DE TYPE DE FONCTION////////////////////////////////////////////////////////////////////

	                case 1: {////////////////////////////////POLYNOOOME//////////////////////////////////////////////////////////////////////////

	                    System.out.println("entrez le degré: ");
	                    choix = scanner.nextInt();
	                    fa = f1.polynome(A.get(k), choix);
	                    fb = f1.polynome(B.get(k), choix);

	                    if (fa*fb<0){
	                        System.out.println("entrez la précision ε : ");
	                        ε=scanner.nextDouble();

	                        while (B.get(k) - A.get(k)> ε || Math.abs(fx)>ε) {

	                        fx = f1.polynome(X.get(k), choix);
	                        fa = f1.polynome(A.get(k), choix);
	                        fb = f1.polynome(B.get(k), choix);

	                        if (fa * fx < 0) {
	                            A.add(A.get(k));
	                            B.add(X.get(k)); }

	                            else {
	                             A.add(X.get(k));
	                             B.add(B.get(k)); }

	                        System.out.println("");
	                        System.out.print("|itté : " + k);
	                        System.out.print("|ak :" + A.get(k));
	                        System.out.print("|xk :" + X.get(k));
	                        System.out.print("|bk :" + B.get(k));
	                        System.out.print("|f(ak) :" + fa);
	                        System.out.print("|f(xk) :" + fx);
	                        System.out.print("|f(bk) :" + fb);

	                        X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                        System.out.println("");


	                        k = k + 1;    } } } break;


	                case 2: {///////////////////////////////////EXPONENTIELLE///////////////////////////////////////////////////////////////////////

	                    System.out.println("entrez 1-polynome: ");
	                    System.out.println("entrez 2-trigonométrie: ");

	                    choix = scanner.nextInt();

	                    if (choix == 1) {//////////EXPOPOLYNOOOOOME/////////////////////////////////////////////////////////////////////////////////////


	                        System.out.println("entrez le degré: ");
	                        choix = scanner.nextInt();

	                        fa = f1.exp(A.get(k), choix);
	                        fb = f1.exp(B.get(k), choix);

	                        if (fa*fb<0){

	                            System.out.println("entrez la précision ε : ");
	                            ε=scanner.nextDouble();

	                            while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {
	                            fx = f1.exp(X.get(k), choix);
	                            fa = f1.exp(A.get(k), choix);
	                            fb = f1.exp(B.get(k), choix);
	                            if (fa * fx < 0) {
	                                A.add(A.get(k));
	                                B.add(X.get(k));
	                            } else {
	                                A.add(X.get(k));
	                                B.add(B.get(k));
	                            }
	                            System.out.println("");
	                            System.out.print("|itté : " + k);
	                            System.out.print("|ak :" + A.get(k));
	                            System.out.print("|xk :" + X.get(k));
	                            System.out.print("|bk :" + B.get(k));
	                            System.out.print("|f(ak) :" + fa);
	                            System.out.print("|f(xk) :" + fx);
	                            System.out.print("|f(bk) :" + fb);

	                            X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                            System.out.println("");


	                            k = k + 1; } } }

	                            else {//////////////////////////EXPO-TRIGONOMETRIE///////////////////////////////////////////////////////////////////////////////////

	                        System.out.println("entrez 1-cos: ");
	                        System.out.println("entrez 2-sin: ");
	                        System.out.println("entrez 3-tan: ");

	                        choix = scanner.nextInt();

	                        switch (choix) {

	                            case 1: {//////////////////////EXPO-COOOOOOSIN//////////////////////////////////////////////////////////////////////////
	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.expcos(A.get(k), choix);
	                                fb = f1.expcos(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {
	                                    fx = f1.expcos(X.get(k), choix);
	                                    fa = f1.expcos(A.get(k), choix);
	                                    fb = f1.expcos(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);
	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1; } }} break;

	                            case 2: {///////////////EXPO-SIIIIIIIN///////////////////////////////////////////////////////////////////////////////////
	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.expsin(A.get(k), choix);
	                                fb = f1.expsin(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {
	                                    fx = f1.expsin(X.get(k), choix);
	                                    fa = f1.expsin(A.get(k), choix);
	                                    fb = f1.expsin(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1; }}  } break;
	                            case 3: {/////////////////////EXPO-TAAAAAAAAAAAAAANG//////////////////////////////////////////////////////////////////////////

	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.exptan(A.get(k), choix);
	                                fb = f1.exptan(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {
	                                    fx = f1.exptan(X.get(k), choix);
	                                    fa = f1.exptan(A.get(k), choix);
	                                    fb = f1.exptan(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");

	                                    k = k + 1; } } } break;
	                                 } }
	                }break;


	                case 3:///////////////////FONCTION TRIGONOMETRIE/////////////////////////////////////////////////////////////////////////////////////////
	                    System.out.println("entrez 1-cos: ");
	                    System.out.println("entrez 2-sin: ");
	                    System.out.println("entrez 3-tan: ");
	                    System.out.println("entrez 4-arccos: ");
	                    System.out.println("entrez 5-arcsin: ");
	                    System.out.println("entrez 6-arctan: ");

	                    choix = scanner.nextInt();

	                    switch (choix) {/////////////////////////////////////////////Trigonometrie/////////////////////////////////////////

	                        case 1://///////////////////////COOOOOOSIN/////////////////////////////////////////////////////////////////////////////
	                            System.out.println("entrez 1-polynome: ");
	                            System.out.println("entrez 2-exponetielle: ");

	                            choix = scanner.nextInt();

	                            if (choix == 1) {//////////////////COOOOSIN-POLYNOME////////////////////////////////////////////////////////////////////

	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.cos(A.get(k), choix);
	                                fb = f1.cos(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {
	                                    fx = f1.cos(X.get(k), choix);
	                                    fa = f1.cos(A.get(k), choix);
	                                    fb = f1.cos(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }

	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");

	                                    k = k + 1;  }} }

	                                    else {//////////////////////////COOOOOSIN-EXPO/////////////////////////////////////////////////////////////////////////


	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();

	                                fa = f1.cosexp(A.get(k), choix);
	                                fb = f1.cosexp(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                 while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {

	                                    fx = f1.cosexp(X.get(k), choix);
	                                    fa = f1.cosexp(A.get(k), choix);
	                                    fb = f1.cosexp(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                     System.out.println("");
	                                     System.out.print("|itté : " + k);
	                                     System.out.print("|ak :" + A.get(k));
	                                     System.out.print("|xk :" + X.get(k));
	                                     System.out.print("|bk :" + B.get(k));
	                                     System.out.print("|f(ak) :" + fa);
	                                     System.out.print("|f(xk) :" + fx);
	                                     System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1;
	                                }} } break;


	                        case 2:////////////////SIIIIINUS////////////////////////////////////////////////////////////////////////////////////
	                            System.out.println("entrez 1-polynome: ");
	                            System.out.println("entrez 2-exponetielle: ");

	                            choix = scanner.nextInt();

	                            if (choix == 1) {/////////////////////SIN-POLYNOME/////////////////////////////////////////////////////////////////////
	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.sin(A.get(k), choix);
	                                fb = f1.sin(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {

	                                    fx = f1.sin(X.get(k), choix);
	                                    fa = f1.sin(A.get(k), choix);
	                                    fb = f1.sin(B.get(k), choix);

	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");

	                                    k = k + 1;  }} }

	                                    else {////////////////////////SIIIIIIN-EXPO//////////////////////////////////////////////////////////////////////////////

	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.sinexp(A.get(k), choix);
	                                fb = f1.sinexp(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {

	                                    fx = f1.sinexp(X.get(k), choix);
	                                    fa = f1.sinexp(A.get(k), choix);
	                                    fb = f1.sinexp(B.get(k), choix);

	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");

	                                    k = k + 1; } } } break;


	                        case 3:////////////////////////TAAANGANTE/////////////////////////////////////////////////////////////////////////////
	                            System.out.println("entrez 1-polynome: ");
	                            System.out.println("entrez 2-exponetielle: ");

	                            choix = scanner.nextInt();

	                            if (choix == 1) {/////////////////////TANG-POLYNOME/////////////////////////////////////////////////////////////////////////
	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.tan(A.get(k), choix);
	                                fb = f1.tan(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {

	                                    fx = f1.tan(X.get(k), choix);
	                                    fa = f1.tan(A.get(k), choix);
	                                    fb = f1.tan(B.get(k), choix);

	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    }
	                                    else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k)); }

	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");

	                                    k = k + 1; } } }
	                            else {////////////////////////////////TAAAANG-EXPO////////////////////////////////////////////////////////////////////////


	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.tanexp(A.get(k), choix);
	                                fb = f1.tanexp(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {
	                                    fx = f1.tanexp(X.get(k), choix);
	                                    fa = f1.tanexp(A.get(k), choix);
	                                    fb = f1.tanexp(B.get(k), choix);

	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1;
	                                }}


	                            }
	                            break;
	                        case 4://////////////////////ARCCOOOOOOOOOS/////////////////////////////////////////////////////////////////////////////////
	                            System.out.println("entrez 1-polynome: ");
	                            System.out.println("entrez 2-exponetielle: ");

	                            choix = scanner.nextInt();


	                            if (choix == 1) {////////////////////////ARCOOOS-POLYNOME////////////////////////////////////////////////////////////////////
	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.arccos(A.get(k), choix);
	                                fb = f1.arccos(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {
	                                    fx = f1.arccos(X.get(k), choix);
	                                    fa = f1.arccos(A.get(k), choix);
	                                    fb = f1.arccos(B.get(k), choix);

	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1;
	                                }}

	                            } else {//////////////////ARCCOS-EXPO////////////////////////////////////////////////////////////////////////////////////
	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.arccosexp(A.get(k), choix);
	                                fb = f1.arccosexp(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                 while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {
	                                    fx = f1.arccosexp(X.get(k), choix);
	                                    fa = f1.arccosexp(A.get(k), choix);
	                                    fb = f1.arccosexp(B.get(k), choix);

	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                     System.out.println("");
	                                     System.out.print("|itté : " + k);
	                                     System.out.print("|ak :" + A.get(k));
	                                     System.out.print("|xk :" + X.get(k));
	                                     System.out.print("|bk :" + B.get(k));
	                                     System.out.print("|f(ak) :" + fa);
	                                     System.out.print("|f(xk) :" + fx);
	                                     System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");

	                                    k = k + 1; }}  } break;

	                        case 5://///////////////ARCSIIIINUS////////////////////////////////////////////////////////////////////////////////////
	                            System.out.println("entrez 1-polynome: ");
	                            System.out.println("entrez 2-exponetielle: ");

	                            choix = scanner.nextInt();

	                            if (choix == 1) {/////////////////////ARCSISSSN-POLYNOME//////////////////////////////////////////////////////////////////////
	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.arcsin(A.get(k), choix);
	                                fb = f1.arcsin(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {
	                                    fx = f1.arcsin(X.get(k), choix);
	                                    fa = f1.arcsin(A.get(k), choix);
	                                    fb = f1.arcsin(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }

	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1;  }}  }
	                            else {/////////////////////////////////ARCSIN-EXPO/////////////////////////////////////////////////////////////////////


	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.arcsinexp(A.get(k), choix);
	                                fb = f1.arcsinexp(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {

	                                    fx = f1.arcsinexp(X.get(k), choix);
	                                    fa = f1.arcsinexp(A.get(k), choix);
	                                    fb = f1.arcsinexp(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1;  }} } break;

	                        case 6://///////////////////ARCTANNNNNNNNNNNNNNNNGANTE///////////////////////////////////////////////////////////////////////////////////////
	                            System.out.println("entrez 1-polynome: ");
	                            System.out.println("entrez 2-exponetielle: ");

	                            choix = scanner.nextInt();

	                            if (choix == 1) {/////////////////////////////////ARCTANGANTE-POLYNOME///////////////////////////////////////////////////////////////
	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.arctan(A.get(k), choix);
	                                fb = f1.arctan(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {

	                                    fx = f1.arctan(X.get(k), choix);
	                                    fa = f1.arctan(A.get(k), choix);
	                                    fb = f1.arctan(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1; } } }
	                            else {//////////////////////////////////ARCTANGANTE-EXPO////////////////////////////////////////////////////////////////////


	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.arctanexp(A.get(k), choix);
	                                fb = f1.arctanexp(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {


	                                    fx = f1.arctanexp(X.get(k), choix);
	                                    fa = f1.arctanexp(A.get(k), choix);
	                                    fb = f1.arctanexp(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                     System.out.println("");
	                                     System.out.print("|itté : " + k);
	                                     System.out.print("|ak :" + A.get(k));
	                                     System.out.print("|xk :" + X.get(k));
	                                     System.out.print("|bk :" + B.get(k));
	                                     System.out.print("|f(ak) :" + fa);
	                                     System.out.print("|f(xk) :" + fx);
	                                     System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1; }} } break;
	                      }break;


	                case 4: {///////////////////////////FONCTION RACCCCCCCCCCCCCCINE////////////////////////////////////////////////////////////////////////////////
	                    System.out.println("entrez 1-polynome: ");
	                    System.out.println("entrez 2-exponetielle: ");

	                    choix = scanner.nextInt();
	                    if (choix == 1) {/////////////////////////RACCCIINE-POLYNOME///////////////////////////////////////////////////////////////////////////////
	                        System.out.println("entrez le degré: ");
	                        choix = scanner.nextInt();
	                        fa = f1.sqrt(A.get(k), choix);
	                        fb = f1.sqrt(B.get(k), choix);

	                        if (fa*fb<0){

	                            System.out.println("entrez la précision ε : ");
	                            ε=scanner.nextDouble();


	                            while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {

	                            fx = f1.sqrt(X.get(k), choix);
	                            fa = f1.sqrt(A.get(k), choix);
	                            fb = f1.sqrt(B.get(k), choix);
	                            if (fa * fx < 0) {
	                                A.add(A.get(k));
	                                B.add(X.get(k));
	                            } else {
	                                A.add(X.get(k));
	                                B.add(B.get(k));
	                            }

	                            System.out.println("");
	                            System.out.print("|itté : " + k);
	                            System.out.print("|ak :" + A.get(k));
	                            System.out.print("|xk :" + X.get(k));
	                            System.out.print("|bk :" + B.get(k));
	                            System.out.print("|f(ak) :" + fa);
	                            System.out.print("|f(xk) :" + fx);
	                            System.out.print("|f(bk) :" + fb);

	                            X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                            System.out.println("");


	                            k = k + 1;  }} }
	                    else {/////////////////////////////RACIINE-EXPO////////////////////////////////////////////////////////////////////
	                        System.out.println("entrez 1-polynome: ");
	                        System.out.println("entrez 2-cos: ");
	                        System.out.println("entrez 3-sin: ");
	                        System.out.println("entrez 4-tan: ");
	                        choix = scanner.nextInt();


	                        switch (choix) {///////////////////////////////////////////////////////////////////////////////////////////

	                            case 1: {//////////////////////////RACIINE-EXPO-POLYNOME////////////////////////////////////////////////////////////////

	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.sqrt(A.get(k), choix);
	                                fb = f1.sqrt(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {

	                                    fx = f1.sqrt(X.get(k), choix);
	                                    fa = f1.sqrt(A.get(k), choix);
	                                    fb = f1.sqrt(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1; }}  }break;


	                            case 2: {///////////////////////////////RACIINE-EXPO-COS/////////////////////////////////////////////////////////////////
	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.sqrtexpcos(A.get(k), choix);
	                                fb = f1.sqrtexpcos(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {

	                                    fx = f1.sqrtexpcos(X.get(k), choix);
	                                    fa = f1.sqrtexpcos(A.get(k), choix);
	                                    fb = f1.sqrtexpcos(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1; }}  } break;
	                            case 3: {//////////////////////////////RACIINE-EXPO-SIIINUS//////////////////////////////////////////////////////////////////
	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();

	                                fa = f1.sqrtexpsin(A.get(k), choix);
	                                fb = f1.sqrtexpsin(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {
	                                    fx = f1.sqrtexpsin(X.get(k), choix);
	                                    fa = f1.sqrtexpsin(A.get(k), choix);
	                                    fb = f1.sqrtexpsin(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1; }} } break;
	                            case 4: {//////////////////////////////////RACIINE-EXPO-TANGENTE///////////////////////////////////////////////////////////////
	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.sqrtexptan(A.get(k), choix);
	                                fb = f1.sqrtexptan(B.get(k), choix);


	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {
	                                    fx = f1.sqrtexptan(X.get(k), choix);
	                                    fa = f1.sqrtexptan(A.get(k), choix);
	                                    fb = f1.sqrtexptan(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }

	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1; }}  } break;
	                        } }
	                }break;


	                case 5: {///////////////////////////FONCTION LOGARITHME////////////////////////////////////////////////////////////////////////////////
	                    System.out.println("entrez 1-polynome: ");
	                    System.out.println("entrez 2-exponetielle: ");
	                    System.out.println("entrez 3-trigonométrie: ");
	                    System.out.println("entrez 4-racine: ");
	                    choix = scanner.nextInt();
	                    if (choix == 1) {/////////////////////////LOG-POLYNOME///////////////////////////////////////////////////////////////////////////////
	                        System.out.println("entrez le degré: ");
	                        choix = scanner.nextInt();
	                        fa = f1.ln(A.get(k), choix);
	                        fb = f1.ln(B.get(k), choix);

	                        if (fa*fb<0){

	                            System.out.println("entrez la précision ε : ");
	                            ε=scanner.nextDouble();


	                            while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {

	                            fx = f1.ln(X.get(k), choix);
	                            fa = f1.ln(A.get(k), choix);
	                            fb = f1.ln(B.get(k), choix);
	                            if (fa * fx < 0) {
	                                A.add(A.get(k));
	                                B.add(X.get(k));
	                            } else {
	                                A.add(X.get(k));
	                                B.add(B.get(k));
	                            }
	                            System.out.println("");
	                            System.out.print("|itté : " + k);
	                            System.out.print("|ak :" + A.get(k));
	                            System.out.print("|xk :" + X.get(k));
	                            System.out.print("|bk :" + B.get(k));
	                            System.out.print("|f(ak) :" + fa);
	                            System.out.print("|f(xk) :" + fx);
	                            System.out.print("|f(bk) :" + fb);

	                            X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                            System.out.println("");


	                            k = k + 1; }} }

	                    if (choix == 2) {/////////////////////////////LOG-EXPO////////////////////////////////////////////////////////////////////
	                        System.out.println("entrez 1-polynome: ");
	                        System.out.println("entrez 2-cos: ");
	                        System.out.println("entrez 3-sin: ");
	                        System.out.println("entrez 4-tan: ");
	                        choix = scanner.nextInt();


	                        switch (choix) {///////////////LOG-EXPO-----------////////////////////////////////////////////////////////////////////////////

	                            case 1: {//////////////////////////LOG-EXPO-POLYNOME////////////////////////////////////////////////////////////////

	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();

	                                fa = f1.lnexpo(A.get(k), choix);
	                                fb = f1.lnexpo(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {

	                                    fx = f1.lnexpo(X.get(k), choix);
	                                    fa = f1.lnexpo(A.get(k), choix);
	                                    fb = f1.lnexpo(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1; }} }break;

	                            case 2: {///////////////////////////////LOG-EXPO-COS/////////////////////////////////////////////////////////////////
	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.lnexpcos(A.get(k), choix);
	                                fb = f1.lnexpcos(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {

	                                    fx = f1.lnexpcos(X.get(k), choix);
	                                    fa = f1.lnexpcos(A.get(k), choix);
	                                    fb = f1.lnexpcos(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1; }}  }break;

	                            case 3: {//////////////////////////////LOG-EXPO-SIIINUS//////////////////////////////////////////////////////////////////
	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();

	                                fa = f1.lnexpsin(A.get(k), choix);
	                                fb = f1.lnexpsin(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {
	                                    fx = f1.lnexpsin(X.get(k), choix);
	                                    fa = f1.lnexpsin(A.get(k), choix);
	                                    fb = f1.lnexpsin(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1; }}  }break;

	                            case 4: {//////////////////////////////////LOG-EXPO-TANGENTE///////////////////////////////////////////////////////////////
	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.lnexptan(A.get(k), choix);
	                                fb = f1.lnexptan(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();


	                                while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {
	                                    fx = f1.lnexptan(X.get(k), choix);
	                                    fa = f1.lnexptan(A.get(k), choix);
	                                    fb = f1.lnexptan(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1; }} } break;
	                            } }


	                    if (choix == 3) {////////////////////////LOG-TRIGONOMETRIE///////////////////////////////////////////////////////////////////////////////


	                        System.out.println("entrez 1-cos: ");
	                        System.out.println("entrez 2-sin: ");
	                        System.out.println("entrez 3-tan: ");
	                        choix = scanner.nextInt();



	                        switch (choix) {

	                            case 1: {//////////////////////LOG-COOOOOOSIN//////////////////////////////////////////////////////////////////////////
	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.lncos(A.get(k), choix);
	                                fb = f1.lncos(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();

	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {

	                                    fx = f1.lncos(X.get(k), choix);
	                                    fa = f1.lncos(A.get(k), choix);
	                                    fb = f1.lncos(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1; }} } break;

	                            case 2: {///////////////LOG-SIIIIIIIN///////////////////////////////////////////////////////////////////////////////////
	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.lnsin(A.get(k), choix);
	                                fb = f1.lnsin(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();


	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {
	                                    fx = f1.lnsin(X.get(k), choix);
	                                    fa = f1.lnsin(A.get(k), choix);
	                                    fb = f1.lnsin(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }

	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1; }} }break;

	                            case 3: {/////////////////////LOG-TAAAAAAAAAAAAAANG//////////////////////////////////////////////////////////////////////////

	                                System.out.println("entrez le degré: ");
	                                choix = scanner.nextInt();
	                                fa = f1.lntan(A.get(k), choix);
	                                fb = f1.lntan(B.get(k), choix);

	                                if (fa*fb<0){

	                                    System.out.println("entrez la précision ε : ");
	                                    ε=scanner.nextDouble();


	                                    while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {
	                                    fx = f1.lntan(X.get(k), choix);
	                                    fa = f1.lntan(A.get(k), choix);
	                                    fb = f1.lntan(B.get(k), choix);
	                                    if (fa * fx < 0) {
	                                        A.add(A.get(k));
	                                        B.add(X.get(k));
	                                    } else {
	                                        A.add(X.get(k));
	                                        B.add(B.get(k));
	                                    }
	                                    System.out.println("");
	                                    System.out.print("|itté : " + k);
	                                    System.out.print("|ak :" + A.get(k));
	                                    System.out.print("|xk :" + X.get(k));
	                                    System.out.print("|bk :" + B.get(k));
	                                    System.out.print("|f(ak) :" + fa);
	                                    System.out.print("|f(xk) :" + fx);
	                                    System.out.print("|f(bk) :" + fb);

	                                    X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                    System.out.println("");


	                                    k = k + 1; }} }break;
	                        } }




	                if (choix == 4) {///////////////////////////////LOG-RACCCCCIN//////////////////////////////////////////////////////////////////////////


	                    System.out.println("entrez 1-polynome: ");
	                    System.out.println("entrez 2-cos: ");
	                    System.out.println("entrez 3-sin: ");
	                    System.out.println("entrez 4-tan: ");
	                    choix = scanner.nextInt();


	                    switch (choix) {///////////////////////////////////////////////////////////////////////////////////////////

	                        case 1: {////////////////////////LOG-RACIINE-POLYNOME////////////////////////////////////////////////////////////////

	                            System.out.println("entrez le degré: ");
	                            choix = scanner.nextInt();

	                            fa = f1.lnsqrt(A.get(k), choix);
	                            fb = f1.lnsqrt(B.get(k), choix);

	                            if (fa*fb<0){

	                                System.out.println("entrez la précision ε : ");
	                                ε=scanner.nextDouble();


	                                while (B.get(k) - A.get(k) > ε || Math.abs(fx) > ε) {

	                                fx = f1.lnsqrt(X.get(k), choix);
	                                fa = f1.lnsqrt(A.get(k), choix);
	                                fb = f1.lnsqrt(B.get(k), choix);
	                                if (fa * fx < 0) {
	                                    A.add(A.get(k));
	                                    B.add(X.get(k));
	                                } else {
	                                    A.add(X.get(k));
	                                    B.add(B.get(k));
	                                }

	                                System.out.println("");
	                                System.out.print("|itté : " + k);
	                                System.out.print("|ak :" + A.get(k));
	                                System.out.print("|xk :" + X.get(k));
	                                System.out.print("|bk :" + B.get(k));
	                                System.out.print("|f(ak) :" + fa);
	                                System.out.print("|f(xk) :" + fx);
	                                System.out.print("|f(bk) :" + fb);

	                                X.add((A.get(k + 1) + B.get(k + 1)) / 2);
	                                System.out.println("");


	                                k = k + 1; }}  }break;


	                        } }

	                        } break;


	                }

	                }}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

