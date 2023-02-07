package remix.run.router

import web.http.FormData


external interface NavigationStatesSubmitting {
    var state: String
    var location: Location
    var formMethod: FormMethod
    var formAction: String
    var formEncType: FormEncType
    var formData: FormData
}

