import java.util.ArrayList;

public class QuanLiSV {
    private ArrayList<SV> sv;
    public QuanLiSV(){
        sv=new ArrayList<SV>();
    }
    public void print(){

        for(SV x:sv){
            System.out.println(x);
        }

    }
    public void add(SV temp){
        sv.add(temp);
    }
    public void remove(int id){
        for(int i=0;i<sv.size();i++){
            if(sv.get(i).equals(id)){
                sv.remove(i);
            }
        }
    }
    public void update(int id,int newId){
        for(SV x:sv){
            if(x.equals(id)){
                x.setId(newId);
            }
        }
    }

    
}
