// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.html

import js.internal.InternalApi

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface HyperlinkElementUtils {
    /**
     * The **`hash`** property of the HTMLAnchorElement interface is a string containing a "#" followed by the fragment identifier of the <a> element's href. If the URL does not have a fragment identifier, this property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/hash)
     */
    var hash: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`host`** property of the HTMLAnchorElement interface is a string containing the host, which is the hostname, and then, if the port of the URL is nonempty, a ":", followed by the port of the URL. If the URL does not have a hostname, this property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/host)
     */
    var host: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`hostname`** property of the HTMLAnchorElement interface is a string containing either the domain name or IP address of the <a> element's href. If the URL does not have a hostname, this property contains an empty string, "". IPv4 and IPv6 addresses are normalized, such as stripping leading zeros, and domain names are converted to IDN.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/hostname)
     */
    var hostname: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`hreflang`** property of the HTMLAnchorElement interface is a string that is the language of the linked resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/hreflang)
     */
    var hreflang: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`origin`** read-only property of the HTMLAnchorElement interface returns a string containing the Unicode serialization of the origin of the <a> element's href.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/origin)
     */
    val origin: String
        get() = definedExternally

    /**
     * The **`password`** property of the HTMLAnchorElement interface is a string containing the password component of the <a> element's href. If the URL does not have a password, this property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/password)
     */
    var password: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`HTMLAnchorElement.pathname`** property is a string containing an initial '/' followed by the path of the URL not including the query string or fragment (or the empty string if there is no path).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/pathname)
     */
    var pathname: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`port`** property of the HTMLAnchorElement interface is a string containing the port number of the <a> element's href. If the port is the default for the protocol (80 for ws: and http:, 443 for wss: and https:, and 21 for ftp:), this property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/port)
     */
    var port: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`protocol`** property of the HTMLAnchorElement interface is a string containing the protocol or scheme of the <area> element's href, including the final ":".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/protocol)
     */
    var protocol: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`search`** property of the HTMLAnchorElement interface is a search string, also called a query string, that is a string containing a "?" followed by the parameters of the <a> element's href. If the URL does not have a search query, this property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/search)
     */
    var search: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`type`** property of the HTMLAnchorElement interface is a string that indicates the MIME type of the linked resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/type)
     */
    var type: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`username`** property of the HTMLAnchorElement interface is a string containing the username component of the <a> element's href. If the URL does not have a username, this property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/username)
     */
    var username: String
        get() = definedExternally
        set(value) = definedExternally
}
