package tanstack.react.router

import kotlin.contracts.contract

@Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "CANNOT_CHECK_FOR_ERASED",
)
internal inline fun isBlockerResolver(
    value: HasBlockerResolverStatus,
): Boolean {
    contract {
        returns(true) implies (value is BlockerResolver)
    }

    return value.status == BlockerResolverStatus.blocked
}
