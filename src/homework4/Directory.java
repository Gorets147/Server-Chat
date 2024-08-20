package homework4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Directory {

    List<Employee> employees = new ArrayList<Employee>();

    public Directory() {
    }

    public Directory(Employee... employee) {
        employees.addAll(Arrays.asList(employee));
    }

    /**
     * Добавляет сотрудника в справочник
     *
     * @param employee экземпляр класса Employee
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public int getSize() {
        return employees.size();
    }

    /**
     * Метод ищет сотрудника по табельному номеру
     *
     * @param index табельный номер сотрудника
     * @return возращает экземпляр класса Employee
     */
    public Employee getEmployee(int index) {
        try {
            return employees.get(index);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }


    /**
     * Метод ищет сотрудника по имени
     *
     * @param name имя сотрудника
     * @return возращает экземпляр класса Employee
     */
    public Employee getEmployee(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }
        return null;
    }

    /**
     * Метод ищет сотрудника по стажу
     *
     * @param expYears стаж в годах сотрудника
     * @return возращает экземпляр класса Employee
     */
    public Employee getEmployee(byte expYears) {
        for (Employee employee : employees) {
            if (employee.getExpYears() == expYears) {
                return employee;
            }
        }
        return null;
    }

    /**
     * Метод возращает номер телефона сотрудника по Имени.
     *
     * @param name имя сотрудника
     * @return Если есть совпадения метод вернёт int number, если совпадений нет то -1
     */
    public int getNumber(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                return employee.getNumber();
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String res = "";
        for (Employee employee : employees) {
            res += employee.toString() + "\n";
        }
        return res;
    }


}
