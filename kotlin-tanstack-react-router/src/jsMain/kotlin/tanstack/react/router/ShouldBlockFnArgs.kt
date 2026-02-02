package tanstack.react.router

import js.objects.JsPlainObject
import tanstack.history.HistoryAction

@JsPlainObject
external interface ShouldBlockFnArgs {
    val current: ShouldBlockFnLocation?
    val next: ShouldBlockFnLocation?
    val action: HistoryAction
}
