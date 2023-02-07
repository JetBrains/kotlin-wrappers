@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

import web.cssom.CSS

inline fun Content(): Content =
    string("''")

fun Content(
    value: String,
): Content =
    string("'" + CSS.escape(value) + "'")
