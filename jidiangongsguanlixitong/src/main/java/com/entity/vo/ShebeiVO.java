package com.entity.vo;

import com.entity.ShebeiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 机电设备
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shebei")
public class ShebeiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 机电设备名称
     */

    @TableField(value = "shebei_name")
    private String shebeiName;


    /**
     * 机电设备编号
     */

    @TableField(value = "shebei_uuid_number")
    private String shebeiUuidNumber;


    /**
     * 机电设备照片
     */

    @TableField(value = "shebei_photo")
    private String shebeiPhoto;


    /**
     * 机电设备类型
     */

    @TableField(value = "shebei_types")
    private Integer shebeiTypes;


    /**
     * 机电设备库存
     */

    @TableField(value = "shebei_kucun_number")
    private Integer shebeiKucunNumber;


    /**
     * 现价/积分
     */

    @TableField(value = "shebei_new_money")
    private Double shebeiNewMoney;


    /**
     * 机电设备热度
     */

    @TableField(value = "shebei_clicknum")
    private Integer shebeiClicknum;


    /**
     * 机电设备介绍
     */

    @TableField(value = "shebei_content")
    private String shebeiContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "shebei_delete")
    private Integer shebeiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：机电设备名称
	 */
    public String getShebeiName() {
        return shebeiName;
    }


    /**
	 * 获取：机电设备名称
	 */

    public void setShebeiName(String shebeiName) {
        this.shebeiName = shebeiName;
    }
    /**
	 * 设置：机电设备编号
	 */
    public String getShebeiUuidNumber() {
        return shebeiUuidNumber;
    }


    /**
	 * 获取：机电设备编号
	 */

    public void setShebeiUuidNumber(String shebeiUuidNumber) {
        this.shebeiUuidNumber = shebeiUuidNumber;
    }
    /**
	 * 设置：机电设备照片
	 */
    public String getShebeiPhoto() {
        return shebeiPhoto;
    }


    /**
	 * 获取：机电设备照片
	 */

    public void setShebeiPhoto(String shebeiPhoto) {
        this.shebeiPhoto = shebeiPhoto;
    }
    /**
	 * 设置：机电设备类型
	 */
    public Integer getShebeiTypes() {
        return shebeiTypes;
    }


    /**
	 * 获取：机电设备类型
	 */

    public void setShebeiTypes(Integer shebeiTypes) {
        this.shebeiTypes = shebeiTypes;
    }
    /**
	 * 设置：机电设备库存
	 */
    public Integer getShebeiKucunNumber() {
        return shebeiKucunNumber;
    }


    /**
	 * 获取：机电设备库存
	 */

    public void setShebeiKucunNumber(Integer shebeiKucunNumber) {
        this.shebeiKucunNumber = shebeiKucunNumber;
    }
    /**
	 * 设置：现价/积分
	 */
    public Double getShebeiNewMoney() {
        return shebeiNewMoney;
    }


    /**
	 * 获取：现价/积分
	 */

    public void setShebeiNewMoney(Double shebeiNewMoney) {
        this.shebeiNewMoney = shebeiNewMoney;
    }
    /**
	 * 设置：机电设备热度
	 */
    public Integer getShebeiClicknum() {
        return shebeiClicknum;
    }


    /**
	 * 获取：机电设备热度
	 */

    public void setShebeiClicknum(Integer shebeiClicknum) {
        this.shebeiClicknum = shebeiClicknum;
    }
    /**
	 * 设置：机电设备介绍
	 */
    public String getShebeiContent() {
        return shebeiContent;
    }


    /**
	 * 获取：机电设备介绍
	 */

    public void setShebeiContent(String shebeiContent) {
        this.shebeiContent = shebeiContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getShebeiDelete() {
        return shebeiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setShebeiDelete(Integer shebeiDelete) {
        this.shebeiDelete = shebeiDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
