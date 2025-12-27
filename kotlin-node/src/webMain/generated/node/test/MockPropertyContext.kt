// Automatically generated - do not modify!

@file:JsModule("node:test")
@file:JsQualifier("test")

package node.test

/**
 * @since v24.3.0
 */
external class MockPropertyContext<PropertyType /* default is Any? */> {
    /**
     * A getter that returns a copy of the internal array used to track accesses (get/set) to
     * the mocked property. Each entry in the array is an object with the following properties:
     */
    val accesses: Array<MockPropertyContextAccessesItem<PropertyType>>

    /**
     * This function returns the number of times that the property was accessed.
     * This function is more efficient than checking `ctx.accesses.length` because
     * `ctx.accesses` is a getter that creates a copy of the internal access tracking array.
     * @returns The number of times that the property was accessed (read or written).
     */
    fun accessCount(): Double

    /**
     * This function is used to change the value returned by the mocked property getter.
     * @param value The new value to be set as the mocked property value.
     */
    fun mockImplementation(value: PropertyType)

    /**
     * This function is used to change the behavior of an existing mock for a single
     * invocation. Once invocation `onAccess` has occurred, the mock will revert to
     * whatever behavior it would have used had `mockImplementationOnce()` not been
     * called.
     *
     * The following example creates a mock function using `t.mock.property()`, calls the
     * mock property, changes the mock implementation to a different value for the
     * next invocation, and then resumes its previous behavior.
     *
     * ```js
     * test('changes a mock behavior once', (t) => {
     *   const obj = { foo: 1 };
     *
     *   const prop = t.mock.property(obj, 'foo', 5);
     *
     *   assert.strictEqual(obj.foo, 5);
     *   prop.mock.mockImplementationOnce(25);
     *   assert.strictEqual(obj.foo, 25);
     *   assert.strictEqual(obj.foo, 5);
     * });
     * ```
     * @param value The value to be used as the mock's
     * implementation for the invocation number specified by `onAccess`.
     * @param onAccess The invocation number that will use `value`. If
     * the specified invocation has already occurred then an exception is thrown.
     * **Default:** The number of the next invocation.
     */
    fun mockImplementationOnce(
        value: PropertyType,
        onAccess: Number = definedExternally,
    )

    /**
     * Resets the access history of the mocked property.
     */
    fun resetAccesses()

    /**
     * Resets the implementation of the mock property to its original behavior. The
     * mock can still be used after calling this function.
     */
    fun restore()
}
