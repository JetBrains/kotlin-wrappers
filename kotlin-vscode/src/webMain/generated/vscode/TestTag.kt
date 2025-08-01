// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Tags can be associated with [TestItems][TestItem] and
 * [TestRunProfiles][TestRunProfile]. A profile with a tag can only
 * execute tests that include that tag in their [TestItem.tags] array.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestTag)
 */
open external class TestTag {
    /**
     * ID of the test tag. `TestTag` instances with the same ID are considered
     * to be identical.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestTag.id)
     */
    val id: String

    /**
     * Creates a new TestTag instance.
     * @param id ID of the test tag.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestTag.constructor)
     */
    constructor(id: String)
}
