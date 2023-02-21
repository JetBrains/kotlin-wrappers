package react.use

import web.dom.document

/**
 * [Original](https://github.com/streamich/react-use/blob/master/src/useTitle.ts)
 */
fun useTitle(
    title: String,
) {
    if (document.title != title) {
        document.title = title
    }
}
