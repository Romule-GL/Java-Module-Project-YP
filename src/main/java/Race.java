import java.util.ArrayList;
public class Race {
    /// Сптско лидеров, на тот случай если больше одной машинки имеет максимальный, одинаковый пробег.
    private ArrayList<Car> leaders = new ArrayList<>();

    /// Метод вычисляет лидера или лидеров, и возвращает список лидирующих машинок.
    public ArrayList<Car> getRaceLeaders(Car[] cars){
        int maxDistance = 0; // Первоначальная инициализация максимальной дистанции.
        for (Car car: cars){
            int distance = car.getDistanceIn24Hours(); // Вычисление пройденной дистанции.

            if(distance > maxDistance){ //Если машинка лидер:
                maxDistance = distance;
                leaders.clear(); // Очищаем список лидеров,
                leaders.add(car); //Добавляем машинку в лидеры.
            }
            else if (distance == maxDistance){ //Если машинка второй лидер:
                leaders.add(car); //Добавляем машинку в лидеры.
            }
        }
        return leaders; //Возвращаем список лидеров.
    }
}
