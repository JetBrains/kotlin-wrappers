package electron.core


external interface JumpListCategory {
// Docs: https://electronjs.org/docs/api/structures/jump-list-category
    /**
     * Array of `JumpListItem` objects if `type` is `tasks` or `custom`, otherwise it
     * should be omitted.
     */
    var items: js.core.ReadonlyArray<JumpListItem>?

    /**
     * Must be set if `type` is `custom`, otherwise it should be omitted.
     */
    var name: String?

    /**
     * One of the following:
     */
    var type: (JumpListCategoryType)?
}
