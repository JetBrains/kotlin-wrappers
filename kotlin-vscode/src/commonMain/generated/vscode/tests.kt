// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Namespace for testing functionality. Tests are published by registering
 * {@link TestController} instances, then adding {@link TestItem TestItems}.
 * Controllers may also describe how to run tests by creating one or more
 * {@link TestRunProfile} instances.
 */
external object tests {
    /**
     * Creates a new test controller.
     *
     * @param id Identifier for the controller, must be globally unique.
     * @param label A human-readable label for the controller.
     * @returns An instance of the {@link TestController}.
     */
    fun createTestController(
        id: String,
        label: String,
    ): TestController
}
