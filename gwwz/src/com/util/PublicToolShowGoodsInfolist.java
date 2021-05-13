package com.util;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.GoodsInfoDAO;
import com.entity.PageModel;

public class PublicToolShowGoodsInfolist {
		
public static void searchGoodsInfo(HttpServletRequest request, HttpServletResponse response,String currentPage,String key){
	
	
	GoodsInfoDAO gdao = new GoodsInfoDAO();
	

	int sumCount = gdao.getSearchSumGoodsCount(key);
	
	//���÷�ҳPageModel����
	PageModel pm = PublicToolPageModel.getPageInfo(request, sumCount,10,currentPage);
		
	//��ѯ���е���Ʒ��Ϣ		
	ArrayList<Object>  goodsInfoList = gdao.searchProductPageModel(pm, key);
	request.setAttribute("goodsInfoList", goodsInfoList);
}
	//ǰ̨����ʾ�����б� 
public static void searchGoodsInfoweb(HttpServletRequest request, HttpServletResponse response,String currentPage,String key,String order){
	
	
	GoodsInfoDAO gdao = new GoodsInfoDAO();
	

	int sumCount = gdao.getSearchSumGoodsCount(key);
	
	//���÷�ҳPageModel����
	PageModel pm = PublicToolPageModel.getPageInfo(request, sumCount,10,currentPage);
		
	//��ѯ���е���Ʒ��Ϣ		
	ArrayList<Object>  goodsInfoList = gdao.searchProductPageModelweb(pm, key,order);
	request.setAttribute("goodsInfoList", goodsInfoList);
}

	//ǰ̨����ʾ�����б� 
public static void typelistGoodsInfoweb(HttpServletRequest request, HttpServletResponse response,String currentPage,String typeid,String order){
	
	
	GoodsInfoDAO gdao = new GoodsInfoDAO();
	

	int sumCount = gdao.gettypelistGoodsCount(typeid);
	
	//���÷�ҳPageModel����
	PageModel pm = PublicToolPageModel.getPageInfo(request, sumCount,10,currentPage);
		
	//��ѯ���е���Ʒ��Ϣ		
	
	ArrayList<Object>  goodsInfoList = gdao.typelistProductPageModelweb(pm, typeid,order);
	request.setAttribute("goodsInfoList", goodsInfoList);
}
	
	
	
	
	public static void showGoodsInfoList(HttpServletRequest request, HttpServletResponse response,String currentPage){
			
		
			GoodsInfoDAO gdao = new GoodsInfoDAO();
			
			int sumCount = gdao.getSumGoodsCount();
	
			//���÷�ҳPageModel����
			PageModel pm = PublicToolPageModel.getPageInfo(request, sumCount,10,currentPage);
				
			//��ѯ���е���Ʒ��Ϣ		
			ArrayList<Object>  goodsInfoList = gdao.getPageModelOfAllGoods(pm);
			request.setAttribute("goodsInfoList", goodsInfoList);
	
		}

public static void searchGoodsInfoforthirdId(HttpServletRequest request, HttpServletResponse response,String currentPage,String key,String thirdId){
	
	
	GoodsInfoDAO gdao = new GoodsInfoDAO();
	

	int sumCount = gdao.getSearchSumGoodsCountforthirdId(key,thirdId);
	
	//���÷�ҳPageModel����
	PageModel pm = PublicToolPageModel.getPageInfo(request, sumCount,10,currentPage);
		
	//��ѯ���е���Ʒ��Ϣ		
	ArrayList<Object>  goodsInfoList = gdao.searchProductPageModelforthirdId(pm, key,thirdId);
	request.setAttribute("goodsInfoList", goodsInfoList);
}



	public static void showGoodsInfoListforthirdId(HttpServletRequest request, HttpServletResponse response,String currentPage,String thirdId){
			
		
			GoodsInfoDAO gdao = new GoodsInfoDAO();
			
			int sumCount = gdao.getSumGoodsCountforthirdId(thirdId);
	
			//���÷�ҳPageModel����
			PageModel pm = PublicToolPageModel.getPageInfo(request, sumCount,10,currentPage);
				
			//��ѯ���е���Ʒ��Ϣ		
			ArrayList<Object>  goodsInfoList = gdao.getPageModelOfAllGoodsforthirdId(pm,thirdId);
			request.setAttribute("goodsInfoList", goodsInfoList);
	
		}
	
	
}
