// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package history

/**
 * Actions represent the type of change to a location value.
 *
 * @see https://github.com/ReactTraining/history/tree/master/docs/api-reference.md#action
 */
// language=JavaScript
@JsName("""(/*union*/{Pop: 'POP', Push: 'PUSH', Replace: 'REPLACE'}/*union*/)""")
external enum class Action {
    /**
     * A POP indicates a change to an arbitrary index in the history stack, such
     * as a back or forward navigation. It does not describe the direction of the
     * navigation, only that the current index changed.
     *
     * Note: This is the default action for newly created history objects.
     */
    Pop,

    /**
     * A PUSH indicates a new entry being added to the history stack, such as when
     * a link is clicked and a new page loads. When this happens, all subsequent
     * entries in the stack are lost.
     */
    Push,

    /**
     * A REPLACE indicates the entry at the current index in the history stack
     * being replaced by a new one.
     */
    Replace,

    ;
}
