package electron


external interface ForkOptions {
    /**
     * Environment key-value pairs. Default is `process.env`.
     */
    var env: Env?

    /**
     * List of string arguments passed to the executable.
     */
    var execArgv: js.core.ReadonlyArray<String>?

    /**
     * Current working directory of the child process.
     */
    var cwd: String?

    /**
     * Allows configuring the mode for `stdout` and `stderr` of the child process.
     * Default is `inherit`. String value can be one of `pipe`, `ignore`, `inherit`,
     * for more details on these values you can refer to stdio documentation from
     * Node.js. Currently this option only supports configuring `stdout` and `stderr`
     * to either `pipe`, `inherit` or `ignore`. Configuring `stdin` is not supported;
     * `stdin` will always be ignored. For example, the supported values will be
     * processed as following:
     */
    var stdio: Any /* (Array<'pipe' | 'ignore' | 'inherit'>) | (string) */?

    /**
     * Name of the process that will appear in `name` property of `child-process-gone`
     * event of `app`. Default is `node.mojom.NodeService`.
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
}
