package com.scie.wechat.message.reg;

/**
 * ������Ϣ
 * 
 * @author tianle
 * @date 2014-08-06
 */
public class LinkMessage extends BaseMessage {
	// ��Ϣ����
	private String Title;
	// ��Ϣ����
	private String Description;
	// ��Ϣ����
	private String Url;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}
}