@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

import cssom.CSS

inline fun Content(): Content =
    string("''")

fun Content(
    value: String,
): Content =
    string("'" + CSS.escape(value) + "'")
