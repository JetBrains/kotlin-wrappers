package electron


external interface WebRequestFilter {
// Docs: https://electronjs.org/docs/api/structures/web-request-filter
    /**
     * Array of types that will be used to filter out the requests that do not match
     * the types. When not specified, all types will be matched. Can be `mainFrame`,
     * `subFrame`, `stylesheet`, `script`, `image`, `font`, `object`, `xhr`, `ping`,
     * `cspReport`, `media` or `webSocket`.
     */
    var types: Array<WebRequestFilterType>?

    /**
     * Array of URL patterns that will be used to filter out the requests that do not
     * match the URL patterns.
     */
    var urls: js.core.ReadonlyArray<String>
}
