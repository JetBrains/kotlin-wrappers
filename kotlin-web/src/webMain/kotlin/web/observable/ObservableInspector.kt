package web.observable

import js.errors.JsError
import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi
import web.function.VoidFunction
import kotlin.js.JsAny

@JsPlainObject
@ExperimentalWebApi
external interface ObservableInspector<in T : JsAny?> :
    SubscriptionObserver<T> {

    val subscribe: VoidFunction?
    val abort: ((error: JsError) -> Unit)?
}
