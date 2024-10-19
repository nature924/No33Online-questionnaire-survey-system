package com.entity.view;

import com.entity.ExamquestionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 题目表
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("examquestion")
public class ExamquestionView extends ExamquestionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 题目类型的值
		*/
		private String examquestionValue;



		//级联表 exampaper
			/**
			* 问卷名称
			*/
			private String exampaperName;
			/**
			* 时长(分钟)
			*/
			private Integer exampaperDate;
			/**
			* 问卷状态
			*/
			private Integer exampaperTypes;
				/**
				* 问卷状态的值
				*/
				private String exampaperValue;

	public ExamquestionView() {

	}

	public ExamquestionView(ExamquestionEntity examquestionEntity) {
		try {
			BeanUtils.copyProperties(this, examquestionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 题目类型的值
			*/
			public String getExamquestionValue() {
				return examquestionValue;
			}
			/**
			* 设置： 题目类型的值
			*/
			public void setExamquestionValue(String examquestionValue) {
				this.examquestionValue = examquestionValue;
			}






				//级联表的get和set exampaper
					/**
					* 获取： 问卷名称
					*/
					public String getExampaperName() {
						return exampaperName;
					}
					/**
					* 设置： 问卷名称
					*/
					public void setExampaperName(String exampaperName) {
						this.exampaperName = exampaperName;
					}
					/**
					* 获取： 时长(分钟)
					*/
					public Integer getExampaperDate() {
						return exampaperDate;
					}
					/**
					* 设置： 时长(分钟)
					*/
					public void setExampaperDate(Integer exampaperDate) {
						this.exampaperDate = exampaperDate;
					}
					/**
					* 获取： 问卷状态
					*/
					public Integer getExampaperTypes() {
						return exampaperTypes;
					}
					/**
					* 设置： 问卷状态
					*/
					public void setExampaperTypes(Integer exampaperTypes) {
						this.exampaperTypes = exampaperTypes;
					}


						/**
						* 获取： 问卷状态的值
						*/
						public String getExampaperValue() {
							return exampaperValue;
						}
						/**
						* 设置： 问卷状态的值
						*/
						public void setExampaperValue(String exampaperValue) {
							this.exampaperValue = exampaperValue;
						}












}
