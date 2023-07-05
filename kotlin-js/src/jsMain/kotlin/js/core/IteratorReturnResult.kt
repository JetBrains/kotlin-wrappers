package js.core

sealed external interface IteratorReturnResult<out TReturn> :
    IteratorResult<Void, TReturn> {
    val value: TReturn
}
