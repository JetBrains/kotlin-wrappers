package electron.core


external interface CookiesSetDetails {
    /**
     * The URL to associate the cookie with. The promise will be rejected if the URL is
     * invalid.
     */
    var url: String

    /**
     * The name of the cookie. Empty by default if omitted.
     */
    var name: String?

    /**
     * The value of the cookie. Empty by default if omitted.
     */
    var value: String?

    /**
     * The domain of the cookie; this will be normalized with a preceding dot so that
     * it's also valid for subdomains. Empty by default if omitted.
     */
    var domain: String?

    /**
     * The path of the cookie. Empty by default if omitted.
     */
    var path: String?

    /**
     * Whether the cookie should be marked as Secure. Defaults to false unless Same
     * Site=None attribute is used.
     */
    var secure: Boolean?

    /**
     * Whether the cookie should be marked as HTTP only. Defaults to false.
     */
    var httpOnly: Boolean?

    /**
     * The expiration date of the cookie as the number of seconds since the UNIX epoch.
     * If omitted then the cookie becomes a session cookie and will not be retained
     * between sessions.
     */
    var expirationDate: Double?

    /**
     * The Same Site policy to apply to this cookie.  Can be `unspecified`,
     * `no_restriction`, `lax` or `strict`.  Default is `lax`.
     */
    var sameSite: (CookiesSetDetailsSameSite)?
}
