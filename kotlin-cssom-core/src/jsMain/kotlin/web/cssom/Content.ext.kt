@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

inline fun Content(): Content =
    string("''")

fun Content(
    value: String,
): Content =
    string("'" + CSS.escape(value) + "'")
