

# GetApiInfoCheckGetInfo200ResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Татвар төлөгчийн нэр |  |
|**freeProject** | **Boolean** | 1.Талбарын утга: НӨАТ-аас чөлөөлөгдөх төсөл эсэхийг илэрхийлнэ.  true → НӨАТ-аас чөлөөлөгдөх төсөл  false → НӨАТ-аас чөлөөлөгдөх төсөл биш    2.true үед (/postRestReceiptRequestReceipt сервис рүү дамжуулах)  Хэрэв тухайн татвар төлөгчийн төсөл НӨАТ-аас чөлөөлөгдөх бол:  /postRestReceiptRequestReceipt сервисийн  postRestReceiptRequestReceipts[].taxType → VAT_FREE  postRestReceiptRequestReceipts[].items[].taxProductCode → \&quot;304\&quot;    3.false үед  Хэрэв НӨАТ-аас чөлөөлөгдөх төсөл биш бол:  vatFreeProject → false |  |
|**cityPayer** | **Boolean** | Хэрэв байгууллага нь НХАТ суутган төлөгч бол уг талбарт true утгыг илгээнэ.  Энэхүү нөхцөл нь зөвхөн Улаанбаатар хотод үйл ажиллагаа явуулж буй салбаруудад хамаарна. |  |
|**vatPayer** | **Boolean** | НӨАТ суутган төлөгч мөн эсэх  true — НӨАТ суутган төлөгч  false — НӨАТ суутган төлөгч биш |  |
|**found** | **Boolean** | Татвар төлөгч мөн эсэх |  |
|**vatpayerRegisteredDate** | **String** | НӨАТ суутган төлөгчөөр бүртгэгдсэн огноо |  |
|**isGovernment** | **Boolean** | isGovernmentOrganization — Тухайн байгууллага төрийн байгууллага эсэхийг илтгэнэ.  true — Төрийн байгууллага  false — Төрийн байгууллага биш |  |



