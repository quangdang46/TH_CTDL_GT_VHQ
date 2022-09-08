public class SV {
    private int id;
    private String name,sex;
    public SV(){

    }
    public SV(int id,String name,String sex){
        this.id=id;
        this.name=name;
        this.sex=sex;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public boolean equals(int id){
        return this.id==id;
    }
    public String toString(){
        return this.id+"_"+this.name+"_"+this.sex;
    }
}