/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author aluno
 */
public interface InterfaceDAO<T> {
    
     public T create(T t);
     public T update(T t);
     public T search(T t);
     public List<T> search();
     public void remove(T t);
}
