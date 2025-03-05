package js.promise

import js.core.JsAny
import js.reflect.unsafeCast
import kotlinx.coroutines.Deferred

internal actual var <T : JsAny?> Promise<T>.deferred: Deferred<T>?
    get() = unsafeCast<DeferredHolder<T>>(this).deferred?.get()
    set(value) {
        unsafeCast<DeferredHolder<T>>(this).deferred = value?.toJsReference()
    }

private external interface DeferredHolder<T : JsAny?> :
    JsAny {

    var deferred: JsReference<Deferred<T>>?
}
