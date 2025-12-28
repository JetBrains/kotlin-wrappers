@file:JsModule("@tanstack/react-router")

package tanstack.react.router

import react.FC

/**
 * A strongly-typed anchor component for declarative navigation.
 * Handles path, search, hash and state updates with optional route preloading
 * and active-state styling.
 *
 * Props:
 * - `preload`: Controls route preloading (eg. 'intent', 'render', 'viewport', true/false)
 * - `preloadDelay`: Delay in ms before preloading on hover
 * - `activeProps`/`inactiveProps`: Additional props merged when link is active/inactive
 * - `resetScroll`/`hashScrollIntoView`: Control scroll behavior on navigation
 * - `viewTransition`/`startTransition`: Use View Transitions/React transitions for navigation
 * - `ignoreBlocker`: Bypass registered blockers
 *
 * An anchor-like element that navigates without full page reloads.
 * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/linkComponent)
 */
external val Link: FC<LinkComponentProps>
