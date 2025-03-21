package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 机电零件
 *
 * @author 
 * @email
 */
@TableName("lingjian")
public class LingjianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LingjianEntity() {

	}

	public LingjianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 机电零件名称
     */
    @ColumnInfo(comment="机电零件名称",type="varchar(200)")
    @TableField(value = "lingjian_name")

    private String lingjianName;


    /**
     * 机电零件编号
     */
    @ColumnInfo(comment="机电零件编号",type="varchar(200)")
    @TableField(value = "lingjian_uuid_number")

    private String lingjianUuidNumber;


    /**
     * 机电零件照片
     */
    @ColumnInfo(comment="机电零件照片",type="varchar(200)")
    @TableField(value = "lingjian_photo")

    private String lingjianPhoto;


    /**
     * 机电零件类型
     */
    @ColumnInfo(comment="机电零件类型",type="int(11)")
    @TableField(value = "lingjian_types")

    private Integer lingjianTypes;


    /**
     * 机电零件库存
     */
    @ColumnInfo(comment="机电零件库存",type="int(11)")
    @TableField(value = "lingjian_kucun_number")

    private Integer lingjianKucunNumber;


    /**
     * 现价/积分
     */
    @ColumnInfo(comment="现价/积分",type="decimal(10,2)")
    @TableField(value = "lingjian_new_money")

    private Double lingjianNewMoney;


    /**
     * 机电零件热度
     */
    @ColumnInfo(comment="机电零件热度",type="int(11)")
    @TableField(value = "lingjian_clicknum")

    private Integer lingjianClicknum;


    /**
     * 机电零件介绍
     */
    @ColumnInfo(comment="机电零件介绍",type="longtext")
    @TableField(value = "lingjian_content")

    private String lingjianContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "lingjian_delete")

    private Integer lingjianDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：机电零件名称
	 */
    public String getLingjianName() {
        return lingjianName;
    }
    /**
	 * 设置：机电零件名称
	 */

    public void setLingjianName(String lingjianName) {
        this.lingjianName = lingjianName;
    }
    /**
	 * 获取：机电零件编号
	 */
    public String getLingjianUuidNumber() {
        return lingjianUuidNumber;
    }
    /**
	 * 设置：机电零件编号
	 */

    public void setLingjianUuidNumber(String lingjianUuidNumber) {
        this.lingjianUuidNumber = lingjianUuidNumber;
    }
    /**
	 * 获取：机电零件照片
	 */
    public String getLingjianPhoto() {
        return lingjianPhoto;
    }
    /**
	 * 设置：机电零件照片
	 */

    public void setLingjianPhoto(String lingjianPhoto) {
        this.lingjianPhoto = lingjianPhoto;
    }
    /**
	 * 获取：机电零件类型
	 */
    public Integer getLingjianTypes() {
        return lingjianTypes;
    }
    /**
	 * 设置：机电零件类型
	 */

    public void setLingjianTypes(Integer lingjianTypes) {
        this.lingjianTypes = lingjianTypes;
    }
    /**
	 * 获取：机电零件库存
	 */
    public Integer getLingjianKucunNumber() {
        return lingjianKucunNumber;
    }
    /**
	 * 设置：机电零件库存
	 */

    public void setLingjianKucunNumber(Integer lingjianKucunNumber) {
        this.lingjianKucunNumber = lingjianKucunNumber;
    }
    /**
	 * 获取：现价/积分
	 */
    public Double getLingjianNewMoney() {
        return lingjianNewMoney;
    }
    /**
	 * 设置：现价/积分
	 */

    public void setLingjianNewMoney(Double lingjianNewMoney) {
        this.lingjianNewMoney = lingjianNewMoney;
    }
    /**
	 * 获取：机电零件热度
	 */
    public Integer getLingjianClicknum() {
        return lingjianClicknum;
    }
    /**
	 * 设置：机电零件热度
	 */

    public void setLingjianClicknum(Integer lingjianClicknum) {
        this.lingjianClicknum = lingjianClicknum;
    }
    /**
	 * 获取：机电零件介绍
	 */
    public String getLingjianContent() {
        return lingjianContent;
    }
    /**
	 * 设置：机电零件介绍
	 */

    public void setLingjianContent(String lingjianContent) {
        this.lingjianContent = lingjianContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getLingjianDelete() {
        return lingjianDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setLingjianDelete(Integer lingjianDelete) {
        this.lingjianDelete = lingjianDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Lingjian{" +
            ", id=" + id +
            ", lingjianName=" + lingjianName +
            ", lingjianUuidNumber=" + lingjianUuidNumber +
            ", lingjianPhoto=" + lingjianPhoto +
            ", lingjianTypes=" + lingjianTypes +
            ", lingjianKucunNumber=" + lingjianKucunNumber +
            ", lingjianNewMoney=" + lingjianNewMoney +
            ", lingjianClicknum=" + lingjianClicknum +
            ", lingjianContent=" + lingjianContent +
            ", lingjianDelete=" + lingjianDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
