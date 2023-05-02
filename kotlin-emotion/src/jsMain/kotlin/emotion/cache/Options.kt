package emotion.cache

import js.core.ReadonlyArray
import web.dom.Node
import web.html.HTMLElement

sealed external interface Options {
    var nonce: String?
    var stylisPlugins: ReadonlyArray<StylisPlugin>?
    var key: String
    var container: Node?
    var speedy: Boolean?
    var insertionPoint: HTMLElement?
}
