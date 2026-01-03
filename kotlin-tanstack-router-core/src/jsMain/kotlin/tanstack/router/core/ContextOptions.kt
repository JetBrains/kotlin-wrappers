package tanstack.router.core

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.abort.AbortController

@JsPlainObject
external interface ContextOptions {
    val abortController: AbortController
    val preload: Boolean
    val params: Params
    val location: ParsedLocation
    val buildLocation: BuildLocationFn
    val cause: Cause
    val matches: ReadonlyArray<* /* MakeRouteMatchUnion */>
}
