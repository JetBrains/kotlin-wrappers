package js.array

@JsName("Array")
actual external class JsArray<T : JsAny?> : JsAny {
    actual operator fun get(index: Int): T
    actual operator fun set(index: Int, value: T)

    @JsName("length")
    actual val size: Int
}
