package ro.emailApp;

public enum Department {
    IT,SALES,DEVELOPMENT,ACCOUNTING,NONE;

    public static Department returnDepartmentFromString(String department) {
        for(Department d: Department.values()) {
            if(department.equalsIgnoreCase(d.name())) return d;
        }
        return NONE;
    }

    public static String allDepartments() {
        StringBuilder allDepartments = new StringBuilder();
        for(Department d: Department.values()) {
            int departmentIndex = d.ordinal();
            if(departmentIndex == (Department.values().length-2)) {
                allDepartments.append(d.name());
            } else if(departmentIndex != (Department.values().length-1)) {
                allDepartments.append(d.name());
                allDepartments.append(", ");
            }
        }
        return allDepartments.toString();
    }
}
