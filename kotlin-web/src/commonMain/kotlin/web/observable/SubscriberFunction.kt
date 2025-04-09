package web.observable

typealias SubscriberFunction<T> = (
    observer: SubscriptionObserver<T>,
) -> Subscription // | () -> Unit
