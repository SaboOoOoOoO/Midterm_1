package midterm.saba_giorbelidze_1.task1;

import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    // TODO change studentName to your name
    private String studentName = "Saba Giorbelidze";

    @Override
    public String getHeadphones1() {
        return "Some Headphones";
    }

    @Override
    public String getLure2() {
        return "A lure";
    }
    @Override
    public String methodAudit3(String argSnake5) {
        return "Audit result for: " + argSnake5;
    }

    @Override
    public List<String> methodSong4(String argSales6) {
        return List.of("Song 1", "Song 2", "Song 3");
    }

    public String toString() {
        String result = "Fantasy{" +
                "studentName='" + studentName + '\'' +
                '}';

        // TODO must be implemented
        return result;
    }
}
