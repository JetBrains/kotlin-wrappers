package remix.run.router

import history.Action as HistoryAction


external interface BlockerFunctionArgs {
    var currentLocation: Location
    var nextLocation: Location
    var historyAction: HistoryAction
}

