plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinCsstype)
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReactCore)

    jsMainApi(npmv("@emotion/cache"))
    jsMainApi(npmv("@emotion/css"))
    jsMainApi(npmv("@emotion/react"))
    jsMainApi(npmv("@emotion/styled"))
}
