@file:Suppress("NOTHING_TO_INLINE")

package react

import csstype.Selector

sealed external interface IntrinsicType<in P : PropsWithClassName> :
    ElementType<P>,
    Selector

inline fun <P : PropsWithClassName> IntrinsicType(
    tagName: String,
): IntrinsicType<P> =
    tagName.unsafeCast<IntrinsicType<P>>()
