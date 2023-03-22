// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package actions.core

// language=JavaScript
@JsName("""(/*union*/{Success: 0, Failure: 1}/*union*/)""")
sealed external interface ExitCode {
    companion object {
        /**
         * A code indicating that the action was successful
         */
        val Success: ExitCode

        /**
         * A code indicating that the action was a failure
         */
        val Failure: ExitCode
    }
}
