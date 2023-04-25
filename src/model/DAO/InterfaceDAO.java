package model.DAO;

import java.util.List;

public interface InterfaceDAO<T> {

    public abstract T create(T objeto);
    public abstract T search(int codigo);
    public abstract T search (String descricao);
    public abstract List <T> search();
    public abstract void update(T objeto);
    public abstract void delete(T objeto);   
}
