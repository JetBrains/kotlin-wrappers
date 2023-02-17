package remix.run.router

import remix.run.router.Action as HistoryAction


external interface BlockerFunctionArgs {
    var currentLocation: Location
    var nextLocation: Location
    var historyAction: HistoryAction
}

