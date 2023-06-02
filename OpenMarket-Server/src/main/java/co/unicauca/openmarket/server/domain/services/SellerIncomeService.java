package co.unicauca.openmarket.server.domain.services;

import co.unicauca.openmarket.client.domain.SellerIncome;
import co.unicauca.openmarket.server.access.ISellerIncomeRepositoy;
import java.util.List;

/**
 *
 * @author 
 */
public class SellerIncomeService {
      /**
     * Repositorio de Category
     */
     ISellerIncomeRepositoy repo;
     /**
     * Constructor parametrizado. Hace inyeccion de dependencias
     *
     * @param repo repositorio de tipo ICategoryRepository
     */
     public SellerIncomeService(ISellerIncomeRepositoy repo) {
        this.repo = repo;
    }
    public boolean save(SellerIncome sellerIncome){
       return repo.save(sellerIncome);
    }
    public List<SellerIncome> findAll(){
        return repo.findAll();
    }
}
