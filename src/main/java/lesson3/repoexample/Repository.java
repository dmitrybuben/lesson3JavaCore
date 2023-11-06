package lesson3.reposample;

import java.util.Collection;
// Обобщенный интерфейс 
public interface Repository<T, Tid> {
    int add(T item);

    int update(T item);

    //удалить по идентификатору
    int delete(Tid tid);

    //получить по идентификатору из базы
    T get(Tid tid);

    //вернуть коллекцию объектов
    Collection<T> getAll();

}
