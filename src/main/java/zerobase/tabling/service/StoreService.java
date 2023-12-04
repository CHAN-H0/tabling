package zerobase.tabling.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.Store;
import org.springframework.stereotype.Service;
import zerobase.tabling.persist.StoreRepository;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class StoreService {


    private final StoreRepository storeRepository;
    public Store save(Store store){
        return null;
    }
    public List<Store> getAllStores() {
        return null;
    }
}
