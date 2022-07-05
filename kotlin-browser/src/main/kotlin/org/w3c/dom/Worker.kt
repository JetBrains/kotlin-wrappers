@file:Suppress(
    "NOTHING_TO_INLINE",
)

package org.w3c.dom

import org.w3c.dom.url.URL

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
