package pingwit.lec_4.homework.task_3;

import pingwit.lec_4.homework.task_1_4.Neighbor;


public class NeighborsArray {
    public static void main(String[] args) {

        Neighbor[] neighbor = new Neighbor[]{new Neighbor("Oleg", 29),
                new Neighbor(),
                new Neighbor("Nikolay", 36),
                new Neighbor("Pol", 20),
                new Neighbor("Igor", 48),
        };
    }
}
// массив то создал, да вот только с эквиал...опять затык....

// вам нужно переопределить методы equals/hashcode в классе Neighbor и затем при помощи цикла найти повторения
// скорее всего вариант ниже вам подойдет:

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Neighbor neighbor = (Neighbor) o;
        return Objects.equals(name, neighbor.name) && Objects.equals(age, neighbor.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}

// попробовал этот вариант - не прокатило....фигово когдапамять короткая....