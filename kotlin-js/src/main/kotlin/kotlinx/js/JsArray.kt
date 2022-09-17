package kotlinx.js

@JsName("Array")
sealed external class JsArray {
    companion object {
        fun <T> from(source: JsIterator<T>): Array<T>
        fun <T> from(source: JsIterable<T>): Array<T>
    }
}
