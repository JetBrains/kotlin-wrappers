@file:OptIn(ExperimentalContracts::class)

package electron.karakum.util

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

// TODO: remove after new arrow release
fun <T> nullable(block: Raise.() -> T): T? {
    contract { callsInPlace(block, InvocationKind.AT_MOST_ONCE) }
    return try {
        block(Raise)
    } catch (_: RaiseCancellationException) {
        null
    }
}
