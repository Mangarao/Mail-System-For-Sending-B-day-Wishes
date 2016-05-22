package com.birthdaywishes.util;

import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;

/**
 * @author Akash
 * This interface has different utility related methods.
 *
 */
public interface UtilityInterface {
	/**
	 * @return This method returns properties object, which will be used in
	 *         creating session.
	 */
	public Properties getSessionProperties();

	/**
	 * @param session
	 * @param listOfToEmailId
	 * @param subject
	 * @param text
	 * @return This method returns Message object after preparing it.
	 */
	public Message createMimeMessage(Session session, List<String> listOfToEmailId, String subject, String text);
}
