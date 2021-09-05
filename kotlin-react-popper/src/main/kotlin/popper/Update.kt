package popper

import react.State
import kotlin.js.Promise

typealias Update = () -> Promise<State> // $Shape
typealias ForceUpdate = () -> Unit
