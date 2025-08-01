// Automatically generated - do not modify!

package vscode

import js.core.JsAny
import js.core.Void
import kotlin.js.definedExternally

/**
 * A TestRun represents an in-progress or completed test run and
 * provides methods to report the state of individual tests in the run.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestRun)
 */
external interface TestRun {
    /**
     * The human-readable name of the run. This can be used to
     * disambiguate multiple sets of results in a test run. It is useful if
     * tests are run across multiple platforms, for example.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestRun.name)
     */
    val name: String?

    /**
     * A cancellation token which will be triggered when the test run is
     * canceled from the UI.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestRun.token)
     */
    val token: CancellationToken

    /**
     * Whether the test run will be persisted across reloads by the editor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestRun.isPersisted)
     */
    val isPersisted: Boolean

    /**
     * Indicates a test is queued for later execution.
     * @param test Test item to update.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestRun.enqueued)
     */
    fun enqueued(test: TestItem)

    /**
     * Indicates a test has started running.
     * @param test Test item to update.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestRun.started)
     */
    fun started(test: TestItem)

    /**
     * Indicates a test has been skipped.
     * @param test Test item to update.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestRun.skipped)
     */
    fun skipped(test: TestItem)

    /**
     * Indicates a test has failed. You should pass one or more
     * [TestMessages][TestMessage] to describe the failure.
     * @param test Test item to update.
     * @param message Messages associated with the test failure.
     * @param duration How long the test took to execute, in milliseconds.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestRun.failed)
     */
    fun failed(
        test: TestItem,
        message: JsAny, /* TestMessage | readonly TestMessage[] */
        duration: Int = definedExternally,
    )

    /**
     * Indicates a test has errored. You should pass one or more
     * [TestMessages][TestMessage] to describe the failure. This differs
     * from the "failed" state in that it indicates a test that couldn't be
     * executed at all, from a compilation error for example.
     * @param test Test item to update.
     * @param message Messages associated with the test failure.
     * @param duration How long the test took to execute, in milliseconds.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestRun.errored)
     */
    fun errored(
        test: TestItem,
        message: JsAny, /* TestMessage | readonly TestMessage[] */
        duration: Int = definedExternally,
    )

    /**
     * Indicates a test has passed.
     * @param test Test item to update.
     * @param duration How long the test took to execute, in milliseconds.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestRun.passed)
     */
    fun passed(
        test: TestItem,
        duration: Int = definedExternally,
    )

    /**
     * Appends raw output from the test runner. On the user's request, the
     * output will be displayed in a terminal. ANSI escape sequences,
     * such as colors and text styles, are supported. New lines must be given
     * as CRLF (`\r\n`) rather than LF (`\n`).
     *
     * @param output Output text to append.
     * @param location Indicate that the output was logged at the given
     * location.
     * @param test Test item to associate the output with.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestRun.appendOutput)
     */
    fun appendOutput(
        output: String,
        location: Location = definedExternally,
        test: TestItem = definedExternally,
    )

    /**
     * Adds coverage for a file in the run.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestRun.addCoverage)
     */
    fun addCoverage(fileCoverage: FileCoverage)

    /**
     * Signals the end of the test run. Any tests included in the run whose
     * states have not been updated will have their state reset.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestRun.end)
     */
    fun end()

    /**
     * An event fired when the editor is no longer interested in data
     * associated with the test run.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TestRun.onDidDispose)
     */
    var onDidDispose: Event<Void>
}
