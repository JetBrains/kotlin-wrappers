package js.promise

import js.reflect.unsafeCast
import kotlinx.coroutines.Deferred

internal actual var <T : JsAny?> Promise<T>.deferred: Deferred<T>?
    get() = unsafeCast<DeferredHolder<T>>(this).deferred
    set(value) {
        unsafeCast<DeferredHolder<T>>(this).deferred = value
    }

private external interface DeferredHolder<T : JsAny?> {
    var deferred: Deferred<T>?
}
