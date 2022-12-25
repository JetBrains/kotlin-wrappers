// Automatically generated - do not modify!

package node.util

sealed external interface InspectOptions {
    /**
     * If `true`, object's non-enumerable symbols and properties are included in the formatted result.
     * `WeakMap` and `WeakSet` entries are also included as well as user defined prototype properties (excluding method properties).
     * @default false
     */
    var showHidden: Boolean?

    /**
     * Specifies the number of times to recurse while formatting object.
     * This is useful for inspecting large objects.
     * To recurse up to the maximum call stack size pass `Infinity` or `null`.
     * @default 2
     */
    var depth: Number?

    /**
     * If `true`, the output is styled with ANSI color codes. Colors are customizable.
     */
    var colors: Boolean?

    /**
     * If `false`, `[util.inspect.custom](depth, opts, inspect)` functions are not invoked.
     * @default true
     */
    var customInspect: Boolean?

    /**
     * If `true`, `Proxy` inspection includes the target and handler objects.
     * @default false
     */
    var showProxy: Boolean?

    /**
     * Specifies the maximum number of `Array`, `TypedArray`, `WeakMap`, and `WeakSet` elements
     * to include when formatting. Set to `null` or `Infinity` to show all elements.
     * Set to `0` or negative to show no elements.
     * @default 100
     */
    var maxArrayLength: Number?

    /**
     * Specifies the maximum number of characters to
     * include when formatting. Set to `null` or `Infinity` to show all elements.
     * Set to `0` or negative to show no characters.
     * @default 10000
     */
    var maxStringLength: Number?

    /**
     * The length at which input values are split across multiple lines.
     * Set to `Infinity` to format the input as a single line
     * (in combination with `compact` set to `true` or any number >= `1`).
     * @default 80
     */
    var breakLength: Number?

    /**
     * Setting this to `false` causes each object key
     * to be displayed on a new line. It will also add new lines to text that is
     * longer than `breakLength`. If set to a number, the most `n` inner elements
     * are united on a single line as long as all properties fit into
     * `breakLength`. Short array elements are also grouped together. Note that no
     * text will be reduced below 16 characters, no matter the `breakLength` size.
     * For more information, see the example below.
     * @default true
     */
    var compact: Any? /* boolean | number */

    /**
     * If set to `true` or a function, all properties of an object, and `Set` and `Map`
     * entries are sorted in the resulting string.
     * If set to `true` the default sort is used.
     * If set to a function, it is used as a compare function.
     */
    var sorted: Any? /* boolean | ((a: string, b: string) => number) */

    /**
     * If set to `true`, getters are going to be
     * inspected as well. If set to `'get'` only getters without setter are going
     * to be inspected. If set to `'set'` only getters having a corresponding
     * setter are going to be inspected. This might cause side effects depending on
     * the getter function.
     * @default false
     */
    var getters: Any? /* 'get' | 'set' | boolean */

    /**
     * If set to `true`, an underscore is used to separate every three digits in all bigints and numbers.
     * @default false
     */
    var numericSeparator: Boolean?
}
