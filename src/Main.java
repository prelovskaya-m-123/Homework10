public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        String firstName = "Ivanov";
        String firstName1 = firstName.trim();
        String middleName = "Ivan";
        String middleName1 = middleName.trim();
        String lastName = "Ivanovich";
        String lastName1 = lastName.trim();
        String fullName = firstName1 + " " + middleName1 + " " + lastName1;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println();
        System.out.println("Task2");
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName1);
        System.out.println();
        System.out.println("Task3 ");
        String firstName2 = "Иванов";
        String middleName2 = "Семён";
        String lastName2 = "Семёнович";
        String fullName2 = firstName2 + " " + middleName2 + " " + lastName2;
        String fullName3 = fullName2.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName3);
    }
}