// Automatically generated - do not modify!

package vscode

import js.core.Void

/**
 * A light-weight user input UI that is initially not visible. After
 * configuring it through its properties the extension can make it
 * visible by calling [QuickInput.show].
 *
 * There are several reasons why this UI might have to be hidden and
 * the extension will be notified through [QuickInput.onDidHide].
 * (Examples include: an explicit call to [QuickInput.hide],
 * the user pressing Esc, some other input UI opening, etc.)
 *
 * A user pressing Enter or some other gesture implying acceptance
 * of the current state does not automatically hide this UI component.
 * It is up to the extension to decide whether to accept the user's input
 * and if the UI should indeed be hidden through a call to [QuickInput.hide].
 *
 * When the extension no longer needs this input UI, it should
 * [QuickInput.dispose] it to allow for freeing up
 * any resources associated with it.
 *
 * See [QuickPick] and [InputBox] for concrete UIs.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput)
 */
external interface QuickInput :
    DisposableLike {
    /**
     * An optional title.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.title)
     */
    var title: String?

    /**
     * An optional current step count.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.step)
     */
    var step: Int?

    /**
     * An optional total step count.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.totalSteps)
     */
    var totalSteps: Int?

    /**
     * If the UI should allow for user input. Defaults to true.
     *
     * Change this to false, e.g., while validating user input or
     * loading data for the next step in user input.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.enabled)
     */
    var enabled: Boolean

    /**
     * If the UI should show a progress indicator. Defaults to false.
     *
     * Change this to true, e.g., while loading more data or validating
     * user input.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.busy)
     */
    var busy: Boolean

    /**
     * If the UI should stay open even when loosing UI focus. Defaults to false.
     * This setting is ignored on iPad and is always false.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.ignoreFocusOut)
     */
    var ignoreFocusOut: Boolean

    /**
     * Makes the input UI visible in its current configuration. Any other input
     * UI will first fire an [QuickInput.onDidHide] event.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.show)
     */
    fun show()

    /**
     * Hides this input UI. This will also fire an [QuickInput.onDidHide]
     * event.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.hide)
     */
    fun hide()

    /**
     * An event signaling when this input UI is hidden.
     *
     * There are several reasons why this UI might have to be hidden and
     * the extension will be notified through [QuickInput.onDidHide].
     * (Examples include: an explicit call to [QuickInput.hide],
     * the user pressing Esc, some other input UI opening, etc.)
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.onDidHide)
     */
    val onDidHide: Event<Void>

    /**
     * Dispose of this input UI and any associated resources. If it is still
     * visible, it is first hidden. After this call the input UI is no longer
     * functional and no additional methods or properties on it should be
     * accessed. Instead a new input UI should be created.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.dispose)
     */
    override fun dispose()
}
