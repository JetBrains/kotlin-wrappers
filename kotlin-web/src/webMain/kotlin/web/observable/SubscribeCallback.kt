package web.observable

import js.observable.Subscriber
import web.experimental.ExperimentalWebApi

@ExperimentalWebApi
typealias SubscribeCallback<T> = (
    subscriber: Subscriber<T>,
) -> Unit
