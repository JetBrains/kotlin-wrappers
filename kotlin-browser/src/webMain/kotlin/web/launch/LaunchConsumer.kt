package web.launch

import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LaunchQueue/setConsumer#callback)
 */
@ExperimentalWebApi
typealias LaunchConsumer = (
    params: LaunchParams,
) -> Unit
