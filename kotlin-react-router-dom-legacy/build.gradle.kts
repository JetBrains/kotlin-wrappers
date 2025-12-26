plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinReactDom)

    webMainApi(npm(jspkg.reactRouterDom))
}
