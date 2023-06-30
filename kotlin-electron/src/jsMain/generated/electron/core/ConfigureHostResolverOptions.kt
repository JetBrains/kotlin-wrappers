package electron.core


external interface ConfigureHostResolverOptions {
    /**
     * Whether the built-in host resolver is used in preference to getaddrinfo. When
     * enabled, the built-in resolver will attempt to use the system's DNS settings to
     * do DNS lookups itself. Enabled by default on macOS, disabled by default on
     * Windows and Linux.
     */
    var enableBuiltInResolver: Boolean?

    /**
     * Can be "off", "automatic" or "secure". Configures the DNS-over-HTTP mode. When
     * "off", no DoH lookups will be performed. When "automatic", DoH lookups will be
     * performed first if DoH is available, and insecure DNS lookups will be performed
     * as a fallback. When "secure", only DoH lookups will be performed. Defaults to
     * "automatic".
     */
    var secureDnsMode: String?

    /**
     * A list of DNS-over-HTTP server templates. See RFC8484 § 3 for details on the
     * template format. Most servers support the POST method; the template for such
     * servers is simply a URI. Note that for some DNS providers, the resolver will
     * automatically upgrade to DoH unless DoH is explicitly disabled, even if there
     * are no DoH servers provided in this list.
     */
    var secureDnsServers: js.core.ReadonlyArray<String>?

    /**
     * Controls whether additional DNS query types, e.g. HTTPS (DNS type 65) will be
     * allowed besides the traditional A and AAAA queries when a request is being made
     * via insecure DNS. Has no effect on Secure DNS which always allows additional
     * types. Defaults to true.
     */
    var enableAdditionalDnsQueryTypes: Boolean?
}
