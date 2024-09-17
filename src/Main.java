public class Main {
    public static void main(String[] args) {
        Task1();
    }

    private static void Task1() {
        System.out.println("Task 1");
//        С именем firstName — для хранения имени.
//        С именем middleName— для хранения отчества.
//        С именем lastName— для хранения фамилии.
//        С именем fullName— для хранения Ф. И. О. сотрудника в формате «Фамилия Имя Отчество». Ivanov Ivan Ivanovich.
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println();

        Task2(fullName);
    }

    private static void Task2(String fullName) {
        System.out.println("Task 2");
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperCaseFullName);

        System.out.println();

        Task3();

    }

    private static void Task3() {
        String fullName;
        System.out.println("Task 3");
        // fullName и данные в ней — «Иванов Семён Семёнович».

        fullName = "Иванов Семён Семёнович";
        String replaceFullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + replaceFullName);
    }
}