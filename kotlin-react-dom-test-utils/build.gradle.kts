plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReact)
    jsMainApi(projects.kotlinReactDom)

    webMainImplementation(libs.coroutines.core)
    webMainImplementation(libs.coroutines.test)

    webMainApi(npm(jspkg.reactDom))
}
