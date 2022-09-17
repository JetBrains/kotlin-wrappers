@file:Suppress(
    "NOTHING_TO_INLINE",
)

package org.w3c.dom

import kotlinx.js.URL

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
