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
import org.openapitools.jackson.nullable.JsonNullable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

/**
 * PostRestReceiptRequestReceiptItem
 */
public class PostRestReceiptRequestReceiptItem {
    @SerializedName("name")
    @Nonnull
    private String name;
    @SerializedName("barCode")
    @Nonnull
    private String barCode;
    @SerializedName("barCodeType")
    @Nullable
    private String barCodeType;
    @SerializedName("classificationCode")
    @Nullable
    private String classificationCode;
    @SerializedName("taxProductCode")
    @Nullable
    private String taxProductCode;
    @SerializedName("measureUnit")
    @Nonnull
    private String measureUnit;
    @SerializedName("qty")
    @Nonnull
    private BigDecimal qty;
    @SerializedName("unitPrice")
    @Nonnull
    private BigDecimal unitPrice;
    @SerializedName("totalVAT")
    @Nullable
    private BigDecimal totalVAT;
    @SerializedName("totalCityTax")
    @Nullable
    private BigDecimal totalCityTax;
    @SerializedName("totalAmount")
    @Nonnull
    private BigDecimal totalAmount;
    @SerializedName("data")
    @Nullable
    private PostRestReceiptRequestReceiptItemData data;

    public PostRestReceiptRequestReceiptItem() {
    }

    public PostRestReceiptRequestReceiptItem name(@Nonnull String name) {
        this.name = name;
        return this;
    }

    /**
     * Бүтээгдэхүүн, үйлчилгээний нэр
     *
     * @return name
     */
    @Nonnull
    public String getName() {
        return name;
    }

    public void setName(@Nonnull String name) {
        this.name = name;
    }


    public PostRestReceiptRequestReceiptItem barCode(@Nonnull String barCode) {
        this.barCode = barCode;
        return this;
    }

    /**
     * Бүтээгдэхүүний зураасан код
     *
     * @return barCode
     */
    @Nonnull
    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(@Nonnull String barCode) {
        this.barCode = barCode;
    }


    public PostRestReceiptRequestReceiptItem barCodeType(@Nullable String barCodeType) {
        this.barCodeType = barCodeType;
        return this;
    }

    /**
     * Зураасан кодын төрөл  | Утга      | Тайлбар                                                                                    |  |-----------|--------------------------------------------------------------------------------------------|  | UNDEFINED | Бар кодгүй эсвэл доорх мөрөнд тодорхойлогдоогүй бар код бүхий бараа эсвэл ажил, үйлчилгээ. |  | GS1       | GS1 зураасан код                                                                           |  | ISBN      | ISBN зураасан код                                                                          |
     *
     * @return barCodeType
     */
    @Nullable
    public String getBarCodeType() {
        return barCodeType;
    }

    public void setBarCodeType(@Nullable String barCodeType) {
        this.barCodeType = barCodeType;
    }


    public PostRestReceiptRequestReceiptItem classificationCode(@Nullable String classificationCode) {
        this.classificationCode = classificationCode;
        return this;
    }

    /**
     * Бүтээгдэхүүн, үйлчилгээний ангиллын код [Бүтээгдэхүүн үйлчилгээний нэгдсэн ангиллын код](https://share.itc.gov.mn/share/developer/gs1\\_gs1.xlsx)  &lt;details&gt;    &lt;summary&gt;📄 Дэлгэрэнгүй үзэх&lt;/summary&gt;    &lt;p&gt;      Монгол улсын “Үндэсний статистикийн хороо”-ноос батлан гаргасан “Бүтээгдэхүүн, үйлчилгээний нэгдсэн ангилал”-ын кодыг ашиглан уг талбарыг бөглөнө. Уг ангиллын кодын 4 дүгээр баганын дагуу бөглөх ёстой бөгөөд уг талбарын урт нь 7 орон бүхий бүхэл тоон утга байна.    &lt;/p&gt;  &lt;/details&gt;
     *
     * @return classificationCode
     */
    @Nullable
    public String getClassificationCode() {
        return classificationCode;
    }

    public void setClassificationCode(@Nullable String classificationCode) {
        this.classificationCode = classificationCode;
    }


    public PostRestReceiptRequestReceiptItem taxProductCode(@Nullable String taxProductCode) {
        this.taxProductCode = taxProductCode;
        return this;
    }

    /**
     * taxType талбарын утга нь VAT_FREE, VAT_ZERO үед татварын харгалзах 3 оронтой тоон кодыг оруулана.  [Сервис харах бол энд дарна уу.](https://developer.itc.gov.mn/docs/ebarimt-api/branches/main/16ukw8k7rdro5-vat-free-vat-zero-no-vat-baraa-jlchilgeenij-kod-lavlah)
     *
     * @return taxProductCode
     */
    @Nullable
    public String getTaxProductCode() {
        return taxProductCode;
    }

    public void setTaxProductCode(@Nullable String taxProductCode) {
        this.taxProductCode = taxProductCode;
    }


    public PostRestReceiptRequestReceiptItem measureUnit(@Nonnull String measureUnit) {
        this.measureUnit = measureUnit;
        return this;
    }

    /**
     * Хэмжих нэгж
     *
     * @return measureUnit
     */
    @Nonnull
    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(@Nonnull String measureUnit) {
        this.measureUnit = measureUnit;
    }


    public PostRestReceiptRequestReceiptItem qty(@Nonnull BigDecimal qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Борлуулсан тоо, хэмжээ
     *
     * @return qty
     */
    @Nonnull
    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(@Nonnull BigDecimal qty) {
        this.qty = qty;
    }


    public PostRestReceiptRequestReceiptItem unitPrice(@Nonnull BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * Нэгж үнэ  Бүх төрлийн татвар шингэсэн дүн
     *
     * @return unitPrice
     */
    @Nonnull
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(@Nonnull BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }


    public PostRestReceiptRequestReceiptItem totalVAT(@Nullable BigDecimal totalVAT) {
        this.totalVAT = totalVAT;
        return this;
    }

    /**
     * Бүтээгдэхүүн, үйлчилгээний НӨАТ-н нийт дүн
     *
     * @return totalVAT
     */
    @Nullable
    public BigDecimal getTotalVAT() {
        return totalVAT;
    }

    public void setTotalVAT(@Nullable BigDecimal totalVAT) {
        this.totalVAT = totalVAT;
    }


    public PostRestReceiptRequestReceiptItem totalCityTax(@Nullable BigDecimal totalCityTax) {
        this.totalCityTax = totalCityTax;
        return this;
    }

    /**
     * Бүтээгдэхүүн, үйлчилгээний НХАТ-н нийт дүн
     *
     * @return totalCityTax
     */
    @Nullable
    public BigDecimal getTotalCityTax() {
        return totalCityTax;
    }

    public void setTotalCityTax(@Nullable BigDecimal totalCityTax) {
        this.totalCityTax = totalCityTax;
    }


    public PostRestReceiptRequestReceiptItem totalAmount(@Nonnull BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Бүтээгдэхүүн, үйлчилгээний гүйлгээний нийт дүн  Бүх төрлийн татвар шингэсэн дүн
     *
     * @return totalAmount
     */
    @Nonnull
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(@Nonnull BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }


    public PostRestReceiptRequestReceiptItem data(@Nullable PostRestReceiptRequestReceiptItemData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @Nullable
    public PostRestReceiptRequestReceiptItemData getData() {
        return data;
    }

    public void setData(@Nullable PostRestReceiptRequestReceiptItemData data) {
        this.data = data;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostRestReceiptRequestReceiptItem postRestReceiptRequestReceiptItem = (PostRestReceiptRequestReceiptItem) o;
        return Objects.equals(this.name, postRestReceiptRequestReceiptItem.name) &&
                Objects.equals(this.barCode, postRestReceiptRequestReceiptItem.barCode) &&
                Objects.equals(this.barCodeType, postRestReceiptRequestReceiptItem.barCodeType) &&
                Objects.equals(this.classificationCode, postRestReceiptRequestReceiptItem.classificationCode) &&
                Objects.equals(this.taxProductCode, postRestReceiptRequestReceiptItem.taxProductCode) &&
                Objects.equals(this.measureUnit, postRestReceiptRequestReceiptItem.measureUnit) &&
                Objects.equals(this.qty, postRestReceiptRequestReceiptItem.qty) &&
                Objects.equals(this.unitPrice, postRestReceiptRequestReceiptItem.unitPrice) &&
                Objects.equals(this.totalVAT, postRestReceiptRequestReceiptItem.totalVAT) &&
                Objects.equals(this.totalCityTax, postRestReceiptRequestReceiptItem.totalCityTax) &&
                Objects.equals(this.totalAmount, postRestReceiptRequestReceiptItem.totalAmount) &&
                Objects.equals(this.data, postRestReceiptRequestReceiptItem.data);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, barCode, barCodeType, classificationCode, taxProductCode, measureUnit, qty, unitPrice, totalVAT, totalCityTax, totalAmount, data);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostRestReceiptRequestReceiptItem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    barCode: ").append(toIndentedString(barCode)).append("\n");
        sb.append("    barCodeType: ").append(toIndentedString(barCodeType)).append("\n");
        sb.append("    classificationCode: ").append(toIndentedString(classificationCode)).append("\n");
        sb.append("    taxProductCode: ").append(toIndentedString(taxProductCode)).append("\n");
        sb.append("    measureUnit: ").append(toIndentedString(measureUnit)).append("\n");
        sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
        sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
        sb.append("    totalVAT: ").append(toIndentedString(totalVAT)).append("\n");
        sb.append("    totalCityTax: ").append(toIndentedString(totalCityTax)).append("\n");
        sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
        openapiFields = new HashSet<String>(Arrays.asList("name", "barCode", "barCodeType", "classificationCode", "taxProductCode", "measureUnit", "qty", "unitPrice", "totalVAT", "totalCityTax", "totalAmount", "data"));

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>(Arrays.asList("name", "barCode", "measureUnit", "qty", "unitPrice", "totalAmount"));
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to PostRestReceiptRequestReceiptItem
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PostRestReceiptRequestReceiptItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in PostRestReceiptRequestReceiptItem is not found in the empty JSON string", PostRestReceiptRequestReceiptItem.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!PostRestReceiptRequestReceiptItem.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `PostRestReceiptRequestReceiptItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : PostRestReceiptRequestReceiptItem.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
        }
        if (!jsonObj.get("barCode").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `barCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("barCode").toString()));
        }
        if ((jsonObj.get("barCodeType") != null && !jsonObj.get("barCodeType").isJsonNull()) && !jsonObj.get("barCodeType").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `barCodeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("barCodeType").toString()));
        }
        if ((jsonObj.get("classificationCode") != null && !jsonObj.get("classificationCode").isJsonNull()) && !jsonObj.get("classificationCode").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `classificationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classificationCode").toString()));
        }
        if ((jsonObj.get("taxProductCode") != null && !jsonObj.get("taxProductCode").isJsonNull()) && !jsonObj.get("taxProductCode").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `taxProductCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxProductCode").toString()));
        }
        if (!jsonObj.get("measureUnit").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `measureUnit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("measureUnit").toString()));
        }
        // validate the optional field `data`
        if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
            PostRestReceiptRequestReceiptItemData.validateJsonElement(jsonObj.get("data"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PostRestReceiptRequestReceiptItem.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PostRestReceiptRequestReceiptItem' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PostRestReceiptRequestReceiptItem> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(PostRestReceiptRequestReceiptItem.class));

            return (TypeAdapter<T>) new TypeAdapter<PostRestReceiptRequestReceiptItem>() {
                @Override
                public void write(JsonWriter out, PostRestReceiptRequestReceiptItem value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public PostRestReceiptRequestReceiptItem read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }

            }.nullSafe();
        }
    }

    /**
     * Create an instance of PostRestReceiptRequestReceiptItem given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PostRestReceiptRequestReceiptItem
     * @throws IOException if the JSON string is invalid with respect to PostRestReceiptRequestReceiptItem
     */
    public static PostRestReceiptRequestReceiptItem fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PostRestReceiptRequestReceiptItem.class);
    }

    /**
     * Convert an instance of PostRestReceiptRequestReceiptItem to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


