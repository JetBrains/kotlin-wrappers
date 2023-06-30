package electron.core


external interface JumpListSettings {
    /**
     * The minimum number of items that will be shown in the Jump List (for a more
     * detailed description of this value see the MSDN docs).
     */
    var minItems: Double

    /**
     * Array of `JumpListItem` objects that correspond to items that the user has
     * explicitly removed from custom categories in the Jump List. These items must not
     * be re-added to the Jump List in the **next** call to `app.setJumpList()`,
     * Windows will not display any custom category that contains any of the removed
     * items.
     */
    var removedItems: js.core.ReadonlyArray<JumpListItem>
}
