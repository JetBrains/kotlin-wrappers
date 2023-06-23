package js.core

import kotlin.js.Promise

sealed external interface AsyncIterator<out T> {
    fun next(): Promise<JsIterator.Result<T, *>>
}
