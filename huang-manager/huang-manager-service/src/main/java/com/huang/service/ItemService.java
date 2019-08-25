package com.huang.service;

import com.huang.pojo.TbItem;

/**
 *
 *@author	黄远志
 *@date		2019年6月24日下午10:51:28
 *@GitHub	https://github.com/huangyuanzhi1997
 */
public interface ItemService {
	TbItem getItemById(long itemId);
/*	EUDataGridResult getItemList(int page, int rows);
	TaotaoResult createItem(TbItem item, String desc, String itemParam) throws Exception;*/

}
