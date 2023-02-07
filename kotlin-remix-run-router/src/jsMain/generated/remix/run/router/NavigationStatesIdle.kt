package remix.run.router


external interface NavigationStatesIdle {
    var state: String
    var location: Any? /* some expression */
    var formMethod: Any? /* some expression */
    var formAction: Any? /* some expression */
    var formEncType: Any? /* some expression */
    var formData: Any? /* some expression */
}

