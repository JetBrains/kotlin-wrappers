// Automatically generated - do not modify!

package vscode

import js.core.Void

/**
 * The base interface for all quick input types.
 *
 * Quick input provides a unified way for extensions to interact with users through simple UI elements.
 * A quick input UI is initially not visible. After configuring it through its properties the extension
 * can make it visible by calling [show][QuickInput.show].
 *
 * There are several reasons why this UI might have to be hidden and the extension will be notified
 * through [onDidHide][QuickInput.onDidHide]. Examples include: an explicit call to
 * [hide][QuickInput.hide], the user pressing Esc, some other input UI opening, etc.
 *
 * A user pressing Enter or some other gesture implying acceptance of the current state does not
 * automatically hide this UI component. It is up to the extension to decide whether to accept the
 * user's input and if the UI should indeed be hidden through a call to [hide][QuickInput.hide].
 *
 * When the extension no longer needs this input UI, it should [dispose][QuickInput.dispose] it
 * to allow for freeing up any resources associated with it.
 *
 * See [QuickPick] and [InputBox] for concrete UIs.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput)
 */
external interface QuickInput :
    DisposableLike {
    /**
     * An optional title for the input UI.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.title)
     */
    var title: String?

    /**
     * An optional current step count for multi-step input flows.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.step)
     */
    var step: Int?

    /**
     * An optional total step count for multi-step input flows.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.totalSteps)
     */
    var totalSteps: Int?

    /**
     * Determines if the UI should allow for user input. Defaults to `true`.
     *
     * Change this to `false`, for example, while validating user input or loading data for the next
     * step in user input.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.enabled)
     */
    var enabled: Boolean

    /**
     * Determines if the UI should show a progress indicator. Defaults to `false`.
     *
     * Change this to `true`, for example, while loading more data or validating user input.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.busy)
     */
    var busy: Boolean

    /**
     * Determines if the UI should stay open even when losing UI focus. Defaults to `false`.
     * This setting is ignored on iPad and is always `false`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.ignoreFocusOut)
     */
    var ignoreFocusOut: Boolean

    /**
     * Makes the input UI visible in its current configuration.
     *
     * Any other input UI will first fire an [onDidHide][QuickInput.onDidHide] event.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.show)
     */
    fun show()

    /**
     * Hides this input UI.
     *
     * This will also fire an [onDidHide][QuickInput.onDidHide] event.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.hide)
     */
    fun hide()

    /**
     * An event signaling when this input UI is hidden.
     *
     * There are several reasons why this UI might have to be hidden and the extension will be notified
     * through [onDidHide][QuickInput.onDidHide]. Examples include: an explicit call to
     * [hide][QuickInput.hide], the user pressing Esc, some other input UI opening, etc.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.onDidHide)
     */
    val onDidHide: Event<Void>

    /**
     * Dispose of this input UI and any associated resources.
     *
     * If it is still visible, it is first hidden. After this call the input UI is no longer functional
     * and no additional methods or properties on it should be accessed. Instead a new input UI should
     * be created.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickInput.dispose)
     */
    override fun dispose()
}
