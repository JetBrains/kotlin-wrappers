@file:JsModule("react-router-dom")

package react.router.dom

import web.window.BeforeUnloadEvent

/**
 * Setup a callback to be fired on the window's `beforeunload` event. This is
 * useful for saving some data to `window.localStorage` just before the page
 * refreshes.
 *
 * Note: The `callback` argument should be a function created with
 * `React.useCallback()`.
 */
external fun useBeforeUnload(callback: (event: BeforeUnloadEvent) -> Any?, options: UseBeforeUnloadOptions = definedExternally): Unit
