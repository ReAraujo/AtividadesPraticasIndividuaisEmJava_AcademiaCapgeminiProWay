package model;

public class Base {
    public String id;


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Base){
            Base outro = (Base)obj;
            if(this.id == outro.id){
                return true;
            }
        }        
        return false;
    }
    
}
