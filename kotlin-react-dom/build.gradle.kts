plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinBrowser)
    webMainApi(projects.kotlinReact)

    webMainApi(npm(jspkg.reactDom))
}
