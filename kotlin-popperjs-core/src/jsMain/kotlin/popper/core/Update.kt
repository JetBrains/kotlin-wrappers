package popper.core

import js.promise.Promise

typealias Update = () -> Promise<State> // $Shape
typealias ForceUpdate = () -> Unit
