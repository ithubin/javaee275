package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;

@RestController
public class ItemController {
	
	//注入service接口代理对象
	@Autowired
	private ItemService itemService;
	
	/**
	 * 需求:根据商品id查询商品
	 * 参数:Long itemId
	 * 返回值:json格式TbItem
	 */
	@RequestMapping("item/{itemId}")
	public TbItem findItemByID(@PathVariable Long itemId){
		//调用service服务方法
		TbItem item = itemService.findItemByID(itemId);
		return item;
		
	}
}
