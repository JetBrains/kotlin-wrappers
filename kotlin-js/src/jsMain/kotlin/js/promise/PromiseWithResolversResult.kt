package js.promise

sealed external interface PromiseWithResolversResult<T> {
    val promise: Promise<T>
    val resolve: PromiseResolve<T>
    val reject: PromiseReject
}
