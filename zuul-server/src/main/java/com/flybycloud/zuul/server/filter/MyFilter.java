package com.flybycloud.zuul.server.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * 过滤器 示例
 * @author hejiang
 * @date 2018/3/28
 */
public class MyFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(MyFilter.class);

    /**
     * pre：路由之前
     * routing：路由之时
     * post： 路由之后
     * error：发送错误调用
     * filterOrder：过滤的顺序
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 级别，数字越低，级别越高
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 过滤器的是否执行过滤 true 过滤， false 不过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 据图逻辑
     * @return
     */
    @Override
    public Object run() {
        logger.info("加载过滤器逻辑开始");
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String contentType = request.getContentType();
        String token = request.getHeader("token");
//        if(StringUtils.isEmpty(token)){
//            ctx.setSendZuulResponse(false);// 过滤该请求，不对其进行路由
//            ctx.setResponseStatusCode(HttpStatus.SC_OK);
//            ctx.setResponseBody("校验失败");
//            ctx.set("isSuccess", false);
//            //解决返回字符串中文乱码问题
//            HttpServletResponse response = ctx.getResponse();
//            response.addHeader("Access-Control-Allow-Origin", "*");
//            response.setContentType("application/json");
//            response.setCharacterEncoding("UTF-8");
//            response.setContentType("text/html;charset=UTF-8");
//            response.setLocale(new java.util.Locale("zh","CN"));
//            return null;
//        }
//        //排除文件上传路径的的请求
//        if(contentType != null && !contentType.contains("multipart/form-data")){
//            InputStream in = null;
//            try {
//                in = ctx.getRequest().getInputStream();
//                String body = StreamUtils.copyToString(in, Charset.forName("UTF-8"));
//                JSONObject json = JSONObject.parseObject(body);
//                if(json == null){
//                    json = new JSONObject();
//                }
//                final byte[] reqBodyBytes = json.toString().getBytes();
//                ctx.setRequest(new HttpServletRequestWrapper(request){
//                    @Override
//                    public ServletInputStream getInputStream() throws IOException {
//                        return new ServletInputStreamWrapper(reqBodyBytes);
//                    }
//                    @Override
//                    public int getContentLength() {
//                        return reqBodyBytes.length;
//                    }
//                    @Override
//                    public long getContentLengthLong() {
//                        return reqBodyBytes.length;
//                    }
//                });
//            } catch (IOException e) {
//                logger.error("zuul过滤器设置用户信息失败", e);
//            }finally {
//                IOUtils.closeQuietly(in);
                ctx.setSendZuulResponse(true);// 对该请求进行路由
                ctx.setResponseStatusCode(HttpStatus.SC_OK);
                ctx.set("isSuccess", true);// 设值，可以在多个过滤器时使用
//            }
//        }
        return null;
    }


}
