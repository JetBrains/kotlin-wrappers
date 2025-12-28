package tanstack.router.core

import js.objects.JsPlainObject

/**
 * [Guide](https://tanstack.com/router/latest/docs/framework/react/guide/navigation#active-options)
 */
@JsPlainObject
external interface ActiveOptions {
    /**
     * If true, the link will be active if the current route matches the `to` route path exactly (no children routes)
     * @default false
     */
    val exact: Boolean?

    /**
     * If true, the link will only be active if the current URL hash matches the `hash` prop
     * @default false
     */
    val includeHash: Boolean?

    /**
     * If true, the link will only be active if the current URL search params inclusively match the `search` prop
     * @default true
     */
    val includeSearch: Boolean?

    /**
     * This modifies the `includeSearch` behavior.
     * If true, properties in `search` that are explicitly `undefined` must NOT be present in the current URL search params for the link to be active.
     * @default false
     */
    val explicitUndefined: Boolean?
}
