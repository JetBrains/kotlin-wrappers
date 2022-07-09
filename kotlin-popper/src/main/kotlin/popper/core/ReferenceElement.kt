@file:Suppress(
    "NOTHING_TO_INLINE",
)

package popper.core

import org.w3c.dom.HTMLElement

sealed external interface ReferenceElement

inline fun ReferenceElement(
    source: HTMLElement?,
): ReferenceElement? =
    source.unsafeCast<ReferenceElement?>()

inline fun ReferenceElement(
    source: VirtualElement?,
): ReferenceElement? =
    source.unsafeCast<ReferenceElement?>()
