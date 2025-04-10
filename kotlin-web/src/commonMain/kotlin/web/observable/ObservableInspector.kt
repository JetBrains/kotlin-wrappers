package web.observable

import js.core.JsAny
import js.errors.JsError
import js.objects.JsPlainObject
import web.function.VoidFunction

@JsPlainObject
external interface ObservableInspector<T : JsAny?> :
    SubscriptionObserver<T> {

    val subscribe: VoidFunction?
    val abort: ((error: JsError) -> Unit)?
}
