package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Per
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T17:20:01.502+08:00")

public class Per   {
  private String OBJID = null;

  private String SUBOBJ_ID = null;

  private String COLLECTTIME = null;

  private String TYPE_ID = null;

  private String KPI_ID = null;

  private String KPI_VLAUE = null;

  public Per OBJID(String OBJID) {
    this.OBJID = OBJID;
    return this;
  }

   /**
   * Get OBJID
   * @return OBJID
  **/
  @ApiModelProperty(value = "")				//@ApiModelProperty()用于方法，字段； 表示对model属性的说明或者数据操作更改 ，value：字段说明
  public String getOBJID() {
    return OBJID;
  }

  public void setOBJID(String OBJID) {
    this.OBJID = OBJID;
  }

  public Per SUBOBJ_ID(String SUBOBJ_ID) {
    this.SUBOBJ_ID = SUBOBJ_ID;
    return this;
  }

   /**
   * Get SUBOBJ_ID
   * @return SUBOBJ_ID
  **/
  @ApiModelProperty(value = "")
  public String getSUBOBJID() {
    return SUBOBJ_ID;
  }

  public void setSUBOBJID(String SUBOBJ_ID) {
    this.SUBOBJ_ID = SUBOBJ_ID;
  }

  public Per COLLECTTIME(String COLLECTTIME) {
    this.COLLECTTIME = COLLECTTIME;
    return this;
  }

   /**
   * Get COLLECTTIME
   * @return COLLECTTIME
  **/
  @ApiModelProperty(value = "")
  public String getCOLLECTTIME() {
    return COLLECTTIME;
  }

  public void setCOLLECTTIME(String COLLECTTIME) {
    this.COLLECTTIME = COLLECTTIME;
  }

  public Per TYPE_ID(String TYPE_ID) {
    this.TYPE_ID = TYPE_ID;
    return this;
  }

   /**
   * Get TYPE_ID
   * @return TYPE_ID
  **/
  @ApiModelProperty(value = "")
  public String getTYPEID() {
    return TYPE_ID;
  }

  public void setTYPEID(String TYPE_ID) {
    this.TYPE_ID = TYPE_ID;
  }

  public Per KPI_ID(String KPI_ID) {
    this.KPI_ID = KPI_ID;
    return this;
  }

   /**
   * Get KPI_ID
   * @return KPI_ID
  **/
  @ApiModelProperty(value = "")
  public String getKPIID() {
    return KPI_ID;
  }

  public void setKPIID(String KPI_ID) {
    this.KPI_ID = KPI_ID;
  }

  public Per KPI_VLAUE(String KPI_VLAUE) {
    this.KPI_VLAUE = KPI_VLAUE;
    return this;
  }

   /**
   * Get KPI_VLAUE
   * @return KPI_VLAUE
  **/
  @ApiModelProperty(value = "")
  public String getKPIVLAUE() {
    return KPI_VLAUE;
  }
  												//属性注入方式有三种，其中这里的是使用set方法注入
  public void setKPIVLAUE(String KPI_VLAUE) {
    this.KPI_VLAUE = KPI_VLAUE;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Per per = (Per) o;
    return Objects.equals(this.OBJID, per.OBJID) &&
        Objects.equals(this.SUBOBJ_ID, per.SUBOBJ_ID) &&
        Objects.equals(this.COLLECTTIME, per.COLLECTTIME) &&
        Objects.equals(this.TYPE_ID, per.TYPE_ID) &&
        Objects.equals(this.KPI_ID, per.KPI_ID) &&
        Objects.equals(this.KPI_VLAUE, per.KPI_VLAUE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(OBJID, SUBOBJ_ID, COLLECTTIME, TYPE_ID, KPI_ID, KPI_VLAUE);
  }

  @Override						//append 将指定的字符串追加到此字符序列
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Per {\n");
    
    sb.append("    OBJID: ").append(toIndentedString(OBJID)).append("\n");
    sb.append("    SUBOBJ_ID: ").append(toIndentedString(SUBOBJ_ID)).append("\n");
    sb.append("    COLLECTTIME: ").append(toIndentedString(COLLECTTIME)).append("\n");
    sb.append("    TYPE_ID: ").append(toIndentedString(TYPE_ID)).append("\n");
    sb.append("    KPI_ID: ").append(toIndentedString(KPI_ID)).append("\n");
    sb.append("    KPI_VLAUE: ").append(toIndentedString(KPI_VLAUE)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

