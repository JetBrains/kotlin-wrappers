@file:JsModule("react-router-dom")

package react.router.dom

import remix.run.router.Fetcher

/**
 * Provides all fetchers currently on the page. Useful for layouts and parent
 * routes that need to provide pending/optimistic UI regarding the fetch.
 */
external fun useFetchers(): js.core.ReadonlyArray<Fetcher<*>>
