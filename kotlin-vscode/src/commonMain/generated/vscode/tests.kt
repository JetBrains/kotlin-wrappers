// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Namespace for testing functionality. Tests are published by registering
 * [TestController] instances, then adding [TestItems][TestItem].
 * Controllers may also describe how to run tests by creating one or more
 * [TestRunProfile] instances.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#tests)
 */
external object tests {
    /**
     * Creates a new test controller.
     *
     * @param id Identifier for the controller, must be globally unique.
     * @param label A human-readable label for the controller.
     * @returns An instance of the [TestController].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#tests.createTestController)
     */
    fun createTestController(
        id: String,
        label: String,
    ): TestController
}
