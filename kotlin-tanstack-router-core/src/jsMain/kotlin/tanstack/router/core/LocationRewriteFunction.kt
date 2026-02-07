package tanstack.router.core

import kotlinx.js.JsPlainObject
import web.url.URL

@JsPlainObject
external interface LocationRewriteFunctionOptions {
    val url: URL
}

/**
 * A function that will be called to rewrite the URL.
 *
 * @param options.url The URL to rewrite.
 * @return The rewritten URL (as a URL instance or full href string) or `undefined` if no rewrite is needed.
 */
typealias LocationRewriteFunction = (
    options: LocationRewriteFunctionOptions,
) -> URL?
