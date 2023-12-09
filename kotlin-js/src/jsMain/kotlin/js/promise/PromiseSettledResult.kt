package js.promise

sealed external interface PromiseSettledResult<T> {
    val status: PromiseSettledResultStatus
}

fun <T> PromiseSettledResult<T>.toResult(): Result<T> =
    when (status) {
        PromiseSettledResultStatus.fulfilled,
        -> Result.success(unsafeCast<PromiseFulfilledResult<T>>().value)

        PromiseSettledResultStatus.rejected,
        -> Result.failure(unsafeCast<PromiseRejectedResult>().reason)

        else -> error("Unknown settled result `$status`")
    }
