// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

external class CommandLine {
// Docs: https://electronjs.org/docs/api/command-line
    /**
     * Append an argument to Chromium's command line. The argument will be quoted
     * correctly. Switches will precede arguments regardless of appending order.
     *
     * If you're appending an argument like `--switch=value`, consider using
     * `appendSwitch('switch', 'value')` instead.
     *
     * > [!NOTE] This will not affect `process.argv`. The intended usage of this
     * function is to control Chromium's behavior.
     */
    fun appendArgument(value: String)

    /**
     * Append a switch (with optional `value`) to Chromium's command line.
     *
     * > [!NOTE] This will not affect `process.argv`. The intended usage of this
     * function is to control Chromium's behavior.
     */
    fun appendSwitch(
        the_switch: String,
        value: String = definedExternally,
    )

    /**
     * The command-line switch value.
     *
     * This function is meant to obtain Chromium command line switches. It is not meant
     * to be used for application-specific command line arguments. For the latter,
     * please use `process.argv`.
     *
     * > [!NOTE] When the switch is not present or has no value, it returns empty
     * string.
     */
    fun getSwitchValue(the_switch: String): String

    /**
     * Whether the command-line switch is present.
     */
    fun hasSwitch(the_switch: String): Boolean

    /**
     * Removes the specified switch from Chromium's command line.
     *
     * > [!NOTE] This will not affect `process.argv`. The intended usage of this
     * function is to control Chromium's behavior.
     */
    fun removeSwitch(the_switch: String)
}
