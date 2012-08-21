/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resumecollectiongui;

/**
 *
 * @author Michael.Wiser
 */
public class Applicant implements java.io.Serializable {
    //i have now changed something. but what did i change?
    private String name = "";
    private String school = "";
    private String degree = "";
    int category = 0;
    private String phoneNotes = "";
    private String interviewNotes = "";
 //   private String resumeLocation = "";
    private boolean emailSent = false;
    private int gradYear = 0;
    private int gradMonth = 0;
    
    public Applicant(){
        
    }
    public Applicant(String n, String s, String deg, int Cat, String phNotes, String intNotes, boolean emailS, int gradY, int gradM ){
        name = n;
        school = s;
        degree = deg;
        category = Cat;
        emailSent = emailS;
        gradYear = gradY;
        gradMonth = gradM;
        
        
    }
    public void Display(){
        System.out.println(name);
            System.out.println(school);
                System.out.println(emailSent);
                    System.out.println(gradYear);
                        System.out.println(gradMonth);
    }
   
    
    
   ///Getters and Setters 
   public String getName() {
      return this.name;
   }
   public void setName(String othName) {
      this.name = othName;
   }
   public String getSchool() {
      return this.school;
   }
   public void setSchool(String othSchool) {
      this.school = othSchool;
   }
   public String getDegree(){
       return this.degree;
   }
   public void setDegree(String deg){
       this.degree = deg;
   }
   public int getCategory(){
       return this.category;
   }
   
   public String getPhoneNotes() {
      return this.phoneNotes;
   }
   public void setPhoneNotes(String othPhone) {
      this.phoneNotes = othPhone;
   }
   public String getInterviewNotes(){
       return this.interviewNotes;
   }
   public void setInterviewNotes(String othNotes){
       this.interviewNotes = othNotes;
   }     
   public boolean getEmailSent(){
       return this.emailSent;
   }  
   public void setEmailSent(boolean othSent){
       this.emailSent = othSent;
   }
   public int getGradYear(){
       return this.gradYear;
   }
   public void setGradYear(int othYear){
       this.gradYear = othYear;
   }
   public int getGradMonth(){
       return this.gradMonth;
   }
   public void setGradMonth(int othMonth){
       this.gradMonth = othMonth;
   }
   
}
