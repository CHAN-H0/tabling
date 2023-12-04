package zerobase.tabling.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Store {

    private Long storeId;
    private String storeName;
    private String storeAddr;
    private String storeTelNum;
    private String storeDescription;
    private String storeMangerId;
}
