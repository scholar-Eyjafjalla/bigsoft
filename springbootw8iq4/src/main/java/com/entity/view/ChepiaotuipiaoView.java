package com.entity.view;

import com.entity.ChepiaotuipiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车票退票
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-05 15:26:04
 */
@TableName("chepiaotuipiao")
public class ChepiaotuipiaoView  extends ChepiaotuipiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChepiaotuipiaoView(){
	}
 
 	public ChepiaotuipiaoView(ChepiaotuipiaoEntity chepiaotuipiaoEntity){
 	try {
			BeanUtils.copyProperties(this, chepiaotuipiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
