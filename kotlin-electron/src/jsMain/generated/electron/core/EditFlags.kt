package electron.core


external interface EditFlags {
    /**
     * Whether the renderer believes it can undo.
     */
    var canUndo: Boolean

    /**
     * Whether the renderer believes it can redo.
     */
    var canRedo: Boolean

    /**
     * Whether the renderer believes it can cut.
     */
    var canCut: Boolean

    /**
     * Whether the renderer believes it can copy.
     */
    var canCopy: Boolean

    /**
     * Whether the renderer believes it can paste.
     */
    var canPaste: Boolean

    /**
     * Whether the renderer believes it can delete.
     */
    var canDelete: Boolean

    /**
     * Whether the renderer believes it can select all.
     */
    var canSelectAll: Boolean

    /**
     * Whether the renderer believes it can edit text richly.
     */
    var canEditRichly: Boolean
}
