package cc.weChatPb.config;

import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
/**
 * @program: sell
 * @description: 微信网页授权信息配置类
 * @author: 01
 * @create: 2018-05-15 15:40
 **/
@Component
public class WechatMpConfig {

//    @Autowired
//    private WechatAccountConfig wechatAccountConfig;

    /**
     * 配置WxMpService所需信息
     * @return
     */
    @Bean  // 此注解指定在Spring容器启动时，就执行该方法并将该方法返回的对象交由Spring容器管理
    public WxMpService wxMpService(){
        WxMpService wxMpService = new WxMpServiceImpl();
        // 设置配置信息的存储位置
        wxMpService.setWxMpConfigStorage(wxMpConfigStorage());

        return wxMpService;
    }

    /**
     * 配置appID和appsecret
     * @return
     */
    @Bean
    public WxMpConfigStorage wxMpConfigStorage(){
        // 使用这个实现类则表示将配置信息存储在内存中
        WxMpInMemoryConfigStorage wxMpInMemoryConfigStorage = new WxMpInMemoryConfigStorage();
        wxMpInMemoryConfigStorage.setAppId("wx773b6fe9e7301063");
        wxMpInMemoryConfigStorage.setSecret("696ff2871604263fff46be0088fefed3");

        return wxMpInMemoryConfigStorage;
    }
}