/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2024-11-30 20:12:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.web.WebEditors;
import org.openxava.view.View;
import org.openxava.tab.Tab;
import org.openxava.util.XavaPreferences;
import org.openxava.util.XavaResources;
import org.openxava.model.meta.MetaProperty;
import org.openxava.web.Ids;
import org.openxava.web.Collections;

public final class collectionFrameHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/xava/imports.jsp", Long.valueOf(1676682592000L));
    _jspx_dependants.put("jar:file:/C:/Users/user/GitRepositories/OpenXavaVSCODE/chauchisoft/target/chauchisoft/WEB-INF/lib/jstl-1.2.jar!/META-INF/c-1_0.tld", Long.valueOf(1153403082000L));
    _jspx_dependants.put("jar:file:/C:/Users/user/GitRepositories/OpenXavaVSCODE/chauchisoft/target/chauchisoft/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1153403082000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1728667757545L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1676682592000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.openxava.model.meta.MetaProperty");
    _jspx_imports_classes.add("org.openxava.util.XavaPreferences");
    _jspx_imports_classes.add("org.openxava.view.View");
    _jspx_imports_classes.add("org.openxava.tab.Tab");
    _jspx_imports_classes.add("org.openxava.util.XavaResources");
    _jspx_imports_classes.add("org.openxava.web.Collections");
    _jspx_imports_classes.add("org.openxava.web.WebEditors");
    _jspx_imports_classes.add("org.openxava.web.Ids");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.openxava.util.Messages errors = null;
      errors = (org.openxava.util.Messages) _jspx_page_context.getAttribute("errors", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (errors == null){
        errors = new org.openxava.util.Messages();
        _jspx_page_context.setAttribute("errors", errors, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String collectionName = request.getParameter("collectionName");
String viewObject = request.getParameter("viewObject");
View view = (View) context.get(request, viewObject);
View collectionView = view.getSubview(collectionName);
String viewName = viewObject + "_" + collectionName;
String frameId = Ids.decorate(request, "frame_" + view.getPropertyPrefix() + collectionName);
String hiddenStyle = view.isFrameClosed(frameId)?"":"style='display: none'";
if (!collectionView.isCollectionFromModel()) {
	Tab tab = collectionView.getCollectionTab();
	if (request.getAttribute(Tab.TAB_RESETED_PREFIX + tab) == null) {
		String collectionId = Collections.id(request, collectionName);
		String tabObject = Collections.tabObject(collectionId);
		tab.setTabObject(tabObject);		
		tab.setRequest(request);  
		tab.setConditionParameters(); 
		tab.reset();
		request.setAttribute(Tab.TAB_RESETED_PREFIX + tab, Boolean.TRUE);
	}
}

      out.write("\n");
      out.write("<span ");
      out.print(hiddenStyle);
      out.write('>');
      out.write('\n');
      out.write('(');
      out.print(collectionView.getCollectionSize());
      out.write(')');
      out.write('\n');

	if (collectionView.isCollectionEditable()) {

      out.write('\n');
      //  xava:image
      org.openxava.web.taglib.ImageTag _jspx_th_xava_005fimage_005f0 = (org.openxava.web.taglib.ImageTag) _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ImageTag.class);
      boolean _jspx_th_xava_005fimage_005f0_reused = false;
      try {
        _jspx_th_xava_005fimage_005f0.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fimage_005f0.setParent(null);
        // /xava/collectionFrameHeader.jsp(42,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_xava_005fimage_005f0.setAction(collectionView.getNewCollectionElementAction());
        // /xava/collectionFrameHeader.jsp(42,0) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_xava_005fimage_005f0.setArgv("viewObject="+viewName);
        int _jspx_eval_xava_005fimage_005f0 = _jspx_th_xava_005fimage_005f0.doStartTag();
        if (_jspx_th_xava_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f0);
        _jspx_th_xava_005fimage_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fimage_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005fimage_005f0_reused);
      }
      out.write('\n');

	}

      out.write("\n");
      out.write("</span>\n");
      out.write("<span class=\"");
      out.print(style.getFrameTotals());
      out.write('"');
      out.write(' ');
      out.print(hiddenStyle);
      out.write('>');
      out.write('\n');

	int totalRows = collectionView.getCollectionTotalsCount();
int totalColumns = collectionView.getMetaPropertiesList().size();
for (int row=0; row<totalRows; row++) {	
	for (int column=0; column<totalColumns; column++) {
		if (collectionView.hasCollectionTotal(row, column)) {
	MetaProperty p = (MetaProperty) collectionView.getMetaPropertiesList().get(column);
	String ftotal = WebEditors.format(request, p, collectionView.getCollectionTotal(row, column), errors, view.getViewName(), true);

      out.write("\n");
      out.write("	&nbsp;&nbsp;				\n");
      out.write("	<span class=\"");
      out.print(style.getFrameTotalsLabel());
      out.write('"');
      out.write('>');
      out.print(collectionView.getCollectionTotalLabel(row, column));
      out.write(":</span>\n");
      out.write("	<span class=\"");
      out.print(style.getFrameTotalsValue());
      out.write('"');
      out.write('>');
      out.print(ftotal);
      out.write("</span>\n");

	}
	}
}

if (!collectionView.isCollectionFromModel() && XavaPreferences.getInstance().isSummationInList()) {
	Tab tab = collectionView.getCollectionTab();
	int totalTabColumns = tab.getMetaProperties().size();
	for (int column=0; column<totalTabColumns; column++) {
		if (!tab.isFixedTotal(column) && tab.hasTotal(column)) {
	MetaProperty p = tab.getMetaProperty(column);
	String ftotal = WebEditors.format(request, p, tab.getTotal(column), errors, view.getViewName(), true);
	String label = XavaResources.getString(request, "sum_of", p.getLabel());

      out.write("\n");
      out.write("	&nbsp;&nbsp;				\n");
      out.write("	<span class=\"");
      out.print(style.getFrameTotalsLabel());
      out.write('"');
      out.write('>');
      out.print(label);
      out.write(":</span>\n");
      out.write("	<span class=\"");
      out.print(style.getFrameTotalsValue());
      out.write('"');
      out.write('>');
      out.print(ftotal);
      out.write("</span>\n");
									
		}
	}
}

      out.write("\n");
      out.write("</span>\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
