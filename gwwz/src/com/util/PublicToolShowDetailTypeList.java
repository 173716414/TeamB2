package com.util;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.GoodsTypeDAO;

import com.dao.GoodsTypeDetailInfoDAO;
import com.entity.PageModel;

public class PublicToolShowDetailTypeList {
	
public static void searchDetailType(HttpServletRequest request, HttpServletResponse response,String currentPage,String key){
	
	
	GoodsTypeDAO gtdao = new GoodsTypeDAO();

	int sumCount = gtdao.getSumSearchGoodsTypeCount(key);
	//���÷�ҳPageModel����
	PageModel pm = PublicToolPageModel.getPageInfo(request, sumCount,10,currentPage);
		
	//��ѯ���е���Ʒ��Ϣ		
	ArrayList<Object>  goodsTypeList = gtdao.searchGoodsType(pm, key);
	request.setAttribute("goodsTypeList",goodsTypeList);
}
	
	
	//��ʾ�ӷ���
	public static void showDetailTypeList(HttpServletRequest request, HttpServletResponse response,String currentPage,int typeid){
			
			
		GoodsTypeDetailInfoDAO gtdao = new GoodsTypeDetailInfoDAO();
			
			int sumCount = gtdao.getTypeDetailCount(typeid);
	
			//���÷�ҳPageModel����
			PageModel pm = PublicToolPageModel.getPageInfo(request, sumCount,10,currentPage);
				
			//GoodsTypeDAO gtddao = new GoodsTypeDAO();
			//��ѯ���е���Ʒ��Ϣ		
			ArrayList<Object>  goodsTypeList = gtdao.getPageDetailModel(pm,typeid);
			request.setAttribute("goodsTypeList",goodsTypeList);
	
		}
	
	
	//ǰ̨��ʾ�ӷ���˵���
	public static void showDetailallTypeList(HttpServletRequest request, HttpServletResponse response,int typeid){
			
			
		GoodsTypeDetailInfoDAO gtdao = new GoodsTypeDetailInfoDAO();
			
			//int sumCount = gtdao.getTypeDetailCount(typeid);
	
			//���÷�ҳPageModel����
		//	PageModel pm = PublicToolPageModel.getPageInfo(request, sumCount,10,currentPage);
				
			//GoodsTypeDAO gtddao = new GoodsTypeDAO();
			//��ѯ���е���Ʒ��Ϣ		
			ArrayList<Object>  goodsDetailallTypeList = gtdao.getallDetailModel(typeid);
			request.setAttribute("goodsDetailallTypeList",goodsDetailallTypeList);
	
		}

}
