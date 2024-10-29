package react.use

import react.useEffect
import react.useMemo
import react.useState
import web.cssom.MediaQuery
import web.cssom.matchMedia
import web.events.subscribe

/**
 * [Original](https://mui.com/material-ui/react-use-media-query/)
 */
fun useMediaQuery(
    query: MediaQuery,
): Boolean {
    val queryList = useMemo(query) {
        matchMedia(query)
    }

    val (matches, setMatches) = useState(queryList.matches)

    useEffect(queryList) {
        setMatches(queryList.matches)

        queryList.changeEvent.subscribe { event ->
            setMatches(event.matches)
        }
    }

    return matches
}
