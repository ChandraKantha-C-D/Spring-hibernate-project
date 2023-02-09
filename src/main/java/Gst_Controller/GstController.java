package Gst_Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gst_dto.DeliGst;
import gst_dto.Goodsrevice;
import gst_dto.KarGst;
import gst_dto.TnGst;
import spring_dto.Cow;

public class GstController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("gst.xml");
		Goodsrevice g = context.getBean("dgst",DeliGst.class);
		g.gstcalci();
		
	}

}
