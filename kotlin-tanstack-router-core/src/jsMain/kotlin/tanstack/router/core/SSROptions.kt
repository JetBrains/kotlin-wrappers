package tanstack.router.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface SSROptions {
    val nonce: String?
}
