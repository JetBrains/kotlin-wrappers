package react

import js.reflect.unsafeCast
import web.cssom.Selector

sealed external interface IntrinsicType<in P : PropsWithClassName> :
    ElementType<P>,
    Selector

inline fun <P : PropsWithClassName> IntrinsicType(
    tagName: String,
): IntrinsicType<P> =
    unsafeCast(tagName)
