package js.iterable

actual external interface JsIterable<out T : JsAny?> :
    JsAny {

    actual interface Mixin<out T : JsAny?> :
        JsIterable<T>
}
