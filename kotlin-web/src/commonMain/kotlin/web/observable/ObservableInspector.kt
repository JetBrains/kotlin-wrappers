package web.observable

import js.core.JsAny
import js.errors.JsError
import js.objects.JsPlainObject

@JsPlainObject
external interface ObservableInspector<T : JsAny?> :
    SubscriptionObserver<T> {

    val subscribe: (() -> Unit)?
    val abort: ((error: JsError) -> Unit)?
}
