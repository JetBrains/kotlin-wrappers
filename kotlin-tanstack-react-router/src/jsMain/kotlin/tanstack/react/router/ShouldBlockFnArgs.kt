package tanstack.react.router

import kotlinx.js.JsPlainObject
import tanstack.history.HistoryAction

@JsPlainObject
external interface ShouldBlockFnArgs {
    val current: ShouldBlockFnLocation? /* MakeShouldBlockFnLocationUnion */
    val next: ShouldBlockFnLocation?    /* MakeShouldBlockFnLocationUnion */
    val action: HistoryAction
}
