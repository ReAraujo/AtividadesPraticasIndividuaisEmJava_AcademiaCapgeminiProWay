package AtividadePratica37_Java_II_Revisao.model;

public abstract class Base {
    public String id;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Base){
            Base outraBase = (Base)obj;
            if(this.id == outraBase.id){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n\tID: " + this.id;
    }

}
