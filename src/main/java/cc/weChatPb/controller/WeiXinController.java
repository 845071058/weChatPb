package cc.weChatPb.controller;

import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URLEncoder;
@Controller
@RequestMapping("/wechat")
@Slf4j
public class WeiXinController {
	
	private static final Logger LOG = LoggerFactory.getLogger(WeChatController.class);

//	@Autowired
//    private WxMpService wxMpService;

    /**
     * 获取code参数
     *
     * @param returnUrl 需要跳转的url
     * @return
     */
//    @GetMapping("/authorize")
//    public String authorize(@RequestParam("returnUrl") String returnUrl) {
//        // 暂时将我们的回调地址硬编码在这里，方便一会调试
//        String url = "https://1c630z6949.51mypc.cn/weChatPb/wechat/userInfo";
//        WxMpServiceImpl wxMpService = new WxMpServiceImpl();
//        // 获取微信返回的重定向url
//        String redirectUrl = wxMpService.oauth2buildAuthorizationUrl(url, WxConsts.OAuth2Scope.SNSAPI_BASE, URLEncoder.encode(returnUrl));
//        System.out.println("【微信网页授权】获取code，redirectUrl = {}" + redirectUrl);
//
//        return "redirect:" + redirectUrl;
//    }

    
}
