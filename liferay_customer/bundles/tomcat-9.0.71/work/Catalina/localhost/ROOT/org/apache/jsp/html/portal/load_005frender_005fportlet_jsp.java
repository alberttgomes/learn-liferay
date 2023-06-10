/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat9
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.html.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.exportimport.kernel.staging.LayoutStagingUtil;
import com.liferay.exportimport.kernel.staging.StagingUtil;
import com.liferay.layout.seo.kernel.LayoutSEOLink;
import com.liferay.layout.seo.kernel.LayoutSEOLinkManager;
import com.liferay.layout.seo.kernel.LayoutSEOLinkManagerUtil;
import com.liferay.petra.string.CharPool;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.bean.BeanParamUtil;
import com.liferay.portal.kernel.bean.BeanPropertiesUtil;
import com.liferay.portal.kernel.cal.Recurrence;
import com.liferay.portal.kernel.configuration.Filter;
import com.liferay.portal.kernel.cookies.CookiesManagerUtil;
import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.dao.search.ResultRowSplitter;
import com.liferay.portal.kernel.dao.search.RowChecker;
import com.liferay.portal.kernel.dao.search.RowMover;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.LocalizedException;
import com.liferay.portal.kernel.exception.NoSuchLayoutException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.language.LanguageWrapper;
import com.liferay.portal.kernel.language.UnicodeLanguageUtil;
import com.liferay.portal.kernel.layoutconfiguration.util.RuntimePageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.log.LogUtil;
import com.liferay.portal.kernel.model.*;
import com.liferay.portal.kernel.model.impl.*;
import com.liferay.portal.kernel.model.impl.VirtualLayout;
import com.liferay.portal.kernel.portlet.InvokerPortlet;
import com.liferay.portal.kernel.portlet.LiferayHeaderRequest;
import com.liferay.portal.kernel.portlet.LiferayHeaderResponse;
import com.liferay.portal.kernel.portlet.LiferayPortletMode;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;
import com.liferay.portal.kernel.portlet.LiferayRenderRequest;
import com.liferay.portal.kernel.portlet.LiferayRenderResponse;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.PortletConfigFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletInstanceFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletProvider;
import com.liferay.portal.kernel.portlet.PortletProviderUtil;
import com.liferay.portal.kernel.portlet.PortletSetupUtil;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletURLUtil;
import com.liferay.portal.kernel.portletdisplaytemplate.PortletDisplayTemplateManagerUtil;
import com.liferay.portal.kernel.security.auth.AuthTokenUtil;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.ResourceActionsUtil;
import com.liferay.portal.kernel.service.*;
import com.liferay.portal.kernel.service.permission.GroupPermissionUtil;
import com.liferay.portal.kernel.service.permission.LayoutPermissionUtil;
import com.liferay.portal.kernel.service.permission.PortletPermissionUtil;
import com.liferay.portal.kernel.service.permission.RolePermissionUtil;
import com.liferay.portal.kernel.servlet.BrowserSnifferUtil;
import com.liferay.portal.kernel.servlet.BufferCacheServletResponse;
import com.liferay.portal.kernel.servlet.MultiSessionMessages;
import com.liferay.portal.kernel.servlet.PortalMessages;
import com.liferay.portal.kernel.servlet.PortalWebResourceConstants;
import com.liferay.portal.kernel.servlet.PortalWebResourcesUtil;
import com.liferay.portal.kernel.servlet.ServletContextPool;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.servlet.taglib.ui.MenuItem;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.FastDateFormatConstants;
import com.liferay.portal.kernel.util.FastDateFormatFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlParserUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.HttpComponentsUtil;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.KeyValuePair;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.PortletKeys;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.ReleaseInfo;
import com.liferay.portal.kernel.util.ServerDetector;
import com.liferay.portal.kernel.util.SessionClicks;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.TextFormatter;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.kernel.util.TimeZoneUtil;
import com.liferay.portal.kernel.util.URLCodec;
import com.liferay.portal.kernel.util.UnicodeFormatter;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.impl.*;
import com.liferay.portal.plugin.PluginUtil;
import com.liferay.portal.security.sso.SSOUtil;
import com.liferay.portal.service.*;
import com.liferay.portal.struts.Definition;
import com.liferay.portal.struts.StrutsUtil;
import com.liferay.portal.struts.TilesUtil;
import com.liferay.portal.util.PropsUtil;
import com.liferay.portal.util.PropsValues;
import com.liferay.portal.util.ShutdownUtil;
import com.liferay.portlet.HeaderRequestFactory;
import com.liferay.portlet.HeaderResponseFactory;
import com.liferay.portlet.LiferayPortletUtil;
import com.liferay.portlet.RenderParametersPool;
import com.liferay.portlet.RenderRequestFactory;
import com.liferay.portlet.RenderResponseFactory;
import com.liferay.portlet.configuration.kernel.util.PortletConfigurationUtil;
import com.liferay.sites.kernel.util.Sites;
import com.liferay.taglib.search.ResultRow;
import com.liferay.taglib.search.SearchEntry;
import com.liferay.taglib.search.TextSearchEntry;
import com.liferay.taglib.util.OutputTag;
import com.liferay.users.admin.kernel.util.UsersAdmin;
import com.liferay.users.admin.kernel.util.UsersAdminUtil;
import java.text.DateFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;
import javax.portlet.MimeResponse;
import javax.portlet.MutableRenderParameters;
import javax.portlet.PortletConfig;
import javax.portlet.PortletContext;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.portlet.ResourceURL;
import javax.portlet.UnavailableException;
import javax.portlet.WindowState;
import com.liferay.admin.kernel.util.PortalProductMenuApplicationType;
import com.liferay.exportimport.kernel.lar.DefaultConfigurationPortletDataHandler;
import com.liferay.layout.utility.page.kernel.LayoutUtilityPageEntryViewRenderer;
import com.liferay.layout.utility.page.kernel.LayoutUtilityPageEntryViewRendererRegistryUtil;
import com.liferay.layout.utility.page.kernel.constants.LayoutUtilityPageEntryConstants;
import com.liferay.portal.kernel.cluster.ClusterExecutorUtil;
import com.liferay.portal.kernel.cluster.ClusterNode;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.db.DBType;
import com.liferay.portal.kernel.exception.LayoutPermissionException;
import com.liferay.portal.kernel.exception.PortletActiveException;
import com.liferay.portal.kernel.exception.RequiredLayoutException;
import com.liferay.portal.kernel.exception.RequiredRoleException;
import com.liferay.portal.kernel.exception.UserActiveException;
import com.liferay.portal.kernel.exception.UserEmailAddressException;
import com.liferay.portal.kernel.exception.UserLockoutException;
import com.liferay.portal.kernel.exception.UserPasswordException;
import com.liferay.portal.kernel.exception.UserReminderQueryException;
import com.liferay.portal.kernel.license.util.LicenseManagerUtil;
import com.liferay.portal.kernel.portlet.PortletConfigurationLayoutUtil;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.kernel.util.ClassUtil;
import com.liferay.portal.kernel.util.ProgressTracker;
import com.liferay.portal.setup.SetupWizardUtil;
import com.liferay.portal.util.LicenseUtil;
import com.liferay.portal.util.MaintenanceUtil;
import com.liferay.portlet.configuration.kernel.util.PortletConfigurationApplicationType;

public final class load_005frender_005fportlet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/html/common/init.jsp", Long.valueOf(1679010335000L));
    _jspx_dependants.put("/html/common/init-ext.jsp", Long.valueOf(1679010335000L));
    _jspx_dependants.put("/html/portal/init.jsp", Long.valueOf(1679010335000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("com.liferay.portal.kernel.model.impl");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.liferay.portal.kernel.model");
    _jspx_imports_packages.add("com.liferay.portal.model.impl");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.liferay.portal.kernel.service");
    _jspx_imports_packages.add("com.liferay.portal.service");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.PrefsPropsUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.ContentTypes");
    _jspx_imports_classes.add("com.liferay.portlet.RenderRequestFactory");
    _jspx_imports_classes.add("java.util.Arrays");
    _jspx_imports_classes.add("java.text.Format");
    _jspx_imports_classes.add("com.liferay.portal.kernel.dao.search.RowMover");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.PortalMessages");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.WebKeys");
    _jspx_imports_classes.add("com.liferay.exportimport.kernel.lar.DefaultConfigurationPortletDataHandler");
    _jspx_imports_classes.add("com.liferay.portal.kernel.workflow.WorkflowConstants");
    _jspx_imports_classes.add("com.liferay.portal.kernel.service.permission.RolePermissionUtil");
    _jspx_imports_classes.add("com.liferay.portal.util.PropsUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.security.auth.PrincipalException");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("com.liferay.portal.kernel.exception.UserReminderQueryException");
    _jspx_imports_classes.add("com.liferay.taglib.util.OutputTag");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.PropsKeys");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.GetterUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.LiferayWindowState");
    _jspx_imports_classes.add("com.liferay.users.admin.kernel.util.UsersAdminUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.CalendarUtil");
    _jspx_imports_classes.add("javax.portlet.PortletContext");
    _jspx_imports_classes.add("com.liferay.portal.kernel.log.LogFactoryUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.ServletContextPool");
    _jspx_imports_classes.add("com.liferay.portal.kernel.cluster.ClusterNode");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.InvokerPortlet");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.SessionClicks");
    _jspx_imports_classes.add("java.util.Set");
    _jspx_imports_classes.add("com.liferay.portal.util.PropsValues");
    _jspx_imports_classes.add("javax.portlet.PortletConfig");
    _jspx_imports_classes.add("com.liferay.portal.kernel.exception.RequiredLayoutException");
    _jspx_imports_classes.add("com.liferay.portal.kernel.license.util.LicenseManagerUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.language.LanguageUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.LiferayRenderResponse");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.JavaConstants");
    _jspx_imports_classes.add("com.liferay.taglib.search.TextSearchEntry");
    _jspx_imports_classes.add("com.liferay.portlet.HeaderResponseFactory");
    _jspx_imports_classes.add("com.liferay.portlet.LiferayPortletUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.PortletProviderUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.HashMapBuilder");
    _jspx_imports_classes.add("com.liferay.petra.string.StringPool");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.PortletURLUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.HttpHeaders");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.LiferayPortletURL");
    _jspx_imports_classes.add("com.liferay.layout.utility.page.kernel.LayoutUtilityPageEntryViewRenderer");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.URLCodec");
    _jspx_imports_classes.add("com.liferay.portal.setup.SetupWizardUtil");
    _jspx_imports_classes.add("com.liferay.portal.plugin.PluginUtil");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("javax.portlet.MimeResponse");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil");
    _jspx_imports_classes.add("java.text.NumberFormat");
    _jspx_imports_classes.add("java.util.TreeSet");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.FastDateFormatConstants");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("com.liferay.portal.kernel.dao.db.DBType");
    _jspx_imports_classes.add("com.liferay.layout.utility.page.kernel.constants.LayoutUtilityPageEntryConstants");
    _jspx_imports_classes.add("java.util.Calendar");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.SessionMessages");
    _jspx_imports_classes.add("java.util.ResourceBundle");
    _jspx_imports_classes.add("com.liferay.portal.kernel.service.permission.PortletPermissionUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.security.permission.ActionKeys");
    _jspx_imports_classes.add("com.liferay.portal.kernel.dao.search.SearchContainer");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.TimeZoneUtil");
    _jspx_imports_classes.add("com.liferay.portal.util.LicenseUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.LiferayHeaderRequest");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.PortalWebResourcesUtil");
    _jspx_imports_classes.add("java.util.LinkedHashSet");
    _jspx_imports_classes.add("com.liferay.portal.kernel.bean.BeanPropertiesUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.PortletConfigFactoryUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.SessionErrors");
    _jspx_imports_classes.add("com.liferay.portlet.RenderParametersPool");
    _jspx_imports_classes.add("javax.portlet.MutableRenderParameters");
    _jspx_imports_classes.add("com.liferay.portal.kernel.cookies.CookiesManagerUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portletdisplaytemplate.PortletDisplayTemplateManagerUtil");
    _jspx_imports_classes.add("javax.portlet.PortletPreferences");
    _jspx_imports_classes.add("com.liferay.layout.seo.kernel.LayoutSEOLinkManager");
    _jspx_imports_classes.add("com.liferay.taglib.search.SearchEntry");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.Portal");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.HttpComponentsUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.json.JSONObject");
    _jspx_imports_classes.add("com.liferay.users.admin.kernel.util.UsersAdmin");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.ClassUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.dao.search.ResultRowSplitter");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.ArrayUtil");
    _jspx_imports_classes.add("com.liferay.layout.seo.kernel.LayoutSEOLinkManagerUtil");
    _jspx_imports_classes.add("com.liferay.exportimport.kernel.staging.StagingUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.cal.Recurrence");
    _jspx_imports_classes.add("com.liferay.portal.kernel.service.LayoutLocalServiceUtil");
    _jspx_imports_classes.add("com.liferay.petra.string.CharPool");
    _jspx_imports_classes.add("com.liferay.portal.kernel.security.permission.ResourceActionsUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.exception.UserActiveException");
    _jspx_imports_classes.add("com.liferay.portal.kernel.json.JSONArray");
    _jspx_imports_classes.add("com.liferay.portal.kernel.service.permission.LayoutPermissionUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.configuration.Filter");
    _jspx_imports_classes.add("com.liferay.portal.security.sso.SSOUtil");
    _jspx_imports_classes.add("com.liferay.petra.string.StringBundler");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.HtmlUtil");
    _jspx_imports_classes.add("javax.portlet.PortletURL");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.TextFormatter");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.taglib.ui.MenuItem");
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("com.liferay.portal.kernel.exception.LocalizedException");
    _jspx_imports_classes.add("com.liferay.portal.kernel.bean.BeanParamUtil");
    _jspx_imports_classes.add("com.liferay.layout.utility.page.kernel.LayoutUtilityPageEntryViewRendererRegistryUtil");
    _jspx_imports_classes.add("com.liferay.portal.util.ShutdownUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.log.LogUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.exception.NoSuchLayoutException");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.MultiSessionMessages");
    _jspx_imports_classes.add("java.util.Locale");
    _jspx_imports_classes.add("com.liferay.portlet.HeaderRequestFactory");
    _jspx_imports_classes.add("com.liferay.portal.kernel.exception.RequiredRoleException");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.Constants");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.ReleaseInfo");
    _jspx_imports_classes.add("com.liferay.portal.struts.StrutsUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.dao.search.DisplayTerms");
    _jspx_imports_classes.add("java.text.DateFormat");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.LocaleUtil");
    _jspx_imports_classes.add("javax.portlet.UnavailableException");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.PortalWebResourceConstants");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.Time");
    _jspx_imports_classes.add("java.util.TimeZone");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.PortalUtil");
    _jspx_imports_classes.add("javax.portlet.PortletResponse");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.Validator");
    _jspx_imports_classes.add("com.liferay.portal.kernel.language.UnicodeLanguageUtil");
    _jspx_imports_classes.add("com.liferay.exportimport.kernel.staging.LayoutStagingUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.StringUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.UnicodeProperties");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.PortletKeys");
    _jspx_imports_classes.add("com.liferay.taglib.search.ResultRow");
    _jspx_imports_classes.add("java.util.Objects");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.ServerDetector");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.LocalizationUtil");
    _jspx_imports_classes.add("javax.portlet.WindowState");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.ListUtil");
    _jspx_imports_classes.add("com.liferay.portlet.RenderResponseFactory");
    _jspx_imports_classes.add("com.liferay.layout.seo.kernel.LayoutSEOLink");
    _jspx_imports_classes.add("com.liferay.portal.kernel.language.LanguageWrapper");
    _jspx_imports_classes.add("com.liferay.portal.kernel.security.auth.AuthTokenUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.HtmlParserUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.UnicodeFormatter");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.LiferayRenderRequest");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.SetUtil");
    _jspx_imports_classes.add("com.liferay.portal.struts.Definition");
    _jspx_imports_classes.add("com.liferay.portal.kernel.model.impl.VirtualLayout");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("com.liferay.portlet.configuration.kernel.util.PortletConfigurationApplicationType");
    _jspx_imports_classes.add("com.liferay.portal.kernel.layoutconfiguration.util.RuntimePageUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.IntegerWrapper");
    _jspx_imports_classes.add("com.liferay.portal.kernel.log.Log");
    _jspx_imports_classes.add("javax.portlet.PortletMode");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.KeyValuePair");
    _jspx_imports_classes.add("java.util.HashSet");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.PortletProvider");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.FastDateFormatFactoryUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.CalendarFactoryUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.dao.search.RowChecker");
    _jspx_imports_classes.add("com.liferay.portal.kernel.exception.UserLockoutException");
    _jspx_imports_classes.add("com.liferay.portal.kernel.exception.LayoutPermissionException");
    _jspx_imports_classes.add("javax.portlet.PortletRequest");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.ParamUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.PortletInstanceFactoryUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.PortletSetupUtil");
    _jspx_imports_classes.add("com.liferay.portal.struts.TilesUtil");
    _jspx_imports_classes.add("javax.portlet.ResourceURL");
    _jspx_imports_classes.add("com.liferay.portal.kernel.exception.UserPasswordException");
    _jspx_imports_classes.add("com.liferay.portal.util.MaintenanceUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.PortletConfigurationLayoutUtil");
    _jspx_imports_classes.add("com.liferay.sites.kernel.util.Sites");
    _jspx_imports_classes.add("com.liferay.portal.kernel.exception.PortletActiveException");
    _jspx_imports_classes.add("com.liferay.portal.kernel.dao.db.DBManagerUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.json.JSONFactoryUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.service.permission.GroupPermissionUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.Http");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.ProgressTracker");
    _jspx_imports_classes.add("com.liferay.admin.kernel.util.PortalProductMenuApplicationType");
    _jspx_imports_classes.add("com.liferay.portlet.configuration.kernel.util.PortletConfigurationUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.cluster.ClusterExecutorUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.LiferayPortletMode");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.BufferCacheServletResponse");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.DateUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.exception.UserEmailAddressException");
    _jspx_imports_classes.add("com.liferay.portal.kernel.servlet.BrowserSnifferUtil");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.LiferayHeaderResponse");
    _jspx_imports_classes.add("java.util.Collections");
    _jspx_imports_classes.add("com.liferay.portal.kernel.portlet.PortletURLFactoryUtil");
    _jspx_imports_classes.add("javax.portlet.PortletException");
  }

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
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      //  liferay-theme:defineObjects
      com.liferay.taglib.theme.DefineObjectsTag _jspx_th_liferay_002dtheme_005fdefineObjects_005f0 = new com.liferay.taglib.theme.DefineObjectsTag();
      _jsp_getInstanceManager().newInstance(_jspx_th_liferay_002dtheme_005fdefineObjects_005f0);
      try {
        _jspx_th_liferay_002dtheme_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
        _jspx_th_liferay_002dtheme_005fdefineObjects_005f0.setParent(null);
        int _jspx_eval_liferay_002dtheme_005fdefineObjects_005f0 = _jspx_th_liferay_002dtheme_005fdefineObjects_005f0.doStartTag();
        if (_jspx_th_liferay_002dtheme_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_liferay_002dtheme_005fdefineObjects_005f0, _jsp_getInstanceManager(), false);
      }
      com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay = null;
      com.liferay.portal.kernel.model.Company company = null;
      com.liferay.portal.kernel.model.User user = null;
      com.liferay.portal.kernel.model.User realUser = null;
      com.liferay.portal.kernel.model.Contact contact = null;
      com.liferay.portal.kernel.model.Layout layout = null;
      java.util.List layouts = null;
      java.lang.Long plid = null;
      com.liferay.portal.kernel.model.LayoutTypePortlet layoutTypePortlet = null;
      java.lang.Long scopeGroupId = null;
      com.liferay.portal.kernel.security.permission.PermissionChecker permissionChecker = null;
      java.util.Locale locale = null;
      java.util.TimeZone timeZone = null;
      com.liferay.portal.kernel.model.Theme theme = null;
      com.liferay.portal.kernel.model.ColorScheme colorScheme = null;
      com.liferay.portal.kernel.theme.PortletDisplay portletDisplay = null;
      java.lang.Long portletGroupId = null;
      themeDisplay = (com.liferay.portal.kernel.theme.ThemeDisplay) _jspx_page_context.findAttribute("themeDisplay");
      company = (com.liferay.portal.kernel.model.Company) _jspx_page_context.findAttribute("company");
      user = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("user");
      realUser = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("realUser");
      contact = (com.liferay.portal.kernel.model.Contact) _jspx_page_context.findAttribute("contact");
      layout = (com.liferay.portal.kernel.model.Layout) _jspx_page_context.findAttribute("layout");
      layouts = (java.util.List) _jspx_page_context.findAttribute("layouts");
      plid = (java.lang.Long) _jspx_page_context.findAttribute("plid");
      layoutTypePortlet = (com.liferay.portal.kernel.model.LayoutTypePortlet) _jspx_page_context.findAttribute("layoutTypePortlet");
      scopeGroupId = (java.lang.Long) _jspx_page_context.findAttribute("scopeGroupId");
      permissionChecker = (com.liferay.portal.kernel.security.permission.PermissionChecker) _jspx_page_context.findAttribute("permissionChecker");
      locale = (java.util.Locale) _jspx_page_context.findAttribute("locale");
      timeZone = (java.util.TimeZone) _jspx_page_context.findAttribute("timeZone");
      theme = (com.liferay.portal.kernel.model.Theme) _jspx_page_context.findAttribute("theme");
      colorScheme = (com.liferay.portal.kernel.model.ColorScheme) _jspx_page_context.findAttribute("colorScheme");
      portletDisplay = (com.liferay.portal.kernel.theme.PortletDisplay) _jspx_page_context.findAttribute("portletDisplay");
      portletGroupId = (java.lang.Long) _jspx_page_context.findAttribute("portletGroupId");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

Portlet portlet = (Portlet)request.getAttribute(WebKeys.RENDER_PORTLET);

portletDisplay.setId(portlet.getPortletId());
portletDisplay.setNamespace(PortalUtil.getPortletNamespace(portlet.getPortletId()));

String url = PortletURLUtil.getRefreshURL(request, themeDisplay, false);

Map<String, String[]> parameters = PortletURLUtil.getRefreshURLParameters(request);

      out.write("\n\n<div class=\"loading-animation\" id=\"p_p_id");
      out.print( portletDisplay.getNamespace() );
      out.write("\">\n	<div id=\"p_p_id");
      out.print( portletDisplay.getNamespace() );
      out.write("-defaultScreen\"></div>\n</div>\n\n");
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_005fscript_005f0 = new com.liferay.taglib.aui.ScriptTag();
      _jsp_getInstanceManager().newInstance(_jspx_th_aui_005fscript_005f0);
      try {
        _jspx_th_aui_005fscript_005f0.setPageContext(_jspx_page_context);
        _jspx_th_aui_005fscript_005f0.setParent(null);
        // /html/portal/load_render_portlet.jsp(34,0) name = use type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_aui_005fscript_005f0.setUse("aui-base");
        int _jspx_eval_aui_005fscript_005f0 = _jspx_th_aui_005fscript_005f0.doStartTag();
        if (_jspx_eval_aui_005fscript_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_aui_005fscript_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_aui_005fscript_005f0);
          }
          do {
            out.write("\n	var ns = '");
            out.print( portletDisplay.getNamespace() );
            out.write("';\n\n	Liferay.Portlet.addHTML(\n		{\n			data: ");
            out.print( JSONFactoryUtil.looseSerializeDeep(parameters) );
            out.write(",\n			onComplete: function(portlet, portletId) {\n				portlet.refreshURL = '");
            out.print( HtmlUtil.escapeJS(url) );
            out.write("';\n			},\n			placeHolder: A.one('#p_p_id' + ns),\n			url: '");
            out.print( HtmlUtil.escapeJS(url) );
            out.write("'\n		}\n	);\n");
            int evalDoAfterBody = _jspx_th_aui_005fscript_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_aui_005fscript_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
          }
        }
        if (_jspx_th_aui_005fscript_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_aui_005fscript_005f0, _jsp_getInstanceManager(), false);
      }
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
