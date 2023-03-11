@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router

import remix.run.router.Router as RemixRouter


external interface RouterProviderProps : react.Props {
    var fallbackElement: react.ReactNode?
    var router: RemixRouter
}
