package pl.olejarz.ocrscannertess4jswagger2flywaylombok;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphicRepo extends CrudRepository<Graphic,Integer> {


}
