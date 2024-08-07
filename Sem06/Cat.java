/*
A. Ветеринарная клиника.

    Поля:
    Кличка (name)
    Год рождения (birth date)
    Порода (breed)
    Номер паспорта (passport id)
    Окрас (color)
    Владелец (owner)
    Пол (sex)
    Прививки (vaccination)
    История посещений (visit history)

    Методы:
    Геттеры: getName(), getBreed(), getColor() ...
    Сеттеры: setName(), setBreed(), setColor() ...
    Добавить прививку addVaccination()
    Добавить посещение addVisit()
*/

import java.util.Objects;

public class Cat {
    private String name;
    private int birthYear;
    private String color;
    private String owner;

    public Cat (String name, int birthYear, String color, String owner) {
        this.name = name;
        this.birthYear = birthYear;
        this.color = color;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getColor() {
        return color;
    }

    public String getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        String result = "Name: " + name + System.lineSeparator()
        + "Birth year: " + birthYear + System.lineSeparator()
        + "Color: " + color + System.lineSeparator()
        + "Owner: " + owner;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Cat cat = (Cat) obj;

        return name.equals(cat.name) && birthYear == cat.birthYear && color.equals(cat.color) && owner.equals(cat.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear, color, owner);
    }

}
