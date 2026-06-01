// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface ForkOptions {
    /**
     * Environment key-value pairs. Default is `process.env`.
     */
    var env: Env?

    /**
     * List of string arguments passed to the executable.
     */
    var execArgv: js.array.ReadonlyArray<String>?

    /**
     * Current working directory of the child process.
     */
    var cwd: String?

    /**
     * Sets the session used by the process for network requests. By default, network
     * requests from the utility process will use the system network context which does
     * not have HTTP cache support. Setting a session enables HTTP caching and other
     * session-specific network features. See session for more information.
     */
    var session: Session?

    /**
     * Sets the session used by the process according to the session's partition
     * string. If `partition` starts with `persist:`, the process will use a persistent
     * session available to all pages in the app with the same `partition`. If there is
     * no `persist:` prefix, the process will use an in-memory session. By assigning
     * the same `partition`, multiple processes can share the same session. If the
     * `session` option is set, this option is ignored.
     */
    var partition: String?

    /**
     * Allows configuring the mode for `stdout` and `stderr` of the child process.
     * Default is `inherit`. String value can be one of `pipe`, `ignore`, `inherit`,
     * for more details on these values you can refer to stdio documentation from
     * Node.js. Currently this option only supports configuring `stdout` and `stderr`
     * to either `pipe`, `inherit` or `ignore`. Configuring `stdin` to any property
     * other than `ignore` is not supported and will result in an error. For example,
     * the supported values will be processed as following:
     */
    var stdio: (Any /* (Array<'pipe' | 'ignore' | 'inherit'>) | (string) */)?

    /**
     * Name of the process that will appear in `name` property of `ProcessMetric`
     * returned by `app.getAppMetrics` and `child-process-gone` event of `app`. Default
     * is `Node Utility Process`.
     */
    var serviceName: String?

    /**
     * With this flag, the utility process will be launched via the `Electron Helper
     * (Plugin).app` helper executable on macOS, which can be codesigned with
     * `com.apple.security.cs.disable-library-validation` and
     * `com.apple.security.cs.allow-unsigned-executable-memory` entitlements. This will
     * allow the utility process to load unsigned libraries. Unless you specifically
     * need this capability, it is best to leave this disabled. Default is `false`.
     *
     * @platform darwin
     */
    var allowLoadingUnsignedLibraries: Boolean?

    /**
     * With this flag, the utility process will disclaim responsibility for the child
     * process. This causes the operating system to consider the child process as a
     * separate entity for purposes of security policies like Transparency, Consent,
     * and Control (TCC). When responsibility is disclaimed, the parent process will
     * not be attributed for any TCC requests initiated by the child process. This is
     * useful when launching processes that run third-party or otherwise untrusted
     * code. Default is `false`.
     *
     * @platform darwin
     */
    var disclaim: Boolean?

    /**
     * With this flag, all HTTP 401 and 407 network requests created via the net module
     * will allow responding to them via the `login` event on the `UtilityProcess`
     * instance when a `session` is provided, or via the `app#login` event in the main
     * process when using the default system network context. Without this flag, auth
     * challenges are handled by the default `login` event on the `ClientRequest`
     * object. Default is `false`.
     */
    var respondToAuthRequestsFromMainProcess: Boolean?
}
