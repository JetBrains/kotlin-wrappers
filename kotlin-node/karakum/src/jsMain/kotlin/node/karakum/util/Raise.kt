@file:OptIn(ExperimentalContracts::class)

package node.karakum.util

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract
import kotlin.coroutines.cancellation.CancellationException

object RaiseCancellationException : CancellationException()

object Raise {
    fun raise(): Nothing = throw RaiseCancellationException

    fun ensure(condition: Boolean) {
        contract { returns() implies condition }
        return if (condition) Unit else raise()
    }

    fun <A> ensureNotNull(value: A?): A {
        contract { returns() implies (value != null) }
        return value ?: raise()
    }
}
