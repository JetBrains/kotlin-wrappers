@file:JsModule("react-popper")

package react.popper

import js.objects.JsPlainObject
import popper.core.Options
import popper.core.ReferenceElement
import web.html.HTMLElement

@JsPlainObject
external interface UsePopperOptions :
    Options

external fun usePopper(
    referenceElement: ReferenceElement?,
    popperElement: HTMLElement?,
    options: UsePopperOptions,
): PopperInstance
