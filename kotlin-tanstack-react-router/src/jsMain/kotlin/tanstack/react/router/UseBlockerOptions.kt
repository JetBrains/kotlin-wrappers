package tanstack.react.router

import js.objects.JsPlainObject

@JsPlainObject
internal external interface UseBlockerOptions {
    val shouldBlockFn: ShouldBlockFn
    val enableBeforeUnload: (() -> Boolean)? /* | Boolean */
    val disabled: Boolean?
    val withResolver: Boolean?
}
