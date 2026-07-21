package js.disposable

actual external interface AsyncDisposable :
    JsAny {

    actual interface Mixin :
        AsyncDisposable
}
