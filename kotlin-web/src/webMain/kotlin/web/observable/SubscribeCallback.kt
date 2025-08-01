package web.observable

import js.observable.Subscriber

typealias SubscribeCallback<T> = (
    subscriber: Subscriber<T>,
) -> Unit
