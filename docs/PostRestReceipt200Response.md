

# PostRestReceipt200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Багц төлбөрийн баримтын ДДТД  33 оронтой тоо |  |
|**posId** | **BigDecimal** | PosAPI-н системийн дугаар |  |
|**status** | **String** | Баримтын төлөв |  |
|**message** | **String** | Тайлбар утга |  |
|**qrDate** | **String** | QR Code-н утга |  |
|**lottery** | **String** | Сугалааны дугаар |  |
|**date** | **LocalDate** | Баримт хэвэлсэн огноо |  |
|**easy** | **String** | Хялбар бүртгэл хийгдсэн эсэх  true - хялбар бүртгэлд бүртгэсэн  false - хялбар бүртгэлд бүртгээгүй |  |
|**postRestReceiptRequestReceipts** | [**List&lt;PostRestReceipt200ResponseReceiptsInner&gt;**](PostRestReceipt200ResponseReceiptsInner.md) | Баримтын мэдээлэл |  |



