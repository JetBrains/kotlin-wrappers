package web.observable

import js.errors.JsError
import js.objects.JsPlainObject
import web.function.VoidFunction
import kotlin.js.JsAny

@JsPlainObject
external interface ObservableInspector<in T : JsAny?> :
    SubscriptionObserver<T> {

    val subscribe: VoidFunction?
    val abort: ((error: JsError) -> Unit)?
}
