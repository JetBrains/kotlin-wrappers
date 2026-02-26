package tanstack.router.core

import web.url.URL

value class LocationRewriteFunction
private constructor(
    private val function: (LocationRewriteFunctionOptions) -> URL?,
) {
    /**
     * A function that will be called to rewrite the URL.
     *
     * @param url The URL to rewrite.
     * @return The rewritten URL (as a URL instance or full href string) or `undefined` if no rewrite is needed.
     */
    operator fun invoke(
        url: URL,
    ): URL? =
        function(LocationRewriteFunctionOptions(url = url))
}
