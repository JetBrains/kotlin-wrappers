// Automatically generated - do not modify!

package vscode

/**
 * Represents the state of a [Terminal].
 */
external interface TerminalState {
    /**
     * Whether the [Terminal] has been interacted with. Interaction means that the
     * terminal has sent data to the process which depending on the terminal's _mode_. By
     * default input is sent when a key is pressed or when a command or extension sends text,
     * but based on the terminal's mode it can also happen on:
     *
     * - a pointer click event
     * - a pointer scroll event
     * - a pointer move event
     * - terminal focus in/out
     *
     * For more information on events that can send data see "DEC Private Mode Set (DECSET)" on
     * https://invisible-island.net/xterm/ctlseqs/ctlseqs.html
     */
    val isInteractedWith: Boolean

    /**
     * The detected shell type of the [Terminal]. This will be `undefined` when there is
     * not a clear signal as to what the shell is, or the shell is not supported yet. This
     * value should change to the shell type of a sub-shell when launched (for example, running
     * `bash` inside `zsh`).
     *
     * Note that the possible values are currently defined as any of the following:
     * 'bash', 'cmd', 'csh', 'fish', 'gitbash', 'julia', 'ksh', 'node', 'nu', 'pwsh', 'python',
     * 'sh', 'wsl', 'zsh'.
     */
    val shell: String?
}
