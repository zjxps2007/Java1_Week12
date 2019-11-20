public class StdTest {
    public static void main(String[] args) {
        //생성자 호출
        Std s1 = new Std();
        Std s2 = new Std(50);
        Std s3 = new Std(25, 25);
        Std s4 = new Std(80, 60, 50);
        //출력
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        //값 비교
        if(s2.equalsScore(s3))
            System.out.println("s2와 s3의 평균 점수가 같습니다.");
        else
            System.out.println("s2와 s3의 평균 점수는 다릅니다.");

        if(s2.equalsScore(s4))
            System.out.println("s2와 s4의 평균 점수가 같습니다.");
        else
            System.out.println("s2와 s4의 평균 점수는 다릅니다.");
    }
}
