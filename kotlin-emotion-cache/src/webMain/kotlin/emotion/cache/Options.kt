package emotion.cache

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.dom.Node
import web.html.HTMLElement

@JsPlainObject
external interface Options {
    val nonce: String?
    val stylisPlugins: ReadonlyArray<StylisPlugin>?
    val key: String
    val container: Node?
    val speedy: Boolean?
    val insertionPoint: HTMLElement?
}
