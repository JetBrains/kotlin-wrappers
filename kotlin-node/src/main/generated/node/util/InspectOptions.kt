// Automatically generated - do not modify!

package node.util

sealed external interface InspectOptions {
    /**
     * If set to `true`, getters are going to be
     * inspected as well. If set to `'get'` only getters without setter are going
     * to be inspected. If set to `'set'` only getters having a corresponding
     * setter are going to be inspected. This might cause side effects depending on
     * the getter function.
     * @default `false`
     */
    var getters: Any? /* 'get' | 'set' | boolean */
    var showHidden: Boolean?

    /**
     * @default 2
     */
    var depth: Number?
    var colors: Boolean?
    var customInspect: Boolean?
    var showProxy: Boolean?
    var maxArrayLength: Number?

    /**
     * Specifies the maximum number of characters to
     * include when formatting. Set to `null` or `Infinity` to show all elements.
     * Set to `0` or negative to show no characters.
     * @default 10000
     */
    var maxStringLength: Number?
    var breakLength: Number?

    /**
     * Setting this to `false` causes each object key
     * to be displayed on a new line. It will also add new lines to text that is
     * longer than `breakLength`. If set to a number, the most `n` inner elements
     * are united on a single line as long as all properties fit into
     * `breakLength`. Short array elements are also grouped together. Note that no
     * text will be reduced below 16 characters, no matter the `breakLength` size.
     * For more information, see the example below.
     * @default `true`
     */
    var compact: Any? /* boolean | number */
    var sorted: Any? /* boolean | ((a: string, b: string) => number) */
}
