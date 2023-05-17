package service;

import java.util.List;

public interface InterfaceService<T> {
    
    public abstract void criar (T objeto);
    public abstract T buscar(int codigo);
    public abstract T  buscar(String descricao);
    public abstract List<T>  buscar();
    public abstract void  atualizar(T objeto);
    public abstract void excluir(T objeto);

}
