@file:Suppress(
    "NOTHING_TO_INLINE",
)

package popper.core

import js.reflect.unsafeCast
import web.dom.Element

sealed external interface ReferenceElement

inline fun ReferenceElement(
    source: Element?,
): ReferenceElement? =
    unsafeCast(source)

inline fun ReferenceElement(
    source: VirtualElement?,
): ReferenceElement? =
    unsafeCast(source)
