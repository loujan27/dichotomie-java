package analyse1;


	import java.util.Scanner;
public  class fonction  {

	        Scanner scanner = new Scanner(System.in);
	        double a = 0;
	        double b = 0;
	        double c = 0;
	        double d = 0;

	        double polynome ( double x, int deg){
	            double res = 0;

	            if (deg == 1) {
	                if (a == 0 && b == 0) {
	                    System.out.println("entrez les coefficient du polynome ax+b : ");
	                    a = scanner.nextInt();
	                    b = scanner.nextInt();
	                }
	                res = a * x + b;
	            }

	            if (deg == 2) {

	                if (a == 0 && b == 0 && c == 0 && d == 0) {
	                    System.out.println("entrez les coefficient du polynome ax²+bx+c : ");

	                    a = scanner.nextInt();
	                    b = scanner.nextInt();
	                    c = scanner.nextInt();

	                }
	                res = a * x * x + b * x + c;
	            }


	            if (deg == 3) {

	                if (a == 0 && b == 0 && c == 0 && d == 0) {
	                    System.out.println("entrez les coefficient du polynome ax3+bx²+cx+d : ");

	                    a = scanner.nextInt();
	                    b = scanner.nextInt();
	                    c = scanner.nextInt();
	                    d = scanner.nextInt();

	                }

	                res = a * x * x * x + b * x * x + c * x + d;
	            }
	            return res;
	        }

	        double ln ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = polynome(x1, deg1);
	            return Math.log(res);
	        }

	        double lnsqrt ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = sqrt(x1, deg1);
	            return Math.log(res);
	        }


	        double lnexpo ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = exp(x1, deg1);
	            return Math.log(res);
	        }


	        double lnexpcos ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = expcos(x1, deg1);
	            return Math.log(res);
	        }

	        double lnexpsin ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = expsin(x1, deg1);
	            return Math.log(res);
	        }

	        double lnexptan ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = exptan(x1, deg1);
	            return Math.log(res);
	        }


	        double lncos ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = cos(x1, deg1);
	            return Math.log(res);
	        }

	        double lnsin ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = sin(x1, deg1);
	            return Math.log(res);
	        }

	        double lntan ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = tan(x1, deg1);
	            return Math.log(res);
	        }


	        double sqrt ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = polynome(x1, deg1);
	            return Math.sqrt(res);
	        }
	        double sqrtexp ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = exp(x1, deg1);
	            return Math.sqrt(res);
	        }
	        double sqrtexpcos ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = expcos(x1, deg1);
	            return Math.sqrt(res);
	        }
	        double sqrtexpsin ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = expsin(x1, deg1);
	            return Math.sqrt(res);
	        }
	        double sqrtexptan ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = exptan(x1, deg1);
	            return Math.sqrt(res);
	        }

	        double exp ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = polynome(x1, deg1);
	            return Math.exp(res);

	        }
	        double expcos ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = cos(x1, deg1);
	            return Math.exp(res);

	        }
	        double expsin ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = sin(x1, deg1);
	            return Math.exp(res);

	        }
	        double exptan ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = tan(x1, deg1);
	            return Math.exp(res);

	        }
	        double cos ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = polynome(x1, deg1);
	            return Math.cos(res);
	        }
	        double sin ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = polynome(x1, deg1);
	            return Math.sin(res);
	        }

	        double tan ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = polynome(x1, deg1);
	            return Math.tan(res);
	        }
	        double arctan ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = polynome(x1, deg1);
	            return Math.atan(res);
	        }

	        double arccos ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = polynome(x1, deg1);
	            return Math.acos(res);
	        }

	        double arcsin ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = polynome(x1, deg1);
	            return Math.asin(res);
	        }
	        double cosexp ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = exp(x1, deg1);
	            return Math.cos(res);
	        }
	        double sinexp ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = exp(x1, deg1);
	            return Math.sin(res);
	        }

	        double tanexp ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = exp(x1, deg1);
	            return Math.tan(res);
	        }
	        double arctanexp ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = exp(x1, deg1);
	            return Math.atan(res);
	        }

	        double arccosexp ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = exp(x1, deg1);
	            return Math.acos(res);
	        }

	        double arcsinexp ( double x, int deg){
	            double x1 = x;
	            int deg1 = deg;
	            double res = exp(x1, deg1);
	            return Math.asin(res);
	        }


	    }









	
	
	
	
	
	
