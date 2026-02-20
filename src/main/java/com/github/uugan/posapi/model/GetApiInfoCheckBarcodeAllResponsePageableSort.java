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
import java.util.Arrays;

import com.google.gson.Gson;
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
 * GetApiInfoCheckBarcodeAllResponsePageableSort
 */
public class GetApiInfoCheckBarcodeAllResponsePageableSort {
    @SerializedName("sorted")
    @Nonnull
    private Boolean sorted = false;
    @SerializedName("unsorted")
    @Nonnull
    private Boolean unsorted = true;
    @SerializedName("empty")
    @Nonnull
    private Boolean empty = true;

    public GetApiInfoCheckBarcodeAllResponsePageableSort() {
    }

    public GetApiInfoCheckBarcodeAllResponsePageableSort sorted(@Nonnull Boolean sorted) {
        this.sorted = sorted;
        return this;
    }

    /**
     * Эрэмбэлэгдсэн эсэх (false &#x3D; Эрэмбэлэгдээгүй)
     *
     * @return sorted
     */
    @Nonnull
    public Boolean getSorted() {
        return sorted;
    }

    public void setSorted(@Nonnull Boolean sorted) {
        this.sorted = sorted;
    }


    public GetApiInfoCheckBarcodeAllResponsePageableSort unsorted(@Nonnull Boolean unsorted) {
        this.unsorted = unsorted;
        return this;
    }

    /**
     * Эрэмбэлэгдээгүй эсэх
     *
     * @return unsorted
     */
    @Nonnull
    public Boolean getUnsorted() {
        return unsorted;
    }

    public void setUnsorted(@Nonnull Boolean unsorted) {
        this.unsorted = unsorted;
    }


    public GetApiInfoCheckBarcodeAllResponsePageableSort empty(@Nonnull Boolean empty) {
        this.empty = empty;
        return this;
    }

    /**
     * эрэмбэлэлтийн мэдээлэл хоосон эсэх
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
        GetApiInfoCheckBarcodeAllResponsePageableSort getApiInfoCheckBarcodeAllResponsePageableSort = (GetApiInfoCheckBarcodeAllResponsePageableSort) o;
        return Objects.equals(this.sorted, getApiInfoCheckBarcodeAllResponsePageableSort.sorted) &&
                Objects.equals(this.unsorted, getApiInfoCheckBarcodeAllResponsePageableSort.unsorted) &&
                Objects.equals(this.empty, getApiInfoCheckBarcodeAllResponsePageableSort.empty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sorted, unsorted, empty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetApiInfoCheckBarcodeAllResponsePageableSort {\n");
        sb.append("    sorted: ").append(toIndentedString(sorted)).append("\n");
        sb.append("    unsorted: ").append(toIndentedString(unsorted)).append("\n");
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
        openapiFields = new HashSet<String>(Arrays.asList("sorted", "unsorted", "empty"));

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>(Arrays.asList("sorted", "unsorted", "empty"));
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to GetApiInfoCheckBarcodeAllResponsePageableSort
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetApiInfoCheckBarcodeAllResponsePageableSort.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in GetApiInfoCheckBarcodeAllResponsePageableSort is not found in the empty JSON string", GetApiInfoCheckBarcodeAllResponsePageableSort.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!GetApiInfoCheckBarcodeAllResponsePageableSort.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `GetApiInfoCheckBarcodeAllResponsePageableSort` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : GetApiInfoCheckBarcodeAllResponsePageableSort.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetApiInfoCheckBarcodeAllResponsePageableSort.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetApiInfoCheckBarcodeAllResponsePageableSort' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetApiInfoCheckBarcodeAllResponsePageableSort> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(GetApiInfoCheckBarcodeAllResponsePageableSort.class));

            return (TypeAdapter<T>) new TypeAdapter<GetApiInfoCheckBarcodeAllResponsePageableSort>() {
                @Override
                public void write(JsonWriter out, GetApiInfoCheckBarcodeAllResponsePageableSort value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public GetApiInfoCheckBarcodeAllResponsePageableSort read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }

            }.nullSafe();
        }
    }

    /**
     * Create an instance of GetApiInfoCheckBarcodeAllResponsePageableSort given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetApiInfoCheckBarcodeAllResponsePageableSort
     * @throws IOException if the JSON string is invalid with respect to GetApiInfoCheckBarcodeAllResponsePageableSort
     */
    public static GetApiInfoCheckBarcodeAllResponsePageableSort fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetApiInfoCheckBarcodeAllResponsePageableSort.class);
    }

    /**
     * Convert an instance of GetApiInfoCheckBarcodeAllResponsePageableSort to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


