package com.leaderment.constant;

/**
 * 常量
 * @author leeyom
 * @date 2017年10月19日 10:41
 */
public class Constants {
	public static final String UB_ACCOUNT_NAME="support@unbreakcable.com";
	public static final String UB_PSSWORD="Ldm123";
	/**
	 * 存储当前登录用户id的字段名
	 */
	public static final String CURRENT_USER_ID = "CURRENT_USER_ID";

	/**
	 * token有效期（小时）
	 */
	public static final int TOKEN_EXPIRES_HOUR = 2;

	/**
	 * 存放Token的header字段
	 */
	public static final String DEFAULT_TOKEN_NAME = "Access-Token";

	/**
	 * RSA公钥
	 */
	public static final String PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCVmTnCLsJ7cr5z+g2QJLCuLq4FzRR7OyQFZyxqZgTnxrQEqmggtWPAp367YMAgaAN4p5+/aDRhyZ2hGQGXMHEoAZEgy4mgqTy76v3+E6gfN08W8I1KOGfwcLUfmphDxj7kIuYlm08Oojkeicrp95xNWvXpFooDpBClHJKXtxV9/QIDAQAB";

	/**
	 * RSA私钥
	 */
	public static final String PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIpnDTxlqtOrzz78lrPtLgnxwc8k/utyNADLXUiRu3tbQmsIB/gyOIbLw/fJ3PySO3DYVCyvMEQJLrZk0GS4MQdxg46PK1gnoX7EPu7BS04cQm+tJ7YoB6cv+6sW2uc8k8Z99nyJtLkgJeuwyrTULRUE6g1nOGE7Hv/zaO7Yg485AgMBAAECgYBtad562tzbjb2/S6xP/bchwW+4NMUamSQnZJ4QWrVeZdzyBF1Yh0tMtRXtdDYxreEz6rFQygZcIu483yIoHb0Tty0IapCiXMKv3YnyrWC9fDEK6a+5AV6gP8y90yWhRnAJFeXEYbEi3rwgmvbUmIaVbvE5Ivz393eseQ9C6jrlaQJBAOgVZ+3MsQz9BZ2TyKUZzrS2C6iWL6IFamq0aUzMrTZBaZ8KsgPLZFbDBR2lZUp4cPyY0ucpLZtuQzlcpA4ehfcCQQCYqj84KvlMPwniswOaxzMl+hulfPJ7VnS2Ra18meF1o5FTf3Xaw0+1M6qu0aE/ZSNeJsEQ4idRdtPT7lRKO4hPAkEAye4GFVPqIMDt5+MzyuMfhQB4OGEkZLaNlvYOQLI9a12SxryJkt+fGBZrFxZXgWo19LILnvGnKvvPJdPDMj3AlQJAWNolR0yDoePCniWwQGIVm9HQS2XIPw6XiQpOqYlqFiynxWAWuMcZ2g2DFpI9dgcoKYEGtwvY9GnjaaJ5fmbdswJACgp64N5cuOpnQR3Sua3PcBdSlXp5Nu2S/+Ffs/3pAL/OXX+UrrHyPOZW3Hpvm24p26Ojk0rm2hv0BVfGunm7KQ==";

	// public static void main(String[] args) {
	// try {
	// System.out.println("私钥："+RsaUtils.getPrivateKey(RsaUtils.genKeyPair()));
	// System.out.println("公钥："+RsaUtils.getPublicKey(RsaUtils.genKeyPair()));
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
}
