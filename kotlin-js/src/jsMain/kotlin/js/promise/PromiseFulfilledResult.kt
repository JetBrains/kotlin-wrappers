package js.promise

sealed external interface PromiseFulfilledResult<T>
    : PromiseSettledResult<T> {
    // status: PromiseSettledResultStatus.fulfilled
    val value: T
}
