package tanstack.router.core

import web.url.URL

@JsName("Function")
external class LocationRewriteFunction
private constructor() {
    internal /* raw */
    operator fun invoke(
        options: LocationRewriteFunctionOptions,
    ): URL?
}

/**
 * A function that will be called to rewrite the URL.
 *
 * @param url The URL to rewrite.
 * @return The rewritten URL (as a URL instance or full href string) or `undefined` if no rewrite is needed.
 */
operator fun LocationRewriteFunction.invoke(
    url: URL,
): URL? =
    invoke(LocationRewriteFunctionOptions(url = url))
