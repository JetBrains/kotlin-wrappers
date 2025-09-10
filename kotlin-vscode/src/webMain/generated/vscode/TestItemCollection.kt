// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.array.Tuple2
import js.iterable.JsIterable
import kotlin.js.JsAny
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * Collection of test items, found in [TestItem.children] and
 * [TestController.items].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestItemCollection)
 */
external interface TestItemCollection :
    JsIterable<Tuple2</* id: */ JsString, /* testItem: */ TestItem>> {
    /**
     * Gets the number of items in the collection.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestItemCollection.size)
     */
    val size: Int

    /**
     * Replaces the items stored by the collection.
     * @param items Items to store.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestItemCollection.replace)
     */
    fun replace(items: ReadonlyArray<TestItem>)

    /**
     * Iterate over each entry in this collection.
     *
     * @param callback Function to execute for each entry.
     * @param thisArg The `this` context used when invoking the handler function.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestItemCollection.forEach)
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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestItemCollection.add)
     */
    fun add(item: TestItem)

    /**
     * Removes a single test item from the collection.
     * @param itemId Item ID to delete.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestItemCollection.delete)
     */
    fun delete(itemId: String)

    /**
     * Efficiently gets a test item by ID, if it exists, in the children.
     * @param itemId Item ID to get.
     * @returns The found item or undefined if it does not exist.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestItemCollection.get)
     */
    fun get(itemId: String): TestItem?
}
