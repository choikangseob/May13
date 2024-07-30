import java.util.ArrayList;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
	Scanner z = new Scanner(System.in);
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);
	ArrayList<String> arName = new ArrayList();
	ArrayList<Integer> arPrice = new ArrayList();
	
	
	ArrayList<String> arNamed = new ArrayList<String>();
	ArrayList<Integer> arQty = new ArrayList<Integer>();
	ArrayList<Integer> arSum = new ArrayList<Integer>();
	
	ArrayList<String> alName = new ArrayList<String>();
	ArrayList<Integer> alQty = new ArrayList<Integer>();
	ArrayList<Integer> alSum = new ArrayList<Integer>();
	ArrayList<String> alMobile = new ArrayList<String>();
	
	
	String m = "M : 메뉴목록관리";
	String o = "O : 주문관리";
	String s = "S : 매출현황";
	String x = "X : 프로그램종료";
	int i= 0;
	while(true) {
	String str1 = z.nextLine();
	if(str1.equals("M")|| str1.equals("m")) { System.out.println(m);
			
			while(true) {
				System.out.println("C/c:메뉴추가(생성), R/r:메뉴목록보기,U/u:메뉴수정,D/d:메뉴삭제,X/x:종료");
				String str2 = z.nextLine();
				if(str2.equals("C")|| str2.equals("c")) {
				
				while(true) {
					System.out.println("메뉴명");
					String str = s1.nextLine();
					
					if(str.equals("")) break;
					arName.add(str);
					System.out.println("가격");
					int n  = s2.nextInt();
					arPrice.add(n);
					
					
				}
			
				
				}else if(str2.equals("R") || str2.equals("r")) { 
					i=0;
					while(i<arName.size() && i<arPrice.size()) {
						
						System.out.println(arName.get(i) + arPrice.get(i)); 
						
						i++;
					}
				
			
				
				
				}else if(str2.equals("U") || str2.equals("u")) { 
					
					while(true) {
					System.out.println("수정할 메뉴번호를 입력하시오");
					int c = s2.nextInt();
					if(c==0) break;
					System.out.println("새 메뉴명");
						String str3 = s1.nextLine();
						if(str3.equals("")) break;
						System.out.println(arName.set(c-1, str3));
					System.out.println("새 가격");
						int b = s2.nextInt();
						if(b==0) break;
						System.out.println(arPrice.set(c-1,b ));
						
						
					}
				}else if(str2.equals("D") || str2.equals("d")) {
					System.out.println("삭제할 메뉴를 선택하시오");
					
					while(true) {int w = s2.nextInt();
						if(w==0)  break;
						arName.remove(w-1);
						arPrice.remove(w-1); 
						
						
							
						for(i=0;i<arName.size() && i<arPrice.size();i++ ) {
							System.out.println(arName.get(i) + arPrice.get(i));
						}
							
					
				
					
					}
				}else if(str2.equals("X") || str2.equals("x")) { System.out.println("종료");
				break;
				}
			}
		
	
	}
	else if(str1.equals("O") || str1.equals("o")) { 
		
		System.out.println("C/c: 주문작성, R/r: 주문조회 D/d:주문취소, X/x:주문완료");
		
		while(true) { String str4 =s1.nextLine();
		
		if(str4.equals("C") || str4.equals("c")) {
		int total=0;
		while(true) {
					System.out.println("주문할 메뉴선택");
					int f = s2.nextInt();
					if(f==0) break;

					arNamed.add(arName.get(f-1));
					System.out.println("주문수량 선택");
					int h = s2.nextInt();
					   
					arQty.add(h);
					System.out.println(arNamed.get(f-1)+"x"+h+"="+arPrice.get(f-1)*h);
					
					
					arSum.add(arPrice.get(f-1)*h);
				
				
					
		
		}
		for ( int w =0;w<arSum.size(); w++) {
			total += arSum.get(w);	
			
		}System.out.println(total);
			
		} else if (str4.equals("R") || str4.equals("r")) {
			
			for(int f=0;f<arNamed.size();f++ ) {
			System.out.println(arNamed.get(f)+"는"+arQty.get(f)+"개 "+arSum.get(f));
			
			}
			
				
		} else if (str4.equals("D") || str4.equals("d")) {
			
			System.out.println("주문취소하려면 0을 입력하시오");
				int y = s2.nextInt();
			
				
			arNamed.clear();
			arQty.clear();
			arSum.clear();
			
			if(y==0) break;
			
		} else { if (str4.equals("X") || str4.equals("x")) {
			System.out.print("마일리지 적립할 모바일 번호를 입렵하십시오 : "); 
			String mobile = s1.nextLine();
			for(int e = 0;e<arNamed.size();e++) {
				alName.add(arNamed.get(e));
				alQty.add(arQty.get(e));
				alSum.add(arSum.get(e));
				alMobile.add(mobile);
			}
			arName.clear(); arQty.clear(); arSum.clear();
			System.out.println("주문완료");
			break;
		}
		}
		}
	}
	else if(str1.equals("S") || str1.equals("s")) { 
		int total = 0;
		for(int w = 0; w<alName.size(); w++) {
	System.out.println(alName.get(w)+"x"+alQty.get(w)+": "+alSum.get(w)+"="+alMobile.get(w));
	total += alSum.get(w);
		}
		System.out.println("총매출액 :"+ total+"원");
		
	
	
	}else {
	}
	if(str1.equals("X") || str1.equals("x")) break;
	
	
	}System.out.println(x);
	
	
	}

}

//메뉴목록보기
//안내 주문할 메뉴번호선택(0:종료)
//주문번호 입력
//안내  수량입력(0:종료)
// 주문수량 입력
//출력 선택한 메뉴명 x 수량=금액
//주문내역 저장 -메뉴명,수량,금액
