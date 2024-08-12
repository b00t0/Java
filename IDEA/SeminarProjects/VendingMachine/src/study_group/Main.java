package study_group;

import study_group.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addStudent("Jack", 18);
        service.addStudent("John", 20);
        service.addStudent("Tracy", 19);
        service.addStudent("Jane", 21);

        System.out.println(service.getStudentsListInfo());
        service.sortByName();
        System.out.println(service.getStudentsListInfo());
        service.sortByAge();
        System.out.println(service.getStudentsListInfo());
    }
}
