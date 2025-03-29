package js.core

import kotlin.js.toJsString as ktToJsString

actual typealias JsString = kotlin.js.JsString

actual fun String.toJsString(): JsString = this.ktToJsString()
