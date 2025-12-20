package js.array

@JsQualifier("Array")
@JsName("of")
actual external fun <T : JsAny?> jsArrayOf(
    vararg elements: T,
): ReadonlyArray<T>
