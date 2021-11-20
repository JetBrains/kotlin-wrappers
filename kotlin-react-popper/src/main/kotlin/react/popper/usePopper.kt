@file:JsModule("react-popper")
@file:JsNonModule

package react.popper

import org.w3c.dom.Element
import org.w3c.dom.HTMLElement
import popper.core.Options

external interface UsePopperOptions : Options

external fun usePopper(
    referenceElement: Element?, // or PopperJS.VirtualElement
    popperElement: HTMLElement?,
    options: UsePopperOptions,
): PopperInstance
