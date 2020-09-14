package com.oajmi.io.gfs.core.http.util.url;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UrlTokenTest {

	@Test
	void constructor() {
		UrlToken token = new UrlToken("testToken", UrlTokenType.SCHEME);

		assertNotNull(token);
		assertEquals("testToken", token.text());
		assertEquals(UrlTokenType.SCHEME, token.type());
	}

	@Test
	void scheme() {
		UrlToken token = UrlToken.scheme("http");

		assertNotNull(token);
		assertEquals("http", token.text());
		assertEquals(UrlTokenType.SCHEME, token.type());
	}

	@Test
	void port() {
		UrlToken token = UrlToken.port("8080");

		assertNotNull(token);
		assertEquals("8080", token.text());
		assertEquals(UrlTokenType.PORT, token.type());
	}
	
	@Test
	void query() {
		UrlToken token = UrlToken.query("a=b");
		
		assertNotNull(token);
		assertEquals("a=b", token.text());
		assertEquals(UrlTokenType.QUERY, token.type());
	}
	
	@Test
	void host() {
		UrlToken token = UrlToken.host("www.host.test");
		
		assertNotNull(token);
		assertEquals("www.host.test", token.text());
		assertEquals(UrlTokenType.HOST, token.type());
	}
	
	@Test
	void equals() {
		UrlToken urlToken1 = UrlToken.scheme("http");
		UrlToken urlToken2 = UrlToken.scheme("http");
		UrlToken urlToken3 = UrlToken.port("8080");
		UrlToken urlToken4 = UrlToken.port("3000");
		
		assertEquals(urlToken1, urlToken2);
		assertNotEquals(urlToken3, urlToken4);
	}
}
