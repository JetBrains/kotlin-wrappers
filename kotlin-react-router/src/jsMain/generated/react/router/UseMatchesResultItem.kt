package react.router

import remix.run.router.Params


external interface UseMatchesResultItem {
    var id: String
    var pathname: String
    var params: Params
    var data: Any?
    var handle: Any?
}
