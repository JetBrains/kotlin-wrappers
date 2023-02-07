// Automatically generated - do not modify!

package web.html

sealed external interface HTMLHyperlinkElementUtils {
    /**
     * Returns the hyperlink's URL's fragment (includes leading "#" if non-empty).
     *
     * Can be set, to change the URL's fragment (ignores leading "#").
     */
    var hash: String

    /**
     * Returns the hyperlink's URL's host and port (if different from the default port for the scheme).
     *
     * Can be set, to change the URL's host and port.
     */
    var host: String

    /**
     * Returns the hyperlink's URL's host.
     *
     * Can be set, to change the URL's host.
     */
    var hostname: String

    /**
     * Returns the hyperlink's URL.
     *
     * Can be set, to change the URL.
     */
    var href: String

    /** Returns the hyperlink's URL's origin. */
    val origin: String

    /**
     * Returns the hyperlink's URL's password.
     *
     * Can be set, to change the URL's password.
     */
    var password: String

    /**
     * Returns the hyperlink's URL's path.
     *
     * Can be set, to change the URL's path.
     */
    var pathname: String

    /**
     * Returns the hyperlink's URL's port.
     *
     * Can be set, to change the URL's port.
     */
    var port: String

    /**
     * Returns the hyperlink's URL's scheme.
     *
     * Can be set, to change the URL's scheme.
     */
    var protocol: String

    /**
     * Returns the hyperlink's URL's query (includes leading "?" if non-empty).
     *
     * Can be set, to change the URL's query (ignores leading "?").
     */
    var search: String

    /**
     * Returns the hyperlink's URL's username.
     *
     * Can be set, to change the URL's username.
     */
    var username: String
}
