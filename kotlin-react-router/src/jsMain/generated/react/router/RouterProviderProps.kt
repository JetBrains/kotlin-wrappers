package react.router

import remix.run.router.Router as RemixRouter


sealed external interface RouterProviderProps : react.Props {
    var fallbackElement: react.ReactNode
    var router: RemixRouter
    var future: FutureConfig?
}
