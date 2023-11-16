@file:JsModule("react-popper")

package react.popper

import popper.core.Options
import popper.core.ReferenceElement
import web.html.HTMLElement

external interface UsePopperOptions : Options

external fun usePopper(
    referenceElement: ReferenceElement?,
    popperElement: HTMLElement?,
    options: UsePopperOptions,
): PopperInstance
