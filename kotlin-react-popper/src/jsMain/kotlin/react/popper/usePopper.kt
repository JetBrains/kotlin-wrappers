@file:JsModule("react-popper")

package react.popper

import popper.core.ReferenceElement
import web.html.HTMLElement

external fun usePopper(
    referenceElement: ReferenceElement?,
    popperElement: HTMLElement?,
    options: UsePopperOptions,
): PopperInstance
