plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinReact)
    webMainApi(projects.kotlinReactDom)

    webMainApi(npm(jspkg.reactSelect))
}
