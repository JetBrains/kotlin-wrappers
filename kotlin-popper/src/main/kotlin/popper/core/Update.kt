package popper.core

import kotlin.js.Promise

typealias Update = () -> Promise<State> // $Shape
typealias ForceUpdate = () -> Unit
