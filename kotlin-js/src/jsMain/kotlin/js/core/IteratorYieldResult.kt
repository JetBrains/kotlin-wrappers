package js.core

sealed external interface IteratorYieldResult<out TYield> :
    IteratorResult<TYield, Void> {
    val value: TYield
}
