package tanstack.react.router

import kotlinx.js.JsPlainObject

@JsPlainObject
internal /* raw */
external interface UseBlockerOptions {
    val shouldBlockFn: ShouldBlockFn
    val enableBeforeUnload: (() -> Boolean)? /* | Boolean */
    val disabled: Boolean?
    val withResolver: Boolean?
}
