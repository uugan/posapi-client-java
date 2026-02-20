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
 * PostRestReceiptRequestReceiptsInner
 */
public class PostRestReceiptRequestReceipt {
    @SerializedName("totalAmount")
    @Nonnull
    private BigDecimal totalAmount;
    @SerializedName("totalVAT")
    @Nullable
    private BigDecimal totalVAT;
    @SerializedName("totalCityTax")
    @Nullable
    private BigDecimal totalCityTax;
    @SerializedName("taxType")
    @Nonnull
    private String taxType;
    @SerializedName("merchantTin")
    @Nonnull
    private String merchantTin;
    @SerializedName("customerTin")
    @Nullable
    private String customerTin;

    @SerializedName("bankAccountNo")
    @Nullable
    private String bankAccountNo;
    @SerializedName("iBan")
    @Nullable
    private String iBan;
    @SerializedName("data")
    @Nullable
    private Object data;
    @SerializedName("invoiceId")
    @Nullable
    private String invoiceId;
    @SerializedName("items")
    @Nonnull
    private List<PostRestReceiptRequestReceiptItem> items = new ArrayList<>();

    public PostRestReceiptRequestReceipt() {
    }

    public PostRestReceiptRequestReceipt totalAmount(@Nonnull BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Дэд төлбөрийн баримтын гүйлгээний нийт дүн  Бүх төрлийн татвар шингэсэн дүн
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


    public PostRestReceiptRequestReceipt totalVAT(@Nullable BigDecimal totalVAT) {
        this.totalVAT = totalVAT;
        return this;
    }

    /**
     * Дэд төлбөрийн баримтын НӨАТ-н нийт дүн
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


    public PostRestReceiptRequestReceipt totalCityTax(@Nullable BigDecimal totalCityTax) {
        this.totalCityTax = totalCityTax;
        return this;
    }

    /**
     * Дэд төлбөрийн баримтын НХАТ-н нийт дүн
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


    public PostRestReceiptRequestReceipt taxType(@Nonnull String taxType) {
        this.taxType = taxType;
        return this;
    }

    /**
     * Татварын төрөл:   Хэрэв нийт худалдан авсан бараанд НӨАТ тооцох, НӨАТ-аас чөлөөлөгдөх болон НӨАТ-н 0 хувь тооцох бараа, ажил, үйлчилгээг хамтад нь худалдан авсан тохиолдолд татварын төрөл тус бүрээр дэд баримт үйлдэнэ!!!  Татварын төрөл   &lt;!--  type: tab  title: VAT_ABLE  --&gt;    НӨАТ тооцох бүтээгдэхүүн, үйлчилгээ /НӨАТ-н тухай хууль 7-р зүйл/    &#x60;&#x60;&#x60;json   {    \&quot;branchNo\&quot;: \&quot;001\&quot;,    \&quot;totalAmount\&quot;: 5600,    \&quot;totalVAT\&quot;: 500,        \&quot;totalCityTax\&quot;: 100,        \&quot;districtCode\&quot;: \&quot;2501\&quot;,    \&quot;merchantTin\&quot;: \&quot;110718991986\&quot;,    \&quot;posNo\&quot;: \&quot;001\&quot;,    \&quot;customerTin\&quot; : \&quot;110718991986\&quot;,    \&quot;consumerNo\&quot;: \&quot;\&quot;,    \&quot;type\&quot;: \&quot;B2B_RECEIPT\&quot;,    \&quot;inactiveId\&quot;: null,    \&quot;reportMonth\&quot;: null,    \&quot;billIdSuffix\&quot;: \&quot;01\&quot;,    \&quot;receipts\&quot;: [      {        \&quot;totalAmount\&quot;: 5600,        \&quot;taxType\&quot;: \&quot;VAT_ABLE\&quot;,        \&quot;merchantTin\&quot;: \&quot;110718991986\&quot;,        \&quot;customerTin\&quot; : null,        \&quot;totalVAT\&quot;: 500.00,        \&quot;totalCityTax\&quot;: 100,        \&quot;bankAccountNo\&quot;: \&quot;\&quot;,        \&quot;iBan\&quot;: \&quot;\&quot;,        \&quot;items\&quot;: [          {            \&quot;name\&quot;: \&quot;Талх\&quot;,            \&quot;barCode\&quot;: \&quot;19059010880001\&quot;,            \&quot;barCodeType\&quot;: \&quot;GS1\&quot;,            \&quot;classificationCode\&quot;: \&quot;2349010\&quot;,            \&quot;taxProductCode\&quot;: null,            \&quot;measureUnit\&quot;: \&quot;senlovesfits\&quot;,            \&quot;qty\&quot;: 1,            \&quot;unitPrice\&quot;: 5000,            \&quot;totalVAT\&quot;: 500,            \&quot;totalCityTax\&quot;: 100,            \&quot;totalAmount\&quot;: 5600          }           ]      }    ],    \&quot;payments\&quot;: [      {      \&quot;code\&quot;:\&quot;CASH\&quot;,      \&quot;status\&quot;: \&quot;PAID\&quot;,      \&quot;paidAmount\&quot;:5600      }    ]  }  &#x60;&#x60;&#x60;  &lt;!--  type: tab  title: VAT_FREE  --&gt;    НӨАТ-аас чөлөөлөгдөх бүтээгдэхүүн, үйлчилгээ /НӨАТ-н тухай хууль 13-р зүйл/  &#x60;&#x60;&#x60;json   {    \&quot;branchNo\&quot;: \&quot;001\&quot;,    \&quot;totalAmount\&quot;: 5000,    \&quot;totalVAT\&quot;: 0,        \&quot;totalCityTax\&quot;: 0,        \&quot;districtCode\&quot;: \&quot;2501\&quot;,    \&quot;merchantTin\&quot;: \&quot;110718991986\&quot;,    \&quot;posNo\&quot;: \&quot;001\&quot;,    \&quot;customerTin\&quot; : \&quot;110718991986\&quot;,    \&quot;consumerNo\&quot;: \&quot;\&quot;,    \&quot;type\&quot;: \&quot;B2B_RECEIPT\&quot;,    \&quot;inactiveId\&quot;: null,    \&quot;reportMonth\&quot;: null,    \&quot;billIdSuffix\&quot;: \&quot;01\&quot;,    \&quot;receipts\&quot;: [      {        \&quot;totalAmount\&quot;: 5000,        \&quot;taxType\&quot;: \&quot;VAT_FREE\&quot;,        \&quot;merchantTin\&quot;: \&quot;110718991986\&quot;,        \&quot;customerTin\&quot; : null,        \&quot;totalVAT\&quot;: 0,        \&quot;totalCityTax\&quot;: 0,        \&quot;bankAccountNo\&quot;: null,        \&quot;iBan\&quot;: null,        \&quot;items\&quot;: [          {            \&quot;name\&quot;: \&quot;:Дээж сүү\&quot;,            \&quot;barCode\&quot;: \&quot;8654000102657\&quot;,            \&quot;barCodeType\&quot;: \&quot;GS1\&quot;,            \&quot;classificationCode\&quot;: \&quot;2349010\&quot;,            \&quot;taxProductCode\&quot;: \&quot;320\&quot;,            \&quot;measureUnit\&quot;: \&quot;senlovesfits\&quot;,            \&quot;qty\&quot;: 1,            \&quot;unitPrice\&quot;: 5000,            \&quot;totalVAT\&quot;: 0,            \&quot;totalCityTax\&quot;: 0,            \&quot;totalAmount\&quot;: 5000          }           ]      }    ],    \&quot;payments\&quot;: [      {      \&quot;code\&quot;:\&quot;CASH\&quot;,      \&quot;status\&quot;: \&quot;PAID\&quot;,      \&quot;paidAmount\&quot;:5000      }    ]  }    &#x60;&#x60;&#x60;  &lt;!--  type: tab  title: VAT_ZERO  --&gt;    НӨАТ-н 0 хувь тооцох бүтээгдэхүүн, үйлчилгээ /НӨАТ-н тухай хууль 12-р зүйл/  &#x60;&#x60;&#x60;json   {    \&quot;branchNo\&quot;: \&quot;001\&quot;,    \&quot;totalAmount\&quot;: 5000,    \&quot;totalVAT\&quot;: 0,        \&quot;totalCityTax\&quot;: 0,        \&quot;districtCode\&quot;: \&quot;2501\&quot;,    \&quot;merchantTin\&quot;: \&quot;110718991986\&quot;,    \&quot;posNo\&quot;: \&quot;001\&quot;,    \&quot;customerTin\&quot; : \&quot;110718991986\&quot;,    \&quot;consumerNo\&quot;: \&quot;\&quot;,    \&quot;type\&quot;: \&quot;B2B_RECEIPT\&quot;,    \&quot;inactiveId\&quot;: null,    \&quot;reportMonth\&quot;: null,    \&quot;billIdSuffix\&quot;: \&quot;01\&quot;,    \&quot;receipts\&quot;: [      {        \&quot;totalAmount\&quot;: 5000,        \&quot;taxType\&quot;: \&quot;VAT_ZERO\&quot;,        \&quot;merchantTin\&quot;: \&quot;110718991986\&quot;,        \&quot;customerTin\&quot; : null,        \&quot;totalVAT\&quot;: 0,        \&quot;totalCityTax\&quot;: 0,        \&quot;bankAccountNo\&quot;: \&quot;\&quot;,        \&quot;iBan\&quot;: \&quot;\&quot;,        \&quot;items\&quot;: [          {            \&quot;name\&quot;: \&quot;Таван толгой - Хятад улсын Ганц модны боомт\&quot;,            \&quot;barCode\&quot;: null,            \&quot;barCodeType\&quot;: \&quot;UNDEFINED\&quot;,            \&quot;classificationCode\&quot;: \&quot;6511905\&quot;,            \&quot;measureUnit\&quot;: \&quot;senlovesfits\&quot;,            \&quot;taxProductCode\&quot;: \&quot;502\&quot;,            \&quot;qty\&quot;: 1,            \&quot;unitPrice\&quot;: 5000,            \&quot;totalVAT\&quot;: 0,            \&quot;totalCityTax\&quot;: 0,            \&quot;totalAmount\&quot;: 5000          }           ]      }    ],    \&quot;payments\&quot;: [      {      \&quot;code\&quot;:\&quot;CASH\&quot;,      \&quot;status\&quot;: \&quot;PAID\&quot;,      \&quot;paidAmount\&quot;:5000      }    ]  }  &#x60;&#x60;&#x60;  &lt;!--  type: tab  title: NO_VAT  --&gt;    Монгол улсын хилийн гадна борлуулсан бүтээгдэхүүн үйлчилгээ / НӨАТ-н тухай хуулийн 3-р зүйлээс бусад  &#x60;&#x60;&#x60;json   {      \&quot;branchNo\&quot;: \&quot;001\&quot;,       \&quot;totalAmount\&quot;: 5000,      \&quot;totalVAT\&quot;: 0,      \&quot;totalCityTax\&quot;: 0,      \&quot;districtCode\&quot;: \&quot;2501\&quot;,      \&quot;merchantTin\&quot;: \&quot;110718991986\&quot;,      \&quot;posNo\&quot;: \&quot;001\&quot;,      \&quot;customerTin\&quot;: \&quot;110718991986\&quot;,      \&quot;consumerNo\&quot;: \&quot;\&quot;,      \&quot;branchNo\&quot;: \&quot;001\&quot;,      \&quot;type\&quot;: \&quot;B2B_RECEIPT\&quot;,      \&quot;inactiveId\&quot;: null,      \&quot;reportMonth\&quot;: null,      \&quot;receipts\&quot;: [          {              \&quot;totalAmount\&quot;: 5000,              \&quot;taxType\&quot;: \&quot;NOT_VAT\&quot;,              \&quot;merchantTin\&quot;: \&quot;110718991986\&quot;,              \&quot;customerTin\&quot;: null,              \&quot;totalVAT\&quot;: 0,              \&quot;totalCityTax\&quot;: 0,              \&quot;bankAccountNo\&quot;: \&quot;\&quot;,              \&quot;iBan\&quot;: \&quot;\&quot;,              \&quot;items\&quot;: [                  {                      \&quot;name\&quot;: \&quot;Jack Daniel&#39;s Whiskey Old No.7 Tennessee 2x1 Liter\&quot;,                      \&quot;barCode\&quot;: \&quot;5099873145258\&quot;,                      \&quot;barCodeType\&quot;: \&quot;GS1\&quot;,                      \&quot;classificationCode\&quot;: \&quot;6511905\&quot;,                      \&quot;measureUnit\&quot;: \&quot;senlovesfits\&quot;,                      \&quot;taxProductCode\&quot;: \&quot;0000414\&quot;,                      \&quot;qty\&quot;: 1,                      \&quot;unitPrice\&quot;: 5000,                      \&quot;totalVAT\&quot;: 0,                      \&quot;totalCityTax\&quot;: 0,                      \&quot;totalAmount\&quot;: 5000                  }              ]          }      ],      \&quot;payments\&quot;: [          {              \&quot;code\&quot;: \&quot;CASH\&quot;,              \&quot;status\&quot;: \&quot;PAID\&quot;,              \&quot;paidAmount\&quot;: 5000          }      ]  }  &#x60;&#x60;&#x60;  &lt;!-- type: tab-end --&gt;
     *
     * @return taxType
     */
    @Nonnull
    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(@Nonnull String taxType) {
        this.taxType = taxType;
    }


    public PostRestReceiptRequestReceipt merchantTin(@Nonnull String merchantTin) {
        this.merchantTin = merchantTin;
        return this;
    }

    @Nullable
    public String customerTin() {
        return customerTin;
    }

    public PostRestReceiptRequestReceipt customerTin(@Nullable String customerTin) {
        this.customerTin = customerTin;
        return this;
    }

    /**
     * Борлуулагчийн ТТД
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


    public PostRestReceiptRequestReceipt bankAccountNo(@Nullable String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
        return this;
    }

    /**
     * Банкны дансны дугаар /Толгой болон дэд баримтын мерчант дээр бүртгэлгтэй дансны аль нэгийг бичиж болно/
     *
     * @return bankAccountNo
     */
    @Nullable
    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(@Nullable String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }


    public PostRestReceiptRequestReceipt iBan(@Nullable String iBan) {
        this.iBan = iBan;
        return this;
    }

    /**
     * Олон улсын банкны дансны дугаарлалт  &lt;details&gt;    &lt;summary&gt;📄 Дэлгэрэнгүй үзэх&lt;/summary&gt;    &lt;p&gt;      Толгой болон дэд баримтын мерчант дээр бүртгэлгтэй IBAN-ы аль нэгийг бичиж болно PosAPI 3.0 системийн receipt сервис дээр iBan талбарыг нэмэх бөгөөд хөгжүүлэлт бүрэн дуусах хүртэл уг талбарыг JSON-д заавал оруулах шаардлагагүй. Мөн Local database-ийн bankaccount хүснэгтэд iban багана нэмэгдэх ба уг баганын өгөгдөл нь баримт илгээх явцад автоматаар бөглөгдөх болно.    &lt;/p&gt;  &lt;/details&gt;
     *
     * @return iBan
     */
    @Nullable
    public String getiBan() {
        return iBan;
    }

    public void setiBan(@Nullable String iBan) {
        this.iBan = iBan;
    }


    public PostRestReceiptRequestReceipt data(@Nullable Object data) {
        this.data = data;
        return this;
    }

    /**
     * Дэд төлбөрийн баримтын нэмэлт өгөгдөл
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


    public PostRestReceiptRequestReceipt invoiceId(@Nullable String invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }

    /**
     * Төлбөрийн баримтын харгалзах нэхэмжлэхийн ДДТД  &lt;details&gt;    &lt;summary&gt;📄 Дэлгэрэнгүй үзэх&lt;/summary&gt;    &lt;p&gt;      Хэрэв тухайн төлбөрийн баримт нь өмнө үүсгэсэн нэхэмжлэхийн дагуу төлж буй үед “invoiceId” талбарт тухайн нэхэмжлэхийн ДДТД-г дамжуулж өгнө. Нэхэмжлэх нь төлбөрийн баримтын нэгэн адил НӨАТ-н тайланд тусгагдсан байдаг тул уг баримт нь НӨАТ-н тайланд тусгагдахгүй. Хэдийгээр тухайн баримт нь НӨАТ-н тайланд тусгагдахгүй болов ч сугалааны дугаар болон НӨАТ-н буцаан олголтонд хамрагдах боломжтой.    &lt;/p&gt;  &lt;/details&gt;
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


    public PostRestReceiptRequestReceipt items(@Nonnull List<PostRestReceiptRequestReceiptItem> items) {
        this.items = items;
        return this;
    }

    public PostRestReceiptRequestReceipt addItemsItem(PostRestReceiptRequestReceiptItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Борлуулсан бүтээгдэхүүн, үйлчилгээний жагсаалт
     *
     * @return items
     */
    @Nonnull
    public List<PostRestReceiptRequestReceiptItem> getItems() {
        return items;
    }

    public void setItems(@Nonnull List<PostRestReceiptRequestReceiptItem> items) {
        this.items = items;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostRestReceiptRequestReceipt postRestReceiptRequestReceipt = (PostRestReceiptRequestReceipt) o;
        return Objects.equals(this.totalAmount, postRestReceiptRequestReceipt.totalAmount) &&
                Objects.equals(this.totalVAT, postRestReceiptRequestReceipt.totalVAT) &&
                Objects.equals(this.totalCityTax, postRestReceiptRequestReceipt.totalCityTax) &&
                Objects.equals(this.taxType, postRestReceiptRequestReceipt.taxType) &&
                Objects.equals(this.merchantTin, postRestReceiptRequestReceipt.merchantTin) &&
                Objects.equals(this.bankAccountNo, postRestReceiptRequestReceipt.bankAccountNo) &&
                Objects.equals(this.iBan, postRestReceiptRequestReceipt.iBan) &&
                Objects.equals(this.data, postRestReceiptRequestReceipt.data) &&
                Objects.equals(this.invoiceId, postRestReceiptRequestReceipt.invoiceId) &&
                Objects.equals(this.items, postRestReceiptRequestReceipt.items);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalAmount, totalVAT, totalCityTax, taxType, merchantTin, bankAccountNo, iBan, data, invoiceId, items);
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
        sb.append("class PostRestReceiptRequestReceiptsInner {\n");
        sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
        sb.append("    totalVAT: ").append(toIndentedString(totalVAT)).append("\n");
        sb.append("    totalCityTax: ").append(toIndentedString(totalCityTax)).append("\n");
        sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
        sb.append("    merchantTin: ").append(toIndentedString(merchantTin)).append("\n");
        sb.append("    bankAccountNo: ").append(toIndentedString(bankAccountNo)).append("\n");
        sb.append("    iBan: ").append(toIndentedString(iBan)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
        openapiFields = new HashSet<String>(Arrays.asList("totalAmount", "totalVAT", "totalCityTax", "taxType", "merchantTin", "bankAccountNo", "iBan", "data", "invoiceId", "items"));

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>(Arrays.asList("totalAmount", "taxType", "merchantTin", "items"));
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to PostRestReceiptRequestReceiptsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PostRestReceiptRequestReceipt.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in PostRestReceiptRequestReceiptsInner is not found in the empty JSON string", PostRestReceiptRequestReceipt.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!PostRestReceiptRequestReceipt.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `PostRestReceiptRequestReceiptsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : PostRestReceiptRequestReceipt.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("taxType").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `taxType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxType").toString()));
        }
        if (!jsonObj.get("merchantTin").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `merchantTin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantTin").toString()));
        }
        if ((jsonObj.get("bankAccountNo") != null && !jsonObj.get("bankAccountNo").isJsonNull()) && !jsonObj.get("bankAccountNo").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `bankAccountNo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bankAccountNo").toString()));
        }
        if ((jsonObj.get("iBan") != null && !jsonObj.get("iBan").isJsonNull()) && !jsonObj.get("iBan").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `iBan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iBan").toString()));
        }
        if ((jsonObj.get("invoiceId") != null && !jsonObj.get("invoiceId").isJsonNull()) && !jsonObj.get("invoiceId").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `invoiceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceId").toString()));
        }
        // ensure the json data is an array
        if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
        }

        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        // validate the required field `items` (array)
        for (int i = 0; i < jsonArrayitems.size(); i++) {
            PostRestReceiptRequestReceiptItem.validateJsonElement(jsonArrayitems.get(i));
        }
        ;
    }


    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PostRestReceiptRequestReceipt.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PostRestReceiptRequestReceiptsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PostRestReceiptRequestReceipt> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(PostRestReceiptRequestReceipt.class));

            return (TypeAdapter<T>) new TypeAdapter<PostRestReceiptRequestReceipt>() {
                @Override
                public void write(JsonWriter out, PostRestReceiptRequestReceipt value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public PostRestReceiptRequestReceipt read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }

            }.nullSafe();
        }
    }

    /**
     * Create an instance of PostRestReceiptRequestReceiptsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PostRestReceiptRequestReceiptsInner
     * @throws IOException if the JSON string is invalid with respect to PostRestReceiptRequestReceiptsInner
     */
    public static PostRestReceiptRequestReceipt fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PostRestReceiptRequestReceipt.class);
    }

    /**
     * Convert an instance of PostRestReceiptRequestReceiptsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


