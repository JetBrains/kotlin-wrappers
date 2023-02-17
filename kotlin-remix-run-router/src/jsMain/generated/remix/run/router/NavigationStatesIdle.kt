package remix.run.router


external interface NavigationStatesIdle {
    var state: String
    var location: Nothing?
    var formMethod: Nothing?
    var formAction: Nothing?
    var formEncType: Nothing?
    var formData: Nothing?
}

