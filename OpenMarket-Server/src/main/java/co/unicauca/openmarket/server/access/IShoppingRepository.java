package co.unicauca.openmarket.server.access;

import co.unicauca.openmarket.client.domain.Shopping;
import java.util.List;

/**
 *
 * @author 
 */
public interface IShoppingRepository {
    boolean save(Shopping shopping);
   
    boolean edit(Long id, Shopping shopping);
   
    boolean delete(Long id);
   
    public Shopping findByproductId(Long productid);
   
    List<Shopping> findAll();
   
    List<Shopping> findByName(String name);
}
