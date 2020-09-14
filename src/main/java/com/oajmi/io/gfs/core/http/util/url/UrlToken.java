/**
 * 
 */
package com.oajmi.io.gfs.core.http.util.url;

/**
 * represents URL tokens value, pair
 * 
 * @author omarAjmi
 * @since 2020-09-14
 */
public class UrlToken {

	private final String text;
	private final UrlTokenType type;

	UrlToken(String text, UrlTokenType type) {
		super();
		this.text = text;
		this.type = type;
	}

	String text() {
		return text;
	}

	UrlTokenType type() {
		return type;
	}

	static UrlToken host(String host) {
		return new UrlToken(host, UrlTokenType.HOST);
	}

	static UrlToken path(String path) {
		return new UrlToken(path, UrlTokenType.PATH);
	}

	static UrlToken port(String port) {
		return new UrlToken(port, UrlTokenType.PORT);
	}

	static UrlToken scheme(String scheme) {
		return new UrlToken(scheme, UrlTokenType.SCHEME);
	}

	static UrlToken query(String query) {
		return new UrlToken(query, UrlTokenType.QUERY);
	}

	@Override
	public int hashCode() {
		return (text == null ? 0 : text.hashCode()) ^ type.hashCode();
	}

	@Override
	public boolean equals(Object other) {
		return other instanceof UrlToken && this.equals((UrlToken) other);
	}

	public boolean equals(UrlToken other) {
		return other != null && other.text.equals(this.text) && other.type == other.type;
	}

	@Override
	public String toString() {
		return "\"" + text + "\" (" + type + ")";
	}

}
