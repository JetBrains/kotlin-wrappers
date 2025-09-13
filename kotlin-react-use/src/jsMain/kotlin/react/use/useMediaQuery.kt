package react.use

import react.useEffect
import react.useMemo
import react.useState
import web.cssom.MediaQuery
import web.cssom.changeEvent
import web.cssom.matchMedia
import web.events.invoke

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

        queryList.changeEvent()
            .collect { setMatches(it.matches) }
    }

    return matches
}
