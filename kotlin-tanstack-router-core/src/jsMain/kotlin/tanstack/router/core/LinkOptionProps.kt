package tanstack.router.core

import web.window.WindowTarget

@JsExternalInheritorsOnly
external interface LinkOptionProps {
    /**
     * The standard anchor tag target attribute
     */
    var target: WindowTarget?

    /**
     * Configurable options to determine if the link should be considered active or not
     * @default {exact:true,includeHash:true}
     */
    var activeOptions: ActiveOptions?

    /**
     * The preloading strategy for this link
     * - `false` - No preloading
     * - `'intent'` - Preload the linked route on hover and cache it for this many milliseconds in hopes that the user will eventually navigate there.
     * - `'viewport'` - Preload the linked route when it enters the viewport
     */
    var preload: Preload?

    /**
     * When a preload strategy is set, this delays the preload by this many milliseconds.
     * If the user exits the link before this delay, the preload will be cancelled.
     */
    var preloadDelay: Int?

    /**
     * Control whether the link should be disabled or not
     * If set to `true`, the link will be rendered without an `href` attribute
     * @default false
     */
    var disabled: Boolean?

    /**
     * When the preload strategy is set to `intent`, this controls the proximity of the link to the cursor before it is preloaded.
     * If the user exits this proximity before this delay, the preload will be cancelled.
     */
    var preloadIntentProximity: Int?
}
