public class UniversityGroup {

    //region fields
    private String groupName;
    private int startYear;
    private int endYear;
    private String[] studentsArray;
    //endregion

    //region constructors
    public UniversityGroup(String groupName, int startYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = startYear + 5;
    }

    public UniversityGroup(String groupName, int startYear, String[] studentsArray) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.studentsArray = studentsArray;
        this.endYear = startYear + 5;
    }

    public UniversityGroup() {
    }
    //endregion

    //region methods
    public String getGroupName() {
        return groupName;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public String[] getStudentsArray() {
        return studentsArray;
    }
    public void addStudents(String[] studentsArray){
        if(this.studentsArray == null){
            this.studentsArray = studentsArray;
        }
    }
    public void getGroupDescription(){
        System.out.println(
                "groupName: " + groupName + 
                "\nstartYear: " + startYear + 
                        "\nendYear: " + endYear
        );
        if(this.studentsArray != null){
            System.out.println("students: " );
            for (String std:this.studentsArray) {
                System.out.println(std);
            }
        }
    }
    //endregion
}

