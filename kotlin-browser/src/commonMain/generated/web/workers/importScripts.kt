// Automatically generated - do not modify!

package web.workers

import web.url.URL

/**
 * Fetches each URL in urls, executes them one-by-one in the order they are passed, and then returns (or throws if something went amiss).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/importScripts)
 */
external fun importScripts(
    vararg urls: String,
)

external fun importScripts(
    vararg urls: URL,
)
