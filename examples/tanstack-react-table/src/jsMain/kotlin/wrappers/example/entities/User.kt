package wrappers.example.entities

external interface User {
    var id: Key
    var name: String
    var email: String
    var phone: String
    var website: String
}

typealias Users = Array<out User>
