@file:Suppress("NOTHING_TO_INLINE")

package react

external interface IntrinsicType<in P : Props> : ElementType<P>

inline fun <P : Props> IntrinsicType(
    tagName: String,
): IntrinsicType<P> =
    tagName.unsafeCast<IntrinsicType<P>>()
