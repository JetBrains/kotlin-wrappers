// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Tags can be associated with [TestItems][TestItem] and
 * [TestRunProfiles][TestRunProfile]. A profile with a tag can only
 * execute tests that include that tag in their [TestItem.tags] array.
 */
open external class TestTag {
    /**
     * ID of the test tag. `TestTag` instances with the same ID are considered
     * to be identical.
     */
    val id: String

    /**
     * Creates a new TestTag instance.
     * @param id ID of the test tag.
     */
    constructor(id: String)
}
