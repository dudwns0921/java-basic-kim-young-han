package class1;

// 배열로 관리하면 코드가 간단해지지만, 학생이라는 개념을 하나로 묶지 않아 데이터가 분산된 형태라 데이터를 변경할 때 오류가 날 위험이 높다.

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2", "학생3"};
        int[] studentAges = {15, 16, 17};
        int[] studentGrades = {80, 90, 100};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrades[i]);
        }
    }
}
