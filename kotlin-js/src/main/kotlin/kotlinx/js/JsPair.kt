@file:Suppress("NOTHING_TO_INLINE")

package kotlinx.js

@Deprecated("Use `JsTuple2` instead")
typealias JsPair<A, B> = JsTuple2<A, B>

@Deprecated("Use `tupleOf` instead")
inline fun <A, B> JsPair(a: A, b: B): JsTuple2<A, B> =
    tupleOf(a, b)
