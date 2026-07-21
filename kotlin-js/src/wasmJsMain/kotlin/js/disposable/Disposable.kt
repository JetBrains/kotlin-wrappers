package js.disposable

actual external interface Disposable :
    JsAny {

    actual interface Mixin :
        Disposable
}
