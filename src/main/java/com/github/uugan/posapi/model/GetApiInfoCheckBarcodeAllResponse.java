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

import com.github.uugan.posapi.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import javax.annotation.Nonnull;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

/**
 * GetApiInfoCheckBarcodeAllResponse
 */
public class GetApiInfoCheckBarcodeAllResponse {
    @SerializedName("content")
    @Nonnull
    private List<List<String>> content = new ArrayList<>();
    @SerializedName("pageable")
    @Nonnull
    private GetApiInfoCheckBarcodeAllResponsePageable pageable;
    @SerializedName("totalPages")
    @Nonnull
    private BigDecimal totalPages = new BigDecimal("0");
    @SerializedName("totalElements")
    @Nonnull
    private BigDecimal totalElements;
    @SerializedName("last")
    @Nonnull
    private Boolean last = false;
    @SerializedName("size")
    @Nonnull
    private BigDecimal size;
    @SerializedName("number")
    @Nonnull
    private BigDecimal number;
    @SerializedName("sort")
    @Nonnull
    private GetApiInfoCheckBarcodeAllResponseSort sort;
    @SerializedName("numberOfElements")
    @Nonnull
    private BigDecimal numberOfElements;
    @SerializedName("first")
    @Nonnull
    private Boolean first = true;
    @SerializedName("empty")
    @Nonnull
    private Boolean empty = false;

    public GetApiInfoCheckBarcodeAllResponse() {
    }

    public GetApiInfoCheckBarcodeAllResponse content(@Nonnull List<List<String>> content) {
        this.content = content;
        return this;
    }

    public GetApiInfoCheckBarcodeAllResponse addContentItem(List<String> contentItem) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
        return this;
    }

    /**
     * Баркодын дэлгэрэнгүй мэдээлэл  1. Баркод  2. Нэр  3. Бүртгэгдсэн эсвэл өөрчлөгдсөн огноо  4. БҮНА код /stockQR гэсэн талбар байвал ОАТ бүхий бараа гэсэн үг/
     *
     * @return content
     */
    @Nonnull
    public List<List<String>> getContent() {
        return content;
    }

    public void setContent(@Nonnull List<List<String>> content) {
        this.content = content;
    }


    public GetApiInfoCheckBarcodeAllResponse pageable(@Nonnull GetApiInfoCheckBarcodeAllResponsePageable pageable) {
        this.pageable = pageable;
        return this;
    }

    /**
     * Get pageable
     *
     * @return pageable
     */
    @Nonnull
    public GetApiInfoCheckBarcodeAllResponsePageable getPageable() {
        return pageable;
    }

    public void setPageable(@Nonnull GetApiInfoCheckBarcodeAllResponsePageable pageable) {
        this.pageable = pageable;
    }


    public GetApiInfoCheckBarcodeAllResponse totalPages(@Nonnull BigDecimal totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * Нийт бичлэгийн тоо
     *
     * @return totalPages
     */
    @Nonnull
    public BigDecimal getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(@Nonnull BigDecimal totalPages) {
        this.totalPages = totalPages;
    }


    public GetApiInfoCheckBarcodeAllResponse totalElements(@Nonnull BigDecimal totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    /**
     * Нийт хуудасны тоо
     *
     * @return totalElements
     */
    @Nonnull
    public BigDecimal getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(@Nonnull BigDecimal totalElements) {
        this.totalElements = totalElements;
    }


    public GetApiInfoCheckBarcodeAllResponse last(@Nonnull Boolean last) {
        this.last = last;
        return this;
    }

    /**
     * Сүүлчийн хуудас эсэх
     *
     * @return last
     */
    @Nonnull
    public Boolean getLast() {
        return last;
    }

    public void setLast(@Nonnull Boolean last) {
        this.last = last;
    }


    public GetApiInfoCheckBarcodeAllResponse size(@Nonnull BigDecimal size) {
        this.size = size;
        return this;
    }

    /**
     * Хуудас бүрийн хэмжээ (бичлэгийн тоо)
     *
     * @return size
     */
    @Nonnull
    public BigDecimal getSize() {
        return size;
    }

    public void setSize(@Nonnull BigDecimal size) {
        this.size = size;
    }


    public GetApiInfoCheckBarcodeAllResponse number(@Nonnull BigDecimal number) {
        this.number = number;
        return this;
    }

    /**
     * Одоогийн хуудасны дугаар
     *
     * @return number
     */
    @Nonnull
    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(@Nonnull BigDecimal number) {
        this.number = number;
    }


    public GetApiInfoCheckBarcodeAllResponse sort(@Nonnull GetApiInfoCheckBarcodeAllResponseSort sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Get sort
     *
     * @return sort
     */
    @Nonnull
    public GetApiInfoCheckBarcodeAllResponseSort getSort() {
        return sort;
    }

    public void setSort(@Nonnull GetApiInfoCheckBarcodeAllResponseSort sort) {
        this.sort = sort;
    }


    public GetApiInfoCheckBarcodeAllResponse numberOfElements(@Nonnull BigDecimal numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }

    /**
     * Энэ хуудсанд байгаа бичлэгийн тоо
     *
     * @return numberOfElements
     */
    @Nonnull
    public BigDecimal getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(@Nonnull BigDecimal numberOfElements) {
        this.numberOfElements = numberOfElements;
    }


    public GetApiInfoCheckBarcodeAllResponse first(@Nonnull Boolean first) {
        this.first = first;
        return this;
    }

    /**
     * Эхний хуудас эсэх
     *
     * @return first
     */
    @Nonnull
    public Boolean getFirst() {
        return first;
    }

    public void setFirst(@Nonnull Boolean first) {
        this.first = first;
    }


    public GetApiInfoCheckBarcodeAllResponse empty(@Nonnull Boolean empty) {
        this.empty = empty;
        return this;
    }

    /**
     * Энэ хуудас хоосон эсэх
     *
     * @return empty
     */
    @Nonnull
    public Boolean getEmpty() {
        return empty;
    }

    public void setEmpty(@Nonnull Boolean empty) {
        this.empty = empty;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetApiInfoCheckBarcodeAllResponse getApiInfoCheckBarcodeAllResponse = (GetApiInfoCheckBarcodeAllResponse) o;
        return Objects.equals(this.content, getApiInfoCheckBarcodeAllResponse.content) &&
                Objects.equals(this.pageable, getApiInfoCheckBarcodeAllResponse.pageable) &&
                Objects.equals(this.totalPages, getApiInfoCheckBarcodeAllResponse.totalPages) &&
                Objects.equals(this.totalElements, getApiInfoCheckBarcodeAllResponse.totalElements) &&
                Objects.equals(this.last, getApiInfoCheckBarcodeAllResponse.last) &&
                Objects.equals(this.size, getApiInfoCheckBarcodeAllResponse.size) &&
                Objects.equals(this.number, getApiInfoCheckBarcodeAllResponse.number) &&
                Objects.equals(this.sort, getApiInfoCheckBarcodeAllResponse.sort) &&
                Objects.equals(this.numberOfElements, getApiInfoCheckBarcodeAllResponse.numberOfElements) &&
                Objects.equals(this.first, getApiInfoCheckBarcodeAllResponse.first) &&
                Objects.equals(this.empty, getApiInfoCheckBarcodeAllResponse.empty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, pageable, totalPages, totalElements, last, size, number, sort, numberOfElements, first, empty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetApiInfoCheckBarcodeAllResponse {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    pageable: ").append(toIndentedString(pageable)).append("\n");
        sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
        sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
        sb.append("    last: ").append(toIndentedString(last)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
        sb.append("    first: ").append(toIndentedString(first)).append("\n");
        sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
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
        openapiFields = new HashSet<String>(Arrays.asList("content", "pageable", "totalPages", "totalElements", "last", "size", "number", "sort", "numberOfElements", "first", "empty"));

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>(Arrays.asList("content", "pageable", "totalPages", "totalElements", "last", "size", "number", "sort", "numberOfElements", "first", "empty"));
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to GetApiInfoCheckBarcodeAllResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetApiInfoCheckBarcodeAllResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in GetApiInfoCheckBarcodeAllResponse is not found in the empty JSON string", GetApiInfoCheckBarcodeAllResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!GetApiInfoCheckBarcodeAllResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `GetApiInfoCheckBarcodeAllResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : GetApiInfoCheckBarcodeAllResponse.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the required json array is present
        if (jsonObj.get("content") == null) {
            throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
        } else if (!jsonObj.get("content").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `content` to be an array in the JSON string but got `%s`", jsonObj.get("content").toString()));
        }
        // validate the required field `pageable`
        GetApiInfoCheckBarcodeAllResponsePageable.validateJsonElement(jsonObj.get("pageable"));
        // validate the required field `sort`
        GetApiInfoCheckBarcodeAllResponseSort.validateJsonElement(jsonObj.get("sort"));
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetApiInfoCheckBarcodeAllResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetApiInfoCheckBarcodeAllResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetApiInfoCheckBarcodeAllResponse> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(GetApiInfoCheckBarcodeAllResponse.class));

            return (TypeAdapter<T>) new TypeAdapter<GetApiInfoCheckBarcodeAllResponse>() {
                @Override
                public void write(JsonWriter out, GetApiInfoCheckBarcodeAllResponse value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public GetApiInfoCheckBarcodeAllResponse read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }

            }.nullSafe();
        }
    }

    /**
     * Create an instance of GetApiInfoCheckBarcodeAllResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetApiInfoCheckBarcodeAllResponse
     * @throws IOException if the JSON string is invalid with respect to GetApiInfoCheckBarcodeAllResponse
     */
    public static GetApiInfoCheckBarcodeAllResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetApiInfoCheckBarcodeAllResponse.class);
    }

    /**
     * Convert an instance of GetApiInfoCheckBarcodeAllResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


