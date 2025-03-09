// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.html

sealed external interface HTMLHyperlinkElementUtils {
    /**
     * Returns the hyperlink's URL's fragment (includes leading "#" if non-empty).
     *
     * Can be set, to change the URL's fragment (ignores leading "#").
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/hash)
     */
    var hash: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Returns the hyperlink's URL's host and port (if different from the default port for the scheme).
     *
     * Can be set, to change the URL's host and port.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/host)
     */
    var host: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Returns the hyperlink's URL's host.
     *
     * Can be set, to change the URL's host.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/hostname)
     */
    var hostname: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Returns the hyperlink's URL.
     *
     * Can be set, to change the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/href)
     */
    var href: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Returns the hyperlink's URL's origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/origin)
     */
    val origin: String
        get() = definedExternally

    /**
     * Returns the hyperlink's URL's password.
     *
     * Can be set, to change the URL's password.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/password)
     */
    var password: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Returns the hyperlink's URL's path.
     *
     * Can be set, to change the URL's path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/pathname)
     */
    var pathname: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Returns the hyperlink's URL's port.
     *
     * Can be set, to change the URL's port.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/port)
     */
    var port: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Returns the hyperlink's URL's scheme.
     *
     * Can be set, to change the URL's scheme.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/protocol)
     */
    var protocol: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Returns the hyperlink's URL's query (includes leading "?" if non-empty).
     *
     * Can be set, to change the URL's query (ignores leading "?").
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/search)
     */
    var search: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Returns the hyperlink's URL's username.
     *
     * Can be set, to change the URL's username.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/username)
     */
    var username: String
        get() = definedExternally
        set(value) = definedExternally
}
