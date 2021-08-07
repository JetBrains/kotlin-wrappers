@file:Suppress("NOTHING_TO_INLINE")

package react

external interface IntrinsicType<in P : RProps> : ElementType<P>

inline fun <P : RProps> IntrinsicType(
    tagName: String,
): IntrinsicType<P> =
    tagName.unsafeCast<IntrinsicType<P>>()
