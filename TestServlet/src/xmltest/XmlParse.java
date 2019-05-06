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
			//获取文档
			Document document=sReader.read(new File("./src/web.xml"));
			//获取根元素
			Element rElementl=document.getRootElement();
//			//获取某个元素下面的子元素的文本
//			String name=rElementl.element("display-name").getText();
//			System.out.println(name);
			//获取当前标签节点下的所有子节点
//			Iterator<Node> iterator=rElementl.element("filter").nodeIterator();
//			while (iterator.hasNext()) {
//				Node node =  iterator.next();
//				System.out.println(node.toString());
//			}
			
			
			//获取指定名称的属性值
			String value=rElementl.attributeValue("id");
			System.out.println(value);
			
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
