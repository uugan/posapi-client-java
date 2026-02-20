# posapi-client

PosAPI 3.0 системийн API холболт зааврууд
- API version: 3.0
  - Build date: 2026-02-20T23:06:56.543975400+08:00[Asia/Ulaanbaatar]
  - Generator version: 7.19.0

---
stoplight-id: 8mw1byololjkv 
---

## ЦАХИМ ТӨЛБӨРИЙН БАРИМТЫН СИСТЕМ POS API 3.0

### Холбоо барих мэдээлэл

| № | Төрөл | Холбоо барих | Хариуцагч |
| -------- | ------- | ------- | ------- |
| 1  | Цахим шуудан хаяг | posapi@itc.gov.mn | Б.Булганжаргал   |
| 1  | Утас | 99974468 | Б.Булганжаргал   |

### Танилцуулга 

<!-- theme: none -->

> **1.1. Хэрэглэгчийн систем болон PosAPI нь REST service ашиглан мэдээлэл солилцдог болсон нь өмнөх хувилбараас давуу талтай.**
> PosAPI 2.0 хувилбар нь програмын сан байдлаар хөгжүүлэгдсэн бөгөөд хэрэглэгчийн системд суурилж ажилладаг. Иймд тухайн хэрэглэгчийн системээс хэт хамааралтай, өөрчлөлт шинэчлэлтийг хийх боломжгүй байдаг. PosAPI 3.0-н хувьд бие даасан тусдаа service application тул хэрэглэгчийн системээс үл хамааран ажилладаг. Энэ нь дээрх 2.0 хувилбар дээр гарч байсан алдаа дутагдлыг арилгаж өгч байна.PosAPI 2.0 нь хэрэглэгчийн системийн нэг хэсэг болж ажиллахын тулд мэдээллийг function ашиглан солилцдог байсныг 3.0 хувилбар дээр өөрчлөн REST WebService ашиглан солилцдог болсон. Мөн хэрэглэгчийн систем болон PosAPI-н хоорондоо Server-Client хэлбэрээр ажиллах бүрэн боломжийг нээж өгсөн.

- [POS API 3.0 татах (Бодит орчин)](https://share.itc.gov.mn/share/developer/PosService_3.0.12-Prod.zip)
- [POS API 3.0 татах (Хөгжүүлэлтийн орчин)](https://share.itc.gov.mn/share/developer/ST_PosService_3.0.12-Staging.zip)

<!-- theme: none -->

> **1.2. Нэг PosAPI-г хэд хэдэн этгээд ашиглан,баримтын мэдээлэл солилцох боломжийг бүрдүүлсэн.**
> PosAPI 2.0 хувилбар нь зөвхөн нэг иргэн, ААН-ийн баримтыг хүлээн авах боломжтой байсан. Энэ нь > > сервер шийдэл бүхий хэрэглэгчийн системийн хувьд төвөгтэй шийдэл юм. Харин PosAPI 3.0 хувилбарын > хувьд энэхүү асуудлыг бүрэн шийдвэрлэсэн.
> PosAPI 3.0 хувилбар нь өөр дээрээ нэг болон түүнээс дээш тооны ААН, иргэнийг бүртгэн,тэдгээрийн > баримтыг бүртгэх боломжтой болсон.

### PosAPI тохируулах: 

> PosAPI нь суусны дараа анхны байдлаар тохируулах шаардлагатай. “posapi.ini” файлд тухайн PosAPI-н үндсэн тохиргоо байрлах ба “P101.poi, P102.poi” файлуудад ажиллагааны тохиргоо байрлах ба нууцлагдсан байна.

Үндсэн тохиргооны тайлбар /posapi.ini файл/

| Нэр              | Талбар                                                                        |
| ---------------- | ----------------------------------------------------------------------------- |
| authUrl          | Тухайн PosAPI-н нэгдсэн нэвтрэлттэй холбогдох тохиргоо./Өөрчлөх шаардлагагүй/ |
| authRealm        | Тухайн PosAPI-н нэгдсэн нэвтрэлттэй холбогдох тохиргоо./Өөрчлөх шаардлагагүй/ |
| authClientId     | Тухайн PosAPI-н нэгдсэн нэвтрэлттэй холбогдох тохиргоо./Өөрчлөх шаардлагагүй/ |
| authClientSecret | Тухайн PosAPI-н нэгдсэн нэвтрэлттэй холбогдох тохиргоо./Өөрчлөх шаардлагагүй/ |
| ebarimtUrl       | Ebarimt системтэй холбогдох хаяг. /Өөрчлөх шаардлагагүй/                      |
| db               | Өгөгдлийн сангийн driver.                                                     |
| dbHost           | Өгөгдлийн сангийн хаяг. /Хэрэв QSQLITE бол файлын зам байна/                  |
| dbPort           | Өгөгдлийн сангийн port. /Хэрэв QSQLITE бол бөглөхгүй/                         |
| dbUser           | Өгөгдлийн сангийн хэрэглэгчийн нэр. /Хэрэв QSQLITE бол бөглөхгүй/             |
| dbPass           | Өгөгдлийн сангийн нууц үг. /Хэрэв QSQLITE бол бөглөхгүй/                      |
| dbName           | Өгөгдлийн сангийн баазын нэр. /Хэрэв QSQLITE бол бөглөхгүй/                   |
| dbOptions        | Өгөгдлийн сангийн нэмэлт тохиргоо. /Хэрэв QSQLITE бол бөглөхгүй/              |
| workDir          | PosAPI-н ажиллагааны хавтас                                                   |
| webServiceHost   | PosAPI-н ажиллах сүлжээний IP address                                         |
| webServicePort   | PosAPI-н ажиллах сүлжээний port                                               |

<!-- theme: none -->
⚠ Анхаарах зүйлс:
\"workDir\" хавтсанд байрлах тохиргооны файлууд тогтмол өөрчлөгдөж байдаг тул PosAPI-г ажиллуулж буй хэрэглэгч нь унших, бичих эрхтэй байх шаардлагатай. Уг хавтсыг \"FREEZE\" хийж болохгүй

PosAPI-н дэмжиж ажиллах өгөгдлийн сангууд ба driver-ууд

| Нэр     | Талбар                        |
| ------- | ----------------------------- |
| QMYSQL  | MySQL эсвэл MariaDB           |
| QPSQL   | PostgreSQL                    |
| QODBC   | ODBC for Microsoft SQL Server |
| QSQLITE | SQLite version 3              |

⚠ Анхаарах зүйл:
PosAPI нь ачаалагдах үедээ өгөгдлийн сангийн хүснэгтүүдийг автоматаар үүсгэдэг. Тиймээс уг тохиргоог хийх хэрэглэгч нь хүснэгт үүсгэх эрхтэй байх шаардлагатай.
Сүлжээний тохиргоо:

Тохиргоо | Шаардлага
---------|----------
 Хадгалах сан (Storage) | Хамгийн багадаа 1GB сул зайтай байх 
 Сүлжээний хурд | Хамгийн багадаа 80 Mbps 
 Хандах эрхийн нөхцөл | Зөвхөн Монгол Улсын сүлжээнээс хандах боломжтой /Гадаадаас холбогдох бол Монгол IP-тэй VPN ашиглана./

>Зөвшөөрөгдсөн IP хаягууд /Network/: 
Домэйн | Серверийн IP 
---------|----------
 api.ebarimt.mn  | 103.17.108.216, 103.17.108.217
 auth.itc.gov.mn | 103.87.69.75, 103.87.69.76
> PosAPI нь үндсэн тохиргоогоор SQLITE баазыг сонгосон байдаг бөгөөд уг тохиргоо нь цөөн тооны баримт үйлддэг хэрэглэгчийн системд илүү тохиромжтой байдаг. Харин олон тооны баримт үйлддэг хэрэглэгчийн системд SQLITE бааз нь зохимжгүй бөгөөд бусад төрлийн баазыг ашиглах нь илүү үр дүнтэй.

### PosAPI идэвхжүүлэх:

> PosAPI суулгасны дараа идэвхгүй төлөвт байдаг ба уг төлөвт аль ч сервисийг дуудсан ажиллахгүй. Идэвхжүүлэхийн тулд PosAPI систем рүү оператор эрх бүхий иргэн нэвтэрч орох шаардлагатай. Хэрэв нэвтрэх үйлдэл хийгдсэн бол PosAPI ийг идэвхжүүлэх процесс дуудагдаж, тухайн PosAPI-г нэвтэрсэн операторын бүртгэлд бүртгэж шинээр сугалааны дугаар авна.

![image001.png](../assets/images/image001.png)

PosAPI-руу хандах port нь posapi.ini файлд тохируулсан port байна /default port: 7080/.
Мөн тухайн иргэн нь хэд хэдэн операторын эрхтэй байж болох бөгөөд PosAPI-г идэвхжүүлэхдээ зөвхөн нэг оператороо сонгон идэвхжүүлнэ

![image002.png](../assets/images/image002.png)

PosAPI амжилттай идэвхэжсэн үед дараах байдлаар харагдана.

![es.png](../assets/images/es.png)

> Эм, эмнэлгийн хэрэгслийн чанар, аюулгүй байдал, хангамж, хүртээмжийг нэгдсэн цахим тогтолцоогоор хянах, цахимжилтыг эрчимжүүлэх зорилгоор шинэчлэн батлагдсан Эм, эмнэлгийн хэрэгслийн тухай 11 дүгээр зүйлийн 11.1.7, 47 дугаар зүйлийн 47.11.1, 47.12 зүйлд тус тус заасны дагуу эм, эмнэлгийн хэрэгсэл борлуулагч этгээд нь эм, эмнэлгийн хэрэгслийн цувралын дугаар, стандарт код, тоо хэмжээг төлбөрийн баримтад тусган, цахим санд хадгалах боломжийг бүрдүүлсэн. Дээрх өөрчлөлтийн дагуу тухайн төрлийн бүтээгдэхүүн борлуулагч \"Эмийн сан\"-ийн PosAPI системд \"Посын нөхцөл\" хэсгийн \"Эмийн сан\" сонголтыг сонгон хадгална. Мөн төлбөрийн баримт үүсгэх JSON-д цувралын дугаарыг нэмэлтээр оруулна.

Анхаарах зүйлс :

1. Эмийн сангийн POSAPI 3.0 холболт бол заавал эмийн сан гэсэн checkbox сонголтыг идэвхжүүлж хадгалах.
2. Эмийн сан check хийсэн үед эмийн бүтээгдэхүүнүүдийн хамт нэг дэд баримтад илгээнэ
3. \"data\":{\"lotNo\":\"эмийн бүтээгдэхүүний цувралын дугаар\"} илгээхийг анхаарна уу.

<!-- theme: warning -->

### Кодын жагсаалт:

- [Бүтээгдэхүүн үйлчилгээний нэгдсэн ангиллын код](https://share.itc.gov.mn/share/developer/gs1\\_gs1.xlsx)

### Өөрчлөлтийн түүх

| № | Хувилбар | Огноо | Тайлбар | Хариуцагч |
| -------- | ------- | ------- | ------- | ------- |
| 1  | 1.0.0 | 03/31/2025 | Гарын авлага боловсруулав | Б.Мөнгөнчимэг   |


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 11+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.github.uugan.pos</groupId>
  <artifactId>posapi-client</artifactId>
  <version>3.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'posapi-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'posapi-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.github.uugan.pos:posapi-client:3.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/posapi-client-3.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:

import com.github.uugan.posapi.PosApiClient;
import com.github.uugan.posapi.PosApiException;
import com.github.uugan.posapi.Configuration;
import com.github.uugan.posapi.model.*;
import com.github.uugan.posapi.api.PosApi;

public class Example {
    public static void main(String[] args) {
        PosApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PosApi apiInstance = new PosApi(defaultClient);
        DeleteRestReceiptRequest deleteRestReceiptRequest = new DeleteRestReceiptRequest(); // DeleteRestReceiptRequest | 
        try {
            apiInstance.deleteRestReceipt(deleteRestReceiptRequest);
        } catch (PosApiException e) {
            System.err.println("Exception when calling PosApi#deleteRestReceipt");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        //why BigDecimal:
        // double inaccuracy
        double a = 0.1;
        double b = 0.2;
        System.out.println("double 0.1 + 0.2 = " + (a + b)); // prints 0.30000000000000004

        // Bad BigDecimal construction from double (captures binary approximation)
        BigDecimal bad = new BigDecimal(0.1);
        System.out.println("new BigDecimal(0.1) = " + bad); // 0.100000000000000005551...

        // Correct BigDecimal construction
        BigDecimal goodFromString = new BigDecimal("0.1");
        BigDecimal goodFromValueOf = BigDecimal.valueOf(0.1); // uses long bits, safer than new BigDecimal(double)
        System.out.println("BigDecimal(\"0.1\") = " + goodFromString); // exact 0.1
        System.out.println("BigDecimal.valueOf(0.1) = " + goodFromValueOf); // exact 0.1

        // Arithmetic with BigDecimal
        BigDecimal bdSum = goodFromString.add(new BigDecimal("0.2"));
        System.out.println("BigDecimal 0.1 + 0.2 = " + bdSum); // 0.3 exact

        // equals vs compareTo
        BigDecimal x = new BigDecimal("1.0");
        BigDecimal y = new BigDecimal("1");
        System.out.println("x.equals(y) = " + x.equals(y));       // false (scale differs)
        System.out.println("x.compareTo(y) == 0 => " + (x.compareTo(y) == 0)); // true

        // Rounding / scale example for currency (2 decimal places)
        BigDecimal price = new BigDecimal("10.005");
        BigDecimal rounded = price.setScale(2, RoundingMode.HALF_UP);
        System.out.println("rounded 10.005 -> " + rounded); // 10.01

        // Practical tip for monetary sums
        BigDecimal qty = new BigDecimal("3");
        BigDecimal unitPrice = new BigDecimal("19.99");
        BigDecimal total = qty.multiply(unitPrice).setScale(2, RoundingMode.HALF_UP);
        System.out.println("total = " + total); // 59.97
        
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**deleteRestReceipt**](docs/DefaultApi.md#deleteRestReceipt) | **DELETE** /rest/postRestReceiptRequestReceipt | Төлбөрийн баримт буцаах
*DefaultApi* | [**getApiInfoCheckBarcodeAll**](docs/DefaultApi.md#getApiInfoCheckBarcodeAll) | **GET** /api/info/check/barcode/all | Баркод жагсаалтаар лавлах
*DefaultApi* | [**getApiInfoCheckBarcodeV2**](docs/DefaultApi.md#getApiInfoCheckBarcodeV2) | **GET** /api/info/check/barcode/v2/{p4}/{p5}/{p1}/{p2}/{p3}/{p6} | БҮНА, бараа бүтээгдэхүүний ангилал, баркод лавлах
*DefaultApi* | [**getApiInfoCheckGetBranchInfo**](docs/DefaultApi.md#getApiInfoCheckGetBranchInfo) | **GET** /api/info/check/getBranchInfo | District_code лавлах
*DefaultApi* | [**getApiInfoCheckGetInfo**](docs/DefaultApi.md#getApiInfoCheckGetInfo) | **GET** /api/info/check/getInfo | Бүртгэлийн мэдээлэл лавлах
*DefaultApi* | [**getApiInfoCheckGetTinInfo**](docs/DefaultApi.md#getApiInfoCheckGetTinInfo) | **GET** /api/info/check/getTinInfo | Татвар төлөгчийн дугаар лавлах /ТIN, Civil_id/
*DefaultApi* | [**getApiInventoryStockGetStockQr**](docs/DefaultApi.md#getApiInventoryStockGetStockQr) | **GET** /api/inventory/stock/getStockQr | ОАТ барааны баркодын мэдээлэл лавлах /QR/
*DefaultApi* | [**getApiReceiptReceiptGetProductTaxCode**](docs/DefaultApi.md#getApiReceiptReceiptGetProductTaxCode) | **GET** /api/postRestReceiptRequestReceipt/postRestReceiptRequestReceipt/getProductTaxCode | VAT_FREE, VAT_ZERO, NO_VAT бараа, үйлчилгээний код лавлах
*DefaultApi* | [**getRestBankAccountstinTIN**](docs/DefaultApi.md#getRestBankAccountstinTIN) | **GET** /rest/bankAccounts | Банкны дансны мэдээлэл лавлах
*DefaultApi* | [**getRestInfo**](docs/DefaultApi.md#getRestInfo) | **GET** /rest/info | Ажиллагааны мэдээлэл хүлээн авах
*DefaultApi* | [**getRestSendData**](docs/DefaultApi.md#getRestSendData) | **GET** /rest/sendData | Төлбөрийн баримтын нэгдсэн системд мэдээлэл илгээх
*DefaultApi* | [**postApiTpiReceiptSaveOprMerchants**](docs/DefaultApi.md#postApiTpiReceiptSaveOprMerchants) | **POST** /api/tpi/postRestReceiptRequestReceipt/saveOprMerchants | Оператороос мерчант бүртгэх хүсэлт илгээх
*DefaultApi* | [**postRestReceipt**](docs/DefaultApi.md#postRestReceipt) | **POST** /rest/postRestReceiptRequestReceipt | Төлбөрийн баримт хадгалах


## Documentation for Models

 - [DeleteRestReceiptRequest](docs/DeleteRestReceiptRequest.md)
 - [GetApiInfoCheckBarcodeAll200Response](docs/GetApiInfoCheckBarcodeAll200Response.md)
 - [GetApiInfoCheckBarcodeAll200ResponsePageable](docs/GetApiInfoCheckBarcodeAll200ResponsePageable.md)
 - [GetApiInfoCheckBarcodeAll200ResponsePageableSort](docs/GetApiInfoCheckBarcodeAll200ResponsePageableSort.md)
 - [GetApiInfoCheckBarcodeAll200ResponseSort](docs/GetApiInfoCheckBarcodeAll200ResponseSort.md)
 - [GetApiInfoCheckGetBranchInfo200Response](docs/GetApiInfoCheckGetBranchInfo200Response.md)
 - [GetApiInfoCheckGetBranchInfo200ResponseDataInner](docs/GetApiInfoCheckGetBranchInfo200ResponseDataInner.md)
 - [GetApiInfoCheckGetInfo200Response](docs/GetApiInfoCheckGetInfo200Response.md)
 - [GetApiInfoCheckGetInfo200ResponseData](docs/GetApiInfoCheckGetInfo200ResponseData.md)
 - [GetApiInfoCheckGetTinInfo200Response](docs/GetApiInfoCheckGetTinInfo200Response.md)
 - [GetApiInventoryStockGetStockQr200Response](docs/GetApiInventoryStockGetStockQr200Response.md)
 - [GetApiReceiptReceiptGetProductTaxCode200Response](docs/GetApiReceiptReceiptGetProductTaxCode200Response.md)
 - [GetApiReceiptReceiptGetProductTaxCode200ResponseDataInner](docs/GetApiReceiptReceiptGetProductTaxCode200ResponseDataInner.md)
 - [GetRestBankAccountsTinTIN200ResponseInner](docs/GetRestBankAccountsTinTIN200ResponseInner.md)
 - [GetRestInfo200Response](docs/GetRestInfo200Response.md)
 - [GetRestInfo200ResponseAppInfo](docs/GetRestInfo200ResponseAppInfo.md)
 - [GetRestInfo200ResponseMerchantsInner](docs/GetRestInfo200ResponseMerchantsInner.md)
 - [GetRestInfo200ResponseMerchantsInnerCustomersInner](docs/GetRestInfo200ResponseMerchantsInnerCustomersInner.md)
 - [PostApiTpiReceiptSaveOprMerchants200Response](docs/PostApiTpiReceiptSaveOprMerchants200Response.md)
 - [PostApiTpiReceiptSaveOprMerchantsRequest](docs/PostApiTpiReceiptSaveOprMerchantsRequest.md)
 - [PostRestReceipt200Response](docs/PostRestReceipt200Response.md)
 - [PostRestReceipt200ResponseReceiptsInner](docs/PostRestReceipt200ResponseReceiptsInner.md)
 - [PostRestReceiptRequest](docs/PostRestReceiptRequest.md)
 - [PostRestReceiptRequestPaymentsInner](docs/PostRestReceiptRequestPaymentsInner.md)
 - [PostRestReceiptRequestPaymentsInnerData](docs/PostRestReceiptRequestPaymentsInnerData.md)
 - [PostRestReceiptRequestReceiptsInner](docs/PostRestReceiptRequestReceiptsInner.md)
 - [PostRestReceiptRequestReceiptsInnerItemsInner](docs/PostRestReceiptRequestReceiptsInnerItemsInner.md)
 - [PostRestReceiptRequestReceiptsInnerItemsInnerData](docs/PostRestReceiptRequestReceiptsInnerItemsInnerData.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="auth.yaml"></a>
### auth.yaml

- **Type**: HTTP Bearer Token authentication

<a id="auth_copy.yaml"></a>
### auth_copy.yaml

- **Type**: HTTP Bearer Token authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



