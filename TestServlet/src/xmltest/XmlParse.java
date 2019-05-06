package xmltest;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;


public class XmlParse {
	
	public static void main(String[] args) {
		SAXReader sReader=new SAXReader();
		try {
			//��ȡ�ĵ�
			Document document=sReader.read(new File("./src/web.xml"));
			//��ȡ��Ԫ��
			Element rElementl=document.getRootElement();
//			//��ȡĳ��Ԫ���������Ԫ�ص��ı�
//			String name=rElementl.element("display-name").getText();
//			System.out.println(name);
			//��ȡ��ǰ��ǩ�ڵ��µ������ӽڵ�
//			Iterator<Node> iterator=rElementl.element("filter").nodeIterator();
//			while (iterator.hasNext()) {
//				Node node =  iterator.next();
//				System.out.println(node.toString());
//			}
			
			
			//��ȡָ�����Ƶ�����ֵ
			String value=rElementl.attributeValue("id");
			System.out.println(value);
			
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
