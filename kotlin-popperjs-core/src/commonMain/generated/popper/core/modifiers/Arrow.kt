// Automatically generated - do not modify!

package popper.core.modifiers

import js.objects.JsPlainObject
import seskar.js.JsValue

external interface PaddingType

@JsPlainObject
external interface ArrowOptions {
    val element: web.html.HTMLElement?
    val padding: PaddingType
}

@JsValue("arrow")
external val Arrow: popper.core.ModifierName<ArrowOptions>
