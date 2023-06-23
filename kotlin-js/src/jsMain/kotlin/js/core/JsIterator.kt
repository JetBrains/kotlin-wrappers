package js.core

/** ES6 Iterator type. */
sealed external interface JsIterator<out T> {
    fun next(): Result<T, Void>

    sealed interface Result<out T, out TReturn> {
        val done: Boolean
    }

    sealed interface YieldResult<out TYield> : Result<TYield, Void> {
        val value: TYield
    }

    sealed interface ReturnResult<out TReturn> : Result<Void, TReturn> {
        val value: TReturn
    }
}
