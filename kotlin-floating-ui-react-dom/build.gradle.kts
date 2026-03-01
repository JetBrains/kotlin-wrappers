plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinReact)
    webMainApi(npm(jspkg.floatingUi.reactDom))
}
