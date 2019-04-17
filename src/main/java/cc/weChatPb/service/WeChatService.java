package cc.weChatPb.service;

public interface WeChatService {

	Boolean verifyInfo(String signature, String timestamp, String nonce,
			String token);
}
