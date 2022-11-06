package web.events

typealias EventHandler<T /* : Event */> = (event: T) -> Unit
