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


package com.github.uugan.posapi.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.github.uugan.posapi.JSON;

import javax.annotation.Nonnull;

/**
 * GetRestInfo200Response
 */
public class GetRestInfoResponse {
    @SerializedName("operatorName")
    @Nonnull
    private String operatorName;
    @SerializedName("operatorTIN")
    @Nonnull
    private String operatorTIN;
    @SerializedName("posId")
    @Nonnull
    private BigDecimal posId;
    @SerializedName("posNo")
    @Nonnull
    private String posNo;
    @SerializedName("lastSentDate")
    @Nonnull
    private String lastSentDate;
    @SerializedName("leftLotteries")
    @Nonnull
    private Integer leftLotteries;
    @SerializedName("appInfo")
    @Nonnull
    private GetRestInfoResponseAppInfo appInfo;
    @SerializedName("merchants")
    @Nonnull
    private List<GetRestInfoResponseMerchant> merchants = new ArrayList<>();

    public GetRestInfoResponse() {
    }

    public GetRestInfoResponse operatorName(@Nonnull String operatorName) {
        this.operatorName = operatorName;
        return this;
    }

    /**
     * Оператор байгууллагын нэр
     *
     * @return operatorName
     */
    @Nonnull
    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(@Nonnull String operatorName) {
        this.operatorName = operatorName;
    }


    public GetRestInfoResponse operatorTIN(@Nonnull String operatorTIN) {
        this.operatorTIN = operatorTIN;
        return this;
    }

    /**
     * Оператор байгууллагын ТТД
     *
     * @return operatorTIN
     */
    @Nonnull
    public String getOperatorTIN() {
        return operatorTIN;
    }

    public void setOperatorTIN(@Nonnull String operatorTIN) {
        this.operatorTIN = operatorTIN;
    }


    public GetRestInfoResponse posId(@Nonnull BigDecimal posId) {
        this.posId = posId;
        return this;
    }

    /**
     * PosAPI-н систем дэх бүртгэлийн Id
     *
     * @return posId
     */
    @Nonnull
    public BigDecimal getPosId() {
        return posId;
    }

    public void setPosId(@Nonnull BigDecimal posId) {
        this.posId = posId;
    }


    public GetRestInfoResponse posNo(@Nonnull String posNo) {
        this.posNo = posNo;
        return this;
    }

    /**
     * PosAPI-н систем дэх бүртгэлийн дугаар
     *
     * @return posNo
     */
    @Nonnull
    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(@Nonnull String posNo) {
        this.posNo = posNo;
    }


    public GetRestInfoResponse lastSentDate(@Nonnull String lastSentDate) {
        this.lastSentDate = lastSentDate;
        return this;
    }

    /**
     * Баримт илгээсэн огноо /Сүүлийн байдлаар/
     *
     * @return lastSentDate
     */
    @Nonnull
    public String getLastSentDate() {
        return lastSentDate;
    }

    public void setLastSentDate(@Nonnull String lastSentDate) {
        this.lastSentDate = lastSentDate;
    }


    public GetRestInfoResponse leftLotteries(@Nonnull Integer leftLotteries) {
        this.leftLotteries = leftLotteries;
        return this;
    }

    /**
     * Нийт үлдсэн сугалаа
     *
     * @return leftLotteries
     */
    @Nonnull
    public Integer getLeftLotteries() {
        return leftLotteries;
    }

    public void setLeftLotteries(@Nonnull Integer leftLotteries) {
        this.leftLotteries = leftLotteries;
    }


    public GetRestInfoResponse appInfo(@Nonnull GetRestInfoResponseAppInfo appInfo) {
        this.appInfo = appInfo;
        return this;
    }

    /**
     * Get appInfo
     *
     * @return appInfo
     */
    @Nonnull
    public GetRestInfoResponseAppInfo getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(@Nonnull GetRestInfoResponseAppInfo appInfo) {
        this.appInfo = appInfo;
    }


    public GetRestInfoResponse merchants(@Nonnull List<GetRestInfoResponseMerchant> merchants) {
        this.merchants = merchants;
        return this;
    }

    public GetRestInfoResponse addMerchantsItem(GetRestInfoResponseMerchant merchantsItem) {
        if (this.merchants == null) {
            this.merchants = new ArrayList<>();
        }
        this.merchants.add(merchantsItem);
        return this;
    }

    /**
     * PosAPI-д бүртгэлтэй ААН-н жагсаалт
     *
     * @return merchants
     */
    @Nonnull
    public List<GetRestInfoResponseMerchant> getMerchants() {
        return merchants;
    }

    public void setMerchants(@Nonnull List<GetRestInfoResponseMerchant> merchants) {
        this.merchants = merchants;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetRestInfoResponse getRestInfo200Response = (GetRestInfoResponse) o;
        return Objects.equals(this.operatorName, getRestInfo200Response.operatorName) &&
                Objects.equals(this.operatorTIN, getRestInfo200Response.operatorTIN) &&
                Objects.equals(this.posId, getRestInfo200Response.posId) &&
                Objects.equals(this.posNo, getRestInfo200Response.posNo) &&
                Objects.equals(this.lastSentDate, getRestInfo200Response.lastSentDate) &&
                Objects.equals(this.leftLotteries, getRestInfo200Response.leftLotteries) &&
                Objects.equals(this.appInfo, getRestInfo200Response.appInfo) &&
                Objects.equals(this.merchants, getRestInfo200Response.merchants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operatorName, operatorTIN, posId, posNo, lastSentDate, leftLotteries, appInfo, merchants);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetRestInfo200Response {\n");
        sb.append("    operatorName: ").append(toIndentedString(operatorName)).append("\n");
        sb.append("    operatorTIN: ").append(toIndentedString(operatorTIN)).append("\n");
        sb.append("    posId: ").append(toIndentedString(posId)).append("\n");
        sb.append("    posNo: ").append(toIndentedString(posNo)).append("\n");
        sb.append("    lastSentDate: ").append(toIndentedString(lastSentDate)).append("\n");
        sb.append("    leftLotteries: ").append(toIndentedString(leftLotteries)).append("\n");
        sb.append("    appInfo: ").append(toIndentedString(appInfo)).append("\n");
        sb.append("    merchants: ").append(toIndentedString(merchants)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }


    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>(Arrays.asList("operatorName", "operatorTIN", "posId", "posNo", "lastSentDate", "leftLotteries", "appInfo", "merchants"));

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>(Arrays.asList("operatorName", "operatorTIN", "posId", "posNo", "lastSentDate", "leftLotteries", "appInfo", "merchants"));
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to GetRestInfo200Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetRestInfoResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in GetRestInfo200Response is not found in the empty JSON string", GetRestInfoResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!GetRestInfoResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `GetRestInfo200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : GetRestInfoResponse.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("operatorName").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `operatorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operatorName").toString()));
        }
        if (!jsonObj.get("operatorTIN").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `operatorTIN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operatorTIN").toString()));
        }
        if (!jsonObj.get("posNo").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `posNo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("posNo").toString()));
        }
        if (!jsonObj.get("lastSentDate").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `lastSentDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastSentDate").toString()));
        }
        // validate the required field `appInfo`
        GetRestInfoResponseAppInfo.validateJsonElement(jsonObj.get("appInfo"));
        // ensure the json data is an array
        if (!jsonObj.get("merchants").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `merchants` to be an array in the JSON string but got `%s`", jsonObj.get("merchants").toString()));
        }

        JsonArray jsonArraymerchants = jsonObj.getAsJsonArray("merchants");
        // validate the required field `merchants` (array)
        for (int i = 0; i < jsonArraymerchants.size(); i++) {
            GetRestInfoResponseMerchant.validateJsonElement(jsonArraymerchants.get(i));
        }
        ;
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetRestInfoResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetRestInfo200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetRestInfoResponse> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(GetRestInfoResponse.class));

            return (TypeAdapter<T>) new TypeAdapter<GetRestInfoResponse>() {
                @Override
                public void write(JsonWriter out, GetRestInfoResponse value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public GetRestInfoResponse read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }

            }.nullSafe();
        }
    }

    /**
     * Create an instance of GetRestInfo200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetRestInfo200Response
     * @throws IOException if the JSON string is invalid with respect to GetRestInfo200Response
     */
    public static GetRestInfoResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetRestInfoResponse.class);
    }

    /**
     * Convert an instance of GetRestInfo200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


