<%@ page import="org.opencms.jsp.CmsJspActionElement" %>
<%@ page import="org.opencms.file.CmsObject" %>
<%@ page import="org.opencms.xml.content.CmsXmlContentFactory" %>
<%@ page import="org.opencms.xml.content.CmsXmlContent" %>
<%@ page import="org.opencms.xml.CmsXmlContentDefinition" %>
<%@ page import="org.opencms.main.OpenCms" %>
<%@ page import="org.opencms.xml.types.I_CmsXmlContentValue" %>
<%@ page import="java.util.Locale" %>
<%@ page import="org.opencms.file.CmsProperty" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.opencms.file.CmsPropertyDefinition" %>
<%@ page import="org.opencms.file.types.I_CmsResourceType" %>
<%@ page import="org.opencms.i18n.CmsEncoder" %>
<%@ page import="org.opencms.file.CmsResource" %>
<%@page buffer="none" session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="cms" uri="http://www.opencms.org/taglib/cms"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%
    CmsJspActionElement jsp = new CmsJspActionElement(pageContext, request, response);
    CmsObject cmso = jsp.getCmsObject();
    Locale locale = cmso.getRequestContext().getLocale();
    String schemas = "/system/modules/com.timsdt.core/schemas/xtest.xsd";
    I_CmsResourceType resourceType;
    String resouceName = "/sites/x-test/abc.xml";
    try {
        resourceType = OpenCms.getResourceManager().getResourceType("xtest");
        CmsXmlContentDefinition contentDefinition = CmsXmlContentDefinition.unmarshal(cmso, schemas);
        CmsXmlContent xmlContent = CmsXmlContentFactory.createDocument(cmso,
                cmso.getRequestContext().getLocale(),
                OpenCms.getSystemInfo().getDefaultEncoding(),
                contentDefinition);


        //add data to fields
        I_CmsXmlContentValue Title = xmlContent.getValue("Title", locale);
        if (Title == null) {
            Title = xmlContent.addValue(cmso, "Title", locale, 0);
        }
        Title.setStringValue(cmso, "Test Val");
        I_CmsXmlContentValue Text = xmlContent.getValue("Text", locale);
        if (Text == null) {
            Text = xmlContent.addValue(cmso, "Text", locale, 0);
        }
        Text.setStringValue(cmso, "Test Text");


        //update properties
        List<CmsProperty> properties = new ArrayList<>(2);
        CmsProperty prop = new CmsProperty();
        prop.setName(CmsPropertyDefinition.PROPERTY_TITLE);
        prop.setValue("Test val for title", CmsProperty.TYPE_INDIVIDUAL);
        properties.add(prop);

        prop = new CmsProperty();
        prop.setName(CmsPropertyDefinition.PROPERTY_DESCRIPTION);
        prop.setValue("Test val for description", CmsProperty.TYPE_INDIVIDUAL);
        properties.add(prop);

        String decodedContent = xmlContent.toString();
        System.out.println(decodedContent);
        CmsResource resource = cmso.createResource(resouceName, resourceType, decodedContent.getBytes(
                        CmsEncoder.lookupEncoding("UTF-8", "UTF-8")),
                properties);

    } catch (Exception e) {
        e.printStackTrace();
    }
%>