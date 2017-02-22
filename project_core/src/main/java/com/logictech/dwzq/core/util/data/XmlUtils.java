package com.logictech.dwzq.core.util.data;

import java.util.HashMap;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.logictech.dwzq.core.util.BaseUtils;

public final class XmlUtils extends BaseUtils {

    /**
     * @description 将xml字符串转换成map
     * @param xml
     * @return Map
     */
    public static Map<String, String> readStringXmlOut(String xml) {
        Map<String, String> map = new HashMap<String, String>();
        Document doc = null;
        try {
            doc = DocumentHelper.parseText(xml); // 将字符串转为XML

            Element rootElt = doc.getRootElement(); // 获取根节点

            // 获取根节点下的子节点MerID
            map.put("MerID", rootElt.elementTextTrim("MerID"));
            map.put("MerAccount", rootElt.elementTextTrim("MerAccount"));
            map.put("OrderID", rootElt.elementTextTrim("OrderID"));
            map.put("TranStat", rootElt.elementTextTrim("TranStat"));
            map.put("TranInfo", rootElt.elementTextTrim("TranInfo"));
            map.put("CardType", rootElt.elementTextTrim("CardType"));
            map.put("Value", rootElt.elementTextTrim("Value"));
            map.put("Command", rootElt.elementTextTrim("Command"));
            map.put("InterfaceName", rootElt.elementTextTrim("InterfaceName"));
            map.put("InterfaceNumber", rootElt.elementTextTrim("InterfaceNumber"));
            map.put("Datetime", rootElt.elementTextTrim("Datetime"));
            map.put("TranOrder", rootElt.elementTextTrim("TranOrder"));
            map.put("Attach", rootElt.elementTextTrim("Attach"));
            map.put("Sign", rootElt.elementTextTrim("Sign"));
        }
        catch (DocumentException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
