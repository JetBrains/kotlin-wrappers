@file:JsQualifier("Uint8Array")

package js.typedarrays

import js.array.MutableArrayLike
import js.array.ReadonlyArray
import js.array.Tuple2
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.buffer.ArrayBufferView
import js.collections.ListLike
import js.core.JsAny
import js.core.JsInt
import js.iterable.JsIterator
import kotlin.js.JsName
import kotlin.js.JsQualifier
import kotlin.js.definedExternally

@JsName("__proto__")
sealed external class TypedArray<
        S : TypedArray<S, R, B, T>,
        R : TypedArray<R, R, ArrayBuffer, T>,
        B : ArrayBufferLike,
        T : JsAny,
        > :
    ArrayBufferView<B>,
    MutableArrayLike<T>,
    ListLike<T> {

    /**
     * The size in bytes of each element in the array.
     */
    val BYTES_PER_ELEMENT: Int

    override val byteLength: Int

    /**
     * Returns the item located at the specified index.
     * @param index The zero-based index of the desired code unit. A negative index will count back from the last item.
     */
    fun at(index: Int): T?

    fun set(
        array: S,
        offset: Int = definedExternally,
    )

    fun set(
        array: ReadonlyArray<T>,
        offset: Int = definedExternally,
    )

    /**
     * Returns the this object after copying a section of the array identified by start and end
     * to the same array starting at position target
     * @param target If target is negative, it is treated as length+target where length is the
     * length of the array.
     * @param start If start is negative, it is treated as length+start. If end is negative, it
     * is treated as length+end.
     * @param end If not specified, length of the this object is used as its default value.
     */
    fun copyWithin(
        target: Int,
        start: Int,
        end: Int = definedExternally,
    ): S

    /**
     * Determines whether all the members of an array satisfy the specified test.
     * @param predicate A function that accepts up to three arguments. The every method calls
     * the predicate function for each element in the array until the predicate returns a value
     * which is coercible to the Boolean value false, or until the end of the array.
     * @param thisArg An object to which the this keyword can refer in the predicate function.
     * If thisArg is omitted, undefined is used as the this value.
     */
    fun every(
        predicate: (value: T) -> Unit,
    ): Boolean

    /**
     * Changes all array elements from `start` to `end` index to a static `value` and returns the modified array
     * @param value value to fill array section with
     * @param start index to start filling the array at. If start is negative, it is treated as
     * length+start where length is the length of the array.
     * @param end index to stop filling the array at. If end is negative, it is treated as
     * length+end.
     */
    fun fill(
        value: T,
        start: Int = definedExternally,
        end: Int = definedExternally,
    ): S

    /**
     * Returns the elements of an array that meet the condition specified in a callback function.
     * @param predicate A function that accepts up to three arguments. The filter method calls
     * the predicate function one time for each element in the array.
     * @param thisArg An object to which the this keyword can refer in the predicate function.
     * If thisArg is omitted, undefined is used as the this value.
     */
    fun filter(
        predicate: (value: T) -> Boolean,
    ): R

    /**
     * Returns the value of the first element in the array where predicate is true, and undefined
     * otherwise.
     * @param predicate find calls predicate once for each element of the array, in ascending
     * order, until it finds one where predicate returns true. If such an element is found, find
     * immediately returns that element value. Otherwise, find returns undefined.
     * @param thisArg If provided, it will be used as the this value for each invocation of
     * predicate. If it is not provided, undefined is used instead.
     */
    fun find(
        predicate: (value: T) -> Boolean,
    ): T?

    /**
     * Returns the index of the first element in the array where predicate is true, and -1
     * otherwise.
     * @param predicate find calls predicate once for each element of the array, in ascending
     * order, until it finds one where predicate returns true. If such an element is found,
     * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
     * @param thisArg If provided, it will be used as the this value for each invocation of
     * predicate. If it is not provided, undefined is used instead.
     */
    fun findIndex(
        predicate: (value: T) -> Boolean,
    ): Int

    /**
     * Returns the value of the last element in the array where predicate is true, and undefined
     * otherwise.
     * @param predicate findLast calls predicate once for each element of the array, in descending
     * order, until it finds one where predicate returns true. If such an element is found, findLast
     * immediately returns that element value. Otherwise, findLast returns undefined.
     * @param thisArg If provided, it will be used as the this value for each invocation of
     * predicate. If it is not provided, undefined is used instead.
     */
    fun findLast(
        predicate: (value: T) -> Boolean,
    ): T?

    /**
     * Returns the index of the last element in the array where predicate is true, and -1
     * otherwise.
     * @param predicate findLastIndex calls predicate once for each element of the array, in descending
     * order, until it finds one where predicate returns true. If such an element is found,
     * findLastIndex immediately returns that element index. Otherwise, findLastIndex returns -1.
     * @param thisArg If provided, it will be used as the this value for each invocation of
     * predicate. If it is not provided, undefined is used instead.
     */
    fun findLastIndex(
        predicate: (value: T) -> Boolean,
    ): Int

    /**
     * Performs the specified action for each element in an array.
     * @param callbackfn  A function that accepts up to three arguments. forEach calls the
     * callbackfn function one time for each element in the array.
     * @param thisArg  An object to which the this keyword can refer in the callbackfn function.
     * If thisArg is omitted, undefined is used as the this value.
     */
    override fun forEach(
        action: (item: T) -> Unit,
    )

    /**
     * Determines whether an array includes a certain element, returning true or false as appropriate.
     * @param searchElement The element to search for.
     * @param fromIndex The position in this array at which to begin searching for searchElement.
     */
    fun includes(
        searchElement: T,
        fromIndex: Int = definedExternally,
    ): Boolean

    /**
     * Returns the index of the first occurrence of a value in an array.
     * @param searchElement The value to locate in the array.
     * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the
     *  search starts at index 0.
     */
    fun indexOf(
        searchElement: T,
        fromIndex: Int = definedExternally,
    ): Int

    /**
     * Adds all the elements of an array separated by the specified separator string.
     * @param separator A string used to separate one element of an array from the next in the
     * resulting String. If omitted, the array elements are separated with a comma.
     */
    fun join(
        separator: String = definedExternally,
    ): String

    /**
     * Returns the index of the last occurrence of a value in an array.
     * @param searchElement The value to locate in the array.
     * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the
     * search starts at index 0.
     */
    fun lastIndexOf(
        searchElement: T,
        fromIndex: Int = definedExternally,
    ): Int

    /**
     * Calls a defined callback function on each element of an array, and returns an array that
     * contains the results.
     * @param callbackfn A function that accepts up to three arguments. The map method calls the
     * callbackfn function one time for each element in the array.
     * @param thisArg An object to which the this keyword can refer in the callbackfn function.
     * If thisArg is omitted, undefined is used as the this value.
     */
    fun map(
        transform: (value: T) -> T,
    ): R

    /**
     * Calls the specified callback function for all the elements in an array. The return value of
     * the callback function is the accumulated result, and is provided as an argument in the next
     * call to the callback function.
     * @param callbackfn A function that accepts up to four arguments. The reduce method calls the
     * callbackfn function one time for each element in the array.
     * @param initialValue If initialValue is specified, it is used as the initial value to start
     * the accumulation. The first call to the callbackfn function provides this value as an argument
     * instead of an array value.
     */
    fun reduce(
        operation: (previousValue: T, currentValue: T, currentIndex: Int) -> T,
    ): T

    /**
     * Calls the specified callback function for all the elements in an array. The return value of
     * the callback function is the accumulated result, and is provided as an argument in the next
     * call to the callback function.
     * @param callbackfn A function that accepts up to four arguments. The reduce method calls the
     * callbackfn function one time for each element in the array.
     * @param initialValue If initialValue is specified, it is used as the initial value to start
     * the accumulation. The first call to the callbackfn function provides this value as an argument
     * instead of an array value.
     */
    fun <U : JsAny?> reduce(
        operation: (previousValue: U, currentValue: T, currentIndex: Int) -> U,
        initialValue: U,
    ): U

    /**
     * Calls the specified callback function for all the elements in an array, in descending order.
     * The return value of the callback function is the accumulated result, and is provided as an
     * argument in the next call to the callback function.
     * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls
     * the callbackfn function one time for each element in the array.
     * @param initialValue If initialValue is specified, it is used as the initial value to start
     * the accumulation. The first call to the callbackfn function provides this value as an
     * argument instead of an array value.
     */
    fun reduceRight(
        operation: (previousValue: T, currentValue: T, currentIndex: Int) -> T,
    ): T

    /**
     * Calls the specified callback function for all the elements in an array, in descending order.
     * The return value of the callback function is the accumulated result, and is provided as an
     * argument in the next call to the callback function.
     * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls
     * the callbackfn function one time for each element in the array.
     * @param initialValue If initialValue is specified, it is used as the initial value to start
     * the accumulation. The first call to the callbackfn function provides this value as an argument
     * instead of an array value.
     */
    fun <U : JsAny?> reduceRight(
        operation: (previousValue: U, currentValue: T, currentIndex: Int) -> U,
        initialValue: U,
    ): U

    /**
     * Reverses the elements in an Array.
     */
    fun reverse(): S

    /**
     * Returns a section of an array.
     * @param start The beginning of the specified portion of the array.
     * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
     */
    fun slice(
        start: Int = definedExternally,
        end: Int = definedExternally,
    ): R

    /**
     * Determines whether the specified callback function returns true for any element of an array.
     * @param predicate A function that accepts up to three arguments. The some method calls
     * the predicate function for each element in the array until the predicate returns a value
     * which is coercible to the Boolean value true, or until the end of the array.
     * @param thisArg An object to which the this keyword can refer in the predicate function.
     * If thisArg is omitted, undefined is used as the this value.
     */
    fun some(
        predicate: (value: T) -> Boolean,
    ): Boolean

    /**
     * Sorts an array.
     * @param compareFn Function used to determine the order of the elements. It is expected to return
     * a negative value if first argument is less than second argument, zero if they're equal and a positive
     * value otherwise. If omitted, the elements are sorted in ascending order.
     * ```ts
     * [11,2,22,1].sort((a, b) => a - b)
     * ```
     */
    fun sort(
        comparison: (a: T, b: T) -> Int = definedExternally,
    ): S

    fun subarray(
        start: Int,
        end: Int,
    ): S

    /**
     * Converts a number to a string by using the current locale.
     */
    fun toLocaleString(): String

    /**
     * Copies the array and returns the copy with the elements in reverse order.
     */
    fun toReversed(): R

    /**
     * Copies and sorts the array.
     * @param compareFn Function used to determine the order of the elements. It is expected to return
     * a negative value if the first argument is less than the second argument, zero if they're equal, and a positive
     * value otherwise. If omitted, the elements are sorted in ascending order.
     * ```ts
     * const myNums = Int32Array<Buffer>.from([11, 2, -22, 1]);
     * myNums.toSorted((a, b) => a - b) // Int32Array<Buffer>(4) [-22, 1, 2, 11]
     * ```
     */
    fun toSorted(
        comparison: (a: T, b: T) -> Int = definedExternally,
    ): R

    /** Returns the primitive value of the specified object. */
    fun valueOf(): S

    /**
     * Copies the array and inserts the given number at the provided index.
     * @param index The index of the value to overwrite. If the index is
     * negative, then it replaces from the end of the array.
     * @param value The value to insert into the copied array.
     * @returns A copy of the original array with the inserted value.
     */
    fun with(
        index: Int,
        value: T,
    ): R

    override fun entries(): JsIterator<Tuple2<JsInt, T>>

    override fun keys(): JsIterator<JsInt>

    override fun values(): JsIterator<T>
}
