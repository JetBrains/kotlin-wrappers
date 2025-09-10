plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)
    webMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReactCore)

    webMainApi(npm(jspkg.reactDom))
}
