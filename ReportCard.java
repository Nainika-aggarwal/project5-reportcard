public class ReportCard {
    private String nStudent;
    private int nRoll;
    public int nGraphicsMarks;
    public int nElectronicsMarks;
    public int nChemistryMarks;
    public int nPhysicsMarks;
    private String nGraphics;
    private String nElectronics;
    private String nChemistry;
    private String nPhysics;
    private String nGrade;


    public ReportCard(String studentName, int roll, int graphicMarks,int electronicMarks, int chemistryMarks, int physicsMarks)
    {
        nStudent = studentName;
        nRoll = roll;
        nGraphicsMarks = graphicMarks;
        nElectronicsMarks = electronicMarks;
        nChemistryMarks = chemistryMarks;
        nPhysicsMarks = physicsMarks;
        nGraphics = " ";
        nElectronics = " ";
        nChemistry = " ";
        nPhysics = " ";
        nGrade = " ";
    }
    public String getStudentName() {
        return nStudent;
    }
    public int getRollNo() {
        return nRoll;
    }
    public int getGraphicsMarks() {
        return nGraphicsMarks;
    }
    public int getElectronisMarks() {
        return nElectronicsMarks;
    }
    public int getChemistryMarks() {
        return nChemistryMarks;
    }
    public int getPhysicsMarks() {
        return nPhysicsMarks;
    }
    public String getGraphics() {
        return nGraphics;
    }
    public String getElectronics() {
        return nElectronics;
    }
    public String getChemistry() {
        return nChemistry;
    }
    public String getPhysics() {
        return nPhysics;
    }
     public void setStudentName(String studentName)
    {
        nStudent = studentName;
    }
    public void setRoll(int roll)
    {
        nRoll = roll;
    }
    public void setGraphicsMarks(int mGraphicsMarks)
    {
        nGraphicsMarks= mGraphicsMarks;
    }
    public void setElectronicsMarks(int mElectronicsMarks)
    {
        nElectronicsMarks = mElectronicsMarks;
    }
    public void setChemistryMarks(int mChemistryMarks)
    {
        nChemistryMarks = mChemistryMarks;
    }
    public void setPhysicsMarks(int mPhysicsMarks)
    {
        nPhysicsMarks = mPhysicsMarks;
    }
    public void setGraphics(int graphicsMarks)
    {
        nGraphics = gradess(graphicsMarks);
    }
    public void setElectronics(int electronicMarks)
    {
        nElectronics = gradess(electronicMarks);

    }
    public void setChemistry(int chemistryMarks)
    {
        nChemistry = gradess(chemistryMarks);
    }
    public void setPhysics(int physicsMarks)
    {
        nPhysics = gradess(physicsMarks);

    }
    public String gradess( int marks_subject)
    {
        String grade;
        if(marks_subject>90){
			grade = "A";
		}
		else if(marks_subject>80&&marks_subject<=90){
			grade = "B";
		}
		else if(marks_subject>70&&marks_subject<=80){
			grade = "C";
		}
		else if(marks_subject>50&&marks_subject<=70){
			 grade  = "D";
		}
		else if(marks_subject>30&&marks_subject<=50){
			grade = "E";
		}
		else{
			grade = "F";
		}
		return grade;
    }
    @Override
    public String toString() {
        return getStudentName() + "\n" +getRollNo() + "\n Engineering Graphics " + getGraphics() + "\n Basic Electronic " + getElectronics() + "\n Chemistry " + getChemistry() + "\n Physics " + getPhysics() ;
    }
}
