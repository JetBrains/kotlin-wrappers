@file:JsModule("react-router-dom")

package react.router.dom


/**
 * Return a boolean indicating if there is an active view transition to the
 * given href.  You can use this value to render CSS classes or viewTransitionName
 * styles onto your elements
 *
 * @param href The destination href
 * @param [opts.relative] Relative routing type ("route" | "path")
 */
external fun useViewTransitionState(to: To, opts: UseViewTransitionStateOpts = definedExternally): Boolean
