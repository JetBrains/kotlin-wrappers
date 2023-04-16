// Automatically generated - do not modify!

package node.test

sealed external interface TestFail {
    /**
     * Additional execution metadata.
     */
    var details: Any /* {
        /**
         * The duration of the test in milliseconds.
         */
        duration: number;

        /**
         * The error thrown by the test.
         */
        error: Error;
    } */

    /**
     * The test name.
     */
    var name: String

    /**
     * The nesting level of the test.
     */
    var nesting: Number

    /**
     * The ordinal number of the test.
     */
    var testNumber: Number

    /**
     * Present if `context.todo` is called.
     */
    var todo: Any? /* string | boolean */

    /**
     * Present if `context.skip` is called.
     */
    var skip: Any? /* string | boolean */
}
