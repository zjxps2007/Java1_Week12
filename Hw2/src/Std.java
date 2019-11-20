public class Std {
    //필드 변수
    private int score1;
    private int score2;
    private int score3;
    //생성자
    Std() {
        score1 = 0;
        score2 = 0;
        score3 = 0;
    }
    //생성자 오버로딩
    Std(int score1) {
        this.score1 = score1;
    }
    //생성자 오버로딩
    Std(int score1, int score2) {
        this.score1 = score1;
        this.score2 = score2;
    }
    //생성자 오버로딩
    Std(int score1, int score2, int score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    //평균을 리턴하는 메소드
    public double getAvg() {
        return (score1 + score2 + score3) / 3;
    }
    //같은지 비교하는 메소드
    boolean equalsScore(Std s) {
        //현제 평균과 메개변수로 받은 평균을 비교
        if (this.getAvg() == s.getAvg()) {
            return true;
        }
        return false;
    }
    //문자열로 반환
    public String toString() {
        return score1 + " " + score2 + " " + score3;
    }
}
