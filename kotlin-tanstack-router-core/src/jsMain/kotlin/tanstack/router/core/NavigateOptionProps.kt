package tanstack.router.core

import web.scroll.ScrollIntoViewOptions

/**
 * The NavigateOptions type is used to describe the options that can be used when describing a navigation action in TanStack Router.
 * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/NavigateOptionsType)
 */
@JsExternalInheritorsOnly
external interface NavigateOptionProps {
    /**
     * If set to `true`, the router will scroll the element with an id matching the hash into view with default `ScrollIntoViewOptions`.
     * If set to `false`, the router will not scroll the element with an id matching the hash into view.
     * If set to `ScrollIntoViewOptions`, the router will scroll the element with an id matching the hash into view with the provided options.
     *
     * `default` - true
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/NavigateOptionsType#hashscrollintoview)
     * [MDN](https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollIntoView)
     */
    var hashScrollIntoView: ScrollIntoViewOptions? /* | Boolean */

    /**
     * `replace` is a boolean that determines whether the navigation should replace the current history entry or push a new one.
     *
     * `default` - false
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/NavigateOptionsType#replace)
     */
    var replace: Boolean?

    /**
     * Defaults to `true` so that the scroll position will be reset to 0,0 after the location is committed to the browser history.
     * If `false`, the scroll position will not be reset to 0,0 after the location is committed to history.
     *
     * `default` - true
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/NavigateOptionsType#resetscroll)
     */
    var resetScroll: Boolean?

    /**
     * If set to `true`, the router will wrap the resulting navigation in a `document.startViewTransition()` call.
     * If `ViewTransitionOptions`, route navigations will be called using `document.startViewTransition({update, types})`
     * where `types` will be the strings array passed with `ViewTransitionOptions["types"]`.
     * If the browser does not support viewTransition types, the navigation will fall back to normal `document.startTransition()`, same as if `true` was passed.
     *
     * If the browser does not support this api, this option will be ignored.
     *
     * `default` - false
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/NavigateOptionsType#viewtransition)
     * [MDN](https://developer.mozilla.org/en-US/docs/Web/API/Document/startViewTransition)
     * [Google](https://developer.chrome.com/docs/web-platform/view-transitions/same-document#view-transition-types)
     */
    var viewTransition: ViewTransitionOptions? /* | Boolean */

    /**
     * If `true`, navigation will ignore any blockers that might prevent it.
     *
     * `default` - false
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/NavigateOptionsType#ignoreblocker)
     */
    var ignoreBlocker: Boolean?

    /**
     * If `true`, navigation to a route inside of router will trigger a full page load instead of the traditional SPA navigation.
     *
     * `default` - false
     *
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/NavigateOptionsType#reloaddocument)
     */
    var reloadDocument: Boolean?

    /**
     * This can be used instead of `to` to navigate to a fully built href, e.g. pointing to an external target.
     * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/NavigateOptionsType#href)
     */
    var href: String?
}
