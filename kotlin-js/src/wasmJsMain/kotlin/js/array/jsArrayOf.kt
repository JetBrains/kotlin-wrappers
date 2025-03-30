@file:JsQualifier("Array")

package js.array

@JsName("of")
actual external fun <T : JsAny?> jsArrayOf(
    vararg elements: T,
): ReadonlyArray<T>
