package org.apache.jsp.etiketDosyalariOrnek2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class etiketDosyalariniKullananSayfamiz2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tags/tagdosyasi2.tagx");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>");
      out.write("<head>");
      out.write("<title>");
      out.write(" Tag Files (Etiket Dosyaları) 2  .jsp ve .tagx ");
      out.write("</title>");
      out.write("</head>");
      out.write("<body>");
      out.write("Güzel gören güzel düşünür,");
      if (_jspx_meth_t_tagdosyasi2_0(_jspx_page_context))
        return;
      out.write("</body>");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_t_tagdosyasi2_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tagdosyasi2
    org.apache.jsp.tag.web.tagdosyasi2_tagx _jspx_th_t_tagdosyasi2_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.tagdosyasi2_tagx.class) : new org.apache.jsp.tag.web.tagdosyasi2_tagx();
    _jspx_th_t_tagdosyasi2_0.setJspContext(_jspx_page_context);
    _jspx_th_t_tagdosyasi2_0.setMessage(" güzel düşünen hayatından lezzet alır.");
    _jspx_th_t_tagdosyasi2_0.doTag();
    return false;
  }
}
