package js.iterable

actual external interface AsyncIterable<out T : JsAny?> :
    JsAny {

    actual interface Mixin<out T : JsAny?> :
        AsyncIterable<T>
}
