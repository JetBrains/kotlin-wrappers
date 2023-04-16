package react.use

import react.useEffect
import react.useMemo
import react.useState
import web.cssom.CHANGE
import web.cssom.MediaQuery
import web.cssom.MediaQueryListEvent
import web.cssom.matchMedia
import web.events.addEventHandler

/**
 * [Original](https://mui.com/material-ui/react-use-media-query/)
 */
fun useMediaQuery(
    query: MediaQuery,
): Boolean {
    val queryList = useMemo(query) {
        matchMedia(query)
    }

    val (matches, setMatches) = useState {
        queryList.matches
    }

    useEffect(queryList) {
        setMatches(queryList.matches)

        cleanup(
            queryList.addEventHandler(MediaQueryListEvent.CHANGE) { event ->
                setMatches(event.matches)
            }
        )
    }

    return matches
}
