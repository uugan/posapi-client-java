

# PostRestReceiptRequestPaymentsInnerData

Төлбөрийн нэмэлт өгөгдөл    code талбарын утга PAYMENT_CARD бол дата талбарын нэмэх боломжтой.      <!--  type: tab  title: EASY_BANK_CARD  -->    Хэрэглэгч банкны картаар төлбөр төлсөн тохиолдолд тухайн картын гүйлгээний мэдээллийг системд дамжуулна. Хэрэглэгч банкны аппликейшнд картаа ИБАРИМТ хялбар бүртгүүлэх тохиргоо хийсэн бол төлбөрийн баримтыг автоматаар баталгаажуулна.    ```json   {    \"branchNo\": \"001\",    \"totalAmount\": 5600,    \"totalVAT\": 500,    \"totalCityTax\": 100,    \"districtCode\": \"2501\",    \"merchantTin\": \"37900846788\",    \"posNo\": \"001\",    \"customerTin\": null,    \"consumerNo\": \"10038071\",    \"type\": \"B2C_RECEIPT\",    \"inactiveId\": null,    \"invoiceId\": null,    \"reportMonth\": null,    \"billIdSuffix\": \"01\",    \"postRestReceiptRequestReceipts\": [      {        \"totalAmount\": 5600,        \"taxType\": \"VAT_ABLE\",        \"merchantTin\": \"37900846788\",        \"customerTin\": null,        \"totalVAT\": 500,        \"totalCityTax\": 100,        \"bankAccountNo\": \"\",        \"iBan\": \"\",        \"items\": [          {            \"name\": \"Талх\",            \"barCode\": \"19059010880001\",            \"barCodeType\": \"GS1\",            \"classificationCode\": \"2349010\",            \"taxProductCode\": null,            \"measureUnit\": \"senlovesfits\",            \"qty\": 1,            \"unitPrice\": 5000,            \"totalVAT\": 500,            \"totalCityTax\": 100,            \"totalAmount\": 5600          }        ]      }    ],    \"payments\": [      {        \"code\": \"CASH\",        \"status\": \"PAID\",        \"paidAmount\": 4000      },      {        \"code\": \"PAYMENT_CARD\",        \"status\": \"PAID\",        \"paidAmount\": 600,        \"data\": {          \"terminalID\": \"11111\",          \"rrn\": \"123456789123\",          \"maskedCardNumber\": \"123456XXXXXX7890\",          \"easy\": true        }      },      {        \"code\": \"PAYMENT_CARD\",        \"status\": \"PAID\",        \"paidAmount\": 1000,        \"data\": {          \"terminalID\": \"111\",          \"rrn\": \"123456789121\",          \"maskedCardNumber\": \"123456XXXXXX7891\",          \"easy\": false        }      }    ]  }  ```  <!-- type: tab-end -->  

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**terminalID** | **String** | Терминал дугаар  data талбар хоосон биш бол requiered |  |
|**rrn** | **String** | Гүйлгээний давтагдашгүй дугаар  data талбар хоосон биш бол requiered |  |
|**maskedCardNumber** | **String** | Нуусан эсвэл далдласан картын дугаар  data талбар хоосон биш бол requiered |  |
|**easy** | **Boolean** | Хялбар бүртгэл хийх эсэх /Иргэнээс асууна/  true: Баримт баталгаажуулах  false: Баримт баталгаажуулахгүй  data талбар хоосон биш бол requiered |  |
|**bankCode** | **String** | Issuer талын банкны код |  [optional] |



