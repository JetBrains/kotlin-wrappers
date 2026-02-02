package tanstack.react.router

import js.objects.JsPlainObject
import tanstack.history.HistoryAction

@JsPlainObject
external interface BlockerResolver :
    HasBlockerResolverStatus {
    val current: ShouldBlockFnLocation? /* MakeShouldBlockFnLocationUnion */
    val next: ShouldBlockFnLocation?    /* MakeShouldBlockFnLocationUnion */
    val action: HistoryAction
    val proceed: () -> Unit
    val reset: () -> Unit
}
