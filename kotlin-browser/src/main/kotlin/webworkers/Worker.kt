@file:Suppress(
    "NOTHING_TO_INLINE",
)

package webworkers

import web.url.URL

typealias Worker = org.w3c.dom.Worker
typealias WorkerOptions = org.w3c.dom.WorkerOptions

inline fun Worker(
    scriptURL: URL,
): Worker =
    Worker(
        scriptURL = scriptURL.unsafeCast<String>()
    )

inline fun Worker(
    scriptURL: URL,
    options: WorkerOptions,
): Worker =
    Worker(
        scriptURL = scriptURL.unsafeCast<String>(),
        options = options,
    )
