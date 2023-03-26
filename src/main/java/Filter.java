import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int count = 0;
        logger.log("Запускаем фильтрацию");
        for (Integer i : source) {
            if (i < treshold) {
                logger.log("Элемент " + i + " не проходит");
            } else {
                logger.log("Элемент " + i + " проходит");
                result.add(i);
                count++;
            }
        }
        logger.log("Прошло " + count + " элемент(а/ов) из " + source.size());
        return result;
    }
}