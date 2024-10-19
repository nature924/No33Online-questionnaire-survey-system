package com.entity.model;

import com.entity.ExamredetailsEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 答题详情表
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ExamredetailsModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 问卷编号
     */
    private String examredetailsUuidNumber;


    /**
     * 用户id
     */
    private Integer yonghuId;


    /**
     * 题目id（外键）
     */
    private Integer examquestionId;


    /**
     * 用户选项
     */
    private String examredetailsMyanswer;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：问卷编号
	 */
    public String getExamredetailsUuidNumber() {
        return examredetailsUuidNumber;
    }


    /**
	 * 设置：问卷编号
	 */
    public void setExamredetailsUuidNumber(String examredetailsUuidNumber) {
        this.examredetailsUuidNumber = examredetailsUuidNumber;
    }
    /**
	 * 获取：用户id
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户id
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：题目id（外键）
	 */
    public Integer getExamquestionId() {
        return examquestionId;
    }


    /**
	 * 设置：题目id（外键）
	 */
    public void setExamquestionId(Integer examquestionId) {
        this.examquestionId = examquestionId;
    }
    /**
	 * 获取：用户选项
	 */
    public String getExamredetailsMyanswer() {
        return examredetailsMyanswer;
    }


    /**
	 * 设置：用户选项
	 */
    public void setExamredetailsMyanswer(String examredetailsMyanswer) {
        this.examredetailsMyanswer = examredetailsMyanswer;
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

    }
