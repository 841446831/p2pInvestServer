package com.android.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.android.entity.Notice;
import com.android.entity.Product;
import com.android.service.NoticeService;
import com.android.service.ProductService;

@Controller
public class ProductController {
	
	
	@Resource
    private ProductService productService;
	@Resource
	private NoticeService noticeService;
	
	
	@RequestMapping("home")
	@ResponseBody
	public String homeList(){
		System.out.println("进入");
		Product product = productService.selectByMax();
		System.out.println(product);
		List<Notice> notice = noticeService.selectAll();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("product", product);
		
		map.put("notice", notice);
		
		return JSON.toJSONString(map);
	}
	@RequestMapping("product")
	@ResponseBody
	public String productList(){
		System.out.println("进入");
		List<Product> product = productService.selectAllByOrder();

		
		
		return JSON.toJSONString(product);
	}
	
}
