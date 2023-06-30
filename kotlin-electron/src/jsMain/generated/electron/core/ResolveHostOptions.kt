package electron.core


external interface ResolveHostOptions {
    /**
     * Requested DNS query type. If unspecified, resolver will pick A or AAAA (or both)
     * based on IPv4/IPv6 settings:
     */
    var queryType: (ResolveHostOptionsQueryType)?

    /**
     * The source to use for resolved addresses. Default allows the resolver to pick an
     * appropriate source. Only affects use of big external sources (e.g. calling the
     * system for resolution or using DNS). Even if a source is specified, results can
     * still come from cache, resolving "localhost" or IP literals, etc. One of the
     * following values:
     */
    var source: (ResolveHostOptionsSource)?

    /**
     * Indicates what DNS cache entries, if any, can be used to provide a response. One
     * of the following values:
     */
    var cacheUsage: (ResolveHostOptionsCacheUsage)?

    /**
     * Controls the resolver's Secure DNS behavior for this request. One of the
     * following values:
     */
    var secureDnsPolicy: (ResolveHostOptionsSecureDnsPolicy)?
}
