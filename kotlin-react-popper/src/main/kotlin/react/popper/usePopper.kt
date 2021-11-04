@file:JsModule("react-popper")
@file:JsNonModule

package react.popper

import org.w3c.dom.Element
import org.w3c.dom.HTMLElement
import popper.PopperOptions

external interface UsePopperOptions<Modifiers> : PopperOptions<Modifiers>

external fun <Modifiers> usePopper(
    referenceElement: Element?, // or PopperJS.VirtualElement
    popperElement: HTMLElement?,
    options: UsePopperOptions<Modifiers>,
): PopperInstance
