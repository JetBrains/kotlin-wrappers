// Automatically generated - do not modify!

package electron.core

external interface NotificationActionEventParams {
    /**
     * The index of the action that was activated.
     */
    var actionIndex: Double

    /**
     * The index of the selected item, if one was chosen. -1 if none was chosen.
     *
     * @platform win32
     */
    var selectionIndex: Double
}
