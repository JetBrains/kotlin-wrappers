package js.core

import kotlin.js.Promise

sealed external interface AsyncIterator<out T, out TReturn, in TNext> {
    fun next(value: TNext = definedExternally): Promise<JsIterator.Result<T, TReturn>>
}
