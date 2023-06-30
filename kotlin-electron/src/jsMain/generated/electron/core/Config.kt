package electron.core


external interface Config {
    /**
     * The proxy mode. Should be one of `direct`, `auto_detect`, `pac_script`,
     * `fixed_servers` or `system`. If it's unspecified, it will be automatically
     * determined based on other specified options.
     */
    var mode: (ConfigMode)?

    /**
     * The URL associated with the PAC file.
     */
    var pacScript: String?

    /**
     * Rules indicating which proxies to use.
     */
    var proxyRules: String?

    /**
     * Rules indicating which URLs should bypass the proxy settings.
     */
    var proxyBypassRules: String?
}
