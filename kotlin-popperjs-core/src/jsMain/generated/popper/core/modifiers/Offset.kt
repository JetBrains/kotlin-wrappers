// Automatically generated - do not modify!

package popper.core.modifiers

import js.objects.JsPlainObject
import seskar.js.JsValue

sealed external interface OffsetType

@JsPlainObject
external interface OffsetOptions {
    val offset: OffsetType
}

@JsValue("offset")
external val Offset: popper.core.ModifierName<OffsetOptions>
