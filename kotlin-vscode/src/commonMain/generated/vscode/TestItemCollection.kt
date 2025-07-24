// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.array.Tuple2
import js.core.JsAny
import js.core.JsString
import js.iterable.JsIterable

/**
 * Collection of test items, found in {@link TestItem.children} and
 * {@link TestController.items}.
 */
external interface TestItemCollection :
    JsIterable<Tuple2</* id: */ JsString, /* testItem: */ TestItem>> {
    /**
     * Gets the number of items in the collection.
     */
    val size: Int

    /**
     * Replaces the items stored by the collection.
     * @param items Items to store.
     */
    fun replace(items: ReadonlyArray<TestItem>)

    /**
     * Iterate over each entry in this collection.
     *
     * @param callback Function to execute for each entry.
     * @param thisArg The `this` context used when invoking the handler function.
     */
    fun forEach(
        callback: (
            item: TestItem,
            collection: TestItemCollection,
        ) -> Unit,
        thisArg: JsAny? = definedExternally,
    )

    /**
     * Adds the test item to the children. If an item with the same ID already
     * exists, it'll be replaced.
     * @param item Item to add.
     */
    fun add(item: TestItem)

    /**
     * Removes a single test item from the collection.
     * @param itemId Item ID to delete.
     */
    fun delete(itemId: String)

    /**
     * Efficiently gets a test item by ID, if it exists, in the children.
     * @param itemId Item ID to get.
     * @returns The found item or undefined if it does not exist.
     */
    fun get(itemId: String): TestItem?
}
