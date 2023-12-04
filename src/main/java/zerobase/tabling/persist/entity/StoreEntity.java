package zerobase.tabling.persist.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import zerobase.tabling.model.Store;

import javax.persistence.*;

@Entity(name = "STORE")
@Getter
@ToString
@NoArgsConstructor
public class StoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;
    private String storeName;
    private String storeAddr;
    private String storeTelNum;
    private String storeDescription;


    public StoreEntity(Store store){
        this.storeId = store.getStoreId();
        this.storeName = store.getStoreName();
        this.storeAddr = store.getStoreAddr();
        this.storeTelNum = store.getStoreTelNum();
        this.storeDescription= store.getStoreDescription();
    }
}
