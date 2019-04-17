package cc.weChatPb.controller;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cc.weChatPb.service.WeChatService;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;

@RequestMapping("/weixin")
@Controller
public class WeChatController {

	private static final Logger LOG = LoggerFactory.getLogger(WeChatController.class);
	@Autowired
	WeChatService wechatService;
	
	/**
	 * 验证token
	 * @param request
	 * @param response
	 */
	@RequestMapping("/get")
	public void index(HttpServletRequest request,HttpServletResponse response){
		System.out.println("2222222222222");
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String token = "xixiainiuniu";
		String echostr = request.getParameter("echostr");
		if (wechatService.verifyInfo(signature, timestamp, nonce, token)) {
			System.out.println("echostr" + echostr);
			if (echostr != null) {
				try {
					response.getWriter().write(echostr);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			LOG.info("signature", signature);
			LOG.info("timestamp", timestamp);
			LOG.info("nonce", nonce);
			LOG.info("token", token);
		}
	}
	
	@RequestMapping("/auth")
    public String auth(@RequestParam("code") String code) {
		System.out.println("进入auth方法...");
		System.out.println("code = {}" + code);
		String reurl = "https://1c630z6949.51mypc.cn/weChatPb/weixin/userInfo";
		String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx773b6fe9e7301063&secret=696ff2871604263fff46be0088fefed3&code=" + code + "&grant_type=authorization_code";
	    RestTemplate restTemplate = new RestTemplate();
	    String response = restTemplate.getForObject(url, String.class);
	    LOG.info("response = {}", response);
	    
	    String returnUrl = "http://1c630z6949.51mypc.cn/weChatPb/index.jsp";
	    return "redirect:" + returnUrl + "?openid=";
    }
	
	/**
     * 使用code参数换取access_token信息，并获取到openid
     *
     * @param code
     * @param returnUrl
     * @return
     */
    @GetMapping("/userInfo")
    public String userInfo(@RequestParam("code") String code, @RequestParam("state") String returnUrl) {
        WxMpOAuth2AccessToken wxMpOAuth2AccessToken = null;
        WxMpServiceImpl wxMpService = new WxMpServiceImpl();
        try {
            // 使用code换取access_token信息
            wxMpOAuth2AccessToken = wxMpService.oauth2getAccessToken(code);
        } catch (WxErrorException e) {
        	e.printStackTrace();
        }
        // 从access_token信息中获取到用户的openid
        String openId = wxMpOAuth2AccessToken.getOpenId();
        LOG.info("【微信网页授权】获取openId，openId = {}", openId);
         returnUrl = "http://1c630z6949.51mypc.cn/weChatPb/index.jsp";
        // 重定向到我们要跳转的页面
        return "redirect:" + returnUrl + "?openid=" + openId;
    }
    
	@PostMapping("/test")
	public void test(String name,String phone, String time) {
		System.out.println(name);
		System.out.println(phone);
		System.out.println(time);
	}

}
