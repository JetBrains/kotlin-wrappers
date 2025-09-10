plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinReactCore)

    webMainApi(npm(jspkg.tanstack.reactQueryDevtools))
}
