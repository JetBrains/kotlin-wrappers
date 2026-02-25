plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReact)

    webMainApi(npm(jspkg.reactDom))
}
