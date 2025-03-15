package js.reflect

actual external interface JsClass<T : JsAny> :
    JsAny {

    actual val name: String
}
