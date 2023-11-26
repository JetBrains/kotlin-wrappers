// Automatically generated - do not modify!

package js.atomic

import js.core.BigInt
import js.typedarrays.BigInt64Array
import js.typedarrays.Int32Array
import js.typedarrays.TypedArray

external object Atomics {
    /**
     * Adds a value to the value at the given position in the array, returning the original value.
     * Until this atomic operation completes, any other read or write operation against the array
     * will block.
     */
    fun <T : Comparable<T>> add(
        typedArray: TypedArray<*, T>,
        index: Int,
        value: T,
    ): T

    /**
     * Stores the bitwise AND of a value with the value at the given position in the array,
     * returning the original value. Until this atomic operation completes, any other read or
     * write operation against the array will block.
     */
    fun <T : Comparable<T>> and(
        typedArray: TypedArray<*, T>,
        index: Int,
        value: T,
    ): T

    /**
     * Replaces the value at the given position in the array if the original value equals the given
     * expected value, returning the original value. Until this atomic operation completes, any
     * other read or write operation against the array will block.
     */
    fun <T : Comparable<T>> compareExchange(
        typedArray: TypedArray<*, T>,
        index: Int,
        expectedValue: T,
        replacementValue: T,
    ): T

    /**
     * Replaces the value at the given position in the array, returning the original value. Until
     * this atomic operation completes, any other read or write operation against the array will
     * block.
     */
    fun <T : Comparable<T>> exchange(
        typedArray: TypedArray<*, T>,
        index: Int,
        value: T,
    ): T

    /**
     * Returns a value indicating whether high-performance algorithms can use atomic operations
     * (`true`) or must use locks (`false`) for the given number of bytes-per-element of a typed
     * array.
     */
    fun isLockFree(size: Int): Boolean

    /**
     * Returns the value at the given position in the array. Until this atomic operation completes,
     * any other read or write operation against the array will block.
     */
    fun <T : Comparable<T>> load(
        typedArray: TypedArray<*, T>,
        index: Int,
    ): T

    /**
     * Wakes up sleeping agents that are waiting on the given index of the array, returning the
     * number of agents that were awoken.
     * @param typedArray A shared Int32Array.
     * @param index The position in the typedArray to wake up on.
     * @param count The number of sleeping agents to notify. Defaults to +Infinity.
     */
    fun notify(
        typedArray: Int32Array,
        index: Int,
        count: Int = definedExternally,
    ): Int

    /**
     * Wakes up sleeping agents that are waiting on the given index of the array, returning the
     * number of agents that were awoken.
     * @param typedArray A shared BigInt64Array.
     * @param index The position in the typedArray to wake up on.
     * @param count The number of sleeping agents to notify. Defaults to +Infinity.
     */
    fun notify(
        typedArray: BigInt64Array,
        index: Int,
        count: Int = definedExternally,
    ): Int

    /**
     * Stores the bitwise OR of a value with the value at the given position in the array,
     * returning the original value. Until this atomic operation completes, any other read or write
     * operation against the array will block.
     */
    fun <T : Comparable<T>> or(
        typedArray: TypedArray<*, T>,
        index: Int,
        value: T,
    ): T

    /**
     * Stores a value at the given position in the array, returning the new value. Until this
     * atomic operation completes, any other read or write operation against the array will block.
     */
    fun <T : Comparable<T>> store(
        typedArray: TypedArray<*, T>,
        index: Int,
        value: T,
    ): T

    /**
     * Subtracts a value from the value at the given position in the array, returning the original
     * value. Until this atomic operation completes, any other read or write operation against the
     * array will block.
     */
    fun <T : Comparable<T>> sub(
        typedArray: TypedArray<*, T>,
        index: Int,
        value: T,
    ): T

    /**
     * If the value at the given position in the array is equal to the provided value, the current
     * agent is put to sleep causing execution to suspend until the timeout expires (returning
     * `"timed-out"`) or until the agent is awoken (returning `"ok"`); otherwise, returns
     * `"not-equal"`.
     */
    fun wait(
        typedArray: Int32Array,
        index: Int,
        value: Int,
        timeout: Int = definedExternally,
    ): WaitStatus

    /**
     * If the value at the given position in the array is equal to the provided value, the current
     * agent is put to sleep causing execution to suspend until the timeout expires (returning
     * `"timed-out"`) or until the agent is awoken (returning `"ok"`); otherwise, returns
     * `"not-equal"`.
     */
    fun wait(
        typedArray: BigInt64Array,
        index: Int,
        value: BigInt,
        timeout: Int = definedExternally,
    ): WaitStatus

    /**
     * A non-blocking, asynchronous version of wait which is usable on the main thread.
     * Waits asynchronously on a shared memory location and returns a Promise
     * @param typedArray A shared Int32Array or BigInt64Array.
     * @param index The position in the typedArray to wait on.
     * @param value The expected value to test.
     * @param [timeout] The expected value to test.
     */
    fun waitAsync(
        typedArray: Int32Array,
        index: Int,
        value: Int,
        timeout: Int = definedExternally,
    ): WaitResult

    /**
     * A non-blocking, asynchronous version of wait which is usable on the main thread.
     * Waits asynchronously on a shared memory location and returns a Promise
     * @param typedArray A shared Int32Array or BigInt64Array.
     * @param index The position in the typedArray to wait on.
     * @param value The expected value to test.
     * @param [timeout] The expected value to test.
     */
    fun waitAsync(
        typedArray: BigInt64Array,
        index: Int,
        value: BigInt,
        timeout: Int = definedExternally,
    ): WaitResult

    /**
     * Stores the bitwise XOR of a value with the value at the given position in the array,
     * returning the original value. Until this atomic operation completes, any other read or write
     * operation against the array will block.
     */
    fun <T : Comparable<T>> xor(
        typedArray: TypedArray<*, T>,
        index: Int,
        value: T,
    ): T
}
