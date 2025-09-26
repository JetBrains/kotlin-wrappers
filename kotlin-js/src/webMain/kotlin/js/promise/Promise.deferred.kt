package js.promise

import js.reflect.internal.kotlinGet
import js.reflect.internal.kotlinSet
import js.symbol.Symbol
import kotlinx.coroutines.Deferred
import kotlin.js.JsAny

private val DEFERRED: Symbol = Symbol("@@deferred")

@Suppress("UNCHECKED_CAST")
internal var <T : JsAny?> Promise<T>.deferred: Deferred<T>?
    get() = kotlinGet(this, DEFERRED) as Deferred<T>?
    set(value) {
        kotlinSet(this, DEFERRED, value)
    }
