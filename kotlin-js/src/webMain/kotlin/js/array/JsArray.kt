@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
)

package js.array

expect external class JsArray<T : JsAny?> : JsAny {
    operator fun get(index: Int): T
    operator fun set(index: Int, value: T)

    val size: Int
}
