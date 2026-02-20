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
 * PostRestReceiptRequest
 */
public class PostRestReceiptRequest {
    @SerializedName("branchNo")
    @Nonnull
    private String branchNo;
    @SerializedName("totalAmount")
    @Nonnull
    private BigDecimal totalAmount;
    @SerializedName("totalVAT")
    @Nullable
    private BigDecimal totalVAT;
    @SerializedName("totalCityTax")
    @Nullable
    private BigDecimal totalCityTax;
    @SerializedName("districtCode")
    @Nullable
    private String districtCode;
    @SerializedName("merchantTin")
    @Nonnull
    private String merchantTin;
    @SerializedName("posNo")
    @Nonnull
    private String posNo;
    @SerializedName("customerTin")
    @Nullable
    private String customerTin;
    @SerializedName("consumerNo")
    @Nullable
    private String consumerNo;
    @SerializedName("type")
    @Nonnull
    private String type;
    @SerializedName("inactiveId")
    @Nullable
    private String inactiveId;
    @SerializedName("reportMonth")
    @Nullable
    private String reportMonth;
    @SerializedName("billIdSuffix")
    @Nonnull
    private String billIdSuffix;
    @SerializedName("data")
    @Nullable
    private Object data;
    @SerializedName("receipts")
    @Nonnull
    private List<PostRestReceiptRequestReceipt> receipts = new ArrayList<>();
    @SerializedName("invoiceId")
    @Nullable
    private String invoiceId;
    @SerializedName("payments")
    @Nullable
    private List<PostRestReceiptRequestPayment> payments = new ArrayList<>();

    public PostRestReceiptRequest() {
    }

    public PostRestReceiptRequest branchNo(@Nonnull String branchNo) {
        this.branchNo = branchNo;
        return this;
    }

    /**
     * Салбарын дугаар  &lt;details&gt;    &lt;summary&gt;📄 Дэлгэрэнгүй үзэх&lt;/summary&gt;    &lt;p&gt;      PosAPI ашиглаж буй татвар төлөгчийн салбарын дугаар. 3 оронтой тоон утгаар /000, 001, 142 гэх мэт/ илэрхийлэх ба татвар төлөгч өөсрдөө салбараа тодорхойлно. Жишээ нь: Emart-н Чингис салбарыг \&quot;001\&quot;, Хороолол салбарыг \&quot;002\&quot; гэх мэтээр дугаарлаж болно.    &lt;/p&gt;  &lt;/details&gt;
     *
     * @return branchNo
     */
    @Nonnull
    public String getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(@Nonnull String branchNo) {
        this.branchNo = branchNo;
    }


    public PostRestReceiptRequest totalAmount(@Nonnull BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Багц баримтын нийт үнийн дүн  &lt;details&gt;    &lt;summary&gt;📄 Дэлгэрэнгүй үзэх&lt;/summary&gt;    &lt;p&gt;      “Бүх төрлийн татвар шингэсэн дүн” гэсэн анхааруулга бүхий талбарууд нь НӨАТ болон НХАТ-г тухайн дүнд нэмж тооцохыг тодорхойлж буй юм. Жишээлбэл тухайн бүтээгдэхүүний үндсэн үнэ нь 1000 төгрөг бөгөөд НХАТ тооцох бүтээгдэхүүн бол дараах байдлаар тооцож нийт үнийг гарган тухайн талбарт оноож өгнө. Нийт үнэ /Нэг барааны тооцоолол/ &#x3D; Үндсэн үнэ+ НӨАТ+НХАТ totalAmount &#x3D; 1000 + 100 + 20 &#x3D; 1120    &lt;/p&gt;  &lt;/details&gt;
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


    public PostRestReceiptRequest totalVAT(@Nullable BigDecimal totalVAT) {
        this.totalVAT = totalVAT;
        return this;
    }

    /**
     * Багц баримтын НӨАТ-н нийт дүн
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


    public PostRestReceiptRequest totalCityTax(@Nullable BigDecimal totalCityTax) {
        this.totalCityTax = totalCityTax;
        return this;
    }

    /**
     * Багц баримтын НХАТ-н нийт дүн  &lt;details&gt;    &lt;summary&gt;📄 Дэлгэрэнгүй үзэх&lt;/summary&gt;    &lt;p&gt;      Нийслэл хотын албан татварын тухай хуулийн 7-р зүйлд заасан бүтээгдэхүүн, үйлчилгээнд ноогдуулсан татварыг уг талбарт оноож өгнө. Нийслэл хотын албан татварыг бодохдоо уг хуулийн 9-р зүйлд тодорхойлсон байдлаар тооцоно.    &lt;/p&gt;  &lt;/details&gt;
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


    public PostRestReceiptRequest districtCode(@Nullable String districtCode) {
        this.districtCode = districtCode;
        return this;
    }

    /**
     * Баримт хэвлэсэн орон нутгийн код /Байршлын код/  4 оронтой бүхэл тоо  [Сервис харах бол энд дарна уу.](https://developer.itc.gov.mn/docs/ebarimt-api/fbdleubwxraqa-district-code-lavlah)
     *
     * @return districtCode
     */
    @Nullable
    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(@Nullable String districtCode) {
        this.districtCode = districtCode;
    }


    public PostRestReceiptRequest merchantTin(@Nonnull String merchantTin) {
        this.merchantTin = merchantTin;
        return this;
    }

    /**
     * Багц баримт олгогчийн ТТД  &lt;details&gt;    &lt;summary&gt;📄 Дэлгэрэнгүй үзэх&lt;/summary&gt;    &lt;p&gt;      Хуулийн этгээд бол 11 оронтой, Хувь хүн 12-14 /civil id/ оронтой бүхэл тоо байна Монголын татварын алба нь өмнө нь улсын бүртгэлийн дугаарыг/Регистрийн дугаар/ ТТД-р давхар ашигладаг байсныг шинэчилж шинээр ТТД-г олгож эхэлсэн. Иймд PosAPI нь татварын албанаас шинээр олгож буй ТТД-г хэрэглэнэ. ТТД нь дараах форматтай байх бөгөөд өөрийн ТТД-ыг өөрийн цахим татварын систем /ETAX/-д хандан “Татвар төлөгчийн мэдээлэл” цонхноос харах боломжтой. ТТД нь хэрэв толгой татвар төлөгч эсвэл хувь хүн бол 11 орон бүхий бүхэл тоон дугаар байна. Харин салбараар бүртгэлтэй татвар төлөгч нь Аж ахуйн нэгжийн орлогын албан татварын тухай хууль, Нэмэгдсэн өртгийн албан татварын тухай хуулийн дагуу баримт үүсгэх боломжгүй болохыг анхаарна уу.    &lt;/p&gt;  &lt;/details&gt;
     *
     * @return merchantTin
     */
    @Nonnull
    public String getMerchantTin() {
        return merchantTin;
    }

    public void setMerchantTin(@Nonnull String merchantTin) {
        this.merchantTin = merchantTin;
    }


    public PostRestReceiptRequest posNo(@Nonnull String posNo) {
        this.posNo = posNo;
        return this;
    }

    /**
     * Тухайн байгууллагын дотоод кассын дугаар
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


    public PostRestReceiptRequest customerTin(@Nullable String customerTin) {
        this.customerTin = customerTin;
        return this;
    }

    /**
     * Худалдан авагчийн ТТД /Зөвхөн бизнесийн үйл ажиллагаанд B2B_RECEIPT, B2B_INVOICE үед бөглөнө/    &lt;details&gt;    &lt;summary&gt;📄 Дэлгэрэнгүй үзэх&lt;/summary&gt;    &lt;p&gt;      Хуулийн этгээд бол 11 оронтой, Хувь хүн 12-14 /civil id/ оронтой бүхэл тоо байна Монголын татварын алба нь өмнө нь улсын бүртгэлийн дугаарыг/Регистрийн дугаар/ ТТД-р давхар ашигладаг байсныг шинэчилж шинээр ТТД-г олгож эхэлсэн. Иймд PosAPI нь татварын албанаас шинээр олгож буй ТТД-г хэрэглэнэ. ТТД нь дараах форматтай байх бөгөөд өөрийн ТТД-ыг өөрийн цахим татварын систем /ETAX/-д хандан “Татвар төлөгчийн мэдээлэл” цонхноос харах боломжтой. ТТД нь хэрэв толгой татвар төлөгч эсвэл хувь хүн бол 11 орон бүхий бүхэл тоон дугаар байна. Харин салбараар бүртгэлтэй татвар төлөгч нь Аж ахуйн нэгжийн орлогын албан татварын тухай хууль, Нэмэгдсэн өртгийн албан татварын тухай хуулийн дагуу баримт үүсгэх боломжгүй болохыг анхаарна уу.    &lt;/p&gt;  &lt;/details&gt;
     *
     * @return customerTin
     */
    @Nullable
    public String getCustomerTin() {
        return customerTin;
    }

    public void setCustomerTin(@Nullable String customerTin) {
        this.customerTin = customerTin;
    }


    public PostRestReceiptRequest consumerNo(@Nullable String consumerNo) {
        this.consumerNo = consumerNo;
        return this;
    }

    /**
     * Худалдан авагч иргэний ebarimt-н бүртгэлийн дугаар /Зөвхөн B2C_RECEIPT үед бөглөх боломжтой/  &lt;details&gt;    &lt;summary&gt;📄 Дэлгэрэнгүй үзэх&lt;/summary&gt;    &lt;p&gt;      8 оронтой бүхэл тоо Хэрэв тухайн төлбөрийн баримтийн төрөл нь B2C_RECEIPT бөгөөд consumerNo талбарын утга нь ebarimt.mn системд нэвтрэх 11****** код бүхий утгатай бол PosAPI нь уг баримтыг шууд Нэгдсэн системд илгээнэ. Илгээх үйлдэл амжилттай болсон нөхцөлд easy талбарын утга нь true, амжилтгүй болсон нөхцөлд false байна. Хэрэв easy талбарын утга true бол цаасан баримт хэвлэх эсэхийг хэрэглэгчийн систем нь тохиргоогоор шийдвэрлэж болно.    &lt;/p&gt;  &lt;/details&gt;
     *
     * @return consumerNo
     */
    @Nullable
    public String getConsumerNo() {
        return consumerNo;
    }

    public void setConsumerNo(@Nullable String consumerNo) {
        this.consumerNo = consumerNo;
    }


    public PostRestReceiptRequest type(@Nonnull String type) {
        this.type = type;
        return this;
    }

    /**
     * Баримтын төрөл   &lt;!--  type: tab  title: B2C_RECEIPT  --&gt;    Бизнес эрхлэгчээс хувь хүнд борлуулсан бүтээгдэхүүн, үйлчилгээний төлбөрийн баримт    &#x60;&#x60;&#x60;json   {    \&quot;branchNo\&quot;: \&quot;001\&quot;,    \&quot;totalAmount\&quot;: 5600,    \&quot;totalVAT\&quot;: 500,        \&quot;totalCityTax\&quot;: 100,        \&quot;districtCode\&quot;: \&quot;2501\&quot;,    \&quot;merchantTin\&quot;: \&quot;110718991986\&quot;,    \&quot;posNo\&quot;: \&quot;001\&quot;,    \&quot;customerTin\&quot; : null,    \&quot;consumerNo\&quot;: \&quot;10038071\&quot;,    \&quot;type\&quot;: \&quot;B2C_RECEIPT\&quot;,    \&quot;inactiveId\&quot;: null,    \&quot;reportMonth\&quot;: null,    \&quot;billIdSuffix\&quot;: \&quot;01\&quot;,    \&quot;postRestReceiptRequestReceipts\&quot;: [      {        \&quot;totalAmount\&quot;: 5600,        \&quot;taxType\&quot;: \&quot;VAT_ABLE\&quot;,        \&quot;merchantTin\&quot;: \&quot;110718991986\&quot;,        \&quot;customerTin\&quot; : null,        \&quot;totalVAT\&quot;: 500.00,        \&quot;totalCityTax\&quot;: 100,        \&quot;bankAccountNo\&quot;: \&quot;\&quot;,        \&quot;invoiceId\&quot;: null,        \&quot;iBan\&quot;: \&quot;\&quot;,        \&quot;items\&quot;: [          {            \&quot;name\&quot;: \&quot;Талх\&quot;,            \&quot;barCode\&quot;: \&quot;19059010880001\&quot;,            \&quot;barCodeType\&quot;: \&quot;GS1\&quot;,            \&quot;classificationCode\&quot;: \&quot;2349010\&quot;,            \&quot;taxProductCode\&quot;: null,            \&quot;measureUnit\&quot;: \&quot;senlovesfits\&quot;,            \&quot;qty\&quot;: 1,            \&quot;unitPrice\&quot;: 5000,            \&quot;totalVAT\&quot;: 500,            \&quot;totalCityTax\&quot;: 100,            \&quot;totalAmount\&quot;: 5600          }           ]      }    ],    \&quot;payments\&quot;: [      {      \&quot;code\&quot;:\&quot;CASH\&quot;,      \&quot;status\&quot;: \&quot;PAID\&quot;,      \&quot;paidAmount\&quot;:5600      }    ]  }  &#x60;&#x60;&#x60;  &lt;!--  type: tab  title: B2B_RECEIPT  --&gt;    Бизнес эрхлэгч хооронд борлуулсан бүтээгдэхүүн, үйлчилгээний төлбөрийн баримт  &#x60;&#x60;&#x60;json   {    \&quot;branchNo\&quot;: \&quot;001\&quot;,    \&quot;totalAmount\&quot;: 5000,    \&quot;totalVAT\&quot;: 0,        \&quot;totalCityTax\&quot;: 0,        \&quot;districtCode\&quot;: \&quot;2501\&quot;,    \&quot;merchantTin\&quot;: \&quot;110718991986\&quot;,    \&quot;posNo\&quot;: \&quot;001\&quot;,    \&quot;customerTin\&quot; : \&quot;110718991986\&quot;,    \&quot;consumerNo\&quot;: \&quot;\&quot;,    \&quot;type\&quot;: \&quot;B2B_RECEIPT\&quot;,    \&quot;inactiveId\&quot;: null,    \&quot;reportMonth\&quot;: null,    \&quot;billIdSuffix\&quot;: \&quot;01\&quot;,    \&quot;postRestReceiptRequestReceipts\&quot;: [      {        \&quot;totalAmount\&quot;: 5000,        \&quot;taxType\&quot;: \&quot;VAT_FREE\&quot;,        \&quot;merchantTin\&quot;: \&quot;110718991986\&quot;,        \&quot;customerTin\&quot; : null,        \&quot;totalVAT\&quot;: 0,        \&quot;totalCityTax\&quot;: 0,        \&quot;bankAccountNo\&quot;: null,        \&quot;invoiceId\&quot;: null,        \&quot;iBan\&quot;: null,        \&quot;items\&quot;: [          {            \&quot;name\&quot;: \&quot;:Дээж сүү\&quot;,            \&quot;barCode\&quot;: \&quot;8654000102657\&quot;,            \&quot;barCodeType\&quot;: \&quot;GS1\&quot;,            \&quot;classificationCode\&quot;: \&quot;2349010\&quot;,            \&quot;taxProductCode\&quot;: \&quot;320\&quot;,            \&quot;measureUnit\&quot;: \&quot;senlovesfits\&quot;,            \&quot;qty\&quot;: 1,            \&quot;unitPrice\&quot;: 5000,            \&quot;totalVAT\&quot;: 0,            \&quot;totalCityTax\&quot;: 0,            \&quot;totalAmount\&quot;: 5000          }           ]      }    ],    \&quot;payments\&quot;: [      {      \&quot;code\&quot;:\&quot;CASH\&quot;,      \&quot;status\&quot;: \&quot;PAID\&quot;,      \&quot;paidAmount\&quot;:5000      }    ]  }    &#x60;&#x60;&#x60;  &lt;!--  type: tab  title: B2C_INVOICE  --&gt;    Бизнес эрхлэгчээс хувь хүнд борлуулсан бүтээгдэхүүн, үйлчилгээний нэхэмжлэх  &#x60;&#x60;&#x60;json   {    \&quot;branchNo\&quot;: \&quot;001\&quot;,    \&quot;totalAmount\&quot;: 5000,    \&quot;totalVAT\&quot;: 0,        \&quot;totalCityTax\&quot;: 0,        \&quot;districtCode\&quot;: \&quot;2501\&quot;,    \&quot;merchantTin\&quot;: \&quot;110718991986\&quot;,    \&quot;posNo\&quot;: \&quot;001\&quot;,    \&quot;customerTin\&quot; : null,    \&quot;consumerNo\&quot;: \&quot;\&quot;,    \&quot;type\&quot;: \&quot;B2C_INVOICE\&quot;,    \&quot;inactiveId\&quot;: null,    \&quot;reportMonth\&quot;: null,    \&quot;billIdSuffix\&quot;: \&quot;01\&quot;,    \&quot;postRestReceiptRequestReceipts\&quot;: [      {        \&quot;totalAmount\&quot;: 5000,        \&quot;taxType\&quot;: \&quot;VAT_ZERO\&quot;,        \&quot;merchantTin\&quot;: \&quot;110718991986\&quot;,        \&quot;customerTin\&quot; : null,        \&quot;totalVAT\&quot;: 0,        \&quot;totalCityTax\&quot;: 0,        \&quot;bankAccountNo\&quot;: \&quot;1111111111\&quot;,        \&quot;iBan\&quot;: \&quot;1001000151111111111\&quot;,        \&quot;items\&quot;: [          {            \&quot;name\&quot;: \&quot;Таван толгой - Хятад улсын Ганц модны боомт\&quot;,            \&quot;barCode\&quot;: null,            \&quot;barCodeType\&quot;: \&quot;UNDEFINED\&quot;,            \&quot;classificationCode\&quot;: \&quot;6511905\&quot;,            \&quot;measureUnit\&quot;: \&quot;senlovesfits\&quot;,            \&quot;taxProductCode\&quot;: \&quot;502\&quot;,            \&quot;qty\&quot;: 1,            \&quot;unitPrice\&quot;: 5000,            \&quot;totalVAT\&quot;: 0,            \&quot;totalCityTax\&quot;: 0,            \&quot;totalAmount\&quot;: 5000          }           ]      }    ],    \&quot;payments\&quot;: [      {      \&quot;code\&quot;:\&quot;CASH\&quot;,      \&quot;status\&quot;: \&quot;PAID\&quot;,      \&quot;paidAmount\&quot;:5000      }    ]  }  &#x60;&#x60;&#x60;  &lt;!--  type: tab  title: B2B_INVOICE  --&gt;    Бизнес эрхлэгч хооронд борлуулсан бүтээгдэхүүн, үйлчилгээний нэхэмжлэх    &#x60;&#x60;&#x60;json   {      \&quot;branchNo\&quot;: \&quot;001\&quot;,      \&quot;totalAmount\&quot;: 5000,      \&quot;totalVAT\&quot;: 0,      \&quot;totalCityTax\&quot;: 0,      \&quot;districtCode\&quot;: \&quot;2501\&quot;,      \&quot;merchantTin\&quot;: \&quot;110718991986\&quot;,      \&quot;posNo\&quot;: \&quot;001\&quot;,      \&quot;customerTin\&quot;: \&quot;110718991986\&quot;,      \&quot;consumerNo\&quot;: \&quot;\&quot;,      \&quot;branchNo\&quot;: \&quot;001\&quot;,      \&quot;type\&quot;: \&quot;B2B_INVOICE\&quot;,      \&quot;inactiveId\&quot;: null,      \&quot;reportMonth\&quot;: null,      \&quot;postRestReceiptRequestReceipts\&quot;: [          {              \&quot;totalAmount\&quot;: 5000,              \&quot;taxType\&quot;: \&quot;NOT_VAT\&quot;,              \&quot;merchantTin\&quot;: \&quot;110718991986\&quot;,              \&quot;customerTin\&quot;: null,              \&quot;totalVAT\&quot;: 0,              \&quot;totalCityTax\&quot;: 0,              \&quot;bankAccountNo\&quot;: \&quot;1111111111\&quot;,              \&quot;iBan\&quot;: \&quot;1001000151111111111\&quot;,              \&quot;items\&quot;: [                  {                      \&quot;name\&quot;: \&quot;Jack Daniel&#39;s Whiskey Old No.7 Tennessee 2x1 Liter\&quot;,                      \&quot;barCode\&quot;: \&quot;5099873145258\&quot;,                      \&quot;barCodeType\&quot;: \&quot;GS1\&quot;,                      \&quot;classificationCode\&quot;: \&quot;6511905\&quot;,                      \&quot;measureUnit\&quot;: \&quot;senlovesfits\&quot;,                      \&quot;taxProductCode\&quot;: \&quot;0000414\&quot;,                      \&quot;qty\&quot;: 1,                      \&quot;unitPrice\&quot;: 5000,                      \&quot;totalVAT\&quot;: 0,                      \&quot;totalCityTax\&quot;: 0,                      \&quot;totalAmount\&quot;: 5000                  }              ]          }      ],      \&quot;payments\&quot;: [          {              \&quot;code\&quot;: \&quot;CASH\&quot;,              \&quot;status\&quot;: \&quot;PAID\&quot;,              \&quot;paidAmount\&quot;: 5000          }      ]  }  &#x60;&#x60;&#x60;     &lt;!--  type: tab  title: STOCK_QR  --&gt;    Онцгой албан татварын тэмдэг бүхий барааны борлуулалт илгээх    &#x60;&#x60;&#x60;json   {    \&quot;totalAmount\&quot;: \&quot;1100\&quot;,    \&quot;totalVAT\&quot;: \&quot;0\&quot;,    \&quot;totalCityTax\&quot;: \&quot;0.00\&quot;,    \&quot;districtCode\&quot;: \&quot;2501\&quot;,    \&quot;merchantTin\&quot;: \&quot;37900846788\&quot;,    \&quot;branchNo\&quot;: \&quot;01\&quot;,    \&quot;posNo\&quot;: \&quot;10009335\&quot;,    \&quot;customerTin\&quot;: \&quot;\&quot;,    \&quot;consumerNo\&quot;: \&quot;\&quot;,    \&quot;type\&quot;: \&quot;B2C_RECEIPT\&quot;,    \&quot;inactiveId\&quot;: \&quot;\&quot;,    \&quot;reportMonth\&quot;: null,    \&quot;postRestReceiptRequestReceipts\&quot;: [      {        \&quot;totalAmount\&quot;: \&quot;1100\&quot;,        \&quot;totalVAT\&quot;: \&quot;0\&quot;,        \&quot;totalCityTax\&quot;: \&quot;0.00\&quot;,        \&quot;taxType\&quot;: \&quot;VAT_FREE\&quot;,        \&quot;merchantTin\&quot;: \&quot;37900846788\&quot;,        \&quot;items\&quot;: [          {            \&quot;barCode\&quot;: \&quot;0709013\&quot;,            \&quot;name\&quot;: \&quot;Байцаа\&quot;,            \&quot;measureUnit\&quot;: \&quot;Ш\&quot;,            \&quot;qty\&quot;: \&quot;2\&quot;,            \&quot;unitPrice\&quot;: \&quot;1000\&quot;,            \&quot;totalAmount\&quot;: \&quot;1100\&quot;,            \&quot;totalVAT\&quot;: \&quot;0\&quot;,            \&quot;barCodeType\&quot;: \&quot;UNDEFINED\&quot;,            \&quot;totalCityTax\&quot;: \&quot;0.00\&quot;,            \&quot;classificationCode\&quot;: \&quot;0709013\&quot;,            \&quot;taxProductCode\&quot;: \&quot;0000414\&quot;,            \&quot;data\&quot;: {              \&quot;stockQR\&quot;: [                \&quot;A17F974BE497F14CE0536F50A8C057A7\&quot;,                \&quot;A17F974BE495F14CE0536F50A8C057A7\&quot;              ]            }          }        ]      }    ],    \&quot;payments\&quot;: [      {        \&quot;code\&quot;: \&quot;CASH\&quot;,        \&quot;paidAmount\&quot;: 1100,        \&quot;status\&quot;: \&quot;PAID\&quot;      }    ]  }  &#x60;&#x60;&#x60;  &lt;!-- type: tab-end --&gt;
     *
     * @return type
     */
    @Nonnull
    public String getType() {
        return type;
    }

    public void setType(@Nonnull String type) {
        this.type = type;
    }


    public PostRestReceiptRequest inactiveId(@Nullable String inactiveId) {
        this.inactiveId = inactiveId;
        return this;
    }

    /**
     * Засварлах баримтын ДДТД  &lt;details&gt;    &lt;summary&gt;📄 Дэлгэрэнгүй үзэх&lt;/summary&gt;    &lt;p&gt;      Баримтыг засварлах буюу хэсэгчилсэн буцаалт хийх тохиолдолд “inactiveId” талбарт засварлах баримтын дугаарыг оруулан баримтын шинэ бичилтийг хийнэ. Баримт засварлаж буй тохиолдолд тухайн хэвлэгдсэн сугалаа хүчингүй болохгүй бөгөөд засварлагдсан баримтад сугалаа ахин олгохгүй. Иймд өмнөх баримтан дээрх сугалааны дугаараар нэгдсэн системд бүртгүүлнэ. Хэрэв нэг төлбөрийн баримтын хувьд хэсэгчилсэн буцаалтыг олон удаа үйлдэж буй үед inactiveId талбарт тухайн баримтын өмнөх баримтын ДДТД-г дамжуулж буцаана. Өөрөөр хэлбэл эхний засварт анхны ДДТД-г ашиглах ба дараагийн засварт 2 дахь төлбөрийн баримтын ДДТД-г ашиглана мөн дахин засвар оруулбал 3 дахь баримтын ДДТД-г ашиглана гэх мэтээр гинжин хэлбэрээр цувуулан засварлана.    &lt;/p&gt;  &lt;/details&gt;
     *
     * @return inactiveId
     */
    @Nullable
    public String getInactiveId() {
        return inactiveId;
    }

    public void setInactiveId(@Nullable String inactiveId) {
        this.inactiveId = inactiveId;
    }


    public PostRestReceiptRequest reportMonth(@Nullable String reportMonth) {
        this.reportMonth = reportMonth;
        return this;
    }

    /**
     * Баримт харьяалагдах тайлант сар  Зөвхөн B2B_RECEIPT, B2B_INVOICE төрлийн баримтуудыг нөхөн үүсгэх ба зөвхөн сар бүрийн 1-7-ны өдрүүдийн хооронд, өмнөх сарын баримтыг нөхөн үүсгэх боломжтой.
     *
     * @return reportMonth
     */
    @Nullable
    public String getReportMonth() {
        return reportMonth;
    }

    public void setReportMonth(@Nullable String reportMonth) {
        this.reportMonth = reportMonth;
    }


    public PostRestReceiptRequest billIdSuffix(@Nonnull String billIdSuffix) {
        this.billIdSuffix = billIdSuffix;
        return this;
    }

    /**
     * Баримтын дугаарлалт  &lt;details&gt;    &lt;summary&gt;📄 Дэлгэрэнгүй үзэх&lt;/summary&gt;    &lt;p&gt;      Баримтын ДДТД-ыг давхцуулахгүйн тулд олгох дотоод дугаарлалт. Тухайн өдөртөө дахин давтагдашгүй дугаар байна    &lt;/p&gt;  &lt;/details&gt;
     *
     * @return billIdSuffix
     */
    @Nonnull
    public String getBillIdSuffix() {
        return billIdSuffix;
    }

    public void setBillIdSuffix(@Nonnull String billIdSuffix) {
        this.billIdSuffix = billIdSuffix;
    }


    public PostRestReceiptRequest data(@Nullable Object data) {
        this.data = data;
        return this;
    }

    /**
     * Багц төлбөрийн баримтын нэмэлт өгөгдөл.
     *
     * @return data
     */
    @Nullable
    public Object getData() {
        return data;
    }

    public void setData(@Nullable Object data) {
        this.data = data;
    }


    public PostRestReceiptRequest receipts(@Nonnull List<PostRestReceiptRequestReceipt> postRestReceiptRequestReceipts) {
        this.receipts = postRestReceiptRequestReceipts;
        return this;
    }

    public PostRestReceiptRequest addReceiptsItem(PostRestReceiptRequestReceipt receiptsItem) {
        if (this.receipts == null) {
            this.receipts = new ArrayList<>();
        }
        this.receipts.add(receiptsItem);
        return this;
    }

    /**
     * Дэд төлбөрийн баримтууд
     *
     * @return postRestReceiptRequestReceipts
     */
    @Nonnull
    public List<PostRestReceiptRequestReceipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(@Nonnull List<PostRestReceiptRequestReceipt> postRestReceiptRequestReceipts) {
        this.receipts = postRestReceiptRequestReceipts;
    }


    public PostRestReceiptRequest invoiceId(@Nullable String invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }

    /**
     * Төлбөрийн баримтын харгалзах нэхэмжлэхийн ДДТД  Анхаар: Толгой баримтын “Object” хэсэгт оруулсан нэхэмжлэхийн дугаар нь тухайн баримтад хамаарах бүх баримтын толгой нэхэмжлэх болохыг илэрхийлнэ. Харин ялгаатай нэхэмжлэхүүдийн төлөлт хийж байгаа тохиолдолд тэдгээрийг Receipts хэсэгт тус бүрээр нь оруулна.  &lt;details&gt;    &lt;summary&gt;📄 Дэлгэрэнгүй үзэх&lt;/summary&gt;    &lt;p&gt;      Хэрэв тухайн төлбөрийн баримт нь өмнө үүсгэсэн нэхэмжлэхийн дагуу төлж буй үед “invoiceId” талбарт тухайн нэхэмжлэхийн ДДТД-г дамжуулж өгнө.    &lt;/p&gt;  &lt;/details&gt;
     *
     * @return invoiceId
     */
    @Nullable
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(@Nullable String invoiceId) {
        this.invoiceId = invoiceId;
    }


    public PostRestReceiptRequest payments(@Nullable List<PostRestReceiptRequestPayment> payments) {
        this.payments = payments;
        return this;
    }

    public PostRestReceiptRequest addPaymentsItem(PostRestReceiptRequestPayment paymentsItem) {
        if (this.payments == null) {
            this.payments = new ArrayList<>();
        }
        this.payments.add(paymentsItem);
        return this;
    }

    /**
     * Төлбөрийн хэлбэр
     *
     * @return payments
     */
    @Nullable
    public List<PostRestReceiptRequestPayment> getPayments() {
        return payments;
    }

    public void setPayments(@Nullable List<PostRestReceiptRequestPayment> payments) {
        this.payments = payments;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostRestReceiptRequest postRestReceiptRequest = (PostRestReceiptRequest) o;
        return Objects.equals(this.branchNo, postRestReceiptRequest.branchNo) &&
                Objects.equals(this.totalAmount, postRestReceiptRequest.totalAmount) &&
                Objects.equals(this.totalVAT, postRestReceiptRequest.totalVAT) &&
                Objects.equals(this.totalCityTax, postRestReceiptRequest.totalCityTax) &&
                Objects.equals(this.districtCode, postRestReceiptRequest.districtCode) &&
                Objects.equals(this.merchantTin, postRestReceiptRequest.merchantTin) &&
                Objects.equals(this.posNo, postRestReceiptRequest.posNo) &&
                Objects.equals(this.customerTin, postRestReceiptRequest.customerTin) &&
                Objects.equals(this.consumerNo, postRestReceiptRequest.consumerNo) &&
                Objects.equals(this.type, postRestReceiptRequest.type) &&
                Objects.equals(this.inactiveId, postRestReceiptRequest.inactiveId) &&
                Objects.equals(this.reportMonth, postRestReceiptRequest.reportMonth) &&
                Objects.equals(this.billIdSuffix, postRestReceiptRequest.billIdSuffix) &&
                Objects.equals(this.data, postRestReceiptRequest.data) &&
                Objects.equals(this.receipts, postRestReceiptRequest.receipts) &&
                Objects.equals(this.invoiceId, postRestReceiptRequest.invoiceId) &&
                Objects.equals(this.payments, postRestReceiptRequest.payments);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchNo, totalAmount, totalVAT, totalCityTax, districtCode, merchantTin, posNo, customerTin, consumerNo, type, inactiveId, reportMonth, billIdSuffix, data, receipts, invoiceId, payments);
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
        sb.append("class PostRestReceiptRequest {\n");
        sb.append("    branchNo: ").append(toIndentedString(branchNo)).append("\n");
        sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
        sb.append("    totalVAT: ").append(toIndentedString(totalVAT)).append("\n");
        sb.append("    totalCityTax: ").append(toIndentedString(totalCityTax)).append("\n");
        sb.append("    districtCode: ").append(toIndentedString(districtCode)).append("\n");
        sb.append("    merchantTin: ").append(toIndentedString(merchantTin)).append("\n");
        sb.append("    posNo: ").append(toIndentedString(posNo)).append("\n");
        sb.append("    customerTin: ").append(toIndentedString(customerTin)).append("\n");
        sb.append("    consumerNo: ").append(toIndentedString(consumerNo)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    inactiveId: ").append(toIndentedString(inactiveId)).append("\n");
        sb.append("    reportMonth: ").append(toIndentedString(reportMonth)).append("\n");
        sb.append("    billIdSuffix: ").append(toIndentedString(billIdSuffix)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    postRestReceiptRequestReceipts: ").append(toIndentedString(receipts)).append("\n");
        sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
        sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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
        openapiFields = new HashSet<String>(Arrays.asList("branchNo", "totalAmount", "totalVAT", "totalCityTax", "districtCode", "merchantTin", "posNo", "customerTin", "consumerNo", "type", "inactiveId", "reportMonth", "billIdSuffix", "data", "postRestReceiptRequestReceipts", "invoiceId", "payments"));

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>(Arrays.asList("branchNo", "totalAmount", "merchantTin", "posNo", "type", "billIdSuffix", "postRestReceiptRequestReceipts"));
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to PostRestReceiptRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PostRestReceiptRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in PostRestReceiptRequest is not found in the empty JSON string", PostRestReceiptRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!PostRestReceiptRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `PostRestReceiptRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : PostRestReceiptRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("branchNo").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `branchNo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("branchNo").toString()));
        }
        if ((jsonObj.get("districtCode") != null && !jsonObj.get("districtCode").isJsonNull()) && !jsonObj.get("districtCode").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `districtCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("districtCode").toString()));
        }
        if (!jsonObj.get("merchantTin").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `merchantTin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantTin").toString()));
        }
        if (!jsonObj.get("posNo").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `posNo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("posNo").toString()));
        }
        if ((jsonObj.get("customerTin") != null && !jsonObj.get("customerTin").isJsonNull()) && !jsonObj.get("customerTin").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `customerTin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerTin").toString()));
        }
        if ((jsonObj.get("consumerNo") != null && !jsonObj.get("consumerNo").isJsonNull()) && !jsonObj.get("consumerNo").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `consumerNo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumerNo").toString()));
        }
        if (!jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        if ((jsonObj.get("inactiveId") != null && !jsonObj.get("inactiveId").isJsonNull()) && !jsonObj.get("inactiveId").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `inactiveId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inactiveId").toString()));
        }
        if ((jsonObj.get("reportMonth") != null && !jsonObj.get("reportMonth").isJsonNull()) && !jsonObj.get("reportMonth").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `reportMonth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportMonth").toString()));
        }
        if (!jsonObj.get("billIdSuffix").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `billIdSuffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billIdSuffix").toString()));
        }
        // ensure the json data is an array
        if (!jsonObj.get("postRestReceiptRequestReceipts").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `postRestReceiptRequestReceipts` to be an array in the JSON string but got `%s`", jsonObj.get("postRestReceiptRequestReceipts").toString()));
        }

        JsonArray jsonArrayreceipts = jsonObj.getAsJsonArray("postRestReceiptRequestReceipts");
        // validate the required field `postRestReceiptRequestReceipts` (array)
        for (int i = 0; i < jsonArrayreceipts.size(); i++) {
            PostRestReceiptRequestReceipt.validateJsonElement(jsonArrayreceipts.get(i));
        }
        ;
        if ((jsonObj.get("invoiceId") != null && !jsonObj.get("invoiceId").isJsonNull()) && !jsonObj.get("invoiceId").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `invoiceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceId").toString()));
        }
        if (jsonObj.get("payments") != null && !jsonObj.get("payments").isJsonNull()) {
            JsonArray jsonArraypayments = jsonObj.getAsJsonArray("payments");
            if (jsonArraypayments != null) {
                // ensure the json data is an array
                if (!jsonObj.get("payments").isJsonArray()) {
                    throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `payments` to be an array in the JSON string but got `%s`", jsonObj.get("payments").toString()));
                }

                // validate the optional field `payments` (array)
                for (int i = 0; i < jsonArraypayments.size(); i++) {
                    PostRestReceiptRequestPayment.validateJsonElement(jsonArraypayments.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PostRestReceiptRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PostRestReceiptRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PostRestReceiptRequest> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(PostRestReceiptRequest.class));

            return (TypeAdapter<T>) new TypeAdapter<PostRestReceiptRequest>() {
                @Override
                public void write(JsonWriter out, PostRestReceiptRequest value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public PostRestReceiptRequest read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }

            }.nullSafe();
        }
    }

    /**
     * Create an instance of PostRestReceiptRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PostRestReceiptRequest
     * @throws IOException if the JSON string is invalid with respect to PostRestReceiptRequest
     */
    public static PostRestReceiptRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PostRestReceiptRequest.class);
    }

    /**
     * Convert an instance of PostRestReceiptRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


