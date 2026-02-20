# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteRestReceipt**](DefaultApi.md#deleteRestReceipt) | **DELETE** /rest/postRestReceiptRequestReceipt | Төлбөрийн баримт буцаах |
| [**getApiInfoCheckBarcodeAll**](DefaultApi.md#getApiInfoCheckBarcodeAll) | **GET** /api/info/check/barcode/all | Баркод жагсаалтаар лавлах |
| [**getApiInfoCheckBarcodeV2**](DefaultApi.md#getApiInfoCheckBarcodeV2) | **GET** /api/info/check/barcode/v2/{p4}/{p5}/{p1}/{p2}/{p3}/{p6} | БҮНА, бараа бүтээгдэхүүний ангилал, баркод лавлах |
| [**getApiInfoCheckGetBranchInfo**](DefaultApi.md#getApiInfoCheckGetBranchInfo) | **GET** /api/info/check/getBranchInfo | District_code лавлах |
| [**getApiInfoCheckGetInfo**](DefaultApi.md#getApiInfoCheckGetInfo) | **GET** /api/info/check/getInfo | Бүртгэлийн мэдээлэл лавлах |
| [**getApiInfoCheckGetTinInfo**](DefaultApi.md#getApiInfoCheckGetTinInfo) | **GET** /api/info/check/getTinInfo | Татвар төлөгчийн дугаар лавлах /ТIN, Civil_id/ |
| [**getApiInventoryStockGetStockQr**](DefaultApi.md#getApiInventoryStockGetStockQr) | **GET** /api/inventory/stock/getStockQr | ОАТ барааны баркодын мэдээлэл лавлах /QR/ |
| [**getApiReceiptReceiptGetProductTaxCode**](DefaultApi.md#getApiReceiptReceiptGetProductTaxCode) | **GET** /api/postRestReceiptRequestReceipt/postRestReceiptRequestReceipt/getProductTaxCode | VAT_FREE, VAT_ZERO, NO_VAT бараа, үйлчилгээний код лавлах |
| [**getRestBankAccountstinTIN**](DefaultApi.md#getRestBankAccountstinTIN) | **GET** /rest/bankAccounts | Банкны дансны мэдээлэл лавлах |
| [**getRestInfo**](DefaultApi.md#getRestInfo) | **GET** /rest/info | Ажиллагааны мэдээлэл хүлээн авах |
| [**getRestSendData**](DefaultApi.md#getRestSendData) | **GET** /rest/sendData | Төлбөрийн баримтын нэгдсэн системд мэдээлэл илгээх |
| [**postApiTpiReceiptSaveOprMerchants**](DefaultApi.md#postApiTpiReceiptSaveOprMerchants) | **POST** /api/tpi/postRestReceiptRequestReceipt/saveOprMerchants | Оператороос мерчант бүртгэх хүсэлт илгээх |
| [**postRestReceipt**](DefaultApi.md#postRestReceipt) | **POST** /rest/postRestReceiptRequestReceipt | Төлбөрийн баримт хадгалах |


<a id="deleteRestReceipt"></a>
# **deleteRestReceipt**
> deleteRestReceipt(deleteRestReceiptRequest)

Төлбөрийн баримт буцаах

&gt;Энэхүү сервис нь барааны буцаалт хийгдсэн болон алдаатай үүссэн Хувь хүн (B2C_RECEIPT) руу шивсэн төлбөрийн баримтыг системд идэвхгүй болгох зориулалттай.      ⚠️ Анхаарах зүйлс:    &lt;!-- theme: warning --&gt;    * Зөвхөн иргэн баталгаажуулаагүй баримтыг идэвхгүй болгох боломжтой.  * Хэрэв баталгаажсан баримт буцаагдсан бол баримт \&quot;Баталгаажаагүй буцаалт\&quot; гэсэн төлөвтэй болж,  * Иргэн өөрийн ИБАРИМТ аппликейшнээс зөвшөөрсний дараа тухайн баримт идэвхгүй болно.

### Example

```java
// Import classes:

import com.github.uugan.posapi.PosApiClient;
import com.github.uugan.posapi.PosApiException;
import com.github.uugan.posapi.Configuration;
import com.github.uugan.posapi.api.PosApi;
import com.github.uugan.posapi.models.*;

public class Example {
    public static void main(String[] args) {
        PosApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

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
    }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteRestReceiptRequest** | [**DeleteRestReceiptRequest**](DeleteRestReceiptRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


<a id="getApiInfoCheckBarcodeAll"></a>
# **getApiInfoCheckBarcodeAll**
> GetApiInfoCheckBarcodeAll200Response getApiInfoCheckBarcodeAll(page, size, date)

Баркод жагсаалтаар лавлах

&gt;Энэхүү сервис нь Цахим төлбөрийн баримтын системийн PosAPI 3.0 хувилбарыг ашиглагч хэрэглэгчдэд зориулсан бөгөөд Бараа бүртгэлийн нэгдсэн систем (ББНС)-д бүртгэлтэй бараа, бүтээгдэхүүний баркодын мэдээллийг хуудаслалтайгаар лавлах боломжийг олгодог.    &lt;!-- theme: warning --&gt;  &gt;Энэхүү сервис нь БҮНА-ын ангиллын түвшингээр мэдээлэл авах боломжтой бөгөөд параметрүүдийг өөрчлөн дуудаж ашиглаж болно. 🔗 [Дэлгэрэнгүй мэдээлэлтэй танилцах  бол энд дарна уу](https://developer.itc.gov.mn/docs/ebarimt-api/said1mgfz0gb7-b-na-baraa-b-teegdeh-nij-angilal-barkod-lavlah)

### Example

```java
// Import classes:

import com.github.uugan.posapi.PosApiClient;
import com.github.uugan.posapi.PosApiException;
import com.github.uugan.posapi.Configuration;
import com.github.uugan.posapi.api.PosApi;
import com.github.uugan.posapi.models.*;

public class Example {
    public static void main(String[] args) {
        PosApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PosApi apiInstance = new PosApi(defaultClient);
        String page = "0"; // String | Хуудаслалтын тоо /0-ээс эхэлнэ/
        String size = "200"; // String | Хуудаслалтын хэмжээ /Хамгийн ихдээ 200/
        String date = "2025-05-26"; // String | Бүртгэгдсэн/өөрчлөгдсөн огноо (тухайн огнооноос хойшхи баркодыг татах)
        try {
            GetApiInfoCheckBarcodeAll200Response result = apiInstance.getApiInfoCheckBarcodeAll(page, size, date);
            System.out.println(result);
        } catch (PosApiException e) {
            System.err.println("Exception when calling PosApi#getApiInfoCheckBarcodeAll");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **String**| Хуудаслалтын тоо /0-ээс эхэлнэ/ | |
| **size** | **String**| Хуудаслалтын хэмжээ /Хамгийн ихдээ 200/ | |
| **date** | **String**| Бүртгэгдсэн/өөрчлөгдсөн огноо (тухайн огнооноос хойшхи баркодыг татах) | [optional] |

### Return type

[**GetApiInfoCheckBarcodeAll200Response**](GetApiInfoCheckBarcodeAll200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApiInfoCheckBarcodeV2"></a>
# **getApiInfoCheckBarcodeV2**
> List&lt;List&lt;String&gt;&gt; getApiInfoCheckBarcodeV2(p1, p2, p3, p4, p5, p6)

БҮНА, бараа бүтээгдэхүүний ангилал, баркод лавлах

&gt;Энэхүү сервис нь Цахим төлбөрийн баримтын системийн PosAPI 3.0 хувилбарыг ашиглагч хэрэглэгчдэд зориулан Бараа, Үйлчилгээний Нэгдсэн Ангилал (БҮНА)-ын түвшин тус бүр болон тухайн ангилалд хамаарах баркодын мэдээллийг лавлах, ашиглах зориулалттай болно.  🔍 Энэхүү сервис нь Бараа, Үйлчилгээний Нэгдсэн Ангилал (БҮНА)-ын шатлалтай бүтэцтэй ангиллын мэдээллийг үе шаттайгаар лавлах боломжийг хэрэглэгчдэд олгодог.    1️⃣Сервисийг ямар нэгэн параметргүйгээр дуудсан тохиолдолд хамгийн дээд түвшний ангилал болох \&quot;Салбар\&quot;-ын жагсаалтыг буцаана.    2️⃣Салбарын код-ыг параметрээр илгээх үед тухайн салбарт хамаарах \&quot;Дэд салбар\&quot;-уудын жагсаалт ирнэ.    3️⃣Дэд салбарын код-ыг параметрт оруулснаар уг дэд салбарт хамаарах \&quot;Бүлэг\&quot; ангиллын мэдээллийг буцаана.    4️⃣Бүлгийн код-ыг параметрт оруулахад холбогдох \&quot;Анги\&quot;,\&quot;Дэд анги\&quot; цаашлаад \&quot;БҮНА код\&quot;, эцэст нь тухайн БҮНА кодын ангилалд багтах барааны баркодын жагсаалтыг харуулна.    5️⃣Ийм байдлаар шат дараатайгаар ангиллын кодыг параметрт дамжуулан илгээснээр БҮНА-ийн бүтэцтэй уялдсан \&quot;Баркод\&quot;-ын мэдээллийг авах боломжтой.

### Example

```java
// Import classes:

import com.github.uugan.posapi.PosApiClient;
import com.github.uugan.posapi.PosApiException;
import com.github.uugan.posapi.Configuration;
import com.github.uugan.posapi.api.PosApi;
import com.github.uugan.posapi.models.*;

public class Example {
    public static void main(String[] args) {
        PosApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PosApi apiInstance = new PosApi(defaultClient);
        String p1 = "0"; // String | Өмнөх салбарын дугаар
        String p2 = "01"; // String | Өмнөх дэд салбарын дугаар
        String p3 = "011"; // String | Өмнөх Бүлгийн дугаар
        String p4 = "0111"; // String | Өмнөх ангийн дугаар
        String p5 = "01111"; // String | Өмнөх дэд ангийн дугаар
        String p6 = "0111100"; // String | Өмнөх БҮНА код
        try {
            List<List<String>> result = apiInstance.getApiInfoCheckBarcodeV2(p1, p2, p3, p4, p5, p6);
            System.out.println(result);
        } catch (PosApiException e) {
            System.err.println("Exception when calling DefaultApi#getApiInfoCheckBarcodeV2");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **p1** | **String**| Өмнөх салбарын дугаар | [optional] |
| **p2** | **String**| Өмнөх дэд салбарын дугаар | [optional] |
| **p3** | **String**| Өмнөх Бүлгийн дугаар | [optional] |
| **p4** | **String**| Өмнөх ангийн дугаар | [optional] |
| **p5** | **String**| Өмнөх дэд ангийн дугаар | [optional] |
| **p6** | **String**| Өмнөх БҮНА код | [optional] |

### Return type

[**List&lt;List&lt;String&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApiInfoCheckGetBranchInfo"></a>
# **getApiInfoCheckGetBranchInfo**
> GetApiInfoCheckGetBranchInfo200Response getApiInfoCheckGetBranchInfo()

District_code лавлах

&gt;Цахим төлбөрийн баримтын систем (PosAPI)-ээс үүсгэж буй төлбөрийн баримтын үйл ажиллагаа явуулж буй байршлын мэдээллийг \&quot;districtCode\&quot; гэсэн баганад бөглөн илгээдэг. Энэ талбарт бөглөсөн байршлын татварын алба болон дэд албаны кодын жагсаалтын мэдээллийг энэхүү сервисээс авах боломжтой.    &gt;Жишээ: Номин холдинг ХХК-ийн Архангай аймгийн Чулуут сум дахь салбараас үүсгэсэн баримтын \&quot;districtCode\&quot;-г 0102 гэж бөглөн илгээнэ.

### Example

```java
// Import classes:

import com.github.uugan.posapi.PosApiClient;
import com.github.uugan.posapi.PosApiException;
import com.github.uugan.posapi.Configuration;
import com.github.uugan.posapi.api.PosApi;

public class Example {
    public static void main(String[] args) {
        PosApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PosApi apiInstance = new PosApi(defaultClient);
        try {
            GetApiInfoCheckGetBranchInfo200Response result = apiInstance.getApiInfoCheckGetBranchInfo();
            System.out.println(result);
        } catch (PosApiException e) {
            System.err.println("Exception when calling DefaultApi#getApiInfoCheckGetBranchInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetApiInfoCheckGetBranchInfo200Response**](GetApiInfoCheckGetBranchInfo200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/javascript

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Internal Server Error |  -  |

<a id="getApiInfoCheckGetInfo"></a>
# **getApiInfoCheckGetInfo**
> GetApiInfoCheckGetInfo200Response getApiInfoCheckGetInfo(tin)

Бүртгэлийн мэдээлэл лавлах

&gt;Энэхүү сервис нь “Татвар төлөгчийн дугаар”-аар тухайн этгээдийн татварын бүртгэл, мэдээллийн нэгдсэн санд байх бүртгэлийн мэдээллийг дамжуулах үүрэгтэй ба хэрэглэгчийн систем нийлүүлэгч нь өөрийн хөгжүүлж буй системд холбон ашиглах боломжтой.    [Регистрийн дугаар ашилан TIN дугаар авах бол дарна уу.](ebarimt.yaml/paths/~1api~1info~1check~1getTinInfo/get)

### Example

```java
// Import classes:

import com.github.uugan.posapi.PosApiClient;
import com.github.uugan.posapi.PosApiException;
import com.github.uugan.posapi.Configuration;
import com.github.uugan.posapi.api.PosApi;
import com.github.uugan.posapi.models.*;

public class Example {
    public static void main(String[] args) {
        PosApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PosApi apiInstance = new PosApi(defaultClient);
        String tin = "31654321554"; // String | ТИН дугаар
        try {
            GetApiInfoCheckGetInfo200Response result = apiInstance.getApiInfoCheckGetInfo(tin);
            System.out.println(result);
        } catch (PosApiException e) {
            System.err.println("Exception when calling PosApi#getApiInfoCheckGetInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tin** | **String**| ТИН дугаар | |

### Return type

[**GetApiInfoCheckGetInfo200Response**](GetApiInfoCheckGetInfo200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApiInfoCheckGetTinInfo"></a>
# **getApiInfoCheckGetTinInfo**
> GetApiInfoCheckGetTinInfo200Response getApiInfoCheckGetTinInfo(regNo)

Татвар төлөгчийн дугаар лавлах /ТIN, Civil_id/

&gt;Татвар төлөгчийн дугаар лавлах сервис /ТIN, Civil_id/: Шинэчлэн батлагдсан Хувь хүний мэдээлэл хамгаалах тухай хууль, Татварын ерөнхий хуульд заасны дагуу татвар төлөгчийг татварын системүүдэд бүртгэхдээ “Татвар төлөгчийн дугаар” ашиглахаар болсон. Дээрх хуулийн дагуу систем нийлүүлэгч нь PosApi 3.0 системд борлуулагчийг бүртгэхдээ “Хуулийн этгээд”-ийн хувьд ТИН дугаар, “Хувь хүн”-ий хувьд Civil_id-г ашиглах ба энэхүү сервис нь татвар төлөгчийн дугаарыг регистрийн дугаараар лавлах боломжийг бүрдүүлсэн.

### Example

```java
// Import classes:

import com.github.uugan.posapi.PosApiClient;
import com.github.uugan.posapi.PosApiException;
import com.github.uugan.posapi.Configuration;
import com.github.uugan.posapi.models.*;
import com.github.uugan.posapi.api.PosApi;

public class Example {
    public static void main(String[] args) {
        PosApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PosApi apiInstance = new PosApi(defaultClient);
        String regNo = "regNo_example"; // String | Татвар төлөгчийн регистрийн дугаар
        try {
            GetApiInfoCheckGetTinInfo200Response result = apiInstance.getApiInfoCheckGetTinInfo(regNo);
            System.out.println(result);
        } catch (PosApiException e) {
            System.err.println("Exception when calling PosApi#getApiInfoCheckGetTinInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **regNo** | **String**| Татвар төлөгчийн регистрийн дугаар | [optional] |

### Return type

[**GetApiInfoCheckGetTinInfo200Response**](GetApiInfoCheckGetTinInfo200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApiInventoryStockGetStockQr"></a>
# **getApiInventoryStockGetStockQr**
> GetApiInventoryStockGetStockQr200Response getApiInventoryStockGetStockQr(stockQr)

ОАТ барааны баркодын мэдээлэл лавлах /QR/

&gt;Онцгой албан татварын тэмдэг бүхий барааны баркод болон бусад дэлгэрэнгүй мэдээллийг \&quot;Тэмдгийн QR ID\&quot; ашиглан лавлах бол энэхүү сервисийг ашиглах ба PosAPI 3.0 системийн \&quot;PosAPI-руу төлбөрийн баримт хадгалах сервис\&quot; /post-rest-postRestReceiptRequestReceipt/-ийн stockQR талбарт хадгалах өгөгдлийг лавлахад ашиглагдана. [Нэгдсэн нэвтрэлтийн token авах бол дарна уу.](reference/auth_copy.yaml/paths/~1protocol~1openid-connect~1token/post)

### Example

```java
// Import classes:

import com.github.uugan.posapi.PosApiClient;
import com.github.uugan.posapi.PosApiException;
import com.github.uugan.posapi.Configuration;
import com.github.uugan.posapi.auth.*;
import com.github.uugan.posapi.models.*;
import com.github.uugan.posapi.api.PosApi;

public class Example {
    public static void main(String[] args) {
        PosApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        // Configure HTTP bearer authorization: auth_copy.yaml
        HttpBearerAuth auth_copy.yaml = (HttpBearerAuth) defaultClient.getAuthentication("auth_copy.yaml");
        auth_copy.yaml.setBearerToken("BEARER TOKEN");

        PosApi apiInstance = new PosApi(defaultClient);
        String stockQr = "BF6B1FBA86FB4C41ADDBB01C09C024F5"; // String | Тэмдгийн QR
        try {
            GetApiInventoryStockGetStockQr200Response result = apiInstance.getApiInventoryStockGetStockQr(stockQr);
            System.out.println(result);
        } catch (PosApiException e) {
            System.err.println("Exception when calling PosApi#getApiInventoryStockGetStockQr");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stockQr** | **String**| Тэмдгийн QR | |

### Return type

[**GetApiInventoryStockGetStockQr200Response**](GetApiInventoryStockGetStockQr200Response.md)

### Authorization

[auth_copy.yaml](../README.md#auth_copy.yaml)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getApiReceiptReceiptGetProductTaxCode"></a>
# **getApiReceiptReceiptGetProductTaxCode**
> GetApiReceiptReceiptGetProductTaxCode200Response getApiReceiptReceiptGetProductTaxCode()

VAT_FREE, VAT_ZERO, NO_VAT бараа, үйлчилгээний код лавлах

&gt;Нэмэгдсэн өртгийн албан татвар /НӨАТ-аас чөлөөлөгдөх, НӨАТ-н 0 хувь хэрэглэх/, Аж ахуйн нэгжийн орлогын албан татвараас чөлөөлөгдөх хуулийн кодыг жагсаалтаар авах бол энэхүү сервисийг ашиглах ба PosAPI 3.0 системийн \&quot;PosAPI-руу төлбөрийн баримт хадгалах сервис\&quot; /post-rest-postRestReceiptRequestReceipt/-ийн taxProductCode талбарт хадгалах өгөгдлийг лавлахад ашиглагдана. 

### Example

```java
// Import classes:

import com.github.uugan.posapi.PosApiClient;
import com.github.uugan.posapi.PosApiException;
import com.github.uugan.posapi.Configuration;
import com.github.uugan.posapi.models.*;
import com.github.uugan.posapi.api.PosApi;

public class Example {
    public static void main(String[] args) {
        PosApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PosApi apiInstance = new PosApi(defaultClient);
        try {
            GetApiReceiptReceiptGetProductTaxCode200Response result = apiInstance.getApiReceiptReceiptGetProductTaxCode();
            System.out.println(result);
        } catch (PosApiException e) {
            System.err.println("Exception when calling PosApi#getApiReceiptReceiptGetProductTaxCode");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetApiReceiptReceiptGetProductTaxCode200Response**](GetApiReceiptReceiptGetProductTaxCode200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRestBankAccountstinTIN"></a>
# **getRestBankAccountstinTIN**
> List&lt;GetRestBankAccountsTinTIN200ResponseInner&gt; getRestBankAccountstinTIN(tin)

Банкны дансны мэдээлэл лавлах

&gt;Банкны дансны мэдээлэл лавлах сервис нь Оператор компанид хэрэглэгчээр бүртгэгдсэн \&quot;Мерчант\&quot; болон түүний \&quot;Түрээслэгч\&quot;-ийн Local баазын \&quot;bankaccount\&quot; хүснэгт-д бүртгэгдсэн идэвхтэй дансны мэдээллийг лавлахад зориулагдсан.     &lt;!-- theme: warning --&gt;    &gt;PosAPI 3.0 систем дэх дансны мэдээлэл шинэчлэх тухай    ✅ PosAPI 3.0 систем нь local баазын \&quot;bankaccount\&quot; дээр дансны мэдээллийг хадгалж, уг өгөгдөлд үндэслэн баримтын дансыг үүсгэдэг.    🔄 Дансны мэдээлэл хэрхэн шинэчлэгддэг вэ?    ПосАПИ дахь дансны мэдээлэл өөрчлөгдвөл баримт илгээх (/senddata/) үйлдэл хийгдэх үед    1️⃣ Дансны дугааруудыг Оператор-Ибаримт систем дэх бүртгэлтэй тулган шалгана.    2️⃣ Хэрэв өөрчлөлт илэрвэл автоматаар шинэчлэнэ.    ⚠ Анхаарах зүйлс:    Нэг ПосАПИ баримт илгээх (/senddata/) үйлдэл хийснээр зөвхөн тухайн ПосАПИ-гийн дансны мэдээлэл шинэчлэгдэнэ.    Бусад ПосАПИ-д энэ өөрчлөлт нөлөөлөхгүй тул, хэрэв таны аль нэг бүртгэлтэй Мерчантын дансны мэдээлэл өөрчлөгдвөл тухайн өөрчлөгдсөн Мерчант бүртгэгдсэн ПосАПИ тус бүрт баримт илгээж, шинэчлэл хийх шаардлагатай.    Иймд дансны мэдээлэл өөрчлөгдсөн тохиолдолд бүх холбогдох ПосАПИ дээр шинэчлэл хийхээ    &gt; \&quot; \&quot;Баримт илгээх\&quot; үйлдэл хийсэн Local бааз дахь дансны мэдээлэл шинэчлэгдэхгүй бол Мерчант болон түүний түрээслэгч нь системд дансаа бүртгээгүй, эсвэл мэдээллээ шинэчлээгүй байх магадлалтай.    ✅ Шийдэл:    \&quot;Цахим татварын систем\&quot;-д нэвтэрч, дансаа бүртгэх эсвэл өөрчилнө.    E-invoice системийн \&quot;Баримт үүсгэх\&quot; цонхны \&quot;Банкны мэдээлэл\&quot; хэсгээс &lt;i class&#x3D;\&quot;fa-solid fa-download\&quot;&gt;&lt;/i&gt; товчийг дарж, мэдээллээ шинэчлэн татна.                  

### Example

```java
// Import classes:

import com.github.uugan.posapi.PosApiClient;
import com.github.uugan.posapi.PosApiException;
import com.github.uugan.posapi.Configuration;
import com.github.uugan.posapi.api.PosApi;

public class Example {
    public static void main(String[] args) {
        PosApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PosApi apiInstance = new PosApi(defaultClient);
        String tin = "tin_example"; // String | Хувь хүн хуулийн этгээдийн татвар төлөгчийн дугаар
        try {
            List<GetRestBankAccountsTinTIN200ResponseInner> result = apiInstance.getRestBankAccountstinTIN(tin);
            System.out.println(result);
        } catch (PosApiException e) {
            System.err.println("Exception when calling DefaultApi#getRestBankAccountstinTIN");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tin** | **String**| Хувь хүн хуулийн этгээдийн татвар төлөгчийн дугаар | [optional] |

### Return type

[**List&lt;GetRestBankAccountsTinTIN200ResponseInner&gt;**](GetRestBankAccountsTinTIN200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRestInfo"></a>
# **getRestInfo**
> GetRestInfo200Response getRestInfo()

Ажиллагааны мэдээлэл хүлээн авах

Энэхүү сервис нь \&quot;PosAPI 3.0\&quot; системийн тохиргоо болон ажиллагааны талаарх мэдээллийг лавлахад зориулагдсан.

### Example

```java
// Import classes:

import com.github.uugan.posapi.PosApiClient;
import com.github.uugan.posapi.PosApiException;
import com.github.uugan.posapi.Configuration;
import com.github.uugan.posapi.models.*;
import com.github.uugan.posapi.api.PosApi;

public class Example {
    public static void main(String[] args) {
        PosApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PosApi apiInstance = new PosApi(defaultClient);
        try {
            GetRestInfo200Response result = apiInstance.getRestInfo();
            System.out.println(result);
        } catch (PosApiException e) {
            System.err.println("Exception when calling PosApi#getRestInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetRestInfo200Response**](GetRestInfo200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRestSendData"></a>
# **getRestSendData**
> Object getRestSendData()

Төлбөрийн баримтын нэгдсэн системд мэдээлэл илгээх

&gt;Сервисийг заавал дуудах шаардлагагүй бөгөөд PosAPI систем нь тодорхой хугацаанд автоматаар энэхүү үйлдлийг гүйцэтгэдэг. 🔄 Хэрэв PosAPI-д хамааралтай өөрчлөлт нэгдсэн систем талд гарсан бол энэ сервисийг дуудснаар тухайн өөрчлөлтийг local баазад хадгалах боломжтой.

### Example

```java
// Import classes:

import com.github.uugan.posapi.PosApiClient;
import com.github.uugan.posapi.PosApiException;
import com.github.uugan.posapi.Configuration;
import com.github.uugan.posapi.api.PosApi;

public class Example {
    public static void main(String[] args) {
        PosApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PosApi apiInstance = new PosApi(defaultClient);
        try {
            Object result = apiInstance.getRestSendData();
            System.out.println(result);
        } catch (PosApiException e) {
            System.err.println("Exception when calling DefaultApi#getRestSendData");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="postApiTpiReceiptSaveOprMerchants"></a>
# **postApiTpiReceiptSaveOprMerchants**
> PostApiTpiReceiptSaveOprMerchants200Response postApiTpiReceiptSaveOprMerchants(X_API_KEY, postApiTpiReceiptSaveOprMerchantsRequest)

Оператороос мерчант бүртгэх хүсэлт илгээх

&gt;Энэхүү сервис нь \&quot;Хэрэглэгчийн систем нийлүүлэгч\&quot; (Оператор компани) өөрийн системээс \&quot;Мерчант\&quot; (Борлуулагч) бүртгэх хүсэлт үүсгэх боломжийг бүрдүүлнэ[Нэгдсэн нэвтрэлтийн token авах бол дарна уу.](reference/auth.yaml/paths/~1protocol~1openid-connect~1token/post)

### Example

```java
// Import classes:

import com.github.uugan.posapi.PosApiClient;
import com.github.uugan.posapi.PosApiException;
import com.github.uugan.posapi.Configuration;
import com.github.uugan.posapi.api.PosApi;
import com.github.uugan.posapi.auth.*;

public class Example {
    public static void main(String[] args) {
        PosApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        // Configure HTTP bearer authorization: auth.yaml
        HttpBearerAuth auth.yaml = (HttpBearerAuth) defaultClient.getAuthentication("auth.yaml");
        auth.yaml.setBearerToken("BEARER TOKEN");

        PosApi apiInstance = new PosApi(defaultClient);
        String X_API_KEY = "Туршилтын орчинд ашиглах: 9406e79323ec0fed4e560342bce72221107a808b"; // String | Posapi@itc.gov.mn рүү хүсэлт илгээн авна
        PostApiTpiReceiptSaveOprMerchantsRequest postApiTpiReceiptSaveOprMerchantsRequest = new PostApiTpiReceiptSaveOprMerchantsRequest(); // PostApiTpiReceiptSaveOprMerchantsRequest | 
        try {
            PostApiTpiReceiptSaveOprMerchants200Response result = apiInstance.postApiTpiReceiptSaveOprMerchants(X_API_KEY, postApiTpiReceiptSaveOprMerchantsRequest);
            System.out.println(result);
        } catch (PosApiException e) {
            System.err.println("Exception when calling DefaultApi#postApiTpiReceiptSaveOprMerchants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **X_API_KEY** | **String**| Posapi@itc.gov.mn рүү хүсэлт илгээн авна | |
| **postApiTpiReceiptSaveOprMerchantsRequest** | [**PostApiTpiReceiptSaveOprMerchantsRequest**](PostApiTpiReceiptSaveOprMerchantsRequest.md)|  | [optional] |

### Return type

[**PostApiTpiReceiptSaveOprMerchants200Response**](PostApiTpiReceiptSaveOprMerchants200Response.md)

### Authorization

[auth.yaml](../README.md#auth.yaml)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="postRestReceipt"></a>
# **postRestReceipt**
> PostRestReceipt200Response postRestReceipt(postRestReceiptRequest)

Төлбөрийн баримт хадгалах

&gt;Энэхүү сервис нь хэрэглэгчийн системээс борлуулалтын мэдээллийг хүлээн авч, дараах мэдээллүүдийг нэмж боловсруулан буцаана:   *ДДТД  *Сугалааны дугаар  *Баримт хэвлэсэн огноо  *Баримтын код  *QrCode    ⚠️ **Анхаарах зүйлс:**  &lt;!-- theme: warning --&gt;  &gt;Эдгээр буцаасан мэдээллүүдээс lottery болон qrData талбаруудын мэдээллийг төлбөрийн баримтанд хэвлэхээс өөрөөр ямар ч хэлбэрээр хадгалахыг хориглоно.

### Example

```java
// Import classes:

import com.github.uugan.posapi.PosApiClient;
import com.github.uugan.posapi.PosApiException;
import com.github.uugan.posapi.Configuration;
import com.github.uugan.posapi.api.PosApi;
import com.github.uugan.posapi.models.*;

public class Example {
    public static void main(String[] args) {
        PosApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PosApi apiInstance = new PosApi(defaultClient);
        PostRestReceiptRequest postRestReceiptRequest = new PostRestReceiptRequest(); // PostRestReceiptRequest |  
        try {
            PostRestReceipt200Response result = apiInstance.postRestReceipt(postRestReceiptRequest);
            System.out.println(result);
        } catch (PosApiException e) {
            System.err.println("Exception when calling PosApi#postRestReceipt");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **postRestReceiptRequest** | [**PostRestReceiptRequest**](PostRestReceiptRequest.md)|   | [optional] |

### Return type

[**PostRestReceipt200Response**](PostRestReceipt200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/soap+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK  Талбаруудын нэмэлт тайлбар:    Баримтын төлөв /status талбар/  | Утга    | Тайлбар                                                        |  |---------|----------------------------------------------------------------|  | SUCCESS | Төлбөрийн баримтын мэдээлэл амжилттай үүссэн.                  |  | ERROR   | Төлбөрийн баримтын мэдээлэл үүсгэхэд алдаа гарсан.             |  | PAYMENT | Төлбөрийн баримтын мэдээлэл үүсгэхэд төлбөрийн мэдээлэл дутуу. |   |  -  |

