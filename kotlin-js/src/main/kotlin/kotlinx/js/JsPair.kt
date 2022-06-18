@file:Suppress("NOTHING_TO_INLINE")

package kotlinx.js

/**
 * Details - https://youtrack.jetbrains.com/issue/KT-45481
 */

// TODO: make external in IR
class JsPair<out A, out B>
private constructor() {
    inline operator fun component1(): A = asDynamic()[0]
    inline operator fun component2(): B = asDynamic()[1]
}

inline fun <A, B> JsPair(a: A, b: B): JsPair<A, B> =
    arrayOf(a, b).unsafeCast<JsPair<A, B>>()
