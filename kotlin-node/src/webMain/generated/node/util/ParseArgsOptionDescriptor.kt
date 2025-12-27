// Automatically generated - do not modify!

package node.util

sealed external interface ParseArgsOptionDescriptor {
    /**
     * Type of argument.
     */
    var type: ParseArgsOptionsType

    /**
     * Whether this option can be provided multiple times.
     * If `true`, all values will be collected in an array.
     * If `false`, values for the option are last-wins.
     * @default false.
     */
    var multiple: Boolean?

    /**
     * A single character alias for the option.
     */
    var short: String?

    /**
     * The value to assign to
     * the option if it does not appear in the arguments to be parsed. The value
     * must match the type specified by the `type` property. If `multiple` is
     * `true`, it must be an array. No default value is applied when the option
     * does appear in the arguments to be parsed, even if the provided value
     * is falsy.
     * @since v18.11.0
     */
    var default: Any? // string | boolean | string[] | boolean[] | undefined
}
