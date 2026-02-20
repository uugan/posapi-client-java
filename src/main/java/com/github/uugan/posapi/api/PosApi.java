/*
 * PosAPI 3.0 системийн API холболт зааврууд
 * ---  stoplight-id: 8mw1byololjkv   ---    ## ЦАХИМ ТӨЛБӨРИЙН БАРИМТЫН СИСТЕМ POS API 3.0    ### Холбоо барих мэдээлэл    | № | Төрөл | Холбоо барих | Хариуцагч |  | -------- | ------- | ------- | ------- |  | 1  | Цахим шуудан хаяг | posapi@itc.gov.mn | Б.Булганжаргал   |  | 1  | Утас | 99974468 | Б.Булганжаргал   |    ### Танилцуулга     <!-- theme: none -->    > **1.1. Хэрэглэгчийн систем болон PosAPI нь REST service ашиглан мэдээлэл солилцдог болсон нь өмнөх хувилбараас давуу талтай.**  > PosAPI 2.0 хувилбар нь програмын сан байдлаар хөгжүүлэгдсэн бөгөөд хэрэглэгчийн системд суурилж ажилладаг. Иймд тухайн хэрэглэгчийн системээс хэт хамааралтай, өөрчлөлт шинэчлэлтийг хийх боломжгүй байдаг. PosAPI 3.0-н хувьд бие даасан тусдаа service application тул хэрэглэгчийн системээс үл хамааран ажилладаг. Энэ нь дээрх 2.0 хувилбар дээр гарч байсан алдаа дутагдлыг арилгаж өгч байна.PosAPI 2.0 нь хэрэглэгчийн системийн нэг хэсэг болж ажиллахын тулд мэдээллийг function ашиглан солилцдог байсныг 3.0 хувилбар дээр өөрчлөн REST WebService ашиглан солилцдог болсон. Мөн хэрэглэгчийн систем болон PosAPI-н хоорондоо Server-Client хэлбэрээр ажиллах бүрэн боломжийг нээж өгсөн.    - [POS API 3.0 татах (Бодит орчин)](https://share.itc.gov.mn/share/developer/PosService_3.0.12-Prod.zip)  - [POS API 3.0 татах (Хөгжүүлэлтийн орчин)](https://share.itc.gov.mn/share/developer/ST_PosService_3.0.12-Staging.zip)    <!-- theme: none -->    > **1.2. Нэг PosAPI-г хэд хэдэн этгээд ашиглан,баримтын мэдээлэл солилцох боломжийг бүрдүүлсэн.**  > PosAPI 2.0 хувилбар нь зөвхөн нэг иргэн, ААН-ийн баримтыг хүлээн авах боломжтой байсан. Энэ нь > > сервер шийдэл бүхий хэрэглэгчийн системийн хувьд төвөгтэй шийдэл юм. Харин PosAPI 3.0 хувилбарын > хувьд энэхүү асуудлыг бүрэн шийдвэрлэсэн.  > PosAPI 3.0 хувилбар нь өөр дээрээ нэг болон түүнээс дээш тооны ААН, иргэнийг бүртгэн,тэдгээрийн > баримтыг бүртгэх боломжтой болсон.    ### PosAPI тохируулах:     > PosAPI нь суусны дараа анхны байдлаар тохируулах шаардлагатай. “posapi.ini” файлд тухайн PosAPI-н үндсэн тохиргоо байрлах ба “P101.poi, P102.poi” файлуудад ажиллагааны тохиргоо байрлах ба нууцлагдсан байна.    Үндсэн тохиргооны тайлбар /posapi.ini файл/    | Нэр              | Талбар                                                                        |  | ---------------- | ----------------------------------------------------------------------------- |  | authUrl          | Тухайн PosAPI-н нэгдсэн нэвтрэлттэй холбогдох тохиргоо./Өөрчлөх шаардлагагүй/ |  | authRealm        | Тухайн PosAPI-н нэгдсэн нэвтрэлттэй холбогдох тохиргоо./Өөрчлөх шаардлагагүй/ |  | authClientId     | Тухайн PosAPI-н нэгдсэн нэвтрэлттэй холбогдох тохиргоо./Өөрчлөх шаардлагагүй/ |  | authClientSecret | Тухайн PosAPI-н нэгдсэн нэвтрэлттэй холбогдох тохиргоо./Өөрчлөх шаардлагагүй/ |  | ebarimtUrl       | Ebarimt системтэй холбогдох хаяг. /Өөрчлөх шаардлагагүй/                      |  | db               | Өгөгдлийн сангийн driver.                                                     |  | dbHost           | Өгөгдлийн сангийн хаяг. /Хэрэв QSQLITE бол файлын зам байна/                  |  | dbPort           | Өгөгдлийн сангийн port. /Хэрэв QSQLITE бол бөглөхгүй/                         |  | dbUser           | Өгөгдлийн сангийн хэрэглэгчийн нэр. /Хэрэв QSQLITE бол бөглөхгүй/             |  | dbPass           | Өгөгдлийн сангийн нууц үг. /Хэрэв QSQLITE бол бөглөхгүй/                      |  | dbName           | Өгөгдлийн сангийн баазын нэр. /Хэрэв QSQLITE бол бөглөхгүй/                   |  | dbOptions        | Өгөгдлийн сангийн нэмэлт тохиргоо. /Хэрэв QSQLITE бол бөглөхгүй/              |  | workDir          | PosAPI-н ажиллагааны хавтас                                                   |  | webServiceHost   | PosAPI-н ажиллах сүлжээний IP address                                         |  | webServicePort   | PosAPI-н ажиллах сүлжээний port                                               |    <!-- theme: none -->  ⚠ Анхаарах зүйлс:  \"workDir\" хавтсанд байрлах тохиргооны файлууд тогтмол өөрчлөгдөж байдаг тул PosAPI-г ажиллуулж буй хэрэглэгч нь унших, бичих эрхтэй байх шаардлагатай. Уг хавтсыг \"FREEZE\" хийж болохгүй    PosAPI-н дэмжиж ажиллах өгөгдлийн сангууд ба driver-ууд    | Нэр     | Талбар                        |  | ------- | ----------------------------- |  | QMYSQL  | MySQL эсвэл MariaDB           |  | QPSQL   | PostgreSQL                    |  | QODBC   | ODBC for Microsoft SQL Server |  | QSQLITE | SQLite version 3              |    ⚠ Анхаарах зүйл:  PosAPI нь ачаалагдах үедээ өгөгдлийн сангийн хүснэгтүүдийг автоматаар үүсгэдэг. Тиймээс уг тохиргоог хийх хэрэглэгч нь хүснэгт үүсгэх эрхтэй байх шаардлагатай.  Сүлжээний тохиргоо:    Тохиргоо | Шаардлага  ---------|----------   Хадгалах сан (Storage) | Хамгийн багадаа 1GB сул зайтай байх    Сүлжээний хурд | Хамгийн багадаа 80 Mbps    Хандах эрхийн нөхцөл | Зөвхөн Монгол Улсын сүлжээнээс хандах боломжтой /Гадаадаас холбогдох бол Монгол IP-тэй VPN ашиглана./    >Зөвшөөрөгдсөн IP хаягууд /Network/:   Домэйн | Серверийн IP   ---------|----------   api.ebarimt.mn  | 103.17.108.216, 103.17.108.217   auth.itc.gov.mn | 103.87.69.75, 103.87.69.76  > PosAPI нь үндсэн тохиргоогоор SQLITE баазыг сонгосон байдаг бөгөөд уг тохиргоо нь цөөн тооны баримт үйлддэг хэрэглэгчийн системд илүү тохиромжтой байдаг. Харин олон тооны баримт үйлддэг хэрэглэгчийн системд SQLITE бааз нь зохимжгүй бөгөөд бусад төрлийн баазыг ашиглах нь илүү үр дүнтэй.    ### PosAPI идэвхжүүлэх:    > PosAPI суулгасны дараа идэвхгүй төлөвт байдаг ба уг төлөвт аль ч сервисийг дуудсан ажиллахгүй. Идэвхжүүлэхийн тулд PosAPI систем рүү оператор эрх бүхий иргэн нэвтэрч орох шаардлагатай. Хэрэв нэвтрэх үйлдэл хийгдсэн бол PosAPI ийг идэвхжүүлэх процесс дуудагдаж, тухайн PosAPI-г нэвтэрсэн операторын бүртгэлд бүртгэж шинээр сугалааны дугаар авна.    ![image001.png](../assets/images/image001.png)    PosAPI-руу хандах port нь posapi.ini файлд тохируулсан port байна /default port: 7080/.  Мөн тухайн иргэн нь хэд хэдэн операторын эрхтэй байж болох бөгөөд PosAPI-г идэвхжүүлэхдээ зөвхөн нэг оператороо сонгон идэвхжүүлнэ    ![image002.png](../assets/images/image002.png)    PosAPI амжилттай идэвхэжсэн үед дараах байдлаар харагдана.    ![es.png](../assets/images/es.png)    > Эм, эмнэлгийн хэрэгслийн чанар, аюулгүй байдал, хангамж, хүртээмжийг нэгдсэн цахим тогтолцоогоор хянах, цахимжилтыг эрчимжүүлэх зорилгоор шинэчлэн батлагдсан Эм, эмнэлгийн хэрэгслийн тухай 11 дүгээр зүйлийн 11.1.7, 47 дугаар зүйлийн 47.11.1, 47.12 зүйлд тус тус заасны дагуу эм, эмнэлгийн хэрэгсэл борлуулагч этгээд нь эм, эмнэлгийн хэрэгслийн цувралын дугаар, стандарт код, тоо хэмжээг төлбөрийн баримтад тусган, цахим санд хадгалах боломжийг бүрдүүлсэн. Дээрх өөрчлөлтийн дагуу тухайн төрлийн бүтээгдэхүүн борлуулагч \"Эмийн сан\"-ийн PosAPI системд \"Посын нөхцөл\" хэсгийн \"Эмийн сан\" сонголтыг сонгон хадгална. Мөн төлбөрийн баримт үүсгэх JSON-д цувралын дугаарыг нэмэлтээр оруулна.    Анхаарах зүйлс :    1. Эмийн сангийн POSAPI 3.0 холболт бол заавал эмийн сан гэсэн checkbox сонголтыг идэвхжүүлж хадгалах.  2. Эмийн сан check хийсэн үед эмийн бүтээгдэхүүнүүдийн хамт нэг дэд баримтад илгээнэ  3. \"data\":{\"lotNo\":\"эмийн бүтээгдэхүүний цувралын дугаар\"} илгээхийг анхаарна уу.    <!-- theme: warning -->    ### Кодын жагсаалт:    - [Бүтээгдэхүүн үйлчилгээний нэгдсэн ангиллын код](https://share.itc.gov.mn/share/developer/gs1\\_gs1.xlsx)    ### Өөрчлөлтийн түүх    | № | Хувилбар | Огноо | Тайлбар | Хариуцагч |  | -------- | ------- | ------- | ------- | ------- |  | 1  | 1.0.0 | 03/31/2025 | Гарын авлага боловсруулав | Б.Мөнгөнчимэг   |
 *
 * The version of the OpenAPI document: 3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.uugan.posapi.api;

import com.github.uugan.posapi.*;
import com.github.uugan.posapi.PosApiClient;

import com.github.uugan.posapi.model.*;
import com.google.gson.reflect.TypeToken;


import com.github.uugan.posapi.model.PostRestReceiptResponse;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PosApi {
    private PosApiClient localVarPosApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PosApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PosApi(PosApiClient posApiClient) {
        this.localVarPosApiClient = posApiClient;
    }

    public PosApiClient getApiClient() {
        return localVarPosApiClient;
    }

    public void setApiClient(PosApiClient posApiClient) {
        this.localVarPosApiClient = posApiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }


    private String chooseBasePath(String[] localBasePaths) {
        if (localCustomBaseUrl != null) {
            return localCustomBaseUrl;
        }
        if (localVarPosApiClient != null) {
            String clientBase = localVarPosApiClient.getBasePath();
            if (clientBase != null && !clientBase.isEmpty()) {
                return clientBase;
            }
        }
        if (localBasePaths != null && localBasePaths.length > 0) {
            int idx = Math.max(0, Math.min(localHostIndex, localBasePaths.length - 1));
            return localBasePaths[idx];
        }
        return null;
    }


    /**
     * Build call for deleteRestReceipt
     * @param deleteRestReceiptRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws PosApiException If fail to serialize the request body object
     */
    public okhttp3.Call deleteRestReceiptCall(@Nullable DeleteRestReceiptRequest deleteRestReceiptRequest, final PosApiCallback _callback) throws PosApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "http://{baseUrl}", "http://localhost:7080/" };

        // Determine Base Path to Use
        basePath = chooseBasePath(localBasePaths);

        Object localVarPostBody = deleteRestReceiptRequest;

        // create path and map variables
        String localVarPath = "/rest/receipt";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarPosApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarPosApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarPosApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteRestReceiptValidateBeforeCall(@Nullable DeleteRestReceiptRequest deleteRestReceiptRequest, final PosApiCallback _callback) throws PosApiException {
        return deleteRestReceiptCall(deleteRestReceiptRequest, _callback);

    }

    /**
     * Төлбөрийн баримт буцаах
     * &gt;Энэхүү сервис нь барааны буцаалт хийгдсэн болон алдаатай үүссэн Хувь хүн (B2C_RECEIPT) руу шивсэн төлбөрийн баримтыг системд идэвхгүй болгох зориулалттай.      ⚠️ Анхаарах зүйлс:    &lt;!-- theme: warning --&gt;    * Зөвхөн иргэн баталгаажуулаагүй баримтыг идэвхгүй болгох боломжтой.  * Хэрэв баталгаажсан баримт буцаагдсан бол баримт \&quot;Баталгаажаагүй буцаалт\&quot; гэсэн төлөвтэй болж,  * Иргэн өөрийн ИБАРИМТ аппликейшнээс зөвшөөрсний дараа тухайн баримт идэвхгүй болно.
     * @param deleteRestReceiptRequest  (optional)
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteRestReceipt(@Nullable DeleteRestReceiptRequest deleteRestReceiptRequest) throws PosApiException {
        deleteRestReceiptWithHttpInfo(deleteRestReceiptRequest);
    }

    /**
     * Төлбөрийн баримт буцаах
     * &gt;Энэхүү сервис нь барааны буцаалт хийгдсэн болон алдаатай үүссэн Хувь хүн (B2C_RECEIPT) руу шивсэн төлбөрийн баримтыг системд идэвхгүй болгох зориулалттай.      ⚠️ Анхаарах зүйлс:    &lt;!-- theme: warning --&gt;    * Зөвхөн иргэн баталгаажуулаагүй баримтыг идэвхгүй болгох боломжтой.  * Хэрэв баталгаажсан баримт буцаагдсан бол баримт \&quot;Баталгаажаагүй буцаалт\&quot; гэсэн төлөвтэй болж,  * Иргэн өөрийн ИБАРИМТ аппликейшнээс зөвшөөрсний дараа тухайн баримт идэвхгүй болно.
     * @param deleteRestReceiptRequest  (optional)
     * @return PosApiResponse&lt;Void&gt;
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PosApiResponse<Void> deleteRestReceiptWithHttpInfo(@Nullable DeleteRestReceiptRequest deleteRestReceiptRequest) throws PosApiException {
        okhttp3.Call localVarCall = deleteRestReceiptValidateBeforeCall(deleteRestReceiptRequest, null);
        return localVarPosApiClient.execute(localVarCall);
    }

    /**
     * Төлбөрийн баримт буцаах (asynchronously)
     * &gt;Энэхүү сервис нь барааны буцаалт хийгдсэн болон алдаатай үүссэн Хувь хүн (B2C_RECEIPT) руу шивсэн төлбөрийн баримтыг системд идэвхгүй болгох зориулалттай.      ⚠️ Анхаарах зүйлс:    &lt;!-- theme: warning --&gt;    * Зөвхөн иргэн баталгаажуулаагүй баримтыг идэвхгүй болгох боломжтой.  * Хэрэв баталгаажсан баримт буцаагдсан бол баримт \&quot;Баталгаажаагүй буцаалт\&quot; гэсэн төлөвтэй болж,  * Иргэн өөрийн ИБАРИМТ аппликейшнээс зөвшөөрсний дараа тухайн баримт идэвхгүй болно.
     * @param deleteRestReceiptRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws PosApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call deleteRestReceiptAsync(@Nullable DeleteRestReceiptRequest deleteRestReceiptRequest, final PosApiCallback<Void> _callback) throws PosApiException {

        okhttp3.Call localVarCall = deleteRestReceiptValidateBeforeCall(deleteRestReceiptRequest, _callback);
        localVarPosApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getApiInfoCheckBarcodeAll
     * @param page Хуудаслалтын тоо /0-ээс эхэлнэ/ (required)
     * @param size Хуудаслалтын хэмжээ /Хамгийн ихдээ 200/ (required)
     * @param date Бүртгэгдсэн/өөрчлөгдсөн огноо (тухайн огнооноос хойшхи баркодыг татах) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws PosApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApiInfoCheckBarcodeAllCall(@Nonnull String page, @Nonnull String size, @Nullable String date, final PosApiCallback _callback) throws PosApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "https://api.ebarimt.mn", "https://st-api.ebarimt.mn" };

        // Determine Base Path to Use
        basePath = chooseBasePath(localBasePaths);

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/info/check/barcode/all";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarPosApiClient.parameterToPair("page", page));
        }

        if (size != null) {
            localVarQueryParams.addAll(localVarPosApiClient.parameterToPair("size", size));
        }

        if (date != null) {
            localVarQueryParams.addAll(localVarPosApiClient.parameterToPair("date", date));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarPosApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarPosApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarPosApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getApiInfoCheckBarcodeAllValidateBeforeCall(@Nonnull String page, @Nonnull String size, @Nullable String date, final PosApiCallback _callback) throws PosApiException {
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new PosApiException("Missing the required parameter 'page' when calling getApiInfoCheckBarcodeAll(Async)");
        }

        // verify the required parameter 'size' is set
        if (size == null) {
            throw new PosApiException("Missing the required parameter 'size' when calling getApiInfoCheckBarcodeAll(Async)");
        }

        return getApiInfoCheckBarcodeAllCall(page, size, date, _callback);

    }

    /**
     * Баркод жагсаалтаар лавлах
     * &gt;Энэхүү сервис нь Цахим төлбөрийн баримтын системийн PosAPI 3.0 хувилбарыг ашиглагч хэрэглэгчдэд зориулсан бөгөөд Бараа бүртгэлийн нэгдсэн систем (ББНС)-д бүртгэлтэй бараа, бүтээгдэхүүний баркодын мэдээллийг хуудаслалтайгаар лавлах боломжийг олгодог.    &lt;!-- theme: warning --&gt;  &gt;Энэхүү сервис нь БҮНА-ын ангиллын түвшингээр мэдээлэл авах боломжтой бөгөөд параметрүүдийг өөрчлөн дуудаж ашиглаж болно. 🔗 [Дэлгэрэнгүй мэдээлэлтэй танилцах  бол энд дарна уу](https://developer.itc.gov.mn/docs/ebarimt-api/said1mgfz0gb7-b-na-baraa-b-teegdeh-nij-angilal-barkod-lavlah)
     * @param page Хуудаслалтын тоо /0-ээс эхэлнэ/ (required)
     * @param size Хуудаслалтын хэмжээ /Хамгийн ихдээ 200/ (required)
     * @param date Бүртгэгдсэн/өөрчлөгдсөн огноо (тухайн огнооноос хойшхи баркодыг татах) (optional)
     * @return GetApiInfoCheckBarcodeAllResponse
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetApiInfoCheckBarcodeAllResponse getApiInfoCheckBarcodeAll(@Nonnull String page, @Nonnull String size, @Nullable String date) throws PosApiException {
        PosApiResponse<GetApiInfoCheckBarcodeAllResponse> localVarResp = getApiInfoCheckBarcodeAllWithHttpInfo(page, size, date);
        return localVarResp.getData();
    }

    /**
     * Баркод жагсаалтаар лавлах
     * &gt;Энэхүү сервис нь Цахим төлбөрийн баримтын системийн PosAPI 3.0 хувилбарыг ашиглагч хэрэглэгчдэд зориулсан бөгөөд Бараа бүртгэлийн нэгдсэн систем (ББНС)-д бүртгэлтэй бараа, бүтээгдэхүүний баркодын мэдээллийг хуудаслалтайгаар лавлах боломжийг олгодог.    &lt;!-- theme: warning --&gt;  &gt;Энэхүү сервис нь БҮНА-ын ангиллын түвшингээр мэдээлэл авах боломжтой бөгөөд параметрүүдийг өөрчлөн дуудаж ашиглаж болно. 🔗 [Дэлгэрэнгүй мэдээлэлтэй танилцах  бол энд дарна уу](https://developer.itc.gov.mn/docs/ebarimt-api/said1mgfz0gb7-b-na-baraa-b-teegdeh-nij-angilal-barkod-lavlah)
     * @param page Хуудаслалтын тоо /0-ээс эхэлнэ/ (required)
     * @param size Хуудаслалтын хэмжээ /Хамгийн ихдээ 200/ (required)
     * @param date Бүртгэгдсэн/өөрчлөгдсөн огноо (тухайн огнооноос хойшхи баркодыг татах) (optional)
     * @return PosApiResponse&lt;GetApiInfoCheckBarcodeAllResponse&gt;
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PosApiResponse<GetApiInfoCheckBarcodeAllResponse> getApiInfoCheckBarcodeAllWithHttpInfo(@Nonnull String page, @Nonnull String size, @Nullable String date) throws PosApiException {
        okhttp3.Call localVarCall = getApiInfoCheckBarcodeAllValidateBeforeCall(page, size, date, null);
        Type localVarReturnType = new TypeToken<GetApiInfoCheckBarcodeAllResponse>(){}.getType();
        return localVarPosApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Баркод жагсаалтаар лавлах (asynchronously)
     * &gt;Энэхүү сервис нь Цахим төлбөрийн баримтын системийн PosAPI 3.0 хувилбарыг ашиглагч хэрэглэгчдэд зориулсан бөгөөд Бараа бүртгэлийн нэгдсэн систем (ББНС)-д бүртгэлтэй бараа, бүтээгдэхүүний баркодын мэдээллийг хуудаслалтайгаар лавлах боломжийг олгодог.    &lt;!-- theme: warning --&gt;  &gt;Энэхүү сервис нь БҮНА-ын ангиллын түвшингээр мэдээлэл авах боломжтой бөгөөд параметрүүдийг өөрчлөн дуудаж ашиглаж болно. 🔗 [Дэлгэрэнгүй мэдээлэлтэй танилцах  бол энд дарна уу](https://developer.itc.gov.mn/docs/ebarimt-api/said1mgfz0gb7-b-na-baraa-b-teegdeh-nij-angilal-barkod-lavlah)
     * @param page Хуудаслалтын тоо /0-ээс эхэлнэ/ (required)
     * @param size Хуудаслалтын хэмжээ /Хамгийн ихдээ 200/ (required)
     * @param date Бүртгэгдсэн/өөрчлөгдсөн огноо (тухайн огнооноос хойшхи баркодыг татах) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws PosApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApiInfoCheckBarcodeAllAsync(@Nonnull String page, @Nonnull String size, @Nullable String date, final PosApiCallback<GetApiInfoCheckBarcodeAllResponse> _callback) throws PosApiException {

        okhttp3.Call localVarCall = getApiInfoCheckBarcodeAllValidateBeforeCall(page, size, date, _callback);
        Type localVarReturnType = new TypeToken<GetApiInfoCheckBarcodeAllResponse>(){}.getType();
        localVarPosApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getApiInfoCheckBarcodeV2
     * @param p1 Өмнөх салбарын дугаар (optional)
     * @param p2 Өмнөх дэд салбарын дугаар (optional)
     * @param p3 Өмнөх Бүлгийн дугаар (optional)
     * @param p4 Өмнөх ангийн дугаар (optional)
     * @param p5 Өмнөх дэд ангийн дугаар (optional)
     * @param p6 Өмнөх БҮНА код (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws PosApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApiInfoCheckBarcodeV2Call(@Nullable String p1, @Nullable String p2, @Nullable String p3, @Nullable String p4, @Nullable String p5, @Nullable String p6, final PosApiCallback _callback) throws PosApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "https://api.ebarimt.mn", "https://st-api.ebarimt.mn" };

        // Determine Base Path to Use
        basePath = chooseBasePath(localBasePaths);

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/info/check/barcode/v2/{p4}/{p5}/{p1}/{p2}/{p3}/{p6}"
            .replace("{" + "p1" + "}", localVarPosApiClient.escapeString(p1.toString()))
            .replace("{" + "p2" + "}", localVarPosApiClient.escapeString(p2.toString()))
            .replace("{" + "p3" + "}", localVarPosApiClient.escapeString(p3.toString()))
            .replace("{" + "p4" + "}", localVarPosApiClient.escapeString(p4.toString()))
            .replace("{" + "p5" + "}", localVarPosApiClient.escapeString(p5.toString()))
            .replace("{" + "p6" + "}", localVarPosApiClient.escapeString(p6.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarPosApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarPosApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarPosApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getApiInfoCheckBarcodeV2ValidateBeforeCall(@Nullable String p1, @Nullable String p2, @Nullable String p3, @Nullable String p4, @Nullable String p5, @Nullable String p6, final PosApiCallback _callback) throws PosApiException {
        return getApiInfoCheckBarcodeV2Call(p1, p2, p3, p4, p5, p6, _callback);

    }

    /**
     * БҮНА, бараа бүтээгдэхүүний ангилал, баркод лавлах
     * &gt;Энэхүү сервис нь Цахим төлбөрийн баримтын системийн PosAPI 3.0 хувилбарыг ашиглагч хэрэглэгчдэд зориулан Бараа, Үйлчилгээний Нэгдсэн Ангилал (БҮНА)-ын түвшин тус бүр болон тухайн ангилалд хамаарах баркодын мэдээллийг лавлах, ашиглах зориулалттай болно.  🔍 Энэхүү сервис нь Бараа, Үйлчилгээний Нэгдсэн Ангилал (БҮНА)-ын шатлалтай бүтэцтэй ангиллын мэдээллийг үе шаттайгаар лавлах боломжийг хэрэглэгчдэд олгодог.    1️⃣Сервисийг ямар нэгэн параметргүйгээр дуудсан тохиолдолд хамгийн дээд түвшний ангилал болох \&quot;Салбар\&quot;-ын жагсаалтыг буцаана.    2️⃣Салбарын код-ыг параметрээр илгээх үед тухайн салбарт хамаарах \&quot;Дэд салбар\&quot;-уудын жагсаалт ирнэ.    3️⃣Дэд салбарын код-ыг параметрт оруулснаар уг дэд салбарт хамаарах \&quot;Бүлэг\&quot; ангиллын мэдээллийг буцаана.    4️⃣Бүлгийн код-ыг параметрт оруулахад холбогдох \&quot;Анги\&quot;,\&quot;Дэд анги\&quot; цаашлаад \&quot;БҮНА код\&quot;, эцэст нь тухайн БҮНА кодын ангилалд багтах барааны баркодын жагсаалтыг харуулна.    5️⃣Ийм байдлаар шат дараатайгаар ангиллын кодыг параметрт дамжуулан илгээснээр БҮНА-ийн бүтэцтэй уялдсан \&quot;Баркод\&quot;-ын мэдээллийг авах боломжтой.
     * @param p1 Өмнөх салбарын дугаар (optional)
     * @param p2 Өмнөх дэд салбарын дугаар (optional)
     * @param p3 Өмнөх Бүлгийн дугаар (optional)
     * @param p4 Өмнөх ангийн дугаар (optional)
     * @param p5 Өмнөх дэд ангийн дугаар (optional)
     * @param p6 Өмнөх БҮНА код (optional)
     * @return List&lt;List&lt;String&gt;&gt;
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<List<String>> getApiInfoCheckBarcodeV2(@Nullable String p1, @Nullable String p2, @Nullable String p3, @Nullable String p4, @Nullable String p5, @Nullable String p6) throws PosApiException {
        PosApiResponse<List<List<String>>> localVarResp = getApiInfoCheckBarcodeV2WithHttpInfo(p1, p2, p3, p4, p5, p6);
        return localVarResp.getData();
    }

    /**
     * БҮНА, бараа бүтээгдэхүүний ангилал, баркод лавлах
     * &gt;Энэхүү сервис нь Цахим төлбөрийн баримтын системийн PosAPI 3.0 хувилбарыг ашиглагч хэрэглэгчдэд зориулан Бараа, Үйлчилгээний Нэгдсэн Ангилал (БҮНА)-ын түвшин тус бүр болон тухайн ангилалд хамаарах баркодын мэдээллийг лавлах, ашиглах зориулалттай болно.  🔍 Энэхүү сервис нь Бараа, Үйлчилгээний Нэгдсэн Ангилал (БҮНА)-ын шатлалтай бүтэцтэй ангиллын мэдээллийг үе шаттайгаар лавлах боломжийг хэрэглэгчдэд олгодог.    1️⃣Сервисийг ямар нэгэн параметргүйгээр дуудсан тохиолдолд хамгийн дээд түвшний ангилал болох \&quot;Салбар\&quot;-ын жагсаалтыг буцаана.    2️⃣Салбарын код-ыг параметрээр илгээх үед тухайн салбарт хамаарах \&quot;Дэд салбар\&quot;-уудын жагсаалт ирнэ.    3️⃣Дэд салбарын код-ыг параметрт оруулснаар уг дэд салбарт хамаарах \&quot;Бүлэг\&quot; ангиллын мэдээллийг буцаана.    4️⃣Бүлгийн код-ыг параметрт оруулахад холбогдох \&quot;Анги\&quot;,\&quot;Дэд анги\&quot; цаашлаад \&quot;БҮНА код\&quot;, эцэст нь тухайн БҮНА кодын ангилалд багтах барааны баркодын жагсаалтыг харуулна.    5️⃣Ийм байдлаар шат дараатайгаар ангиллын кодыг параметрт дамжуулан илгээснээр БҮНА-ийн бүтэцтэй уялдсан \&quot;Баркод\&quot;-ын мэдээллийг авах боломжтой.
     * @param p1 Өмнөх салбарын дугаар (optional)
     * @param p2 Өмнөх дэд салбарын дугаар (optional)
     * @param p3 Өмнөх Бүлгийн дугаар (optional)
     * @param p4 Өмнөх ангийн дугаар (optional)
     * @param p5 Өмнөх дэд ангийн дугаар (optional)
     * @param p6 Өмнөх БҮНА код (optional)
     * @return PosApiResponse&lt;List&lt;List&lt;String&gt;&gt;&gt;
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PosApiResponse<List<List<String>>> getApiInfoCheckBarcodeV2WithHttpInfo(@Nullable String p1, @Nullable String p2, @Nullable String p3, @Nullable String p4, @Nullable String p5, @Nullable String p6) throws PosApiException {
        okhttp3.Call localVarCall = getApiInfoCheckBarcodeV2ValidateBeforeCall(p1, p2, p3, p4, p5, p6, null);
        Type localVarReturnType = new TypeToken<List<List<String>>>(){}.getType();
        return localVarPosApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * БҮНА, бараа бүтээгдэхүүний ангилал, баркод лавлах (asynchronously)
     * &gt;Энэхүү сервис нь Цахим төлбөрийн баримтын системийн PosAPI 3.0 хувилбарыг ашиглагч хэрэглэгчдэд зориулан Бараа, Үйлчилгээний Нэгдсэн Ангилал (БҮНА)-ын түвшин тус бүр болон тухайн ангилалд хамаарах баркодын мэдээллийг лавлах, ашиглах зориулалттай болно.  🔍 Энэхүү сервис нь Бараа, Үйлчилгээний Нэгдсэн Ангилал (БҮНА)-ын шатлалтай бүтэцтэй ангиллын мэдээллийг үе шаттайгаар лавлах боломжийг хэрэглэгчдэд олгодог.    1️⃣Сервисийг ямар нэгэн параметргүйгээр дуудсан тохиолдолд хамгийн дээд түвшний ангилал болох \&quot;Салбар\&quot;-ын жагсаалтыг буцаана.    2️⃣Салбарын код-ыг параметрээр илгээх үед тухайн салбарт хамаарах \&quot;Дэд салбар\&quot;-уудын жагсаалт ирнэ.    3️⃣Дэд салбарын код-ыг параметрт оруулснаар уг дэд салбарт хамаарах \&quot;Бүлэг\&quot; ангиллын мэдээллийг буцаана.    4️⃣Бүлгийн код-ыг параметрт оруулахад холбогдох \&quot;Анги\&quot;,\&quot;Дэд анги\&quot; цаашлаад \&quot;БҮНА код\&quot;, эцэст нь тухайн БҮНА кодын ангилалд багтах барааны баркодын жагсаалтыг харуулна.    5️⃣Ийм байдлаар шат дараатайгаар ангиллын кодыг параметрт дамжуулан илгээснээр БҮНА-ийн бүтэцтэй уялдсан \&quot;Баркод\&quot;-ын мэдээллийг авах боломжтой.
     * @param p1 Өмнөх салбарын дугаар (optional)
     * @param p2 Өмнөх дэд салбарын дугаар (optional)
     * @param p3 Өмнөх Бүлгийн дугаар (optional)
     * @param p4 Өмнөх ангийн дугаар (optional)
     * @param p5 Өмнөх дэд ангийн дугаар (optional)
     * @param p6 Өмнөх БҮНА код (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws PosApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApiInfoCheckBarcodeV2Async(@Nullable String p1, @Nullable String p2, @Nullable String p3, @Nullable String p4, @Nullable String p5, @Nullable String p6, final PosApiCallback<List<List<String>>> _callback) throws PosApiException {

        okhttp3.Call localVarCall = getApiInfoCheckBarcodeV2ValidateBeforeCall(p1, p2, p3, p4, p5, p6, _callback);
        Type localVarReturnType = new TypeToken<List<List<String>>>(){}.getType();
        localVarPosApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getApiInfoCheckGetBranchInfo
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws PosApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApiInfoCheckGetBranchInfoCall(final PosApiCallback _callback) throws PosApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "https://api.ebarimt.mn/", "https://st-api.ebarimt.mn/" };

        // Determine Base Path to Use
        basePath = chooseBasePath(localBasePaths);

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/info/check/getBranchInfo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/javascript"
        };
        final String localVarAccept = localVarPosApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarPosApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarPosApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getApiInfoCheckGetBranchInfoValidateBeforeCall(final PosApiCallback _callback) throws PosApiException {
        return getApiInfoCheckGetBranchInfoCall(_callback);

    }

    /**
     * District_code лавлах
     * &gt;Цахим төлбөрийн баримтын систем (PosAPI)-ээс үүсгэж буй төлбөрийн баримтын үйл ажиллагаа явуулж буй байршлын мэдээллийг \&quot;districtCode\&quot; гэсэн баганад бөглөн илгээдэг. Энэ талбарт бөглөсөн байршлын татварын алба болон дэд албаны кодын жагсаалтын мэдээллийг энэхүү сервисээс авах боломжтой.    &gt;Жишээ: Номин холдинг ХХК-ийн Архангай аймгийн Чулуут сум дахь салбараас үүсгэсэн баримтын \&quot;districtCode\&quot;-г 0102 гэж бөглөн илгээнэ.
     * @return GetApiInfoCheckGetBranchInfoResponse
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public GetApiInfoCheckGetBranchInfoResponse getApiInfoCheckGetBranchInfo() throws PosApiException {
        PosApiResponse<GetApiInfoCheckGetBranchInfoResponse> localVarResp = getApiInfoCheckGetBranchInfoWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * District_code лавлах
     * &gt;Цахим төлбөрийн баримтын систем (PosAPI)-ээс үүсгэж буй төлбөрийн баримтын үйл ажиллагаа явуулж буй байршлын мэдээллийг \&quot;districtCode\&quot; гэсэн баганад бөглөн илгээдэг. Энэ талбарт бөглөсөн байршлын татварын алба болон дэд албаны кодын жагсаалтын мэдээллийг энэхүү сервисээс авах боломжтой.    &gt;Жишээ: Номин холдинг ХХК-ийн Архангай аймгийн Чулуут сум дахь салбараас үүсгэсэн баримтын \&quot;districtCode\&quot;-г 0102 гэж бөглөн илгээнэ.
     * @return PosApiResponse&lt;GetApiInfoCheckGetBranchInfoResponse&gt;
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public PosApiResponse<GetApiInfoCheckGetBranchInfoResponse> getApiInfoCheckGetBranchInfoWithHttpInfo() throws PosApiException {
        okhttp3.Call localVarCall = getApiInfoCheckGetBranchInfoValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GetApiInfoCheckGetBranchInfoResponse>(){}.getType();
        return localVarPosApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * District_code лавлах (asynchronously)
     * &gt;Цахим төлбөрийн баримтын систем (PosAPI)-ээс үүсгэж буй төлбөрийн баримтын үйл ажиллагаа явуулж буй байршлын мэдээллийг \&quot;districtCode\&quot; гэсэн баганад бөглөн илгээдэг. Энэ талбарт бөглөсөн байршлын татварын алба болон дэд албаны кодын жагсаалтын мэдээллийг энэхүү сервисээс авах боломжтой.    &gt;Жишээ: Номин холдинг ХХК-ийн Архангай аймгийн Чулуут сум дахь салбараас үүсгэсэн баримтын \&quot;districtCode\&quot;-г 0102 гэж бөглөн илгээнэ.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws PosApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApiInfoCheckGetBranchInfoAsync(final PosApiCallback<GetApiInfoCheckGetBranchInfoResponse> _callback) throws PosApiException {

        okhttp3.Call localVarCall = getApiInfoCheckGetBranchInfoValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GetApiInfoCheckGetBranchInfoResponse>(){}.getType();
        localVarPosApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getApiInfoCheckGetInfo
     * @param tin ТИН дугаар (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws PosApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApiInfoCheckGetInfoCall(@Nonnull String tin, final PosApiCallback _callback) throws PosApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "https://api.ebarimt.mn", "https://st-api.ebarimt.mn" };

        // Determine Base Path to Use
        basePath = chooseBasePath(localBasePaths);

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/info/check/getInfo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tin != null) {
            localVarQueryParams.addAll(localVarPosApiClient.parameterToPair("tin", tin));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarPosApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarPosApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarPosApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getApiInfoCheckGetInfoValidateBeforeCall(@Nonnull String tin, final PosApiCallback _callback) throws PosApiException {
        // verify the required parameter 'tin' is set
        if (tin == null) {
            throw new PosApiException("Missing the required parameter 'tin' when calling getApiInfoCheckGetInfo(Async)");
        }

        return getApiInfoCheckGetInfoCall(tin, _callback);

    }

    /**
     * Бүртгэлийн мэдээлэл лавлах
     * &gt;Энэхүү сервис нь “Татвар төлөгчийн дугаар”-аар тухайн этгээдийн татварын бүртгэл, мэдээллийн нэгдсэн санд байх бүртгэлийн мэдээллийг дамжуулах үүрэгтэй ба хэрэглэгчийн систем нийлүүлэгч нь өөрийн хөгжүүлж буй системд холбон ашиглах боломжтой.    [Регистрийн дугаар ашилан TIN дугаар авах бол дарна уу.](ebarimt.yaml/paths/~1api~1info~1check~1getTinInfo/get)
     * @param tin ТИН дугаар (required)
     * @return GetApiInfoCheckGetInfoResponse
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetApiInfoCheckGetInfoResponse getApiInfoCheckGetInfo(@Nonnull String tin) throws PosApiException {
        PosApiResponse<GetApiInfoCheckGetInfoResponse> localVarResp = getApiInfoCheckGetInfoWithHttpInfo(tin);
        return localVarResp.getData();
    }

    /**
     * Бүртгэлийн мэдээлэл лавлах
     * &gt;Энэхүү сервис нь “Татвар төлөгчийн дугаар”-аар тухайн этгээдийн татварын бүртгэл, мэдээллийн нэгдсэн санд байх бүртгэлийн мэдээллийг дамжуулах үүрэгтэй ба хэрэглэгчийн систем нийлүүлэгч нь өөрийн хөгжүүлж буй системд холбон ашиглах боломжтой.    [Регистрийн дугаар ашилан TIN дугаар авах бол дарна уу.](ebarimt.yaml/paths/~1api~1info~1check~1getTinInfo/get)
     * @param tin ТИН дугаар (required)
     * @return PosApiResponse&lt;GetApiInfoCheckGetInfoResponse&gt;
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PosApiResponse<GetApiInfoCheckGetInfoResponse> getApiInfoCheckGetInfoWithHttpInfo(@Nonnull String tin) throws PosApiException {
        okhttp3.Call localVarCall = getApiInfoCheckGetInfoValidateBeforeCall(tin, null);
        Type localVarReturnType = new TypeToken<GetApiInfoCheckGetInfoResponse>(){}.getType();
        return localVarPosApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Бүртгэлийн мэдээлэл лавлах (asynchronously)
     * &gt;Энэхүү сервис нь “Татвар төлөгчийн дугаар”-аар тухайн этгээдийн татварын бүртгэл, мэдээллийн нэгдсэн санд байх бүртгэлийн мэдээллийг дамжуулах үүрэгтэй ба хэрэглэгчийн систем нийлүүлэгч нь өөрийн хөгжүүлж буй системд холбон ашиглах боломжтой.    [Регистрийн дугаар ашилан TIN дугаар авах бол дарна уу.](ebarimt.yaml/paths/~1api~1info~1check~1getTinInfo/get)
     * @param tin ТИН дугаар (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws PosApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApiInfoCheckGetInfoAsync(@Nonnull String tin, final PosApiCallback<GetApiInfoCheckGetInfoResponse> _callback) throws PosApiException {

        okhttp3.Call localVarCall = getApiInfoCheckGetInfoValidateBeforeCall(tin, _callback);
        Type localVarReturnType = new TypeToken<GetApiInfoCheckGetInfoResponse>(){}.getType();
        localVarPosApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getApiInfoCheckGetTinInfo
     * @param regNo Татвар төлөгчийн регистрийн дугаар (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws PosApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApiInfoCheckGetTinInfoCall(@Nullable String regNo, final PosApiCallback _callback) throws PosApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "https://api.ebarimt.mn", "https://st-api.ebarimt.mn" };

        // Determine Base Path to Use
        basePath = chooseBasePath(localBasePaths);

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/info/check/getTinInfo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (regNo != null) {
            localVarQueryParams.addAll(localVarPosApiClient.parameterToPair("regNo", regNo));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarPosApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarPosApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarPosApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getApiInfoCheckGetTinInfoValidateBeforeCall(@Nullable String regNo, final PosApiCallback _callback) throws PosApiException {
        return getApiInfoCheckGetTinInfoCall(regNo, _callback);

    }

    /**
     * Татвар төлөгчийн дугаар лавлах /ТIN, Civil_id/
     * &gt;Татвар төлөгчийн дугаар лавлах сервис /ТIN, Civil_id/: Шинэчлэн батлагдсан Хувь хүний мэдээлэл хамгаалах тухай хууль, Татварын ерөнхий хуульд заасны дагуу татвар төлөгчийг татварын системүүдэд бүртгэхдээ “Татвар төлөгчийн дугаар” ашиглахаар болсон. Дээрх хуулийн дагуу систем нийлүүлэгч нь PosApi 3.0 системд борлуулагчийг бүртгэхдээ “Хуулийн этгээд”-ийн хувьд ТИН дугаар, “Хувь хүн”-ий хувьд Civil_id-г ашиглах ба энэхүү сервис нь татвар төлөгчийн дугаарыг регистрийн дугаараар лавлах боломжийг бүрдүүлсэн.
     * @param regNo Татвар төлөгчийн регистрийн дугаар (optional)
     * @return GetApiInfoCheckGetTinInfoResponse
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetApiInfoCheckGetTinInfoResponse getApiInfoCheckGetTinInfo(@Nullable String regNo) throws PosApiException {
        PosApiResponse<GetApiInfoCheckGetTinInfoResponse> localVarResp = getApiInfoCheckGetTinInfoWithHttpInfo(regNo);
        return localVarResp.getData();
    }

    /**
     * Татвар төлөгчийн дугаар лавлах /ТIN, Civil_id/
     * &gt;Татвар төлөгчийн дугаар лавлах сервис /ТIN, Civil_id/: Шинэчлэн батлагдсан Хувь хүний мэдээлэл хамгаалах тухай хууль, Татварын ерөнхий хуульд заасны дагуу татвар төлөгчийг татварын системүүдэд бүртгэхдээ “Татвар төлөгчийн дугаар” ашиглахаар болсон. Дээрх хуулийн дагуу систем нийлүүлэгч нь PosApi 3.0 системд борлуулагчийг бүртгэхдээ “Хуулийн этгээд”-ийн хувьд ТИН дугаар, “Хувь хүн”-ий хувьд Civil_id-г ашиглах ба энэхүү сервис нь татвар төлөгчийн дугаарыг регистрийн дугаараар лавлах боломжийг бүрдүүлсэн.
     * @param regNo Татвар төлөгчийн регистрийн дугаар (optional)
     * @return PosApiResponse&lt;GetApiInfoCheckGetTinInfoResponse&gt;
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PosApiResponse<GetApiInfoCheckGetTinInfoResponse> getApiInfoCheckGetTinInfoWithHttpInfo(@Nullable String regNo) throws PosApiException {
        okhttp3.Call localVarCall = getApiInfoCheckGetTinInfoValidateBeforeCall(regNo, null);
        Type localVarReturnType = new TypeToken<GetApiInfoCheckGetTinInfoResponse>(){}.getType();
        return localVarPosApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Татвар төлөгчийн дугаар лавлах /ТIN, Civil_id/ (asynchronously)
     * &gt;Татвар төлөгчийн дугаар лавлах сервис /ТIN, Civil_id/: Шинэчлэн батлагдсан Хувь хүний мэдээлэл хамгаалах тухай хууль, Татварын ерөнхий хуульд заасны дагуу татвар төлөгчийг татварын системүүдэд бүртгэхдээ “Татвар төлөгчийн дугаар” ашиглахаар болсон. Дээрх хуулийн дагуу систем нийлүүлэгч нь PosApi 3.0 системд борлуулагчийг бүртгэхдээ “Хуулийн этгээд”-ийн хувьд ТИН дугаар, “Хувь хүн”-ий хувьд Civil_id-г ашиглах ба энэхүү сервис нь татвар төлөгчийн дугаарыг регистрийн дугаараар лавлах боломжийг бүрдүүлсэн.
     * @param regNo Татвар төлөгчийн регистрийн дугаар (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws PosApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApiInfoCheckGetTinInfoAsync(@Nullable String regNo, final PosApiCallback<GetApiInfoCheckGetTinInfoResponse> _callback) throws PosApiException {

        okhttp3.Call localVarCall = getApiInfoCheckGetTinInfoValidateBeforeCall(regNo, _callback);
        Type localVarReturnType = new TypeToken<GetApiInfoCheckGetTinInfoResponse>(){}.getType();
        localVarPosApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getApiInventoryStockGetStockQr
     * @param stockQr Тэмдгийн QR (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws PosApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApiInventoryStockGetStockQrCall(@Nonnull String stockQr, final PosApiCallback _callback) throws PosApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "https://st-service.itc.gov.mn/", "https://service.itc.gov.mn/" };

        // Determine Base Path to Use
        basePath = chooseBasePath(localBasePaths);

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/inventory/stock/getStockQr";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (stockQr != null) {
            localVarQueryParams.addAll(localVarPosApiClient.parameterToPair("stockQr", stockQr));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarPosApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarPosApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "auth_copy.yaml" };
        return localVarPosApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getApiInventoryStockGetStockQrValidateBeforeCall(@Nonnull String stockQr, final PosApiCallback _callback) throws PosApiException {
        // verify the required parameter 'stockQr' is set
        if (stockQr == null) {
            throw new PosApiException("Missing the required parameter 'stockQr' when calling getApiInventoryStockGetStockQr(Async)");
        }

        return getApiInventoryStockGetStockQrCall(stockQr, _callback);

    }

    /**
     * ОАТ барааны баркодын мэдээлэл лавлах /QR/
     * &gt;Онцгой албан татварын тэмдэг бүхий барааны баркод болон бусад дэлгэрэнгүй мэдээллийг \&quot;Тэмдгийн QR ID\&quot; ашиглан лавлах бол энэхүү сервисийг ашиглах ба PosAPI 3.0 системийн \&quot;PosAPI-руу төлбөрийн баримт хадгалах сервис\&quot; /post-rest-receipt/-ийн stockQR талбарт хадгалах өгөгдлийг лавлахад ашиглагдана. [Нэгдсэн нэвтрэлтийн token авах бол дарна уу.](reference/auth_copy.yaml/paths/~1protocol~1openid-connect~1token/post)
     * @param stockQr Тэмдгийн QR (required)
     * @return GetApiInventoryStockGetStockQrResponse
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetApiInventoryStockGetStockQrResponse getApiInventoryStockGetStockQr(@Nonnull String stockQr) throws PosApiException {
        PosApiResponse<GetApiInventoryStockGetStockQrResponse> localVarResp = getApiInventoryStockGetStockQrWithHttpInfo(stockQr);
        return localVarResp.getData();
    }

    /**
     * ОАТ барааны баркодын мэдээлэл лавлах /QR/
     * &gt;Онцгой албан татварын тэмдэг бүхий барааны баркод болон бусад дэлгэрэнгүй мэдээллийг \&quot;Тэмдгийн QR ID\&quot; ашиглан лавлах бол энэхүү сервисийг ашиглах ба PosAPI 3.0 системийн \&quot;PosAPI-руу төлбөрийн баримт хадгалах сервис\&quot; /post-rest-receipt/-ийн stockQR талбарт хадгалах өгөгдлийг лавлахад ашиглагдана. [Нэгдсэн нэвтрэлтийн token авах бол дарна уу.](reference/auth_copy.yaml/paths/~1protocol~1openid-connect~1token/post)
     * @param stockQr Тэмдгийн QR (required)
     * @return PosApiResponse&lt;GetApiInventoryStockGetStockQrResponse&gt;
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PosApiResponse<GetApiInventoryStockGetStockQrResponse> getApiInventoryStockGetStockQrWithHttpInfo(@Nonnull String stockQr) throws PosApiException {
        okhttp3.Call localVarCall = getApiInventoryStockGetStockQrValidateBeforeCall(stockQr, null);
        Type localVarReturnType = new TypeToken<GetApiInventoryStockGetStockQrResponse>(){}.getType();
        return localVarPosApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * ОАТ барааны баркодын мэдээлэл лавлах /QR/ (asynchronously)
     * &gt;Онцгой албан татварын тэмдэг бүхий барааны баркод болон бусад дэлгэрэнгүй мэдээллийг \&quot;Тэмдгийн QR ID\&quot; ашиглан лавлах бол энэхүү сервисийг ашиглах ба PosAPI 3.0 системийн \&quot;PosAPI-руу төлбөрийн баримт хадгалах сервис\&quot; /post-rest-receipt/-ийн stockQR талбарт хадгалах өгөгдлийг лавлахад ашиглагдана. [Нэгдсэн нэвтрэлтийн token авах бол дарна уу.](reference/auth_copy.yaml/paths/~1protocol~1openid-connect~1token/post)
     * @param stockQr Тэмдгийн QR (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws PosApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApiInventoryStockGetStockQrAsync(@Nonnull String stockQr, final PosApiCallback<GetApiInventoryStockGetStockQrResponse> _callback) throws PosApiException {

        okhttp3.Call localVarCall = getApiInventoryStockGetStockQrValidateBeforeCall(stockQr, _callback);
        Type localVarReturnType = new TypeToken<GetApiInventoryStockGetStockQrResponse>(){}.getType();
        localVarPosApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getApiReceiptReceiptGetProductTaxCode
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws PosApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApiReceiptReceiptGetProductTaxCodeCall(final PosApiCallback _callback) throws PosApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "https://api.ebarimt.mn", "https://st-api.ebarimt.mn" };

        // Determine Base Path to Use
        basePath = chooseBasePath(localBasePaths);

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/receipt/receipt/getProductTaxCode";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarPosApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarPosApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarPosApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getApiReceiptReceiptGetProductTaxCodeValidateBeforeCall(final PosApiCallback _callback) throws PosApiException {
        return getApiReceiptReceiptGetProductTaxCodeCall(_callback);

    }

    /**
     * VAT_FREE, VAT_ZERO, NO_VAT бараа, үйлчилгээний код лавлах
     * &gt;Нэмэгдсэн өртгийн албан татвар /НӨАТ-аас чөлөөлөгдөх, НӨАТ-н 0 хувь хэрэглэх/, Аж ахуйн нэгжийн орлогын албан татвараас чөлөөлөгдөх хуулийн кодыг жагсаалтаар авах бол энэхүү сервисийг ашиглах ба PosAPI 3.0 системийн \&quot;PosAPI-руу төлбөрийн баримт хадгалах сервис\&quot; /post-rest-receipt/-ийн taxProductCode талбарт хадгалах өгөгдлийг лавлахад ашиглагдана. 
     * @return GetApiReceiptReceiptGetProductTaxCodeResponse
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetApiReceiptReceiptGetProductTaxCodeResponse getApiReceiptReceiptGetProductTaxCode() throws PosApiException {
        PosApiResponse<GetApiReceiptReceiptGetProductTaxCodeResponse> localVarResp = getApiReceiptReceiptGetProductTaxCodeWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * VAT_FREE, VAT_ZERO, NO_VAT бараа, үйлчилгээний код лавлах
     * &gt;Нэмэгдсэн өртгийн албан татвар /НӨАТ-аас чөлөөлөгдөх, НӨАТ-н 0 хувь хэрэглэх/, Аж ахуйн нэгжийн орлогын албан татвараас чөлөөлөгдөх хуулийн кодыг жагсаалтаар авах бол энэхүү сервисийг ашиглах ба PosAPI 3.0 системийн \&quot;PosAPI-руу төлбөрийн баримт хадгалах сервис\&quot; /post-rest-receipt/-ийн taxProductCode талбарт хадгалах өгөгдлийг лавлахад ашиглагдана. 
     * @return PosApiResponse&lt;GetApiReceiptReceiptGetProductTaxCodeResponse&gt;
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PosApiResponse<GetApiReceiptReceiptGetProductTaxCodeResponse> getApiReceiptReceiptGetProductTaxCodeWithHttpInfo() throws PosApiException {
        okhttp3.Call localVarCall = getApiReceiptReceiptGetProductTaxCodeValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GetApiReceiptReceiptGetProductTaxCodeResponse>(){}.getType();
        return localVarPosApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * VAT_FREE, VAT_ZERO, NO_VAT бараа, үйлчилгээний код лавлах (asynchronously)
     * &gt;Нэмэгдсэн өртгийн албан татвар /НӨАТ-аас чөлөөлөгдөх, НӨАТ-н 0 хувь хэрэглэх/, Аж ахуйн нэгжийн орлогын албан татвараас чөлөөлөгдөх хуулийн кодыг жагсаалтаар авах бол энэхүү сервисийг ашиглах ба PosAPI 3.0 системийн \&quot;PosAPI-руу төлбөрийн баримт хадгалах сервис\&quot; /post-rest-receipt/-ийн taxProductCode талбарт хадгалах өгөгдлийг лавлахад ашиглагдана. 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws PosApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApiReceiptReceiptGetProductTaxCodeAsync(final PosApiCallback<GetApiReceiptReceiptGetProductTaxCodeResponse> _callback) throws PosApiException {

        okhttp3.Call localVarCall = getApiReceiptReceiptGetProductTaxCodeValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GetApiReceiptReceiptGetProductTaxCodeResponse>(){}.getType();
        localVarPosApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRestBankAccountstinTIN
     * @param tin Хувь хүн хуулийн этгээдийн татвар төлөгчийн дугаар (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws PosApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRestBankAccountstinTINCall(@Nullable String tin, final PosApiCallback _callback) throws PosApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "http://{baseUrl}", "http://localhost:7080/" };

        // Determine Base Path to Use
        basePath = chooseBasePath(localBasePaths);

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/bankAccounts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tin != null) {
            localVarQueryParams.addAll(localVarPosApiClient.parameterToPair("tin", tin));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarPosApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarPosApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarPosApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getRestBankAccountstinTINValidateBeforeCall(@Nullable String tin, final PosApiCallback _callback) throws PosApiException {
        return getRestBankAccountstinTINCall(tin, _callback);

    }

    /**
     * Банкны дансны мэдээлэл лавлах
     * &gt;Банкны дансны мэдээлэл лавлах сервис нь Оператор компанид хэрэглэгчээр бүртгэгдсэн \&quot;Мерчант\&quot; болон түүний \&quot;Түрээслэгч\&quot;-ийн Local баазын \&quot;bankaccount\&quot; хүснэгт-д бүртгэгдсэн идэвхтэй дансны мэдээллийг лавлахад зориулагдсан.     &lt;!-- theme: warning --&gt;    &gt;PosAPI 3.0 систем дэх дансны мэдээлэл шинэчлэх тухай    ✅ PosAPI 3.0 систем нь local баазын \&quot;bankaccount\&quot; дээр дансны мэдээллийг хадгалж, уг өгөгдөлд үндэслэн баримтын дансыг үүсгэдэг.    🔄 Дансны мэдээлэл хэрхэн шинэчлэгддэг вэ?    ПосАПИ дахь дансны мэдээлэл өөрчлөгдвөл баримт илгээх (/senddata/) үйлдэл хийгдэх үед    1️⃣ Дансны дугааруудыг Оператор-Ибаримт систем дэх бүртгэлтэй тулган шалгана.    2️⃣ Хэрэв өөрчлөлт илэрвэл автоматаар шинэчлэнэ.    ⚠ Анхаарах зүйлс:    Нэг ПосАПИ баримт илгээх (/senddata/) үйлдэл хийснээр зөвхөн тухайн ПосАПИ-гийн дансны мэдээлэл шинэчлэгдэнэ.    Бусад ПосАПИ-д энэ өөрчлөлт нөлөөлөхгүй тул, хэрэв таны аль нэг бүртгэлтэй Мерчантын дансны мэдээлэл өөрчлөгдвөл тухайн өөрчлөгдсөн Мерчант бүртгэгдсэн ПосАПИ тус бүрт баримт илгээж, шинэчлэл хийх шаардлагатай.    Иймд дансны мэдээлэл өөрчлөгдсөн тохиолдолд бүх холбогдох ПосАПИ дээр шинэчлэл хийхээ    &gt; \&quot; \&quot;Баримт илгээх\&quot; үйлдэл хийсэн Local бааз дахь дансны мэдээлэл шинэчлэгдэхгүй бол Мерчант болон түүний түрээслэгч нь системд дансаа бүртгээгүй, эсвэл мэдээллээ шинэчлээгүй байх магадлалтай.    ✅ Шийдэл:    \&quot;Цахим татварын систем\&quot;-д нэвтэрч, дансаа бүртгэх эсвэл өөрчилнө.    E-invoice системийн \&quot;Баримт үүсгэх\&quot; цонхны \&quot;Банкны мэдээлэл\&quot; хэсгээс &lt;i class&#x3D;\&quot;fa-solid fa-download\&quot;&gt;&lt;/i&gt; товчийг дарж, мэдээллээ шинэчлэн татна.                  
     * @param tin Хувь хүн хуулийн этгээдийн татвар төлөгчийн дугаар (optional)
     * @return List&lt;GetRestBankAccountsTinTINResponse&gt;
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<GetRestBankAccountsTinTINResponse> getRestBankAccountstinTIN(@Nullable String tin) throws PosApiException {
        PosApiResponse<List<GetRestBankAccountsTinTINResponse>> localVarResp = getRestBankAccountstinTINWithHttpInfo(tin);
        return localVarResp.getData();
    }

    /**
     * Банкны дансны мэдээлэл лавлах
     * &gt;Банкны дансны мэдээлэл лавлах сервис нь Оператор компанид хэрэглэгчээр бүртгэгдсэн \&quot;Мерчант\&quot; болон түүний \&quot;Түрээслэгч\&quot;-ийн Local баазын \&quot;bankaccount\&quot; хүснэгт-д бүртгэгдсэн идэвхтэй дансны мэдээллийг лавлахад зориулагдсан.     &lt;!-- theme: warning --&gt;    &gt;PosAPI 3.0 систем дэх дансны мэдээлэл шинэчлэх тухай    ✅ PosAPI 3.0 систем нь local баазын \&quot;bankaccount\&quot; дээр дансны мэдээллийг хадгалж, уг өгөгдөлд үндэслэн баримтын дансыг үүсгэдэг.    🔄 Дансны мэдээлэл хэрхэн шинэчлэгддэг вэ?    ПосАПИ дахь дансны мэдээлэл өөрчлөгдвөл баримт илгээх (/senddata/) үйлдэл хийгдэх үед    1️⃣ Дансны дугааруудыг Оператор-Ибаримт систем дэх бүртгэлтэй тулган шалгана.    2️⃣ Хэрэв өөрчлөлт илэрвэл автоматаар шинэчлэнэ.    ⚠ Анхаарах зүйлс:    Нэг ПосАПИ баримт илгээх (/senddata/) үйлдэл хийснээр зөвхөн тухайн ПосАПИ-гийн дансны мэдээлэл шинэчлэгдэнэ.    Бусад ПосАПИ-д энэ өөрчлөлт нөлөөлөхгүй тул, хэрэв таны аль нэг бүртгэлтэй Мерчантын дансны мэдээлэл өөрчлөгдвөл тухайн өөрчлөгдсөн Мерчант бүртгэгдсэн ПосАПИ тус бүрт баримт илгээж, шинэчлэл хийх шаардлагатай.    Иймд дансны мэдээлэл өөрчлөгдсөн тохиолдолд бүх холбогдох ПосАПИ дээр шинэчлэл хийхээ    &gt; \&quot; \&quot;Баримт илгээх\&quot; үйлдэл хийсэн Local бааз дахь дансны мэдээлэл шинэчлэгдэхгүй бол Мерчант болон түүний түрээслэгч нь системд дансаа бүртгээгүй, эсвэл мэдээллээ шинэчлээгүй байх магадлалтай.    ✅ Шийдэл:    \&quot;Цахим татварын систем\&quot;-д нэвтэрч, дансаа бүртгэх эсвэл өөрчилнө.    E-invoice системийн \&quot;Баримт үүсгэх\&quot; цонхны \&quot;Банкны мэдээлэл\&quot; хэсгээс &lt;i class&#x3D;\&quot;fa-solid fa-download\&quot;&gt;&lt;/i&gt; товчийг дарж, мэдээллээ шинэчлэн татна.                  
     * @param tin Хувь хүн хуулийн этгээдийн татвар төлөгчийн дугаар (optional)
     * @return PosApiResponse&lt;List&lt;GetRestBankAccountsTinTINResponse&gt;&gt;
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PosApiResponse<List<GetRestBankAccountsTinTINResponse>> getRestBankAccountstinTINWithHttpInfo(@Nullable String tin) throws PosApiException {
        okhttp3.Call localVarCall = getRestBankAccountstinTINValidateBeforeCall(tin, null);
        Type localVarReturnType = new TypeToken<List<GetRestBankAccountsTinTINResponse>>(){}.getType();
        return localVarPosApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Банкны дансны мэдээлэл лавлах (asynchronously)
     * &gt;Банкны дансны мэдээлэл лавлах сервис нь Оператор компанид хэрэглэгчээр бүртгэгдсэн \&quot;Мерчант\&quot; болон түүний \&quot;Түрээслэгч\&quot;-ийн Local баазын \&quot;bankaccount\&quot; хүснэгт-д бүртгэгдсэн идэвхтэй дансны мэдээллийг лавлахад зориулагдсан.     &lt;!-- theme: warning --&gt;    &gt;PosAPI 3.0 систем дэх дансны мэдээлэл шинэчлэх тухай    ✅ PosAPI 3.0 систем нь local баазын \&quot;bankaccount\&quot; дээр дансны мэдээллийг хадгалж, уг өгөгдөлд үндэслэн баримтын дансыг үүсгэдэг.    🔄 Дансны мэдээлэл хэрхэн шинэчлэгддэг вэ?    ПосАПИ дахь дансны мэдээлэл өөрчлөгдвөл баримт илгээх (/senddata/) үйлдэл хийгдэх үед    1️⃣ Дансны дугааруудыг Оператор-Ибаримт систем дэх бүртгэлтэй тулган шалгана.    2️⃣ Хэрэв өөрчлөлт илэрвэл автоматаар шинэчлэнэ.    ⚠ Анхаарах зүйлс:    Нэг ПосАПИ баримт илгээх (/senddata/) үйлдэл хийснээр зөвхөн тухайн ПосАПИ-гийн дансны мэдээлэл шинэчлэгдэнэ.    Бусад ПосАПИ-д энэ өөрчлөлт нөлөөлөхгүй тул, хэрэв таны аль нэг бүртгэлтэй Мерчантын дансны мэдээлэл өөрчлөгдвөл тухайн өөрчлөгдсөн Мерчант бүртгэгдсэн ПосАПИ тус бүрт баримт илгээж, шинэчлэл хийх шаардлагатай.    Иймд дансны мэдээлэл өөрчлөгдсөн тохиолдолд бүх холбогдох ПосАПИ дээр шинэчлэл хийхээ    &gt; \&quot; \&quot;Баримт илгээх\&quot; үйлдэл хийсэн Local бааз дахь дансны мэдээлэл шинэчлэгдэхгүй бол Мерчант болон түүний түрээслэгч нь системд дансаа бүртгээгүй, эсвэл мэдээллээ шинэчлээгүй байх магадлалтай.    ✅ Шийдэл:    \&quot;Цахим татварын систем\&quot;-д нэвтэрч, дансаа бүртгэх эсвэл өөрчилнө.    E-invoice системийн \&quot;Баримт үүсгэх\&quot; цонхны \&quot;Банкны мэдээлэл\&quot; хэсгээс &lt;i class&#x3D;\&quot;fa-solid fa-download\&quot;&gt;&lt;/i&gt; товчийг дарж, мэдээллээ шинэчлэн татна.                  
     * @param tin Хувь хүн хуулийн этгээдийн татвар төлөгчийн дугаар (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws PosApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRestBankAccountstinTINAsync(@Nullable String tin, final PosApiCallback<List<GetRestBankAccountsTinTINResponse>> _callback) throws PosApiException {

        okhttp3.Call localVarCall = getRestBankAccountstinTINValidateBeforeCall(tin, _callback);
        Type localVarReturnType = new TypeToken<List<GetRestBankAccountsTinTINResponse>>(){}.getType();
        localVarPosApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRestInfo
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws PosApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRestInfoCall(final PosApiCallback _callback) throws PosApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "http://{baseUrl}", "http://localhost:7080/" };

        // Determine Base Path to Use
        basePath = chooseBasePath(localBasePaths);
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/info";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarPosApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarPosApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarPosApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getRestInfoValidateBeforeCall(final PosApiCallback _callback) throws PosApiException {
        return getRestInfoCall(_callback);

    }

    /**
     * Ажиллагааны мэдээлэл хүлээн авах
     * Энэхүү сервис нь \&quot;PosAPI 3.0\&quot; системийн тохиргоо болон ажиллагааны талаарх мэдээллийг лавлахад зориулагдсан.
     * @return GetRestInfo200Response
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetRestInfoResponse getRestInfo() throws PosApiException {
        PosApiResponse<GetRestInfoResponse> localVarResp = getRestInfoWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Ажиллагааны мэдээлэл хүлээн авах
     * Энэхүү сервис нь \&quot;PosAPI 3.0\&quot; системийн тохиргоо болон ажиллагааны талаарх мэдээллийг лавлахад зориулагдсан.
     * @return PosApiResponse&lt;GetRestInfo200Response&gt;
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PosApiResponse<GetRestInfoResponse> getRestInfoWithHttpInfo() throws PosApiException {
        okhttp3.Call localVarCall = getRestInfoValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GetRestInfoResponse>(){}.getType();
        return localVarPosApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Ажиллагааны мэдээлэл хүлээн авах (asynchronously)
     * Энэхүү сервис нь \&quot;PosAPI 3.0\&quot; системийн тохиргоо болон ажиллагааны талаарх мэдээллийг лавлахад зориулагдсан.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws PosApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRestInfoAsync(final PosApiCallback<GetRestInfoResponse> _callback) throws PosApiException {

        okhttp3.Call localVarCall = getRestInfoValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GetRestInfoResponse>(){}.getType();
        localVarPosApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRestSendData
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws PosApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRestSendDataCall(final PosApiCallback _callback) throws PosApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "http://{baseUrl}", "http://localhost:7080/" };

        // Determine Base Path to Use
        basePath = chooseBasePath(localBasePaths);

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/sendData";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarPosApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarPosApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarPosApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getRestSendDataValidateBeforeCall(final PosApiCallback _callback) throws PosApiException {
        return getRestSendDataCall(_callback);

    }

    /**
     * Төлбөрийн баримтын нэгдсэн системд мэдээлэл илгээх
     * &gt;Сервисийг заавал дуудах шаардлагагүй бөгөөд PosAPI систем нь тодорхой хугацаанд автоматаар энэхүү үйлдлийг гүйцэтгэдэг. 🔄 Хэрэв PosAPI-д хамааралтай өөрчлөлт нэгдсэн систем талд гарсан бол энэ сервисийг дуудснаар тухайн өөрчлөлтийг local баазад хадгалах боломжтой.
     * @return Object
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public Object getRestSendData() throws PosApiException {
        PosApiResponse<Object> localVarResp = getRestSendDataWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Төлбөрийн баримтын нэгдсэн системд мэдээлэл илгээх
     * &gt;Сервисийг заавал дуудах шаардлагагүй бөгөөд PosAPI систем нь тодорхой хугацаанд автоматаар энэхүү үйлдлийг гүйцэтгэдэг. 🔄 Хэрэв PosAPI-д хамааралтай өөрчлөлт нэгдсэн систем талд гарсан бол энэ сервисийг дуудснаар тухайн өөрчлөлтийг local баазад хадгалах боломжтой.
     * @return PosApiResponse&lt;Object&gt;
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PosApiResponse<Object> getRestSendDataWithHttpInfo() throws PosApiException {
        okhttp3.Call localVarCall = getRestSendDataValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarPosApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Төлбөрийн баримтын нэгдсэн системд мэдээлэл илгээх (asynchronously)
     * &gt;Сервисийг заавал дуудах шаардлагагүй бөгөөд PosAPI систем нь тодорхой хугацаанд автоматаар энэхүү үйлдлийг гүйцэтгэдэг. 🔄 Хэрэв PosAPI-д хамааралтай өөрчлөлт нэгдсэн систем талд гарсан бол энэ сервисийг дуудснаар тухайн өөрчлөлтийг local баазад хадгалах боломжтой.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws PosApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRestSendDataAsync(final PosApiCallback<Object> _callback) throws PosApiException {

        okhttp3.Call localVarCall = getRestSendDataValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarPosApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for postApiTpiReceiptSaveOprMerchants
     * @param X_API_KEY Posapi@itc.gov.mn рүү хүсэлт илгээн авна (required)
     * @param postApiTpiReceiptSaveOprMerchantsRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws PosApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postApiTpiReceiptSaveOprMerchantsCall(@Nonnull String X_API_KEY, @Nullable PostApiTpiReceiptSaveOprMerchantsRequest postApiTpiReceiptSaveOprMerchantsRequest, final PosApiCallback _callback) throws PosApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "https://api.ebarimt.mn/", "https://st-api.ebarimt.mn/" };

        // Determine Base Path to Use
        basePath = chooseBasePath(localBasePaths);

        Object localVarPostBody = postApiTpiReceiptSaveOprMerchantsRequest;

        // create path and map variables
        String localVarPath = "/api/tpi/receipt/saveOprMerchants";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarPosApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarPosApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        if (X_API_KEY != null) {
            localVarHeaderParams.put("X-API-KEY", localVarPosApiClient.parameterToString(X_API_KEY));
        }


        String[] localVarAuthNames = new String[] { "auth.yaml" };
        return localVarPosApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postApiTpiReceiptSaveOprMerchantsValidateBeforeCall(@Nonnull String X_API_KEY, @Nullable PostApiTpiReceiptSaveOprMerchantsRequest postApiTpiReceiptSaveOprMerchantsRequest, final PosApiCallback _callback) throws PosApiException {
        // verify the required parameter 'X_API_KEY' is set
        if (X_API_KEY == null) {
            throw new PosApiException("Missing the required parameter 'X_API_KEY' when calling postApiTpiReceiptSaveOprMerchants(Async)");
        }

        return postApiTpiReceiptSaveOprMerchantsCall(X_API_KEY, postApiTpiReceiptSaveOprMerchantsRequest, _callback);

    }

    /**
     * Оператороос мерчант бүртгэх хүсэлт илгээх
     * &gt;Энэхүү сервис нь \&quot;Хэрэглэгчийн систем нийлүүлэгч\&quot; (Оператор компани) өөрийн системээс \&quot;Мерчант\&quot; (Борлуулагч) бүртгэх хүсэлт үүсгэх боломжийг бүрдүүлнэ[Нэгдсэн нэвтрэлтийн token авах бол дарна уу.](reference/auth.yaml/paths/~1protocol~1openid-connect~1token/post)
     * @param X_API_KEY Posapi@itc.gov.mn рүү хүсэлт илгээн авна (required)
     * @param postApiTpiReceiptSaveOprMerchantsRequest  (optional)
     * @return PostApiTpiReceiptSaveOprMerchantsResponse
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PostApiTpiReceiptSaveOprMerchantsResponse postApiTpiReceiptSaveOprMerchants(@Nonnull String X_API_KEY, @Nullable PostApiTpiReceiptSaveOprMerchantsRequest postApiTpiReceiptSaveOprMerchantsRequest) throws PosApiException {
        PosApiResponse<PostApiTpiReceiptSaveOprMerchantsResponse> localVarResp = postApiTpiReceiptSaveOprMerchantsWithHttpInfo(X_API_KEY, postApiTpiReceiptSaveOprMerchantsRequest);
        return localVarResp.getData();
    }

    /**
     * Оператороос мерчант бүртгэх хүсэлт илгээх
     * &gt;Энэхүү сервис нь \&quot;Хэрэглэгчийн систем нийлүүлэгч\&quot; (Оператор компани) өөрийн системээс \&quot;Мерчант\&quot; (Борлуулагч) бүртгэх хүсэлт үүсгэх боломжийг бүрдүүлнэ[Нэгдсэн нэвтрэлтийн token авах бол дарна уу.](reference/auth.yaml/paths/~1protocol~1openid-connect~1token/post)
     * @param X_API_KEY Posapi@itc.gov.mn рүү хүсэлт илгээн авна (required)
     * @param postApiTpiReceiptSaveOprMerchantsRequest  (optional)
     * @return PosApiResponse&lt;PostApiTpiReceiptSaveOprMerchantsResponse&gt;
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PosApiResponse<PostApiTpiReceiptSaveOprMerchantsResponse> postApiTpiReceiptSaveOprMerchantsWithHttpInfo(@Nonnull String X_API_KEY, @Nullable PostApiTpiReceiptSaveOprMerchantsRequest postApiTpiReceiptSaveOprMerchantsRequest) throws PosApiException {
        okhttp3.Call localVarCall = postApiTpiReceiptSaveOprMerchantsValidateBeforeCall(X_API_KEY, postApiTpiReceiptSaveOprMerchantsRequest, null);
        Type localVarReturnType = new TypeToken<PostApiTpiReceiptSaveOprMerchantsResponse>(){}.getType();
        return localVarPosApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Оператороос мерчант бүртгэх хүсэлт илгээх (asynchronously)
     * &gt;Энэхүү сервис нь \&quot;Хэрэглэгчийн систем нийлүүлэгч\&quot; (Оператор компани) өөрийн системээс \&quot;Мерчант\&quot; (Борлуулагч) бүртгэх хүсэлт үүсгэх боломжийг бүрдүүлнэ[Нэгдсэн нэвтрэлтийн token авах бол дарна уу.](reference/auth.yaml/paths/~1protocol~1openid-connect~1token/post)
     * @param X_API_KEY Posapi@itc.gov.mn рүү хүсэлт илгээн авна (required)
     * @param postApiTpiReceiptSaveOprMerchantsRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws PosApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postApiTpiReceiptSaveOprMerchantsAsync(@Nonnull String X_API_KEY, @Nullable PostApiTpiReceiptSaveOprMerchantsRequest postApiTpiReceiptSaveOprMerchantsRequest, final PosApiCallback<PostApiTpiReceiptSaveOprMerchantsResponse> _callback) throws PosApiException {

        okhttp3.Call localVarCall = postApiTpiReceiptSaveOprMerchantsValidateBeforeCall(X_API_KEY, postApiTpiReceiptSaveOprMerchantsRequest, _callback);
        Type localVarReturnType = new TypeToken<PostApiTpiReceiptSaveOprMerchantsResponse>(){}.getType();
        localVarPosApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }


    /**
     * Build call for postRestReceipt
     * @param postRestReceiptRequest   (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws PosApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  Талбаруудын нэмэлт тайлбар:    Баримтын төлөв /status талбар/  | Утга    | Тайлбар                                                        |  |---------|----------------------------------------------------------------|  | SUCCESS | Төлбөрийн баримтын мэдээлэл амжилттай үүссэн.                  |  | ERROR   | Төлбөрийн баримтын мэдээлэл үүсгэхэд алдаа гарсан.             |  | PAYMENT | Төлбөрийн баримтын мэдээлэл үүсгэхэд төлбөрийн мэдээлэл дутуу. |   </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postRestReceiptCall(@Nullable PostRestReceiptRequest postRestReceiptRequest, final PosApiCallback _callback) throws PosApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "http://{baseUrl}", "http://localhost:7080/" };

        // Determine Base Path to Use
        basePath = chooseBasePath(localBasePaths);

        Object localVarPostBody = postRestReceiptRequest;

        // create path and map variables
        String localVarPath = "/rest/receipt";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/soap+xml"
        };
        final String localVarAccept = localVarPosApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarPosApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarPosApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postRestReceiptValidateBeforeCall(@Nullable PostRestReceiptRequest postRestReceiptRequest, final PosApiCallback _callback) throws PosApiException {
        return postRestReceiptCall(postRestReceiptRequest, _callback);

    }

    /**
     * Төлбөрийн баримт хадгалах
     * &gt;Энэхүү сервис нь хэрэглэгчийн системээс борлуулалтын мэдээллийг хүлээн авч, дараах мэдээллүүдийг нэмж боловсруулан буцаана:   *ДДТД  *Сугалааны дугаар  *Баримт хэвлэсэн огноо  *Баримтын код  *QrCode    ⚠️ **Анхаарах зүйлс:**  &lt;!-- theme: warning --&gt;  &gt;Эдгээр буцаасан мэдээллүүдээс lottery болон qrData талбаруудын мэдээллийг төлбөрийн баримтанд хэвлэхээс өөрөөр ямар ч хэлбэрээр хадгалахыг хориглоно.
     * @param postRestReceiptRequest   (optional)
     * @return PostRestReceiptResponse
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  Талбаруудын нэмэлт тайлбар:    Баримтын төлөв /status талбар/  | Утга    | Тайлбар                                                        |  |---------|----------------------------------------------------------------|  | SUCCESS | Төлбөрийн баримтын мэдээлэл амжилттай үүссэн.                  |  | ERROR   | Төлбөрийн баримтын мэдээлэл үүсгэхэд алдаа гарсан.             |  | PAYMENT | Төлбөрийн баримтын мэдээлэл үүсгэхэд төлбөрийн мэдээлэл дутуу. |   </td><td>  -  </td></tr>
     </table>
     */
    public PostRestReceiptResponse postRestReceipt(@Nullable PostRestReceiptRequest postRestReceiptRequest) throws PosApiException {
        PosApiResponse<PostRestReceiptResponse> localVarResp = postRestReceiptWithHttpInfo(postRestReceiptRequest);
        return localVarResp.getData();
    }

    /**
     * Төлбөрийн баримт хадгалах
     * &gt;Энэхүү сервис нь хэрэглэгчийн системээс борлуулалтын мэдээллийг хүлээн авч, дараах мэдээллүүдийг нэмж боловсруулан буцаана:   *ДДТД  *Сугалааны дугаар  *Баримт хэвлэсэн огноо  *Баримтын код  *QrCode    ⚠️ **Анхаарах зүйлс:**  &lt;!-- theme: warning --&gt;  &gt;Эдгээр буцаасан мэдээллүүдээс lottery болон qrData талбаруудын мэдээллийг төлбөрийн баримтанд хэвлэхээс өөрөөр ямар ч хэлбэрээр хадгалахыг хориглоно.
     * @param postRestReceiptRequest   (optional)
     * @return PosApiResponse&lt;PostRestReceiptResponse&gt;
     * @throws PosApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  Талбаруудын нэмэлт тайлбар:    Баримтын төлөв /status талбар/  | Утга    | Тайлбар                                                        |  |---------|----------------------------------------------------------------|  | SUCCESS | Төлбөрийн баримтын мэдээлэл амжилттай үүссэн.                  |  | ERROR   | Төлбөрийн баримтын мэдээлэл үүсгэхэд алдаа гарсан.             |  | PAYMENT | Төлбөрийн баримтын мэдээлэл үүсгэхэд төлбөрийн мэдээлэл дутуу. |   </td><td>  -  </td></tr>
     </table>
     */
    public PosApiResponse<PostRestReceiptResponse> postRestReceiptWithHttpInfo(@Nullable PostRestReceiptRequest postRestReceiptRequest) throws PosApiException {
        okhttp3.Call localVarCall = postRestReceiptValidateBeforeCall(postRestReceiptRequest, null);
        Type localVarReturnType = new TypeToken<PostRestReceiptResponse>(){}.getType();
        return localVarPosApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Төлбөрийн баримт хадгалах (asynchronously)
     * &gt;Энэхүү сервис нь хэрэглэгчийн системээс борлуулалтын мэдээллийг хүлээн авч, дараах мэдээллүүдийг нэмж боловсруулан буцаана:   *ДДТД  *Сугалааны дугаар  *Баримт хэвлэсэн огноо  *Баримтын код  *QrCode    ⚠️ **Анхаарах зүйлс:**  &lt;!-- theme: warning --&gt;  &gt;Эдгээр буцаасан мэдээллүүдээс lottery болон qrData талбаруудын мэдээллийг төлбөрийн баримтанд хэвлэхээс өөрөөр ямар ч хэлбэрээр хадгалахыг хориглоно.
     * @param postRestReceiptRequest   (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws PosApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  Талбаруудын нэмэлт тайлбар:    Баримтын төлөв /status талбар/  | Утга    | Тайлбар                                                        |  |---------|----------------------------------------------------------------|  | SUCCESS | Төлбөрийн баримтын мэдээлэл амжилттай үүссэн.                  |  | ERROR   | Төлбөрийн баримтын мэдээлэл үүсгэхэд алдаа гарсан.             |  | PAYMENT | Төлбөрийн баримтын мэдээлэл үүсгэхэд төлбөрийн мэдээлэл дутуу. |   </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postRestReceiptAsync(@Nullable PostRestReceiptRequest postRestReceiptRequest, final PosApiCallback<PostRestReceiptResponse> _callback) throws PosApiException {

        okhttp3.Call localVarCall = postRestReceiptValidateBeforeCall(postRestReceiptRequest, _callback);
        Type localVarReturnType = new TypeToken<PostRestReceiptResponse>(){}.getType();
        localVarPosApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
