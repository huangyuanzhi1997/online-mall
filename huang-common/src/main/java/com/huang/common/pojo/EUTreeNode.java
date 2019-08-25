package com.huang.common.pojo;
/**
 * easyUI树形控件节点格式
 *@author	黄远志
 *@date		2019年6月24日下午11:35:19
 *@GitHub	https://github.com/huangyuanzhi1997
 */
public class EUTreeNode {

	private long id;
	private String text;
	private String state;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
