// Automatically generated - do not modify!

package actions.exec

sealed external interface ExecOutput {
    /**The exit code of the process */
    var exitCode: Number

    /**The entire stdout of the process as a string */
    var stdout: String

    /**The entire stderr of the process as a string */
    var stderr: String
}
