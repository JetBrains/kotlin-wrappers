@file:JsModule("react-popper")
@file:JsNonModule

package react.popper

import org.w3c.dom.HTMLElement
import popper.core.Options
import popper.core.ReferenceElement

external interface UsePopperOptions : Options

external fun usePopper(
    referenceElement: ReferenceElement?,
    popperElement: HTMLElement?,
    options: UsePopperOptions,
): PopperInstance
