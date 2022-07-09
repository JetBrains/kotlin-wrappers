@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react.popper

import org.w3c.dom.HTMLElement
import popper.core.VirtualElement

sealed external interface ReferenceElement

inline fun ReferenceElement(
    source: HTMLElement?,
): ReferenceElement? =
    source.unsafeCast<ReferenceElement?>()

inline fun ReferenceElement(
    source: VirtualElement?,
): ReferenceElement? =
    source.unsafeCast<ReferenceElement?>()
