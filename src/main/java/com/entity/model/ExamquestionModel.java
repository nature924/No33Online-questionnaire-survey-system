package com.entity.model;

import com.entity.ExamquestionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 题目表
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ExamquestionModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 所属问卷id（外键）
     */
    private Integer exampaperId;


    /**
     * 题目名称
     */
    private String examquestionName;


    /**
     * 选项
     */
    private String examquestionOptions;


    /**
     * 题目类型
     */
    private Integer examquestionTypes;


    /**
     * 题目排序，值越大排越前面
     */
    private Integer examquestionSequence;


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
	 * 获取：所属问卷id（外键）
	 */
    public Integer getExampaperId() {
        return exampaperId;
    }


    /**
	 * 设置：所属问卷id（外键）
	 */
    public void setExampaperId(Integer exampaperId) {
        this.exampaperId = exampaperId;
    }
    /**
	 * 获取：题目名称
	 */
    public String getExamquestionName() {
        return examquestionName;
    }


    /**
	 * 设置：题目名称
	 */
    public void setExamquestionName(String examquestionName) {
        this.examquestionName = examquestionName;
    }
    /**
	 * 获取：选项
	 */
    public String getExamquestionOptions() {
        return examquestionOptions;
    }


    /**
	 * 设置：选项
	 */
    public void setExamquestionOptions(String examquestionOptions) {
        this.examquestionOptions = examquestionOptions;
    }
    /**
	 * 获取：题目类型
	 */
    public Integer getExamquestionTypes() {
        return examquestionTypes;
    }


    /**
	 * 设置：题目类型
	 */
    public void setExamquestionTypes(Integer examquestionTypes) {
        this.examquestionTypes = examquestionTypes;
    }
    /**
	 * 获取：题目排序，值越大排越前面
	 */
    public Integer getExamquestionSequence() {
        return examquestionSequence;
    }


    /**
	 * 设置：题目排序，值越大排越前面
	 */
    public void setExamquestionSequence(Integer examquestionSequence) {
        this.examquestionSequence = examquestionSequence;
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
