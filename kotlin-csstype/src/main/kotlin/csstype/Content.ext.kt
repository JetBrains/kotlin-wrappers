@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

import org.w3c.dom.css.CSS

inline fun Content(): Content =
    string("''")

fun Content(
    value: String,
): Content =
    string("'" + CSS.escape(value) + "'")
