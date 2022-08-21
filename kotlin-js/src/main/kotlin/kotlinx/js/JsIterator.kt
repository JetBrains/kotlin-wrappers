package kotlinx.js

/** ES6 Iterator type. */
sealed external interface JsIterator<out T> {
    fun next(): Result<T, Void>

    sealed interface Result<out T, out TReturn> {
        val done: Boolean
    }

    sealed interface YieldResult<TYield> : Result<TYield, Void> {
        val value: TYield
    }

    sealed interface ReturnResult<TReturn> : Result<Void, TReturn> {
        val value: TReturn
    }
}
