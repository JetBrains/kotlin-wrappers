plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinReact)
    jsMainApi(projects.kotlinReactDom)

    webMainApi(npm(jspkg.reactBeautifulDnd))
}
