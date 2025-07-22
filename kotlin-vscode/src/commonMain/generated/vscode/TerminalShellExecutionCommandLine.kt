// Automatically generated - do not modify!

package vscode

/**
 * A command line that was executed in a terminal.
 */
external interface TerminalShellExecutionCommandLine {
    /**
     * The full command line that was executed, including both the command and its arguments.
     */
//  readonly value: string;

    /**
     * Whether the command line value came from a trusted source and is therefore safe to
     * execute without user additional confirmation, such as a notification that asks "Do you
     * want to execute (command)?". This verification is likely only needed if you are going to
     * execute the command again.
     *
     * This is `true` only when the command line was reported explicitly by the shell
     * integration script (ie. {@link TerminalShellExecutionCommandLineConfidence.High high confidence})
     * and it used a nonce for verification.
     */
//  readonly isTrusted: boolean;

    /**
     * The confidence of the command line value which is determined by how the value was
     * obtained. This depends upon the implementation of the shell integration script.
     */
//  readonly confidence: TerminalShellExecutionCommandLineConfidence;
}
