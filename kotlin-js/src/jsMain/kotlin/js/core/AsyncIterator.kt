package js.core

import kotlin.js.Promise

sealed external interface AsyncIterator<out T> {
    val next: (/* ...args: [] | [TNext] */) -> Promise<JsIterator.Result<T, Void>>
}
