public class Project {
    
    private String name;
    private String date;
    private String description;
    private String criteria;
    

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setDueDate(String d){
        this.date = d;
    }
    public String getDueDate(){
        return date;
    }
    public void setDescription(String descr){
        this.description = descr;
    }
    public String getDescription(){
        return description;
    }
    public void setClientCriteria(String crit){
        this.criteria = crit;
    }
    public String getClientCriteria(){
        return criteria;
    }

}
