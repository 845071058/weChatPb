package cc.weChatPb.service.impl;

import java.util.TreeSet;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import cc.weChatPb.service.WeChatService;
@Service
public class WeChatServiceImpl implements WeChatService{

	public Boolean verifyInfo(String signature, String timestamp, String nonce, String token) {
		TreeSet<String> set = new TreeSet<String>();
		set.add(token);
		set.add(timestamp);
		set.add(nonce);
		StringBuilder sBuilder = new StringBuilder();
		for (String item : set) {
			sBuilder.append(item);
		}
		String sign = DigestUtils.sha1Hex(sBuilder.toString());
		return signature.equalsIgnoreCase(sign);
	}

}
