// Automatically generated - do not modify!

package node.test

/**
 * An instance of `SuiteContext` is passed to each suite function in order to
 * interact with the test runner. However, the `SuiteContext` constructor is not
 * exposed as part of the API.
 * @since v18.7.0, v16.17.0
 */
sealed external interface SuiteContext {
    /**
     * The absolute path of the test file that created the current suite. If a test file imports
     * additional modules that generate suites, the imported suites will return the path of the root test file.
     * @since v22.6.0
     */
    val filePath: String?

    /**
     * The name of the suite.
     * @since v18.8.0, v16.18.0
     */
    val name: String

    /**
     * Can be used to abort test subtasks when the test has been aborted.
     * @since v18.7.0, v16.17.0
     */
    val signal: web.abort.AbortSignal
}
