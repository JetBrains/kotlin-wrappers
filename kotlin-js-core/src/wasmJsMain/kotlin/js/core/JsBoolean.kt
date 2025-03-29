package js.core

import kotlin.js.toBoolean as ktToBoolean
import kotlin.js.toJsBoolean as ktToJsBoolean

actual typealias JsBoolean = kotlin.js.JsBoolean

actual fun kotlin.js.JsBoolean.toBoolean(): Boolean = this.ktToBoolean()

actual fun Boolean.toJsBoolean(): JsBoolean = this.ktToJsBoolean()
