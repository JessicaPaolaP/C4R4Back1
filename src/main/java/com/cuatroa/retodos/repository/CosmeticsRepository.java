package com.cuatroa.retodos.repository;

import com.cuatroa.retodos.model.Cosmetics;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cuatroa.retodos.repository.crud.CosmeticsCrudRepository;

/**
 *
 * @author desaextremo
 */
@Repository
public class CosmeticsRepository {
    @Autowired
    private CosmeticsCrudRepository repository;

    public List<Cosmetics> getAll() {
        return repository.findAll();
    }

    public Optional<Cosmetics> getClothe(String reference) {
        return repository.findById(reference);
    }
    
    public Cosmetics create(Cosmetics clothe) {
        return repository.save(clothe);
    }

    public void update(Cosmetics clothe) {
        repository.save(clothe);
    }
    
    public void delete(Cosmetics clothe) {
        repository.delete(clothe);
    }
    
    public List<Cosmetics> productByPrice(double precio) {
	return repository.findByPriceLessThanEqual(precio);
}
}
