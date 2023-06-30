package electron.core


external interface ClientRequestConstructorOptions {
    /**
     * The HTTP request method. Defaults to the GET method.
     */
    var method: String?

    /**
     * The request URL. Must be provided in the absolute form with the protocol scheme
     * specified as http or https.
     */
    var url: String?

    /**
     * The `Session` instance with which the request is associated.
     */
    var session: Session?

    /**
     * The name of the `partition` with which the request is associated. Defaults to
     * the empty string. The `session` option supersedes `partition`. Thus if a
     * `session` is explicitly specified, `partition` is ignored.
     */
    var partition: String?

    /**
     * Can be `include` or `omit`. Whether to send credentials with this request. If
     * set to `include`, credentials from the session associated with the request will
     * be used. If set to `omit`, credentials will not be sent with the request (and
     * the `'login'` event will not be triggered in the event of a 401). This matches
     * the behavior of the fetch option of the same name. If this option is not
     * specified, authentication data from the session will be sent, and cookies will
     * not be sent (unless `useSessionCookies` is set).
     */
    var credentials: (ClientRequestConstructorOptionsCredentials)?

    /**
     * Whether to send cookies with this request from the provided session. If
     * `credentials` is specified, this option has no effect. Default is `false`.
     */
    var useSessionCookies: Boolean?

    /**
     * Can be `http:` or `https:`. The protocol scheme in the form 'scheme:'. Defaults
     * to 'http:'.
     */
    var protocol: String?

    /**
     * The server host provided as a concatenation of the hostname and the port number
     * 'hostname:port'.
     */
    var host: String?

    /**
     * The server host name.
     */
    var hostname: String?

    /**
     * The server's listening port number.
     */
    var port: Double?

    /**
     * The path part of the request URL.
     */
    var path: String?

    /**
     * Can be `follow`, `error` or `manual`. The redirect mode for this request. When
     * mode is `error`, any redirection will be aborted. When mode is `manual` the
     * redirection will be cancelled unless `request.followRedirect` is invoked
     * synchronously during the `redirect` event.  Defaults to `follow`.
     */
    var redirect: (ClientRequestConstructorOptionsRedirect)?

    /**
     * The origin URL of the request.
     */
    var origin: String?
}
