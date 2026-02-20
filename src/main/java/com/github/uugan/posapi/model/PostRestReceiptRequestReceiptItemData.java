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

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.*;

/**
 * Бүтээгдэхүүн, үйлчилгээний нэмэлт өгөгдөл
 */
public class PostRestReceiptRequestReceiptItemData {
    @SerializedName("lotNo")
    @Nullable
    private String lotNo;
    @SerializedName("stockQR")
    @Nullable
    private List<String> stockQR = new ArrayList<>();

    public PostRestReceiptRequestReceiptItemData() {
    }

    public PostRestReceiptRequestReceiptItemData lotNo(@Nullable String lotNo) {
        this.lotNo = lotNo;
        return this;
    }

    /**
     * Эм, эмнэлгийн хэрэгслийн цувралын дугаар
     *
     * @return lotNo
     */
    @Nullable
    public String getLotNo() {
        return lotNo;
    }

    public void setLotNo(@Nullable String lotNo) {
        this.lotNo = lotNo;
    }


    public PostRestReceiptRequestReceiptItemData stockQR(@Nullable List<String> stockQR) {
        this.stockQR = stockQR;
        return this;
    }

    public PostRestReceiptRequestReceiptItemData addStockQRItem(String stockQRItem) {
        if (this.stockQR == null) {
            this.stockQR = new ArrayList<>();
        }
        this.stockQR.add(stockQRItem);
        return this;
    }

    /**
     * ОАТ тэмдэг бүхий барааны QR дата  &lt;details&gt;    &lt;summary&gt;📄 Дэлгэрэнгүй үзэх&lt;/summary&gt;    &lt;p&gt;      Онцгой албан татварын тэмдэг бүхий барааг зарж борлуулах үед item-ийн data талбарт stockQR гэсэн array string-ийг нэмэх шаардлагатай. Мөн тухайн тэмдгийн барааны баркодыг үнэн зөв ирүүлэх ба Баркодын мэдээллийг “ОАТ барааны баркодын мэдээлэл лавлах” сервисийг ашиглаж, QR кодыг дамжуулна.    &lt;/p&gt;  &lt;/details&gt;    [ОАТ барааны баркодын мэдээлэл лавлах /QR/ сервис харах бол энд дарна уу](https://developer.itc.gov.mn/docs/ebarimt-api/zxu5zjs7j91db-oat-baraany-barkodyn-medeelel-lavlah-qr)
     *
     * @return stockQR
     */
    @Nullable
    public List<String> getStockQR() {
        return stockQR;
    }

    public void setStockQR(@Nullable List<String> stockQR) {
        this.stockQR = stockQR;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostRestReceiptRequestReceiptItemData postRestReceiptRequestReceiptItemData = (PostRestReceiptRequestReceiptItemData) o;
        return Objects.equals(this.lotNo, postRestReceiptRequestReceiptItemData.lotNo) &&
                Objects.equals(this.stockQR, postRestReceiptRequestReceiptItemData.stockQR);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lotNo, stockQR);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostRestReceiptRequestReceiptItemData {\n");
        sb.append("    lotNo: ").append(toIndentedString(lotNo)).append("\n");
        sb.append("    stockQR: ").append(toIndentedString(stockQR)).append("\n");
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
        openapiFields = new HashSet<String>(Arrays.asList("lotNo", "stockQR"));

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>(0);
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to PostRestReceiptRequestReceiptItemData
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PostRestReceiptRequestReceiptItemData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in PostRestReceiptRequestReceiptItemData is not found in the empty JSON string", PostRestReceiptRequestReceiptItemData.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!PostRestReceiptRequestReceiptItemData.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `PostRestReceiptRequestReceiptItemData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("lotNo") != null && !jsonObj.get("lotNo").isJsonNull()) && !jsonObj.get("lotNo").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `lotNo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lotNo").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("stockQR") != null && !jsonObj.get("stockQR").isJsonNull() && !jsonObj.get("stockQR").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `stockQR` to be an array in the JSON string but got `%s`", jsonObj.get("stockQR").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PostRestReceiptRequestReceiptItemData.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PostRestReceiptRequestReceiptItemData' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PostRestReceiptRequestReceiptItemData> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(PostRestReceiptRequestReceiptItemData.class));

            return (TypeAdapter<T>) new TypeAdapter<PostRestReceiptRequestReceiptItemData>() {
                @Override
                public void write(JsonWriter out, PostRestReceiptRequestReceiptItemData value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public PostRestReceiptRequestReceiptItemData read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }

            }.nullSafe();
        }
    }

    /**
     * Create an instance of PostRestReceiptRequestReceiptItemData given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PostRestReceiptRequestReceiptItemData
     * @throws IOException if the JSON string is invalid with respect to PostRestReceiptRequestReceiptItemData
     */
    public static PostRestReceiptRequestReceiptItemData fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PostRestReceiptRequestReceiptItemData.class);
    }

    /**
     * Convert an instance of PostRestReceiptRequestReceiptItemData to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


