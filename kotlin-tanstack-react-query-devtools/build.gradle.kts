plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinReact)

    webMainApi(npm(jspkg.tanstack.reactQueryDevtools))
}
