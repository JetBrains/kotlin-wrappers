@file:Suppress(
    "NOTHING_TO_INLINE",
)

package js.core

typealias JsPair<A, B> = JsTuple2<A, B>

inline fun <A, B> JsPair(a: A, b: B): JsTuple2<A, B> =
    tupleOf(a, b)
