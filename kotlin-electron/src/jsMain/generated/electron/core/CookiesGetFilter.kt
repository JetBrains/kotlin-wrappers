package electron.core


external interface CookiesGetFilter {
    /**
     * Retrieves cookies which are associated with `url`. Empty implies retrieving
     * cookies of all URLs.
     */
    var url: String?

    /**
     * Filters cookies by name.
     */
    var name: String?

    /**
     * Retrieves cookies whose domains match or are subdomains of `domains`.
     */
    var domain: String?

    /**
     * Retrieves cookies whose path matches `path`.
     */
    var path: String?

    /**
     * Filters cookies by their Secure property.
     */
    var secure: Boolean?

    /**
     * Filters out session or persistent cookies.
     */
    var session: Boolean?

    /**
     * Filters cookies by httpOnly.
     */
    var httpOnly: Boolean?
}
