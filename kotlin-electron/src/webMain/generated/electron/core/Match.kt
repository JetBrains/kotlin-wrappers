// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface Match {
    /**
     * Host name to match, for standard schemes. It is compared with the URL's host as
     * a whole, case-insensitively; there is no wildcard or subdomain matching. Omit to
     * match any host.
     */
    var host: String?

    /**
     * Path prefix to match, starting with `/` and written as it appears in a URL
     * (percent-encoded). Defaults to `/`.
     */
    var path: String?
}
