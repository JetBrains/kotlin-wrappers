plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinBrowser)

    webMainImplementation(projects.kotlinJsPlainObject)

    webMainApi(npm(jspkg.popperjs.core))
}
