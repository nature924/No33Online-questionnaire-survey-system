package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 问卷表
 *
 * @author 
 * @email
 */
@TableName("exampaper")
public class ExampaperEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ExampaperEntity() {

	}

	public ExampaperEntity(T t) {
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
    @TableField(value = "id")

    private Integer id;


    /**
     * 问卷名称
     */
    @TableField(value = "exampaper_name")

    private String exampaperName;


    /**
     * 时长(分钟)
     */
    @TableField(value = "exampaper_date")

    private Integer exampaperDate;


    /**
     * 问卷状态
     */
    @TableField(value = "exampaper_types")

    private Integer exampaperTypes;

    /**
     * 结束语
     */
    @TableField(value = "exampaper_jieshuyu")

    private String exampaperJieshuyu;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;



    public String getExampaperJieshuyu() {
        return exampaperJieshuyu;
    }

    public void setExampaperJieshuyu(String exampaperJieshuyu) {
        this.exampaperJieshuyu = exampaperJieshuyu;
    }

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
	 * 设置：问卷名称
	 */
    public String getExampaperName() {
        return exampaperName;
    }


    /**
	 * 获取：问卷名称
	 */

    public void setExampaperName(String exampaperName) {
        this.exampaperName = exampaperName;
    }
    /**
	 * 设置：时长(分钟)
	 */
    public Integer getExampaperDate() {
        return exampaperDate;
    }


    /**
	 * 获取：时长(分钟)
	 */

    public void setExampaperDate(Integer exampaperDate) {
        this.exampaperDate = exampaperDate;
    }
    /**
	 * 设置：问卷状态
	 */
    public Integer getExampaperTypes() {
        return exampaperTypes;
    }


    /**
	 * 获取：问卷状态
	 */

    public void setExampaperTypes(Integer exampaperTypes) {
        this.exampaperTypes = exampaperTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Exampaper{" +
            "id=" + id +
            ", exampaperName=" + exampaperName +
            ", exampaperDate=" + exampaperDate +
            ", exampaperTypes=" + exampaperTypes +
            ", createTime=" + createTime +
        "}";
    }
}
