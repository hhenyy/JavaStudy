package p2023_07_28;
//
//1.  반지름(r)이 5인 경우에 다음을 구하는 프로그램을 작성 하세요.
//(단, 결과는 소숫점 2째자리 까지 결과가 나타나도록 해야함)
//     DecimalFormat 클래스를 이용 해서 해결 하세요.
//
//원주(원둘레) = 2 * PI * r
//원의 면적 =  PI * r * r
//구의 표면적 = 4 * PI * r * r
//구의 체적(부피) = 4/3 * PI * r * r * r

import java.text.DecimalFormat;

class StaticTest07 {
  public static void main(String[] args)  {

    int r=5;
	double l;      //원주(원둘레)
    double s;      //원의 면적
	double v1;     //구의 표면적
	double v;      //구의 체적(부피)

	l=2*r*Math.PI;
    s=r*r*Math.PI;
	v1=4*Math.PI*r*r;
	v=4.0/3*Math.PI*r*r*r; // pow(r,3)

	DecimalFormat df = new DecimalFormat("###.00");
		
//	System.out.println("원주 : " + l);
//    System.out.println("반지름이 "+r+"인 원의 면적 "+ s);
//	System.out.println("구의 표면적 : " + v1);
//	System.out.println("구의 체적 :" + v);	
//	System.out.println();
	
	System.out.println("원주 : " + df.format(l));
             System.out.println("반지름이 "+r+"인 원의 면적 "+ df.format(s));
	System.out.println("구의 표면적 : " + df.format(v1));
	System.out.println("구의 체적 :" + df.format(v));
	System.out.println();
	
//	System.out.printf("%f", l);
//	System.out.printf("%.2f", l);
//	System.out.println();
//	System.out.format("%.2f", s);
//	System.out.println();
//	System.out.format("%.2f", v1);
//	System.out.println();
//	System.out.format("%.2f", v);
  }
}