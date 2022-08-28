@file:Suppress("NOTHING_TO_INLINE")

package kotlinx.js

typealias JsPair<A, B> = JsTuple2<A, B>

inline fun <A, B> JsPair(a: A, b: B): JsTuple2<A, B> =
    tupleOf(a, b)
