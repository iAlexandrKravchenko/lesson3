public class Human {
    String name;
    boolean sex;
    int age;
    Human father;
    Human mother;
    public Human(String name, boolean sex, int age, Human father, Human mother){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.father=father;
        this.mother=mother;


    }

    public Human(String аня, String женский, int age, String jora, String grisha) {
    }

    @Override
    public String toString(){
        return "Имя "+ name + " пол "+ sex + father.name + mother.name;
    }
    /*
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, двое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/
}
